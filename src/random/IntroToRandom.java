//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class IntroToRandom {
	public static void main(String[] args) {
		String Simba = JOptionPane.showInputDialog("Woud you like a random number?");
		if (Simba.equals("Yes")) {
			System.out.print("Good");
			Random Steve = new Random();
			int num = Steve.nextInt(11);
			System.out.print(num);
			JOptionPane.showMessageDialog(null, "Your number is " + num);
		}
		String Parce = JOptionPane.showInputDialog("Select a number between 1 & 10");
		String Cuco = JOptionPane.showInputDialog("Are you ready to play for luck?");
		if (Cuco.equals("Yes")) {
			Random Steve = new Random();
			int num = Steve.nextInt(11);
			System.out.print(num);
			JOptionPane.showMessageDialog(null, "The number is " + num);

			String Capo = JOptionPane.showInputDialog("Was your number right? " + num);
			if (Capo.equals("Yes")) {
				JOptionPane.showMessageDialog(null, "Great");
			}
		}
	}
}

//3. Now make r random. 
//   Create an object of the Random class
//	 use .nextInt() to get a random number

//4. Limit the random number between 0 and 100

//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value

//6. Challenge: Limit the random number between -222 and 88

//1. Print out the value of r

//2. Run the program.  What number appears in the console?
//   Run it again. Is the number the same?