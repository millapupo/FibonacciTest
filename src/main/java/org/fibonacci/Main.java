package org.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int number = scanner.nextInt();
        scanner.close();

        if(checkFibonacci(number)){
            System.out.println(number + " é da sequencia Fibonacci");
        }else {
            System.out.println(number + " não é da sequência Fibonacci");
        }
    }
    private static boolean checkFibonacci(int number) {
        int first = 0;
        int second = 1;
        while(first <= number){
            if(first == number){
                return true;
            }
            int nextNumber = first + second;
            first = second;
            second = nextNumber;
        }
        return false;
    }
}