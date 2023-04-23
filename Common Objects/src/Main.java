public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        // Create a new customer and add some skills
        Customer customer1 = new Customer("jdoe123", "John Doe", "123 Main St", "jdoe@example.com", 123, "");
        Skill skill1 = new Skill("Programming", 3);
        Skill skill2 = new Skill("Data Analysis", 2);
        customer1.addSkill(skill1);
        customer1.addSkill(skill2);

        // Perform an experiment to level up the Programming skill
        Experiment experiment1 = new Experiment("Programming", 2);
        customer1.performExperiment(experiment1);

        // Print the customer's skills
        System.out.println("Customer 1 Skills:");
        for (Skill skill : customer1.getSkills()) {
            System.out.println(skill.getName() + ": Level " + skill.getLevel());
        }

        // Create a new scientist and add some skills
        Scientist scientist1 = new Scientist("jsmith456", "Jane Smith", "456 Oak St", "jsmith@example.com", 456, "","Biology");
        Skill skill3 = new Skill("Biology", 4);
        Skill skill4 = new Skill("Statistics", 3);
        scientist1.addSkill(skill3);
        scientist1.addSkill(skill4);

        // Perform an experiment to level up the Biology skill
        Experiment experiment2 = new Experiment("Biology", 3);
        scientist1.performExperiment(experiment2);

        // Print the scientist's skills
        System.out.println("Scientist 1 Skills:");
        for (Skill skill : scientist1.getSkills()) {
            System.out.println(skill.getName() + ": Level " + skill.getLevel());
        }

    }
}