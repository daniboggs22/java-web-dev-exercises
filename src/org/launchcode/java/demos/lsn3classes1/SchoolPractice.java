package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
            // Instantiate your Student class for part 2 here!
            //create a new instance of the Student class
            Student student1 = new Student("Danielle", 1, 1, 4.0);
            //System.out.println(student1.getNumberOfCredits());
            Teacher teacher1 = new Teacher("Carrie", "Jones", "Coding", 5);
        System.out.println(teacher1.getFirstName());
        //to access the teacher info, you have to use the "get" methods within the Teacher class to have them print
        Teacher teacher2 = new Teacher ("John", "Smith", "History", 6);
        System.out.println(teacher2.getSubject());

    }
}
