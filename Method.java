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

// import java.util.*;
// public class Method{
//     public static int multiply(int a,int b){
//         int mul=a*b;
//         return mul;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter The First Value:");
//         int a=sc.nextInt();
//        System.out.print("Enter The Second Value:");
//         int b=sc.nextInt();
//         int mul=multiply(a,b);
//         System.out.println(mul);
//     }
// }

//NEXT QUESTION 
//FINDING FACTORIAL USING FUNCTION

// import java .util.*;
// public class Method{
//     public static int findFactorial(int fact){
//         if(fact<0){
//             System.out.println("INVALID NUMBER");
//             return 0;
//         }
//         int sum=1,temp;
//         temp=fact;
//         for(int i=temp;i>0;i--){
//         sum=sum*i;
//         }
//         return sum;//SO HERE I RETURN THE VALUE OF THE SUM WHICH IS ACTAUALLY THE FACTORIAL OF THE NUMBER GIVEN BY THE USER WHICH IS GONE IN THE MAIN METHOD AND PRINT THE VALUE OF THE FACTORIAL
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE NUMBER:");
//         int fact=sc.nextInt();
//         System.out.println("THE FACTORIAL OF THE NUMBER IS:"+findFactorial(fact));//HERE IS THE THE CALLING METHOD AND ALSO THE PRINTING AFTER THE RETURNED VALUE
//     }
// }

// ENTER 3 NUMBERS FROM THE USER & MAKE A FUNCTION TO PRINT THEIR AVERAGE.

// import java.util.*;
// public class Method{
//     public static double average(int num){
//         Scanner sc=new Scanner(System.in);
//         double sum=0;
//         double[] arr=new double[num];
//         for(int i=0;i<num;i++){
//             System.out.print((i+1)+"INDEXED VALUE=");
//             arr[i]=sc.nextDouble();
//          sum+=arr[i];
              
//         }
//         return sum/num;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE NUMBER HOW MANY YOU WANT:");
//         int value=sc.nextInt();
//         System.out.println("THE AVERAGE IS="+average(value));
//     }
// }

//2. WRITE A FUNCTION TO PRINT THE SUM OF ALL ODD NUMBERS FROM 1 TO N. 

// import java.util.*;
// public class Method{
//     public static int oddSum(int num){
//         int sum=0;
//         for(int i=1;i<=num;i++){
//             if(i%2!=0){
//                 sum+=i;
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE VALUE WHERE YOU WANT TO CHECK AND ADD THE ODD NUMBER:");
//         int num=sc.nextInt();
//         System.out.println("The Sum Of The Odd Numbers Between Your Given Number="+ oddSum(num));
//     }
// }

// 3. WRITE A FUNCTION WHICH TAKES IN 2 NUMBERS AND RETURNS THE GREATER OF THOSE 
//TWO.

// import java.util.*;
// public class Method{
//     public static int greaterNumber(int num,int num2){
//         if(num>num2){
//             return num;
//         }else{
//             return num2;
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE FIRST NUMBER:");
//         int num1=sc.nextInt();
//          System.out.print("ENTER THE SECOND NUMBER:");
//         int num2=sc.nextInt();
//         System.out.println("THE GREATEST NUMBER="+greaterNumber(num1,num2));


//     }
// }

// Write a function that takes in age as input and returns if that person is eligible 
// to vote or not. A person of age > 18 is eligible to vote. 

// import java .util.*;
// public class Method{
//     public static void eligibleChecking(int age){
//         if(age>=18){
//             System.out.println("YOU ARE ELIGIBLE FOR VOTING:");
//         }else{
//             System.out.println("NO YOU ARE NOT");
//         }

//     } 
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("ENTER THE AGE");
//         int age=sc.nextInt();
//         eligibleChecking(age);
//     }

// }


// . WRITE AN INFINITE LOOP USING DO WHILE CONDITION. 


// import java.util.*;
// public class Method{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         do{
//             if(2>1){
//                 System.out.println("*");

//             }
//         }while(true);
//     }
// }


//NEXT QUESTION
//WRITE A PROGRAM TO ENTER THE NUMBERS TILL THE USER WANTS AND AT THE END IT 
// SHOULD DISPLAY THE COUNT OF POSITIVE, NEGATIVE AND ZEROS ENTERED. 


// import java.util.*;
// public class Method{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int pos=0,neg=0,zero=0;
//        int i=0;
//         System.out.print("ENTER THE NUMBER HOW MUCH YOU WANT TO ENTER:");
//         int num=sc.nextInt();


//         do{//SO IN THIS QUESTION WE USE DO WHILE LOOP BY 
//             int num2=sc.nextInt();
//             if(num2>0){
//                 pos++;

//             }else if(num2<0){
//                 neg++;

//             }else{
//                 zero++;
//             }
//             i++;
            
//         }while(i<num);
//         System.out.println("THE POSITIVE INTEGERS ARE:"+pos);
//          System.out.println("THE NEGETIVE INTEGERS ARE:"+neg);
//           System.out.println("THE ZERO ARE:"+zero);
//     }
// }


//NEXT QUESTION
//TWO NUMBERS ARE ENTERED BY THE USER, X AND N. WRITE A FUNCTION TO FIND 
// THE VALUE OF ONE NUMBER RAISED TO THE POWER OF ANOTHER I.E. .X POWERS N 

// import java.util.*;
// import java.lang.Math;
// public class Method{
//     public static double displayPower(int x,int n){
//     double power=Math.pow(x,n);
//     return power;
//     }
//     public static void main(String[] args){
//      Scanner sc=new Scanner(System.in);
//      System.out.print("ENTER THE NUMBER:");
//      int x=sc.nextInt();
//      System.out.print("ENTER THE NUMBER WHICH YOU WANT TO GIVE POWER:");
//      int n=sc.nextInt();
//      System.out.println("THE VALUE IS AFTER POWERING="+ displayPower(x,n));
//     }
// }


//NEXT QUESTION
//WRITE A PROGRAM TO PRINT FIBONACCI SERIES OF N TERMS WHERE N IS INPUT 
// BY USER : 
// 0 1 1 2 3 5 8 13 21 ... 

// import java.util.*;
// public class Method{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num;
//         System.out.print("ENTER THE NUMBER WHERE YOU WANT TO FIBANACCI SERIES");
//          num=sc.nextInt();
//         int[] arr=new int[num];
//         arr[0]=0;
//         arr[1]=1;
//         for(int i=2;i<num;i++){
//             arr[i]=arr[i-1]+arr[i-2];

//         }
//         for(int i=0;i<num;i++){
//             System.out.print(arr[i]+"\t");
//         }

//     }
// }

//WRITE A PROGRAM IN JAVA THAT DEFINE THE CLASS STUDENT WITH THE FOLLOWING DETAILS AS VARIABLE WITHIN IT
//USN,NAME,BRANCH,PHONE,PERCENTAGE.
//WRITE A PROGRAM IN JAVA TO CREATE A STUDENT OBJECT AND PRINT THE USN,NAME,BRANCH,PHONE,PERCENTAGE OF THESE VARIABLE WITH SUITABLE HEADING 

//    
//WRITE A PROGRAM TO CRATE A CLASS CALLED SHAPE WITH METHOD CALLED GETPARAMETER () & GETAREA  CREATE A SUBCLASS CALLED CIRCLE THAT OVERRIDE THE GET PARAMETER AND GETAREA () METHOD TO CALCUTE AREA & PERIMETER OF CIRCLE 

// import java.util.*;

//  class Shape{
//     public void getParameter(){
//         System.out.println("PARAMETER OF THE CIRCLE");
//     }
//     public void getArea(){
//         System.out.println("AREA OF THE CIRCLE");
//     }
   
//     }
//      class Circle extends Shape{
//         double radius;
//         Circle(double r){
//             radius=r;
//         }
//         @Override
//        public void getParameter(){
//             double parameter=2* Math.PI * radius;
//            System.out.println("PARAMETER OF THE CIRCLE="+parameter);
//         }
//         @Override
//         public void getArea(){
//             double area=Math.PI*radius*radius;
//             System.out.println("AREA OF THE CIRCLE="+area);
//         }
//  }
// public class Method{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//      System.out.print("ENTER THE RADIUS:");
//      double r=sc.nextDouble();
//         Circle obj=new Circle(r);
//         obj.getParameter();
//         obj.getArea();
//     }

// }
// import java.util.*;
// class Shape{
//     void getParameter(){
//         System.out.print("FIONDING PAREAMETER");
//     }
//     void getArea(){
//         System.out.print("FINDING AREA");
//     }

// }
// class Circle extends Shape{
//     double radius;
//     Circle(double r){
//     radius=r;
//     }
//     @Override
//     void getParameter(){
//         double parameter=2*Math.PI*radius;
//         System.out.println("THE PARAMETER OF THE CIRCLE="+parameter);
//     }   
//     @Override
//     void getArea(){
//         double area=Math.PI*radius*radius;
//         System.out.println("THE AREA OF THE CIRCLE="+area);
//     }
// }
// public class Method{
//     public static void main(String[] args){
//       Scanner sc=new Scanner(System.in);
//       System.out.print("ENTER THE RADIUS OF THE CIRCLE:");
//       double r=sc.nextDouble();
//       Circle obj=new Circle(r);
//       obj.getParameter();
//       obj.getArea();
//     }
// }

//WAJP TO CREAT A CLASS EMPLOYEE WITH THE METHOD CALLED CALCULATE SALARY CREATE TWO SUB CLASS MANAGER AND STAFF IN EACH SUB CLASS OVERRIDE THE CALCULATE SALARY TO CALCULATE AND RETURN THE SALARY BASED ON THEIR SPEICIFIC ROLE

import java.util.*;
class Employee{
    void calculateSalary(){
        System.out.println("CALCULATE SALARY");
    }
}
class Manager extends Employee{
    int a,b,c,d;
    Manager(int grossSalary,int netSalary,int allowances,int perquisite){
        a=grossSalary;
        b=netSalary;
        c=allowances;
        d=perquisite;
    }
     @Override
     void calculateSalary(){
       int salary=a+b+c+d;
       System.out.println("THE SALARY OF THE MANAGER="+salary);
     }
}
class Staff extends Employee{
    int a,b,c,d;
    Staff(int grossSalary,int netSalary,int allowance,int perquisite){
        a=grossSalary;
        b=netSalary;
        c=allowance;
        d=perquisite;
    }
    @Override
    void calculateSalary(){
        int salary=a+b+c+d;
        System.out.println("THE SALARY OF THE STAFF="+salary);
    }
}
public class Method{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER 'M' IF YOU ARE MANAGER AND INTER 'S' IF YOU ARE EMPLOYEE:");
        String alpha=sc.next();
        switch(alpha){
            case "M" : System.out.print("ENTER THE GROSS SALARY:");
                      int gs=sc.nextInt();
                      System.out.print("ENTER THE NET SALARY:");
                      int ns=sc.nextInt();
                      System.out.print("ENTER THE ALLOWANCES:");
                      int aw=sc.nextInt();
                      System.out.print("ENTER THE PERQUISITE:");
                      int pr=sc.nextInt();
                      Manager obj=new Manager(gs,ns,aw,pr);
                      obj.calculateSalary();
                      break;
            case "S":System.out.print("ENTER THE GROSS SALARY:");
                      int gas=sc.nextInt();
                      System.out.print("ENTER THE NET SALARY:");
                      int nas=sc.nextInt();
                      System.out.print("ENTER THE ALLOWANCES:");
                      int aaw=sc.nextInt();
                      System.out.print("ENTER THE PERQUISITE:");
                      int par=sc.nextInt();
                      Staff obj1=new Staff(gas,nas,aaw,par);
                      obj1.calculateSalary();
                      break;
            default : System.out.println("INVALID INPUT");


        }
    }
}