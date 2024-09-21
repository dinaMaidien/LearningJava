import java.util.Scanner;

public class printf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        System.out.printf("So %s. How old are you? ", name);
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.printf("Cool! %d is a good age to start programming. \n\nWhat language would you prefer? ", age);
        String language = scanner.nextLine();

        System.out.printf("Ah! %s is a solid programming language.", language);

        scanner.close();

    }

}
    
// here u can see  dia takyah declare data pon, just kena amik dari input user ja, guna printf untuk gabung fromat part adn ptrln 
