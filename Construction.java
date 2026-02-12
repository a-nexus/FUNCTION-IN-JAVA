import java.util.*;
class Construction{
     double area;
     final double pi=3.14;
     int r;
     public Construction(int radius){
        r=radius;
        area=pi*r*r;
        System.out.println(area);
   }
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER THE RADIUS VALUE:");
    int radius=sc.nextInt();
    Construction area=new Construction(radius);

   }
}