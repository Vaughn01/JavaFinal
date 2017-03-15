/**
 * 
 */
package FinalProject;

import java.util.Random;

import javax.swing.JOptionPane;

/**
 * @author TV111790
 *
 */
public class Decision {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Random r = new Random();
		final int LOW = 1;
		final int HIGH = 12;
		String message = null;
		int comGuessKiller = r.nextInt(12) + LOW;
		Object[] People = {"Brosius", "Ress", "Tatyana", "Charles", "Kassie", "Nick", "Andrew", "Sebastian", "Zach", "Chase", "Isaiah", "Mason"};
		int guessKiller = JOptionPane.showOptionDialog(null, "Who do you believe is the murderer?", "Choose a person", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, People, People[0] );
		
		if(guessKiller == comGuessKiller)
		{
			JOptionPane.showMessageDialog(null,"Congratulations, You have chosen correctly! There have been no more killings.");
			JOptionPane.showMessageDialog(null, guessKiller + "has been arrested and charged with murder...");
			JOptionPane.showMessageDialog(null, "You leave the class realizing that programming is not your suit, but instead you go on to become a detective. You are now safe, for now...");
			JOptionPane.showMessageDialog(null, "Meanwhile, " + comGuessKiller + " has escaped from prison, finds your picture and says, “I’m coming for you, detective… ");
			JOptionPane.showMessageDialog(null, "To be continued...");
		}

		else
		{
			JOptionPane.showMessageDialog(null, "LIGHTS FLASH!!!! THUNDER SOUNDS!!! ");
			JOptionPane.showMessageDialog(null, "You have chosen WRONG! " + guessKiller + "has been MURDERED!!! There is a note right by the body.");
		}

	}

}
