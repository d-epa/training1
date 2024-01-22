

 import java.util.Scanner;

public class sub
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("To find the areas of following press:");
        System.out.println("1 for the Area of a Circle");
        System.out.println("2 for the Area of a Square");
        System.out.println("3 for the Area of a Right Angled Triangle");
        System.out.println("4 for the Area of a Rectangle");
        System.out.println("5 for the Circumference of a Circle");
        System.out.println("6 for the Perimeter of a Square");
        System.out.println("7 for the Perimeter of a Rectangle");
        System.out.println("Enter your Choice:");
        int ch = sc.nextInt();

        switch(ch)
        {
            case 1: System.out.println("Enter radius for the circle:");
                float r = sc.nextFloat();
                float area = 3.14f*r*r;
                System.out.println("Area:"+area);
                break;

            case 2: System.out.println("Enter side for square:");
                int s = sc.nextInt();
                int ae = s*s;
                System.out.println("Area:"+ae);
                break;

            case 3: System.out.println("Enter height and base for traingle:");
                float h = sc.nextFloat();
                float bs = sc.nextFloat();
                float ar = 0.5f*h*bs;
                System.out.println("Area:"+ar);
                break;

            case 4: System.out.println("Enter length and breadth for rectangle:");
                int l = sc.nextInt();
                int b = sc.nextInt();
                int aa = l*b;
                System.out.println("Area:"+aa);
                break;

            case 5: System.out.println("Enter radius for circle:");
                float rad = sc.nextFloat();
                float cir = 3.14f*2f*rad;
                System.out.println("Circumference:"+cir);
                break;


            case 6: System.out.println("Enter side for square:");
                int side = sc.nextInt();
                int peri = 4*side;
                System.out.println("Perimeter:"+peri);
                break;

            case 7: System.out.println("Enter length and breadth for rectangle:");
                int lg = sc.nextInt();
                int br = sc.nextInt();
                int per = 2*(lg+br);
                System.out.println("Perimeter:"+per);
                break;

            default:System.out.println("Invalid Input");
                break;
        }
    }
}