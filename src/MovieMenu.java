import java.util.Scanner;

public class MovieMenu {
    public static void main(String []args){

        Scanner reader = new Scanner(System.in);
        urlConnectionTomatoes connectionTomatoes = new urlConnectionTomatoes();

        String a;
        int b;

        while(true) {
            
            System.out.println("Movie or TV show");
            String m = reader.nextLine();
            m = m.toUpperCase();
            
            a = "";
            System.out.println("Input a name:");
            a = reader.nextLine();
            
            if(m.equals("TV")||m.equals("T")){
            
             System.out.println("Enter season: ");
            b = reader.nextInt();
        }
        else
            b =0;
            

            
            connectionTomatoes.getHTML(connectionTomatoes.trimName(a), b);
    }
}
}
