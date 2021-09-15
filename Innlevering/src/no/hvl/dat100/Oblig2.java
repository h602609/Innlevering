package no.hvl.dat100;
import javax.swing.JOptionPane.*;
import java.util.Scanner;

public class Oblig2 {

	public static void main(String[] args) {

		
		
		for(int b = 0; b < 10; b++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Skriv inn poengsum:");

			int a = scan.nextInt();
			System.out.println(a);
			
			System.out.println(b);
			if (90 <= a && a <= 100) {
				System.out.println("A");
			} else if (89 >= a && a >= 80) {
				System.out.println("B");
			} else if (79 >= a && a >= 60) {
				System.out.println("C");
			} else if (59 >= a && a >= 50) {
				System.out.println("D");
			} else if (49 >= a && a >= 40) {
				System.out.println("E");
			} else if (39 >= a && a >= 0) {
				System.out.println("F");
			} else {
				System.out.println("Ugyldig");
				b--;
			}

		}

}

}

	
