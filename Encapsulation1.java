import java.util.*;
public class Encapsulation1 {

    
static class Student{
    private String studentName;
    private int rollNumber;
    private double marks;

    public String getStudentName() {
        return studentName;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public double getMarks(){
        return marks;
    }
     
    public void setStudentName(String Name){
      this.studentName= Name;
    }
    public void setRollNumber(int roll){
         this.rollNumber= roll;
    }
    public void setMarks(double Marks){
         this.marks =Marks;
    }
    public String checkPass(){
     
        if(marks >=40){
            return "Pass";
        }else{
            return "Fail";
        }
        
    }

}
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
      Student student =new Student();
      System.out.print("Enter your name :"); 
      String Name = sc.nextLine();
       student.setStudentName(Name);
       System.out.print("enter your roll number :");
       int roll =sc.nextInt();
       student.setRollNumber(roll);
       System.out.println("Enter your marks:");
       double marks =sc.nextDouble();
       student.setMarks(marks);

       sc.close();
       System.out.println("Student1 details");
       System.out.println("Name:" + student.getStudentName());
       System.out.println("Roll Number:" + student.getRollNumber());
       System.out.println("Marks :" + student.getMarks());
       System.out.println("Result:" + student.checkPass());


    }
}
