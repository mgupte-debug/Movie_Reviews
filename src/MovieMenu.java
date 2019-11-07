import java.util.Scanner;

public class MovieMenu {
    public static void main(String []args){

        Scanner reader = new Scanner(System.in);
        urlConnectionTomatoes connectionTomatoes = new urlConnectionTomatoes();

        String a;

        while(true) {
            a = "";
            System.out.println("Input a movie name:");
            a = reader.nextLine();
            connectionTomatoes.getHTML(connectionTomatoes.trimMovieName(a));
        }
    }
}
