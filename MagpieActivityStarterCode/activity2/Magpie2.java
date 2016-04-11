/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if (statement.indexOf("you") >= 0
                 || statement.indexOf("your") >= 0) {
            response = "Let's talk less about me, more about you.";
        }
        else if (statement.indexOf("suck") >= 0
                 || statement.indexOf("hate") >= 0
                 || statement.indexOf("stupid") >= 0) {
            response = "That's mean :(";
        }
        else if (statement.trim().equals("")) {
            response = "...Excuse me?";
        }
        else if (statement.indexOf("restaurant") >= 0) {
            response = "I found 12 restaurants in your area.";
        }
        else if (statement.indexOf("yes") >= 0) {
            response = "That's what I thought.";
        }
        else if (statement.indexOf("Sebastian") >= 0
        	|| statement.indexOf("Matthew") >= 0) {
            response = "Oh, I heard he's the best.";
        }
        else if (statement.indexOf("love") >= 0) {
            response = "The feeling is not mutual.";
        }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}
}
