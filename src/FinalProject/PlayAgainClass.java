/**
 * 
 */
package FinalProject;

import javax.swing.JOptionPane;

/**
 * @author TV111790
 *
 */
public class PlayAgainClass 
{

	/**
	 * @param args
	 */
	public static void PlayAgainClass()
	{
		{
			//This asks the user if they would like to learn more. If they select yes, then it will ask the question. Otherwise the selection no will take you to the story line.
			Object[] People = {"Yes", "No" };
			int n = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Choose a person", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, People, People[0] );
			//This part decides the decision
			do{
			switch(n)
				 {
					case 0:
		
					MainGameClass();
				 }
		 n = JOptionPane.showOptionDialog(null, "Do you want to play again?", "Choose a person", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, People, People[0] );
				 }while(n==0);
				 
			if(n==1)
			{
JOptionPane.showMessageDialog(null, "Hope you had fun!! and survived... ");	
			}

	

}
	}

	private static void MainGameClass() 
	{
		{
			//This is the first part of the story line.
			DialogClass.prologue();
			//This is where it will ask you who is the murderer and what happens...
			LoopingClass.LoopingClass();
			//These are the ending results.
			Decision.Decision(); 
			//This part of the program asks the user if they want to play again. Otherwise the game ends.
		}
		
	}
	}
