package extra;
import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {

	String Where = JOptionPane.showInputDialog("Which number will I start counting down From?");
	
	int Bar = Integer.parseInt(Where);
	
	for (int i = Bar; i >=1; i--) {
		System.out.println(i);
		speak(i+"");	
	}
	speak("Blast off");
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


