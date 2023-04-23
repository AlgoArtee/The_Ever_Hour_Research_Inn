public class Scientist extends Customer{

    private String fieldOfStudy;

    // constructor
    public Scientist(String username, String name, String address, String email, int customerID, String password, String fieldOfStudy) {
        super(username, name, address, email, customerID, password);
        this.fieldOfStudy = fieldOfStudy;
    }

    // getter and setter for fieldOfStudy
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
}
