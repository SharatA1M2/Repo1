package test;





//Java program to demonstrate working 
//of java.lang.Math.pow() method 

import java.lang.Math; 

public class prog1  { 

 // driver code 
 public static void main(String args[]) 
 { 
     double i = 10.5; 
     double t = 36; 
     double a = 70000; 
     double EMI ;
   
     
     EMI = (i / 12) * a * Math.pow((1 + (i / 12)), t) / (1 - Math.pow((1 + (i / 12)), t));
     System.out.println(EMI); 

    
 } 
} 
