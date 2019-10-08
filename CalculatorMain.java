import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorMain {

    public static void main(String[] args) throws IOException {
        CalculatorMain objC = new CalculatorMain();
        objC.calc();
    }

    public void calc() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=====================");
        System.out.println(" A Simple Calculator ");
        System.out.println("=====================");
        System.out.println("Enter? (y/n)");
        char inp = (char) br.read();
        try {
            if (inp == 'y') {
                enter();
            } else if (inp == 'n') {
                exit();
            } else {
                System.out.println("");
                throw new InpErrorException("Sorry, just enter y or n!");
            }
        } catch (InpErrorException ier) {
            //TODO: handle exception
            System.out.println(ier);
        }
    }

    public void enter() {
        System.out.println("");
        System.out.println("Opening application...");
        System.out.println("");

        UserInput ui = new UserInput();
        ui.calcBody();
    }

    public void exit(){
        System.out.println("");
        System.out.println("Closing application...");
        System.exit(0);
    }
}