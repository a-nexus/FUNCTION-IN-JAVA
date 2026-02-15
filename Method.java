//SO HERE IS MY FIRST FUNCTION PROGRAM IN JAVA

// PRINT A GIVEN IN A FUNCTION

// import java.util.*;
// import java.util.*;
// public class Function{//CLASS NAME 
//     public static void printMyName(String Name){//HERE IS WE DECLARIED OUR FUNCTION
//         System.out.print(Name);
//     }
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER YOUR NAME:");
//         String your=sc.nextLine();
//         printMyName(your);//HERE WE CALL OUR FUNCTION
//     }
// }


//SO IN JAVA THERE THERE IS NOTHING LIKE FUNCTION WHICH IS STANDALONE THERE IS METHOD WHICH IS USED THE MAIN CLASS AND THERE IS TWO TYPE TO WRITE THE METHOD SO 1STLY USING STATIC DATAT TYPE IN WHICH WE DONT HAVE TO CREATE A OBJECT IN OUR MAIN METHOD AND  2CONDLY CREATING A METHOD WITH VOID DATA TYPE IN WHICH WE HAVE TO CRAETE A OBJECT BY WHICH WE CALL METHOD 

// //EXAMPLE BY USING STATIC

// import java.util.*;
// import java.io.*;
// public class Method{
//     public static void printMyName(String Name){//SO HERE WE USE STATIC WITH THE DATA TYPE (VOID) BY WHICH WE DONT HAVE TO CREATE OBJECT IN OUR MAIN METHOD
//         System.out.println(Name);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER YOUR NAME:");
//         String your=sc.nextLine();
//         printMyName(your);//HERE WE CALL OUR FUNCTION WITHOUT CREATING AN OBJECT
//     }
// }


//NEXT EXAMPLE IS REMOVING STATIC AND THEN PRINT MY NAME BY CALLING MY FUNCTION BY CREATING OBJECT

// import java.util.*;
// import java.io.*;
// public class Method{
//     public void printMyName(String Name){
//           System.out.println(Name);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         Method obj=new Method();
//         System.out.print("ENTER YOUR NAME:");
//         String your=sc.nextLine();
//         obj.printMyName(your);
//     }
// }


//NEXT QUESTION MAKE A FUNCTION TO ADD 2 NUMBER AND RETURN THE SUM

// import java.util.*;
// public class Method{
//     public static int calculateSum(int a,int b){
//         int sum=a+b;
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE FIRST NUMBER:");
//         int a=sc.nextInt();
//     System.out.print("ENTER THE SECOND NUMBER:");
//         int b=sc.nextInt();
        
        
//         int sum=calculateSum(a,b);
//         System.out.println(sum);

//     }
// }

//NEXT QUESTION MULTYPLYCATION OF TWO NUMBER BY FUNCTION OR METHOD

import java.util.*;
public class Method{
    public static int multiply(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First Value:");
        int a=sc.nextInt();
       System.out.print("Enter The Second Value:");
        int b=sc.nextInt();
        int mul=multiply(a,b);
        System.out.println(mul);
    }
}