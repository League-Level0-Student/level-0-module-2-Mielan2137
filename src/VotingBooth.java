import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String GoodMorning = JOptionPane.showInputDialog("Good morning, How are you today?");
	if (GoodMorning=="Good"||GoodMorning=="Fine") {
		System.out.println("Very Well, Good to Hear");
		JOptionPane.showMessageDialog(null, "Very Well, Good To Hear");
	}
	String Age= JOptionPane.showInputDialog("What is your Age?");
	int Bar = Integer.parseInt(Age);
	if (Bar>17) {
		System.out.println("Who do you beleive should be president this upcoming term?");
	JOptionPane.showInputDialog("Who do you beleive should be president this upcoming term?");
}
}
}
