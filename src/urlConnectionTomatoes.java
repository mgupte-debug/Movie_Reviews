/**
 * @(#)urlConnectionRottenTomatoes.java
 *
 * This is a proof of concept program that tells the user the birthday of whatever celebrity they are intersted in
 * It uses tomatoes to find the information.
 *
 * Updates to make: Accept single names,
 * rewrite the date string into a nicer format, if the tomatoespedia page doesn't exist for the normal format, try alternate format.
 * Rewrite as a class, use a GUI to instantiate.
 *
 * @author Mitali Gupte, Alex Earl
 *
 * @version 1.00 2019/31/10
 */



import java.net.*;
import java.io.*;

public class urlConnectionTomatoes 
{
    WebsiteAnalyzer analyzer = new WebsiteAnalyzer();
    MovieMenu menu = new MovieMenu();
    //MovieMenu 

    public String trimName(String name, int season, String showType){
        try {
            String input = name.replace('(', ' ');// if user enters year in parentheses
            input = input.replace(')', ' ');
            input = input.replace(':', ' '); //if the user enters an extended movie name (ex "Terminator: Dark Faith")
            input = input.replace(' ', '_');

            if (input.charAt(input.length() - 1) == '_')
                input = input.substring(0, input.length() - 1);

            if(season == 0)
                return showType + "/" + input;
            else if (season < 10)
                return showType + "/" + input + "/s0" + season;
            else
                return showType + "/" + input + "/s" + season;
        }
        catch(StringIndexOutOfBoundsException e)
        {
            return "-1";
        }
    }
    

    
    public void getHTML(String name) {
        try {
            String tomatoesPage;
            tomatoesPage = "https://www.rottentomatoes.com/" + name;
            URL url = new URL(tomatoesPage);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String HTML = "";
            String InputLine;
            while ((InputLine = br.readLine()) != null) {
                HTML += InputLine;
            }
            br.close();
            System.out.println(analyzer.RatingFinder(HTML));
        } catch (IOException e) {

        }
    }
}
