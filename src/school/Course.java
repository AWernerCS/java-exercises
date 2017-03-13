package school;

import java.util.ArrayList;

/**
 * Created by Rio on 3/12/2017.
 */

public class Course{

    private String name;
    private String instructorName;
    private int numberOfCredits = 0;
    private int maxEnrollment = 0;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String aName, String aInstructorName, int aNumberOfCredits, int aMaxEnrollment){
        name = aName;
        instructorName = aInstructorName;
        numberOfCredits = aNumberOfCredits;
        maxEnrollment = aMaxEnrollment;
    }

    public String getName(){
        return name;
    }
    public void setName(String aName){
        name = aName;
    }

    public String getInstructorName(){
        return instructorName;
    }
    public void setInstructorName(String aInstructorName){
        instructorName = aInstructorName;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public int getMaxEnrollment(){
        return maxEnrollment;
    }
    public void setMaxEnrollment(int aMaxEnrollment){
        maxEnrollment = aMaxEnrollment;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void addEnrolledStudent(Student aStudent) {
        enrolledStudents.add(aStudent);
    }
    public void removeEnrolledStudent(Student aStudent) {
        enrolledStudents.remove(aStudent);
    }
}
