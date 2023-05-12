import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        ArrayList<BookConstructor> allBooks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        while (x) {
            System.out.println("Name of the book: ");
            String response = scanner.nextLine();
            if (response.equals("")) {
                System.out.println("What information will be printed?");
                String response4 = scanner.nextLine();
                if (response4.equals("everything")) {
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println(allBooks.get(i).name + ", " + allBooks.get(i).pages + " pages, " + allBooks.get(i).year);
                    }
                } else if (response4.equals("name")) {
                    for (int i = 0; i < allBooks.size(); i++) {
                        System.out.println(allBooks.get(i).name);
                    }
                }

                break;
            }
            System.out.println("How many pages? ");
            String response2 = scanner.nextLine();
            System.out.println("What year was it published? ");
            String response3 = scanner.nextLine();
            allBooks.add(new BookConstructor(response, response2, response3));

        }
    }
    }

