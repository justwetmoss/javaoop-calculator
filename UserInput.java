import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput{
    private char operand;
    private int n1, n2;

    void calcBody(){
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Input number : ");
            n1 = scn.nextInt();

            System.out.println("Input number again : ");
            n2 = scn.nextInt();

            System.out.println("Select operand ( + | - | / | * )");
            operand = scn.next().charAt(0);
        } catch (InputMismatchException e) {
            //TODO: handle exception
            System.out.println("");
            System.out.print("Only number allowed!\n");
            System.exit(0);
        }
        
        System.out.println("---------------------------");
        System.out.println(n1 +" "+ operand +" "+ n2);
        System.out.println("Do you want to calculate this? (y/n) Exit (e)");
        char inp = scn.next().charAt(0);
        try {
            if (inp == 'y') {
                Operation objOpr = new Operation(n1, n2, operand);
                objOpr.calculate();
            } else if (inp == 'n') {
                calcBody();
            } else if (inp == 'e') {
                exit();
            } else {
                throw new InpErrorException("Sorry, just enter y or n or e!");
            }
        } catch (InpErrorException ier) {
            //TODO: handle exception
            System.out.println(ier);
        }
    }

    public void exit(){
        System.out.println("");
        System.out.println("Closing application...");
        System.exit(0);
    }
}