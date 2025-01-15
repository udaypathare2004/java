import java.util.*;
public class Car {
    // Private fields (data hiding)
    private String brand;
    private String model;
    private int year;

    //Constructor to initialize fields
    public Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    } 
    //Getter for 'brand'
    public String getBrand(){
        return brand;

    } 
    //Setter for 'brand'
    public void setBrand(String brand){
        this.brand= brand;

    }
    //Getter for 'model'
    public String getModel(){
        return model;

    }
    //Setter for 'model'
    public void setModel(String model){
        this.model=model;

    }
    //Getter for 'year'
    public int getYear(){
        return year;

    }
    //Setter for 'year'
    public int setYear(int year){
        if(year>1885){// Cars were not invented before 1886
        this.year=year;
    }else{
        System.out.println("Invalid year! cars were not made before 1886.");

    }
        return this.year;
   } 
    public static void main(String[] args){
        // Creating a car object
         Car car = new Car("Toyota","Camry", 2020);

         //Accessing  fields  through getters
         System.out.println(" Brand:"+car.getBrand());
         System.out.println("Model:"+car.getModel());
         System.out.println("Year:"+car.getYear());

         //Modifiying fields through setters
         car.setBrand("Honda");
         car.setModel("Civic");
         car.setYear(2023);

         //Updated  values
         System.out.println("Updated Brand:"+car.getBrand());
         System.out.println("Updated Model:"+car.getModel()); 
         System.out.println("Updated Year:"+car.getYear());
    }
}

