/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
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
        statement = statement.toLowerCase();
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
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("mr.") >= 0
                || statement.indexOf("ms.") >= 0){
            response = "They sound like a good teacher.";
        }
        else if(statement.trim().length() == 0){
            response = "Talk to me!";
        }
        else if(statement.indexOf("I want") <= 0){
            int space2 = statement.indexOf(" ",statement.indexOf("I want") + 6);
            String smth = statement.substring(statement.indexOf("I want") + 6,space2);
            response = "Would you really be happy if you had " + smth + "?";
        }
        
        // Question.Activity2.1: There is a keyword 
          //    inside a larger word that has a different meaning.
          //    For example, the computer looks at "know" and see that substring(1,3) == "no",
          //    so it will think the person is being negative. 
        
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
        final int NUMBER_OF_RESPONSES = 6;
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
        else if (whichResponse == 4)
        {
            response = "I'm sorry, I don't understand.";
        }
        else if (whichResponse == 5)
        {
            response = "Could you phrase that differently?";
        }
            return response;
        }
    
    private int findKeyword(String statement, String goal, int startPos)
    {
         String phrase = statement.trim().toLowerCase();
         goal = goal.toLowerCase();
         int psn = phrase.indexOf(goal, startPos);
         while (psn >= 0)
         {
         String before = " ", after = " ";
         if (psn > 0)
         {
         before = phrase.substring(psn - 1, psn);
         }
         if (psn + goal.length() < phrase.length())
         {
         after = phrase.substring(psn + goal.length(),
         psn + goal.length() + 1);
         }
         /* determine the values of psn, before, and after at this point in the method. */
         if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))
         &&
         ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
         {
         return psn;
         }
         psn = phrase.indexOf(goal, psn + 1);
         }
         return -1;
    }
}
