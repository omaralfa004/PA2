import java.util.Scanner;
public class Main
{
    public static void main(String[] Strings)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Solving Quadratic Equation ax2+bx+c=0 \nEnter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);

            double r11 = Math.round(r1*100)/100;
            double r22 = Math.round(r2*100)/100;
            System.out.println("The roots are " + r11 + " and " + r22);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            double r11 = Math.round(r1*100)/100;
            System.out.println("The root is " + r11);
        }
        else
        {

            System.out.println("Roots are imaginary.");
        }
    }
}