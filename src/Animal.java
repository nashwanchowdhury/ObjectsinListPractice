
import java.util.Scanner;
import java.util.ArrayList;
public class Animal {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        String y;
        while (x) {
            System.out.println("Please enter a name: ");
            String response = scanner.nextLine();
            if (response.equals("")) {
                for (int i = 0; i < dogs.size(); i++) {
                    if (dogs.get(i).dog.equals("yes")) {
                        y = "true";
                    } else {
                         y = "false";
                    }
                System.out.println(dogs.get(i).name + " is a dog = " + y);
                }
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            String response2 = scanner.nextLine();
            dogs.add(new Dog(response, response2));

        }
    }
}

