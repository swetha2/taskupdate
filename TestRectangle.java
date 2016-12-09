import java.util.Scanner;
public class TestRectangle{
 
 public static void main(String args[])
  {
     Rectangle r1 = new Rectangle();
     Rectangle r2 = new Rectangle();
     Rectangle r3 = new Rectangle();        
     Rectangle r4 = new Rectangle();
     Rectangle r5 = new Rectangle();
   
    Scanner in = new Scanner(System.in);
    
      System.out.println("enter the lenght & breadth for rectangle r1");
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        r1.Rectangle(a1,b1);
        r1.area();
   
       System.out.println("enter the lenght & breadth for rectangle r2");
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        r2.Rectangle(a2,b2);
        r2.area();
        r2.get();
      
       System.out.println("enter the lenght & breadth for rectangle r3");
        int a3 = in.nextInt();
        int b3 = in.nextInt(); 
        r3.Rectangle(a3,b3);
        r3.area();
        r3.set();
        r3.area();
         
       System.out.println("enter the lenght & breadth for rectangle r4");
        int a4 = in.nextInt();
        int b4 = in.nextInt();
        r4.Rectangle(a4,b4);
        r4.area();

       System.out.println("enter the lenght & breadth for rectangle r5");
        int a5 = in.nextInt();
        int b5 = in.nextInt();
        r5.Rectangle(a5,b5);
        r5.area();
     
  }
}




