package MovieReviews;

/**
 * @(#)urlConnectionRottenTomatoes.java
 *
 * This is a proof of concept program that tells the user the birthday of whatever celebrity they are intersted in
 * It uses Wikipedia to find the information.
 *
 * Updates to make: Accept single names,
 * rewrite the date string into a nicer format, if the Wikipedia page doesn't exist for the normal format, try alternate format.
 * Rewrite as a class, use a GUI to instantiate.
 *
 * @author Mitali Gupte, Alex Earl
 *
 * @version 1.00 2019/31/10
 */



import java.net.*;
import java.io.*;
import java.util.Scanner;

public class urlConnectionTomatoes {

    public static String trimMovieName(String movie_name){

        String input = movie_name.replace('(', ' ');// if user enters year in parentheses
        input = movie_name.replace(')', ' ');

        input = movie_name.replace(' ', '_');

        if(input.charAt(input.length()) == '_')
            input.substring(0, input.length());

        return input;
    }

    public static void main(String[] args)  {

        Scanner reader = new Scanner(System.in);
        String celeb="";

        while (true){

            try{

                System.out.println("Type in name of movie. (type quit if done)");
                String movie_name = reader.nextLine();
                movie_name= trimMovieName(movie_name);
                if(movie_name.equals("quit"))
                    break;



                String tomatoesPage = "https://www.rottentomatoes.com/m/"+movie_name;
                URL tomatoes = new URL(tomatoesPage);
                URLConnection yc = tomatoes.openConnection();
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        yc.getInputStream()));

                String inputLine;
                String line="";
                String sourceCode = in.


            }
            catch(FileNotFoundException ex)
            {
                System.out.println("unknown");
            }
            catch(MalformedURLException e)
            {
                System.out.println("badly formed url exception occurred");
                return;
            }
            catch(IOException e)
            {
                System.out.println("IO exception occurred");
                return;
            }


        }

    }//endmain
}//endclass

