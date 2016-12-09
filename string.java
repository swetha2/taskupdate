import java.io.*;
//package prjStrings;
//package com.instaceofjava;
public class string{
  public static void main(String args[])
   {
     int count=0;
     String revstring = new String();
     for(int i=0;i<args[0].length();i++)
          count++;
    System.out.println("the number of characters in the string is:"+count);

     String changeCase = args[0];
     String result;
     result = changeCase.toUpperCase();
     System.out.println("the uppercase letters of given string are:"  +  result);

     for(int i=args[0].length()-1;i>=0;--i)
      {
         revstring=revstring+args[0].charAt(i);
      }
     System.out.println("the reverse string is:" + revstring);
     if(revstring.equalsIgnoreCase(args[0]))
        System.out.println("The string is palindrome");
     else
        System.out.println("The is not a palindrome");
    
    }
}
