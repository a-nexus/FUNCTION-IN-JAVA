//SO HERE IS MY FIRST FUNCTION PROGRAM IN JAVA

// PRINT A GIVEN IN A FUNCTION

import java.util.*;
import java.util.*;
public class Function{//CLASS NAME 
    public static void printMyName(String Name){//HERE IS WE DECLARIED OUR FUNCTION
        System.out.print(Name);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR NAME:");
        String your=sc.nextLine();
        printMyName(your);//HERE WE CALL OUR FUNCTION
    }
}

