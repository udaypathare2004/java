public class Employee {
    //Private fields (data hiding)
    private String name;
    private int id;
    private double salary;
      
    //Constracter to initialize fields
    public Employee(String name, int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    //Public getter and setter for 'name'
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    //Public getter and setter for 'id'
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    //Public getter and setter for 'salary'
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if(salary>0){//Adding  basic validation
            this.salary=salary;
        }else{
            System.out.println("Salary must be positive!");
        }
    }
    public static void main(String[] args){
        //Creating an object of Employee
        Employee emp=new Employee("Alice",101,50000);

        //Accessing and modifying private field via getters and setters
        System.out.println("Employee Name:"+emp.getName());
      emp.setSalary(55000);
      System.out.println("Updated Salary:"+emp.getSalary());
      
    }
}
