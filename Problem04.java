package com.java;

public class Problem04 {
	public static void main(String[] args) {

        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        StringBuilder result = new StringBuilder();
        result.append("{");

        for (int i = 1; i <= 9; i++) {
            int count = 0;

            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }

            result.append(i).append(": ").append(count);

            if (i < 9) {
                result.append(", ");
            }
        }

        result.append("}");
        System.out.println(result);
    }

}
