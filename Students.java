import java.util.*;
import java.io.*;

/**
 * Handles a collection of students
 *
 * @author Russell Gavin Fielder
 * @version 5/7/2017
 */
public class Students
{
    // instance variables - replace the example below with your own
    private ArrayList<Student> students;

    /**
     * Constructor for objects of class Students
     */
    public Students()
    {
        // initialise instance variables
        students = new ArrayList<Student>();
    }
    
    /**
     * Returns a student at the specified index
     * 
     * @return  the Student record at the specified index
     */
    public Student get(int index)
    {
        if (index < 0) 
        {
            System.out.println("Problem getting student record: index " + index + " out of range.");
            return students.get(0);
        }
        if (index >= students.size())
        {
            System.out.println("Problem getting student record: index " + index + " out of range.");
            return students.get(0);
        }
        else
            return students.get(index);
    }

    /**
     * Reads a collection of students from file
     * 
     */
    public void readFile(String filename) throws IOException
    {
        String name = "";
        int age = 0;
        double gpa = 0.0;
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNextLine()) {
            name = sc.nextLine();
            age = Integer.parseInt(sc.nextLine());
            gpa = Double.parseDouble(sc.nextLine());
            students.add(new Student(name, age, gpa));
        }
    }
    
    /** 
     * Returns a Student record of the student with the highest GPA
     * 
     * @return  the Student with the highest GPA
     */
    public Student getHighestStudent()
    {
        Student toReturn = students.get(0);
        for (Student s : students)
            if (s.getGPA() > toReturn.getGPA()) 
                toReturn = s;
        return toReturn;
    }
    
    /**
     * Returns the average GPA
     * 
     * @return  the average GPA
     */
    public double averageGPA()
    {
        double val = 0.0;
        for (Student s : students)
            val += s.getGPA();
        val /= students.size();
        return val;
    }
    
    /**
     * Adds a Student to the collection
     * 
     * @param  s  the Student record to be added.
     */
    public void add(Student s)
    {
        students.add(s);
    }
    
    /** 
     * Returns a Students collection of students at or above a given GPA
     * 
     * @param  thresh  the threshold of student GPA
     * @return  a Students collection of students at or above a given GPA
     */
    public Students getStudentsAbove(double thresh)
    {
        Students toReturn = new Students();
        for (Student s : students)
            if (s.getGPA() >= thresh)
                toReturn.add(s);
        return toReturn;
    }
    
    /** 
     * Returns a Students collection of students below a given GPA
     * 
     * @param  thresh  the threshold of student GPA
     * @return  a Students collection of students below a given GPA
     */
    public Students getStudentsBelow(double thresh)
    {
        Students toReturn = new Students();
        for (Student s : students)
            if (s.getGPA() < thresh)
                toReturn.add(s);
        return toReturn;
    }
    
    /**
     * Returns the youngest student 
     * 
     * @return  the youngest student
     */
    public Student getYoungest()
    {
        Student toReturn = students.get(0);
        for (Student s : students)
        {
            if (s.getAge() < toReturn.getAge())
            {
                toReturn = s;
            }
        }
        return toReturn;
       
    }
    
    /**
     * Returns a string representing the list of students
     * 
     * @return a String representing the list of students
     */
    public String toString() 
    {
        String out = "";
        for (Student s : students)
        {
            out += s.toString() + "\r\n";
        }
        return out;
    }
    
    /** 
     * Returns the average age of students
     * 
     * @return  the average age of students
     */
    public double averageAge()
    {
        double val = 0.0;
        for (Student s : students)
            val += s.getAge();
        val /= students.size();
        return val;
    }
    
    /**
     * Returns the number of students
     * 
     * @return the number of students
     */
    public int numberOfStudents()
    {
        return students.size();
    }
}













