package Encapsulation;

// Hiding the data from another class by using private access specifier is called encapsulation

public class Ex1_Sample1
{
 // declare a global variable with private access specifier
   private int num1;
   private int num2;


   // initialize the variable with in the constructor with public access specifier
    public Ex1_Sample1()
    {
        num1=10;
        num2=20;
    }

    public void add()
    {
        System.out.println(num1+num2);
    }
}
