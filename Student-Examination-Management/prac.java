import java.util.*;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}
abstract class Student{
    int student_id;
    String name;
    int marks;
    Student(int sid,String name,int marks){
        this.student_id=sid;this.name=name;this.marks=marks;
    }
    abstract public void calculategrade();
}
class EngineeringStudent{
    int student_id;
}
class MedicalStudent{

}
class prac{
    public static void main(String[] args) {
        HashMap<> records=new HashMap<>();
        //display all students and topper and sort them 
    }
}