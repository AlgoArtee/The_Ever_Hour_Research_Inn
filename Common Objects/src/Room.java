public class Room {

    private int roomNumber;
    private boolean occupied;
    private boolean hasLab;
    private Laboratory lab;

    public Room(int roomNumber, boolean hasLab) {
        this.roomNumber = roomNumber;
        this.hasLab = hasLab;
        this.occupied = false;
        if (hasLab) {
            this.lab = new Laboratory(roomNumber);
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean hasLab() {
        return hasLab;
    }

    public Laboratory getLab() {
        return lab;
    }

    public void setLab(Laboratory lab) {
        this.lab = lab;
    }
}
