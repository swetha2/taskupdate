
public class date{
 int day,month,year;
 
 int date(int d,int m,int y)
  {
    day=d;
    month=m;
    year=y;
    int r=check();
    return r;
  }

 int check()
   {
     if(month<1 || month >12)
       {  System.out.println("invalid month");  return -1;}
     if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
       {
         if(day<1 || day>31)
          { System.out.println("invalid day"); return -2;}
       }
      if(month==4 || month==6 || month==9 || month==11)
        {
           if(day<1 || day>30)
             { System.out.println("invalid day"); return -3;}
        }
    
      if(year%4==0)
        if(day<1 || day>29)
          { System.out.println("invalid day"); return -4;}
      else
      if(day<1 || day>28)
          { System.out.println("invalid day"); return -5;}
 
     System.out.println("valid date");
      return 0;
   }
void add_date(int a,int b,int c)
    {
       int new_day=day+a;
       int new_month=month+b;
       int new_year=year+c;

        
   if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
    {
       if(new_day>31)
         {
            new_day=new_day%31;
            month++;
         }
    }
   if(month==4 || month==6 || month==9 || month==11)
    {
        if(new_day>30)
          {
             new_day=new_day%30;
             month++;
          }
     }
   if(year%4==0)
     {
       if(new_day>29)
         {
           new_day=new_day%29;
           month++;
          }
       }
    else
      {
        if(new_day>28)
          {
            new_day=new_day%28;
            month++;
          }
      }
  if(new_month>12)
         {
            new_month=new_month%12;
            year++;
          }
  //return date;
 }
}

       
               
