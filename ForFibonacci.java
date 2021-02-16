public class ForFibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, result,i ,n = 10;
        System.out.println("The first " +n+" terms of the fibonacci series are: ");
        System.out.println(a);
        for (i = 0;i<n;i++){
            result = a + b;
            a = b;
            b = result;
            System.out.println(+result);
        }
    }
}
