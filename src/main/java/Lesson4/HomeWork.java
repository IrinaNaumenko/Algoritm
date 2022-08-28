package Lesson4;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(pov(2,4));

    }
    private static long pov( long x, long n) {
        if (n ==0) {
            return 1;
        }
        if (n == 1) {
            return  x;
        }

        return x * pov(x, n-1);
    }
}
