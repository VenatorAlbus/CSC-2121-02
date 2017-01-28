import java.util.Arrays;
import util.Keyboard;
import util.RandomPermutation;
import util.WriteTextFile;
import util.ReadTextFile;


public class CreateFilePermutation
{
	public static void main(String[] args)
	{
		//DO THIS
		//use the Keyboard class to obtain the upper integer value
		//also, obtain the file name to save the data later
		util.Keyboard k = util.Keyboard.getKeyboard();
		int cardNum = k.readInt("Please enter the number of cards");


		//DO THIS
		//obtain the random permutation using the upper integer value
		//write out the values to a text file (close the file)
		
		RandomPermutation pp = new RandomPermutation(66, cardNum);
		WriteTextFile write = new WriteTextFile("resources/brass_deck_shuffle.txt");
		while (pp.hasNext() )
		{
		  int randint = pp.next();
		   write.writeLine(randint + "");
		}		
		write.close();

		//DO THIS
		//read the values in from the text file and store them in an integer array
		//it is easiest to read the first line outside of a while loop that tests for EOF
		//use Integer.parseInt() for converting String to int
		int[] cardDeck = new int [cardNum];
		ReadTextFile read = new ReadTextFile("resources/brass_deck_shuffle.txt");
		
		int cardcount=0;
		String currentLine= read.readLine();
		while (!read.EOF())
		{
			int parsedCard = Integer.parseInt(currentLine);
			cardDeck[cardcount++] = parsedCard;
			currentLine = read.readLine();
		}
		read.close();
		
		
		//DO THIS
		//sort the integers (use java.util.Arrays.sort)
		//print them out to make sure they are all there once

		Arrays.sort(cardDeck);
		for (int index=0; index <cardNum; index++)
		{
			System.out.println(cardDeck[index] + "");
		}


	}
}
