/**
 * 
 */
package FinalProject;

import javax.swing.JOptionPane;

/**
 * @author TV111790
 *
 */
public class MadLibs {

	/**
	 * @param args
	 */
	public static void madLib()
	{
	String userName, userAge, userHomeLand, userFavFood, userPurpose;
	
	userName = JOptionPane.showInputDialog(null, "What is your name?");
	userAge = JOptionPane.showInputDialog(null, "What is your age?");
	userHomeLand = JOptionPane.showInputDialog(null, "Where are you from? ");
	userFavFood = JOptionPane.showInputDialog(null, "What is your favorite food? ");
	userPurpose = JOptionPane.showInputDialog(null, "Why did you join this class? ");
	
	JOptionPane.showMessageDialog(null, "Your name is " + userName + " , you are " + userAge + " years old, you are from " + 
	userHomeLand + ", your favorite food is " + userFavFood + 
	" and you decided to join my class because you said '" + userPurpose + ".");
	}
}
