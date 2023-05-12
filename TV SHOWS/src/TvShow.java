import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    public static void main(String[] args) {
        ArrayList<Show> allShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("Name of the show: ");
            String response = scanner.nextLine();
            if (response.equals("")) {
                for (int i = 0; i < allShows.size(); i++) {
                    System.out.println("The name of the show is " + allShows.get(i).name + " with " + allShows.get(i).episodes + " episodes. The genre is " + allShows.get(i).genre);
                }
                break;
            }
            System.out.println("How many episodes? ");
            String response2 = scanner.nextLine();
            System.out.println("What is the genre? ");
            String response3 = scanner.nextLine();
            allShows.add(new Show(response, response2, response3));

        }
    }
}