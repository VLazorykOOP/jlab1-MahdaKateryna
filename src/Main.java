import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Lab 1 Java");
        System.out.println("\t\t\t Task 1");

        System.out.print("Input a: ");
        float a = in.nextFloat();
        System.out.print("Input b: ");
        float b = in.nextFloat();

        float result = (a/(b*b-2)+b/(a*a+2)+(a*b)*(a*b)*(a*b));

        if (b*b == 2)
            System.out.println("Division by 0");
        else
            System.out.println("Result: " + result);



        System.out.println();
        System.out.println("\t\t\t Task 2");



    }
}
