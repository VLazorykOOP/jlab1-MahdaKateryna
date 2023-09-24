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

        System.out.print("Input n, n<400: ");
        int n = in.nextInt();

        int[] A = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Input " + i + " element: ");
            A[i] = in.nextInt();
        }

        int maxUnic = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int curNum = A[i];
            boolean Unic = true;

            // Перевірка на унікальність:
            for (int j = 0; j < n; j++) {
                if (i != j && curNum == A[j]) {
                    Unic = false;
                    break;
                }
            }

            if (Unic && curNum > maxUnic) {
                maxUnic = curNum;
            }
        }

        if (maxUnic != Integer.MIN_VALUE) {
            System.out.println("Max unique number: " + maxUnic);
        } else {
            System.out.println("No unique numbers.");
        }



    }
}
