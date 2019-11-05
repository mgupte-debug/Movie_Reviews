import java.util.Scanner;

public class MovieMenu {
    public static void main(String []args){

        Scanner reader = new Scanner(System.in);
        WebsiteAnalyzer analyzer = new WebsiteAnalyzer();
        urlConnectionTomatoes connectionTomatoes = new urlConnectionTomatoes();

        String a = "";
        connectionTomatoes.trimMovieName(a);
    }
}
