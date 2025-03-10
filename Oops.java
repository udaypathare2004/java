public class Oops {
    public static void main(String args[]){
      Pen p1 =new Pen();//created a pen object called p1
      p1.setColor("black");
      Pen p2 =new Pen();
      p2.setTip(5);
      System.out.println(p1.color);
      System.out.println(p2.tip);
    }
}
class Pen{
    String color;
    int tip;
     
    void setColor(String newColor){
        color =newColor;
    }

    void setTip(int newTip){
       tip =newTip;
    }
}
