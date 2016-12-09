import java.util.Scanner;
public class TestRectangle1{
 
 public static void main(String args[])
  {
     Rectangle1 r1 = new Rectangle1();
     Rectangle1 r2 = new Rectangle1();
     Rectangle1 r3 = new Rectangle1();        
     Rectangle1 r4 = new Rectangle1();
     Rectangle1 r5 = new Rectangle1();
   
    Scanner in = new Scanner(System.in);
    System.out.println("enter the lenght & breadth for rectangle r1");
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        r1.set(a1,b1);
        //r1.area();
   
       System.out.println("enter the lenght & breadth for rectangle r2");
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        r2.set(a2,b2);
       // r2.area();
        double l=r2.getl();
        double w=r2.getw();
      
       System.out.println("enter the lenght & breadth for rectangle r3");
        int a3 = in.nextInt();
        int b3 = in.nextInt(); 
        r3.set(a3,b3);
        //r3.area();
         
       System.out.println("enter the lenght & breadth for rectangle r4");
        int a4 = in.nextInt();
        int b4 = in.nextInt();
        r4.set(a4,b4);
        //r4.area();

       System.out.println("enter the lenght & breadth for rectangle r5");
        int a5 = in.nextInt();
        int b5 = in.nextInt();
        r5.set(a5,b5);
        //r5.area();
     
  } 

}
