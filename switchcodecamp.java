import java.util.Scanner;

class switchcodecamp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the first operand? ");
        int a =scanner.nextInt();

        // consumes the dangling newline character
        scanner.nextLine();

        System.out.print("What is the second operand? ");
        int b = scanner.nextInt();

        // consumes the dangling newline character
        scanner.nextLine();

        System.out.print("What operation would you like to perform? ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%d + %d = %d", a, b, a+b);
                break;
            case "sub":
                System.out.printf("%d - %d = %d", a, b, a-b);
                break;
            case "mul":
                System.out.printf("%d * %d = %d", a, b, a*b);
                break;
            case "div":
                if (b == 0) {
                    System.out.print("Can't divide by zero!");
                } else {
                    System.out.printf("%d / %d = %d", a, b, a / b);
                }
                break;
            default:
                System.out.printf("Invalid Operation!");
        }

        scanner.close();

    }

}
    
