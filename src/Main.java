import java.util.Scanner;
public class Main {
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);


        double num1;
        double num2 ;
        char operator;
        double result = 0;

        System.out.print("Enter The first number:  ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator:   ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter The second number:  ");
        num2 = scanner.nextDouble();

        //System.out.println("Well done");


        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;





        }

        System.out.println(result);
        Double sqrt = Math.sqrt(result); // tried to use INT, ask for explaination
        System.out.println("Square root of the result: " + sqrt);

        scanner.close();
    }

    public static void main(String[] args) {
        calculator();




    }
}


// voice not class and method difference
// different type of variables data types
// after first result i need to calculate 