
/**
 * Handles a single student record
 *
 * @author Russell Gavin Fielder
 * @version 5/7/2017
 */
public class Student
{
    // instance variables
    private String name;
    private int age;
    private double GPA;

    /**
     * Default Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        name = "";
        age = -1;
        GPA = 0.0;
    }
    
    /**
     * Initializing Constructor for objects of class Student
     */
    public Student(String name_in, int age_in, double GPA_in)
    {
        // initialise instance variables
        name = name_in;
        age = age_in;
        GPA = GPA_in;
    }
    
    /**
     * Returns a string representing the student
     * 
     * @return  a string representing the student
     */
    public String toString()
    {
        String out = name + "\t" + age + "\t" + GPA;
        return out;        
    }
    
    /**
     * Gets the name of the student
     * 
     * @return  the name of the student
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the age of the student
     * 
     * @return  the age of the student
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * Gets the gpa of the student
     * 
     * @return  the gpa of the student
     */
    public double getGPA()
    {
        return GPA;
    }
    
    /**
     * Sets the name of the student
     * 
     * @param  name_in  the name of the student
     */
    public void setName(String name_in)
    {
        name = name_in;
    }
    
    /**
     * Sets the age of the student
     * 
     * @param  age_in  the age of the student
     */
    public void setAge(int age_in)
    {
        age = age_in;
    }
    
    /**
     * Sets the gpa of the student
     * 
     * @param  GPA_in  the gpa of the student
     */
    public void setGPA(double GPA_in)
    {
        GPA = GPA_in;
    }
    
}
