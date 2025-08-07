package Fibonnacci;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int x = 3;
        System.out.println("Insira um número natural para descobrir o número Fibonacci nesta posição");
        n = scanner.nextInt();
        int[] fib = new int[n+1];
        if(n == 1 || n == 2) {
            System.out.println("Número Fibonacci posição 2 = "+1);
        }else if(n == 0) {
            System.out.println("Número Fibonacci posição 0 = "+0);
        }else {
            System.out.println("O número Fibonacci na posição "+ n+ " corresponde a "+ fibonacci(n, fib, x));
        }

    }

    public static int fibonacci(int n, int[] fib, int x) {
        fib[0] = 1;
        fib[1] = 1;
        fib[2] = 2;
        fib[x] = fib[x-1] + fib[x-2];
        if (x<n) {
            return fibonacci(n, fib,x+1);
        } else {
            return fib[x-1];
        }
    }
}
