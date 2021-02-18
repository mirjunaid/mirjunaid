import java.util.Scanner;

public class NthTermofAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first term of the arithmetic progression: ");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the common difference of the AP: ");
        int cd = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the number of terms of the AP: ");
        int n = scanner2.nextInt();
        int Tn = a + (n - 1 )*cd;
        System.out.println("The Nth term of the arithmetic progression is: "+Tn);

    }

}
