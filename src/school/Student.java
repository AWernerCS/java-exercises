package school;

/**
 * Created by Rio on 3/12/2017.
 */
public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa){
        name = aName;
        studentId = aStudentId;
        numberOfCredits = aNumberOfCredits;
        gpa = aGpa;
    }

    public Student(String aName, int aStudentId){
        name = aName;
        studentId = aStudentId;
    }

    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    public int getStudentId(){
        return studentId;
    }
    protected void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double aGpa){
        gpa = aGpa;
    }
}
