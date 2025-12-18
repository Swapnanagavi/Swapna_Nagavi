package com.java;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int odd = 2 * i + 1;

            if (i < a - 1) {
                System.out.print(odd + ", ");
            } else {
                System.out.print(odd);
            }
        }

        sc.close();
	}

}
