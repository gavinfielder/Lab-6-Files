import java.io.*;       // for PrintWriter, IOException
import java.util.*;     // for Scanner

/**
 * This program reads student records from file, processes them, and prints some analysis
 * 
 * @author Russell Gavin Fielder
 * @version 5/7/2017
 */
public class Tester
{
    // Main program 
    public static void main(String args[]) throws IOException
    {
        // Declare Students collection
        Students students = new Students();
        // Declare PrintWriter for output
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        
        //Get input data
        students.readFile("Students.txt");
        
        //Print all students
        System.out.print("All Students:\n" + students.toString() + "\n");
        out.write("All Students:\r\n" + students.toString() + "\r\n");
        
        //Print the student with the highest GPA
        Student best = students.getHighestStudent();
        System.out.print("Highest GPA Student:\r\n" + best.toString() + "\n\n");
        out.write("Highest GPA Student:\r\n" + best.toString() + "\r\n\r\n");
        
        //Calculate and print the average GPA
        double avg = students.averageGPA();
        System.out.print("Average GPA: " + avg + "\n\n");
        out.write("Average GPA: " + avg + "\r\n\r\n");
        
        //Make sub-lists of students above and below average gpa
        Students goodStudents = students.getStudentsAbove(avg);
        Students badStudents = students.getStudentsBelow(avg);
        
        //Print number of students above and below average
        System.out.print("Number of students below average: "
                            + goodStudents.numberOfStudents() + "\n");
        System.out.print("Number of students above average: "
                            + goodStudents.numberOfStudents() + "\n\n");
        out.write("Number of students below average: "
                            + badStudents.numberOfStudents() + "\r\n");
        out.write("Number of students above average: "
                            + badStudents.numberOfStudents() + "\r\n\r\n");
        
        //Print all above-average students
        System.out.print("Above Average Students:\r\n" + goodStudents.toString() + "\n");
        out.write("Above Average Students:\r\n" + goodStudents.toString() + "\r\n");
        
        //Print the youngest below average student
        Student youngestBelowAverage = badStudents.getYoungest();
        System.out.print("Youngest student below average GPA:\n" 
                            + youngestBelowAverage.toString() + "\n\n");
        out.write("Youngest student below average GPA:\n" 
                            + youngestBelowAverage.toString() + "\r\n\r\n");
                            
        //Print the average age of students below average GPA
        double avgAge = badStudents.averageAge();
        System.out.printf("Average age of students with below average GPA: %.2f\n", avgAge);
        out.printf("Average age of students with below average GPA: %.2f\r\n", avgAge);
        
        //Close PrintWriter
        out.close();
    }
}
