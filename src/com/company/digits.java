package com.company;
import java.util.Scanner;

public class digits {

    public static void main(String[] args) {
        String input;
        int digit1 = 0, digit2 = 0, digit3 = 0, digit4Plus = 0;
        Scanner sc = new Scanner(System.in);

	    System.out.print("Insert a number: ");
	    input = sc.nextLine();

	    while (!input.equals("end")) {
	        int num = Integer.parseInt(input);

	        if (num != 0) {
	            if (num / 10 == 0) {
	                digit1++;
                }
	            else if (num / 100 == 0) {
	                digit2++;
                }
	            else if (num / 1000 == 0) {
	                digit3++;
                }
	            else
	                digit4Plus++;
            }
	        input = sc.nextLine();
        }
	    System.out.println("One: " + digit1 + " Two: " + digit2 + " Three: " + digit3 + " Four or More: " + digit4Plus);
    }
}
