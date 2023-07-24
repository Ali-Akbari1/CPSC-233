
package Assignment3;

public class Assignment3Main {

    // Person Class
    public static class Person {

        // Instance variables
        private int age;
        private String name;
        private double height;
        private double weight;

        // Default Constructor
        public Person() {
            age = 0;
            name = "No name yet ";
        }

        // Parameterized Constructor
        public Person(double initialHeight, int initialAge, String initialName, double initialWeight) {
            setHeight(initialHeight);
            setWeight(initialWeight);
            setAge(initialAge);
            setName(initialName);
        }

        // Set Methods
        public void setHeight(double newHeight) {
            height = newHeight;
        }

        public void setWeight(double newWeight) {
            weight = newWeight;
        }

        public void setAge(int newAge) {
            age = newAge;
        }

        public void setName(String newName) {
            name = newName;
        }

        // Get Methods
        public double getHeight() {
            return height;
        }

        public double getWeight() {
            return weight;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        // Method to calculate a persons BMI using height and weight
        public double calculateBMI() {
            height = getHeight();
            weight = getWeight();

            double bmi = 0.0;

            bmi = weight / (height * height);

            return bmi;
        }

        // Method to check if a person is the same age as another person
        public boolean isSameAge(Person otherPerson) {
            return this.age == otherPerson.getAge();
        }

        // Method to display the objects
        public void writeOutput(){
            System.out.println("Name: " + name + ","+ " Age: " + age + "," + " Height: " + height + "m," + " Weight: " + weight + "kg" +
                                " BMI of " + name + " is: " + calculateBMI());
        }

    }


    // Boy Class
    public static class Boy extends Person {
        private String gender;
        private double shoeSize;

        // Default Constructor
        public Boy() {
            shoeSize = 0;
            gender = "Male";
        }

        // Parameterized Constructor
        public Boy(double initialShoeSize, String initialGender, double initialHeight, int initialAge, String initialName, double initialWeight) {
            super(initialHeight, initialAge, initialName, initialWeight);
            setShoeSize(initialShoeSize);
            setGender(initialGender);
        }

        // Set methods
        public void setShoeSize(double newShoeSize) {
            shoeSize = newShoeSize;
        }

        public void setGender(String newGender) {
            gender = newGender;
        }

        // Get methods
        public double getShoeSize() {
            return shoeSize;
        }

        public String getGender() {
            return gender;
        }

        // Method to check if a person is the same age as another person
        public boolean isSameAge(Person otherPerson) {
            return this.getAge() == otherPerson.getAge();
        }

        // Method to display the objects
        public void writeOutput(){
            super.writeOutput();
            System.out.println("Gender: " + gender + "," + " Shoe Size: " + shoeSize);

        }

    }

    // Girl Class
    public static class Girl extends Person {
        private String gender;
        private double shoeSize;

        // Default Constructor
        public Girl() {
            shoeSize = 0;
            gender = "Female";
        }

        // Parameterized Constructor
        public Girl(double initialShoeSize, String initialGender, double initialHeight, int initialAge, String initialName, double initialWeight) {
            super(initialHeight, initialAge, initialName, initialWeight);
            setShoeSize(initialShoeSize);
            setGender(initialGender);
        }

        // Set methods
        public void setShoeSize(double newShoeSize) {
            shoeSize = newShoeSize;
        }

        public void setGender(String newGender) {
            gender = newGender;
        }

        // Get methods
        public double getShoeSize() {
            return shoeSize;
        }

        public String getGender() {
            return gender;
        }

        // Method to check if a person is the same age as another person
        public boolean isSameAge(Person otherPerson) {
            return this.getAge() == otherPerson.getAge();
        }

        // Method to display the objects
        public void writeOutput(){
            super.writeOutput();
            System.out.println("Gender: " + gender + "," + " Shoe Size: " + shoeSize );

        }
    }


    // Main Function
    public static void main(String[] args) {

        // New list called people that will hold the objects
        Person[] people = new Person[4];

        people[0] = new Person(1.80, 18, "John Doe", 70.45);
        people[1] = new Girl(5.5, "Female", 1.53, 12, "Jane Doe", 41.67);
        people[2] = new Boy(9.5, "Male", 1.86, 25, "Ryan Nguyen", 72.3);
        people[3] = new Boy(8.5, "Male", 1.74, 18, "Ali Muhammad", 91.7);


        // Loop through the list and display the objects
        for (Person p: people){
            p.writeOutput();
            System.out.println();
        }


        // Same age checker
        System.out.println("Is " + people[0].getName() + " the same age as " + people[1].getName() + " " + people[0].isSameAge(people[1]));
        System.out.println("Is " + people[0].getName() + " the same age as " + people[3].getName() + " " + people[0].isSameAge(people[3]));
        System.out.println("Is " + people[1].getName() + " the same age as " + people[2].getName() + " " + people[1].isSameAge(people[2]));
        System.out.println("Is " + people[2].getName() + " the same age as " + people[3].getName() + " " + people[2].isSameAge(people[3]));

    }
}
