public class Rectangle1{

 double length,width;
 double area,perimeter;
void Rectangle1()
 {
   length=1;
   width=1;
 }

 void area()
  {
     area=length*width;
     perimeter=2*(length+width);
     System.out.println(" the area of the rectangle is:"+ area+"\n the perimeter of the rectangle is"+ perimeter);
     
  }

  double getl()
   {
      return length;
    }
  double getw()
    {
      return width;
    }

  int set(double a, double b)
    {
       if(a>0.0 && a<20.0)
            length=a;
        else
             {System.out.println("length is out of range"); return -11;}
       if(b>0.0 && b<20.0)
              width=b;
         else
              {System.out.println("width is out of range");  return -2;}
       area();
      
       return 0;
    }
 
}
