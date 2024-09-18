package org.example;
import org.example.add.AddClass;
import org.example.subtract.SubtractClass;
import org.example.multiply.MultiplyClass;
import org.example.divide.DivideClass;
public class Main {
    public static void main(String[] args) {
        AddClass add=new AddClass();
        SubtractClass subtract= new SubtractClass();
        MultiplyClass multiply= new MultiplyClass();
        DivideClass divide= new DivideClass();
        int a= 10;
        int b= 5;

        System.out.println("Addition Result "+ add.add(a,b));
        System.out.println("Subtraction Result "+ subtract.subtract(a,b));
        System.out.println("Multiplication Result "+ multiply.multiply(a,b));
        System.out.println("Division Result "+ divide.divide(a,b));
    }
}