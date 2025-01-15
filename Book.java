import java.util.*;
public class Book {
    //Private field (data hiding)
    private String title;
    private String author;
    private double price;

    //Constractor to initialize fields
    public book(String title,String auther,double price){
        this.title=title;
        this.author=author;
        setPrice(price);//Used setter to apply validation
    }
    //Getter for 'title'
    public String getTitle(){
        return title;
    }
    //Setter for 'title';
    public void setTitle(String title){
        this.title=title;
    }
    //Getter for 'author'
    public String getAuthor(){
        return author;
    }
    //Setter for 'author'
    public String setAuthor(){
        this.author=author;
    }
    //Getter for  'price'
    public  Double getPrice(double price){
      if(price>0){
        this.price=price;
      }else{
        System.out.println("Price  must be greater than zero.");

      }
    }
    public static void main(String[] args){
        //Creating a Book object
        Book book =new Book("1984","George Orwell",15.99);

        //Accessing private fields using getters
        System.out.println("Book Title:"+book.getTitle());
        System.out.println("Book Auther:"+book.getAuthor());
        System.out.println("Book Price: $"+book.getPrice());
        
        //Modifying fields using Stters
        book.setTitle("Animal farm");
        book.setAuthor("George Orwell");
        book.setPrice(12.49);

        //Updated values
        System.out.println("Updated Book Title:"+book.getTitle());
        System.out.println("Updated Book Price:"+book.getPrice());
        System.out.println("Updated Book Auther:"+book.getAuther());


    }

}
