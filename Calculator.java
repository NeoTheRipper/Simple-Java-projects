import java.util.Scanner;


public class Calculator {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available operations: * / + - %");
        System.out.println("Enter operation: ");

        char op = scanner.nextLine().charAt(0);

        System.out.println("Enter first digit: ");
        double one = scanner.nextInt();

        System.out.println("Enter second digit: ");
        double two = scanner.nextInt();

        if(op == '*'){
            double hasil = one * two;
            System.out.println("Result: " + hasil);
        }

        else if(op == '/'){
            double bolme = one / two;
            System.out.println("Result: " + bolme);
        }

        else if(op == '+'){
            double cem = one + two;
            System.out.println("Result: " + cem);
        }

        else if(op == '-'){
            double ferq = one - two;
            System.out.println("Result: " + ferq);
        }

        else if(op == '%'){
            double qaliq = one % two;
            System.out.println("Result: " + qaliq);
        }

        else{
            System.out.println("Wrong input");

        }
        scanner.close();
    }
}
