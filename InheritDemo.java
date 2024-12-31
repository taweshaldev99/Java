import java.io.*;
import java.util.*;

public class InheritDemo {
    int Salary= 100000;
}

 class Object extends InheritDemo{
    int Bonus= 4000;
}
 class Calc{
    public static void main(String[] args){
        Object obj = new Object();
        System.out.println(" Salary is: " +obj.Salary +"\nBonus is  " +obj.Bonus );
    }

 }
