//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		
		double cc = Math.random() * 3;
		int cc2 = (int) cc;
		if(cc2 == 0) {
			compChoice = "r";
		} else if (cc2 == 1) {
			compChoice = "p";
		} else if (cc2 == 2) {
			compChoice = "s";
		}
		setPlayers(player);
		
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals(compChoice)) {
			winner = "! Draw Game !";
		} else if(playChoice == "r" && compChoice == "s" || playChoice == "p" && compChoice == "r" || playChoice == "s" && compChoice == "p") {
			winner = "!Player Wins!" + playChoice + " beats " + compChoice;
		} else {
			winner = "Computer Wins! " + compChoice + " beats " + playChoice;
		}
		return winner;
	}

	public String toString()
	{
		String output="";
		output += "Player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + determineWinner();
		return output;
	}
}