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
public class GameClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		//Find multiple choice, copy and paste program
		Random r = new Random();
		final int LOW = 1;
		final int HIGH = 12;
		int comGuessKiller = r.nextInt(12) + LOW;
		Object[] People = {"Brosius", "Ress", "Tatyana", "Charles", "Kassie", "Nick", "Andrew", "Sebastian", "Zach", "Chase", "Isaiah", "Mason"};
		int guessKiller = JOptionPane.showOptionDialog(null, "Who do you believe is the murderer?", "Choose a person", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, People, People[0] );
		switch(guessKiller)
		 {
			case 0:

			 Decision();
			 break;
			 
		
			case 1:
				 Decision();
			break;
		
		
			case 2:
				 Decision();
			break;
		
			case 3:
				 Decision();
			break;
			case 4:
				 Decision();
			break;
			case 5:
				 Decision();
			break;
			case 6:
				 Decision();
			break;
			case 7:
				 Decision();
			break;
			case 8:
				 Decision();
			break;
			case 9:
				 Decision();
			break;
			case 10:
				 Decision();
			break;
			case 11:
				 Decision();
			break;
			case 12: 
			default:
				JOptionPane.showMessageDialog(null, "Now that you have gotten to know some people, you slowly ease into your homework assignments.");
		
		if(guessKiller == comGuessKiller)
		{
			JOptionPane.showMessageDialog(null,"Congratulations, You have chosen correctly! There have been no more killings.");
			JOptionPane.showMessageDialog(null, guessKiller + "has been arrested and charged with murder...");
			JOptionPane.showMessageDialog(null, "You leave the class realizing that programming is not your suit, but instead you go on to become a detective. You are now safe, for now...");
			JOptionPane.showMessageDialog(null, "Meanwhile, " + comGuessKiller + " has escaped from prison, finds your picture and says, 的知 coming for you, detective� ");
			JOptionPane.showMessageDialog(null, "To be continued...");
		}

		else
		{
			JOptionPane.showMessageDialog(null, "LIGHTS FLASH!!!! THUNDER SOUNDS!!! ");
			JOptionPane.showMessageDialog(null, "You have chosen WRONG! " + guessKiller + "has been MURDERED!!! There is a note right by the body.");
		}
			 }
	}

	private static void Decision() 
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
			JOptionPane.showMessageDialog(null, "Meanwhile, " + comGuessKiller + " has escaped from prison, finds your picture and says, 的知 coming for you, detective� ");
			JOptionPane.showMessageDialog(null, "To be continued...");
		}

		else
		{
			JOptionPane.showMessageDialog(null, "LIGHTS FLASH!!!! THUNDER SOUNDS!!! ");
			JOptionPane.showMessageDialog(null, "You have chosen WRONG! " + guessKiller + "has been MURDERED!!! There is a note right by the body.");
		}
		public static void Names(String[] args) 
		{
			String[] names = new String[12];
			{
				names[0] = "Brosius";
				names[1] = "Ress";
				names[2] = "Tatyana";
				names[3] = "Charles";
				names[4] = "Kassie";
				names[5] = "Nick";
				names[6] = "Andrew";
				names[7] = "Sebastian";
				names[8] = "Zach";
				names[9] = "Chase";
				names[10] = "Isiah";
				names[11] = "Mason";
			
			}

	}
}
