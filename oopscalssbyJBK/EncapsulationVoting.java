package oopscalssbyJBK;

    import java.util.Scanner;

    class Voter {
        private String name;
        private int age;
        private String vote;

        // Constructor
        public Voter(String name, int age) {
            this.name = name;
            this.age = age;
            this.vote = "Not Voted"; // Default value
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Method to cast a vote
        public void castVote(String candidate) {
            if (age >= 18) {
                this.vote = candidate;
                System.out.println(name + " has successfully voted for " + candidate);
            } else {
                System.out.println("Sorry, " + name + ". You are underaged and cannot vote.");
            }
        }

        // Method to display voter details
        public void displayVoterInfo() {
            System.out.println("Voter Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Voted For: " + vote);
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Voter voter = new Voter(name, age);

            if (age >= 18) {
                System.out.print("Enter the name of the candidate you want to vote for: ");
                String candidate = scanner.nextLine();
                voter.castVote(candidate);
            }

            voter.displayVoterInfo();
            scanner.close();
        }
    }

