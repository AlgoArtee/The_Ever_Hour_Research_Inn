import java.util.ArrayList;

public class Customer extends Visitor{
    private String name;
    private String address;
    private String email;
    private int customerID;
    private String password;

    private ArrayList<Skill> skills = new ArrayList<>();

    // constructor
    public Customer(String username, String name, String address, String email, int customerID, String password) {
        super(username);
        this.name = name;
        this.address = address;
        this.email = email;
        this.customerID = customerID;
        this.password = password;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void performExperiment(Experiment experiment) {
        for (Skill skill : skills) {
            if (experiment.getName().equals(skill.getName())) {
                skill.setLevel(skill.getLevel() + experiment.getExperience());
            }
        }
    }

    public ArrayList<Skill> getSkills(){
        return skills;
    }

}
