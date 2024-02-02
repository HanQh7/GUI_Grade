
package h1;
import javax.swing.*;
public class Grade_GUI {

	public static void main(String[] args) {
		
		String str=JOptionPane.showInputDialog(null,"Enter your grade :");
		
		int Grade=Integer.parseInt(str);
		
		if (Grade > 60) {
		
		JOptionPane.showMessageDialog(null," Your PASS");
		}
		else {
			JOptionPane.showMessageDialog(null," Your not PASS");
		}
		
		
		
		
		if (Grade >=95&& Grade<=100) {
			JOptionPane.showMessageDialog(null," Your grade is A");
		}
		
		else if (Grade >=85&& Grade<=90) {
			JOptionPane.showMessageDialog(null," Your grade is B");
		}
		else if (Grade >=75&& Grade<=80) {
			JOptionPane.showMessageDialog(null,"Your grade is C");
			
		}
		else if (Grade >=65&& Grade<=70) {
			JOptionPane.showMessageDialog(null," Your grade is D");
		}
		else  {
			JOptionPane.showMessageDialog(null," Your grade is F");
		}
	}

	}
	

