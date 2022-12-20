import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char operator;
        int number1;
        int number2;
        int result;

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to + , - , * , / ?");
        operator = input.next().charAt(0);

        System.out.println("Enter a whole number");
        number1 = input.nextInt();

        System.out.println("Enter another");
        number2 = input.nextInt();

        if(operator == '+'){
            result = number1 + number2;
            System.out.println("Your result is " + result);
        }else if(operator == '-'){
            result = number1 - number2;
            System.out.println("Your result is " + result);
        }else if(operator == '*'){
            result = number1 * number2;
            System.out.println("Your result is " + result);
        }else if(operator == '/'){
            result = number1 / number2;
            System.out.println("Your result is " + result);
        }

        input.close();

        //random comment
    }
}
