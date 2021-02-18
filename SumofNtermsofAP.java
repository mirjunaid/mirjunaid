import java.util.Scanner;

public class SumofNtermsofAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first term of the AP: ");
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter common difference of the AP: ");
        int cd = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the number of terms of the AP: ");
        float n = scanner2.nextInt();
        float Sn = n/2*(2*a+(n-1)*cd);
        System.out.println("The sum of N terms of the AP is: "+Sn);
    }
}
