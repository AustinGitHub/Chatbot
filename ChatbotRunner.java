import java.util.Scanner;

public class ChatbotRunner
{

	/**
	 * Create a chatbot, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Chatbot maggie = new Chatbot();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
