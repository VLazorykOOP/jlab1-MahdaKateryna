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

        float result = (a / (b * b - 2) + b / (a * a + 2) + (a * b) * (a * b) * (a * b));

        if (b * b == 2)
            System.out.println("Division by 0");
        else
            System.out.println("Result: " + result);


//////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("\t\t\t Task 2");

        System.out.print("Input n, n<400: ");
        int n = in.nextInt();

        int[] A1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input " + i + " element: ");
            A1[i] = in.nextInt();
        }

        int maxUnic = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int curNum = A1[i];
            boolean Unic = true;

            // Перевірка на унікальність:
            for (int j = 0; j < n; j++) {
                if (i != j && curNum == A1[j]) {
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


/////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("\t\t\t Task 3");


        System.out.print("Input n: ");
        n = in.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];

        System.out.println("Input elements of matrix A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = in.nextInt();
            }
        }

        System.out.println("Input elements of matrix B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = in.nextInt();
            }
        }

        int[] X = new int[n];


        // Обчислюємо вектор X:

        for (int i = 0; i < n; i++) {
            int negA = 0;
            int negB = 0;

            for (int j = 0; j < n; j++) {
                if (A[i][j] < 0) {
                    negA++;
                }
                if (B[i][j] < 0) {
                    negB++;
                }
            }

            if (negA == negB) {
                X[i] = 1;
            } else {
                X[i] = 0;
            }
        }

        System.out.print("Vector X: ");
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " ");
        }


        ///////////////////////////////////////
        System.out.println();
        System.out.println("\t\t\t Task 4");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String Text = scanner.nextLine();

        String[] words = Text.split("\\s+");

        StringBuilder res = new StringBuilder();

        for (String word : words) {
            char firstChar = word.charAt(0);
            StringBuilder newWord = new StringBuilder().append(firstChar);

            for (int i = 1; i < word.length(); i++) {
                if (Character.toLowerCase(word.charAt(i)) != Character.toLowerCase(firstChar)) {
                    newWord.append(word.charAt(i));
                }
            }

            res.append(newWord.toString()).append(" ");
        }

        System.out.print("Result: ");
        System.out.println(res.toString());

    }}
