import java.util.*;
public class Bill {
    /*
     * Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
     * eraser. You have to output the total cost of the items back to the user as their bill.
     *(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
     *
     */
    public static void main(String args []){
      Scanner sc =new Scanner(System.in);
      float pencil =sc.nextFloat();
      float pen = sc.nextFloat();
      float eraser =sc.nextFloat();
      float bill = (pencil + pen +eraser);
      float Gst = (pencil + pen + eraser)*18/100;
      System.out.println(bill + Gst);
    }
}
