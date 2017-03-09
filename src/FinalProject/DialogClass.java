/**
 * 
 */
package FinalProject;

import javax.swing.JOptionPane;

/**
 * @author RA316282
 *
 */
public class DialogClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		prologue();
		

	}
	public static void prologue()
	{
		JOptionPane.showMessageDialog(null, "You were recently just added into a class called Java Programming. The principal decides to walk to where your next class you will be. She walks you to the class number 161.");
		JOptionPane.showMessageDialog(null, "Principal: Alright, here we are. This is room number 161, Java Programming and your teacher will be Mr. Brosius, the best teacher in the school, or so they say…. Anyway, this class will last for only one quarter so make the best of it.");
		JOptionPane.showMessageDialog(null, "You: Thank you. I will try.");
		JOptionPane.showMessageDialog(null, "Principal: This class is going to be very difficult... Not many people survive the whole class for long... ");
		JOptionPane.showMessageDialog(null, "You: Don’t worry, I have had experience with programming with C++. So this would be easy.");
		JOptionPane.showMessageDialog(null, "You start to open the door when the principal shouts to you.");
		JOptionPane.showMessageDialog(null, "Principal: That is what they all say…. Regardless, I wish you the best of luck, you will need it.");
		JOptionPane.showMessageDialog(null, "You turn to find that the principal has disappeared. A little creeped out you walk into the room, to find it full of students working on the computers, already starting the assignments.");
		JOptionPane.showMessageDialog(null, "Mr. Brosius: Hello and welcome to the best class in the entire school!!! Tell me a little bit about yourself.");
		JOptionPane.showMessageDialog(null, "You tell him your name, your age, where you are from, your favorite food, and why you joined this class. ");
		
		madLib();
		
		JOptionPane.showMessageDialog(null, "Um... Interesting… Well, the class has already started on their first assignment. Here’s your book, there is your seat, and get to work. NOW!");
		JOptionPane.showMessageDialog(null, "He has already sat in his seat by the time you are able to register anything. You take your book and sit in your seat. The person next to you decides to greet you.");
		JOptionPane.showMessageDialog(null, "Person next to you: Hi! My name is Charles. I guess you are my partner for the next 9 weeks! From what I can tell, you don’t seem to know anyone from this class! Don’t worry, I know everyone here, just ask me, and I can tell you anything you would like about someone. ");
		

	}
	public static void madLib()
	{
	String userName, userAge, userHomeLand, userFavFood, userPurpose;
	
	userName = JOptionPane.showInputDialog(null, "What is your name?");
	userAge = JOptionPane.showInputDialog(null, "What is your age?");
	userHomeLand = JOptionPane.showInputDialog(null, "Where are you from? ");
	userFavFood = JOptionPane.showInputDialog(null, "What is your favorite food? ");
	userPurpose = JOptionPane.showInputDialog(null, "Why did you join this class? ");
	
	JOptionPane.showMessageDialog(null, "Your name is " + userName + " , you are " + userAge + " years old, you are from " + userHomeLand + ", your favorite food is " + userFavFood + " and you decided to join my class because you said '" + userPurpose + ".");
	}
}
