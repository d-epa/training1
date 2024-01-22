import java.util.Scanner;

public class circle
{
    public static void main(String []args)
    {
        AreaOfCircle area = new AreaOfCircle();

        area.readRadius();
        System.out.println("Area of Circle : " + area.getArea());
    }
}
class AreaOfCircle
{
    private float rad = 0.0f;
    private float area;

    {
        area = 0.0f;
    }

    public void readRadius()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        rad = input.nextFloat();
    }

    public float getArea()
    {
        area = (float)Math.PI*rad*rad;
        return area;
    }
}
