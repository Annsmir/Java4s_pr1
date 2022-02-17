package pr1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Predicate<Integer> pow_2 = num -> num > 0 && (num & (num - 1)) == 0;
        System.out.println("Enter the number: ");
        int numb = sc.nextInt();
        System.out.println("Is " + numb + " the power of two: " + pow_2.test(numb));
    }
}
