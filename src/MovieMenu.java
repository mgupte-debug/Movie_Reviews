import java.util.Scanner;

public class MovieMenu {
    public static void main(String []args){

        Scanner reader = new Scanner(System.in);
        urlConnectionTomatoes connectionTomatoes = new urlConnectionTomatoes();

        String a, type;
        int b;

        while(true) {

            System.out.println("Movie or TV show");
            String m = reader.nextLine();
            m = m.toUpperCase();

            a = "";
            System.out.println("Input a name:");
            a = reader.nextLine();

            if (m.equals("TV") || m.equals("T")) {
                type = "tv";
                System.out.println("Enter season(0 if no seasons): ");
                b = reader.nextInt();
            } else {
                b = 0;
                type = "m";
            }
            connectionTomatoes.getHTML(connectionTomatoes.trimName(a,b, type));
        }
    }
}
