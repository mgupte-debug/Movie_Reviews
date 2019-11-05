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


public class urlConnectionTomatoes {

    public String trimMovieName(String movie_name){

        String input = movie_name.replace('(', ' ');// if user enters year in parentheses
        input = movie_name.replace(')', ' ');

        input = movie_name.replace(' ', '_');

        if(input.charAt(input.length()) == '_')
            input.substring(0, input.length());

        return input;
    }
}//endclass

