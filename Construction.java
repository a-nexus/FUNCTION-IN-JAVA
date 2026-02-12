// import java.util.*;
// public class Construction{
//      double area;
//      final double pi=3.14;
//      int r;
//      public Construction(int radius){
//         r=radius;
//         area=pi*r*r;
//         System.out.println(area);
//    }
//    public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     System.out.print("ENTER THE RADIUS VALUE:");
//     int radius=sc.nextInt();
//     Construction area=new Construction(radius);

//    }
// }


//NEXT QUESTION IS MULTIPLICATION OF TWO NUMBER

import java.util.*;
public class Construction{
    int a;
    int b;
    int product;
    public Construction(int num1,int num2){
        a=num1;
        b=num2;
        product=a*b;
        System.out.println(product);
        
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE FIRST VALUE:");
        int num1=sc.nextInt();
               System.out.print("ENTER THE SECOND VALUE:");
        int num2=sc.nextInt();
        Construction product=new Construction(num1, num2);
    }
}