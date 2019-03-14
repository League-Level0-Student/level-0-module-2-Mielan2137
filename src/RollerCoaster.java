import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String ride = JOptionPane.showInputDialog("Whould you like to Ride this ride");
		if (ride.equals("Yes")) {
			System.out.println("Good");
		}
		String height = JOptionPane.showInputDialog(
				"For security purposes we must ask you for your height in inches. How tall are you(in inches");
		int Tip = Integer.parseInt(height);
		if (Tip > 47) {
			System.out.println("Good, You can Ride!");
			JOptionPane.showMessageDialog(null, "Good, You can Ride!");
		}
	else {
			System.out.println("Too Bad Buddy Boy. You Cannot Ride!");
			JOptionPane.showMessageDialog(null, "Too Bad Buddy Boy. You Cannot Ride!");

		}
	}
	}

