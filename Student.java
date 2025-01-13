

import java.util.*;
//Write public getter and setter methods for each field.

//Create a class Student with private fields for name, age, and grade.
public class Student {
  private String name;
  private int age;
  private String address;

  public Student(String name,int age,String address){
    this.name=name;
    this.age=age;
    this.address=address;
  }
  //Getter and setter for 'name'
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  //Getter and Setter for'age'
  public int getAge(){
     return age;
  }
  public void setAge(int age){
    if(age>0){//Adding basic validation
      this.age=age;
    }else{
      System.out.println("Age must be positive!");
    }
  }
  //Getter and Setter for 'address'
  public String getAddress(){
    return address;
  }
  public void setAddress(String address){
    this.address=address;
  }
  //Main method for testing
    public static void main(String[] args){ 
      Student person=new Student("Alice",25,"123 Main St");
    //Using getters
    System.out.println("Name:"+person.getName());
    System.out.println("Age:"+person.getAge());
    System.out.println("Address:"+person.getAddress());
    //using setters
    person.setName("Bob");
    person.setAge(30);
    person.setAddress("456 Elm St");

    //Updated values
    System.out.println("Updated Name:"+person.getName());
    System.out.println("Updated Age:"+person.getName());
    System.out.println("updated Address:"+person.getAddress());
    }
    
}