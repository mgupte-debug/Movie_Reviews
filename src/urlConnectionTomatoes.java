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
import java.util.Scanner;

public class urlConnectionTomatoes 
{
    WebsiteAnalyzer analyzer = new WebsiteAnalyzer();

    public String trimMovieName(String movie_name){
        try {
            String input = movie_name.replace('(', ' ');// if user enters year in parentheses
            input = input.replace(')', ' ');

            input = input.replace(' ', '_');

            if (input.charAt(input.length() - 1) == '_')
                input = input.substring(0, input.length() - 1);

            System.out.println(input);   //delete later
            return input;
        }
        catch(StringIndexOutOfBoundsException e)
        {
            return "-1";
        }
    }
    
    public void getHTML(String movie_name) {
        try
        {
            String tomatoesPage = "https://www.rottentomatoes.com/m/" + movie_name;
            URL url = new URL(tomatoesPage);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String HTML = "";
            String InputLine;
            while ((InputLine = br.readLine()) != null){HTML += InputLine;}
            br.close();
            System.out.println(HTML);
            System.out.println(analyzer.wordFinder(HTML));

        }
        catch (MalformedURLException e) {
            System.out.println("badly formed url exception occurred");
        }
        catch (IOException e)
        {

        }
        catch (StringIndexOutOfBoundsException e)
        {

        }
        /*catch(FileNotFoundException e)
		  {
		  	System.out.println("unknown");
		  }*/
        }
}

			  	


    

        
