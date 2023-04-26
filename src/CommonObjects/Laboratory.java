package CommonObjects;

import java.sql.*;

public class Laboratory extends Room {
    private String labEquipment;
    private Connection conn;

    public Laboratory(int roomNumber) {
        super(roomNumber, true);
        this.labEquipment = "";
        try {
            Class.forName("org.sqlite.JDBC");
            this.conn = DriverManager.getConnection("jdbc:sqlite:lab_equipment.db");
            queryEquipment(roomNumber);
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public String getLabEquipment() {
        return labEquipment;
    }

    public void setLabEquipment(String labEquipment) {
        this.labEquipment = labEquipment;
    }

    public void queryEquipment(int roomNumber) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT equipment.name, equipment.quantity, equipment.description " +
                    "FROM equipment " +
                    "JOIN room_equipment ON equipment.id = room_equipment.equipment_id " +
                    "JOIN rooms ON room_equipment.room_id = rooms.id " +
                    "WHERE rooms.number = " + roomNumber + ";";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                String description = rs.getString("description");
                System.out.println("Equipment Name: " + name);
                System.out.println("Quantity: " + quantity);
                System.out.println("Description: " + description);
                this.labEquipment += name + "\n";
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}


