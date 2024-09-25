import java.util.*;
abstract class A
{
    abstract void area1();
    abstract void area2();
}
class Area extends A
{
    void area1()
    {
        double r;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius :");
        r = sc.nextDouble();
        area = 3.14*(r*r);
        System.out.println("The area of circle is :"+(area));
    }
    void area2()
    {
        int s;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter side :");
         s= sc.nextInt();
         int ar;
         ar = 4*s;
        System.out.println("The area of Square is :"+(ar));
    }
    public static void main(String args[])
    {
        Area obj = new Area();
        obj.area1();
        obj.area2();
    }
}
