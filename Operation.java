public class Operation extends Calculator {
    private char operand;

    public Operation(int num1, int num2, char operand){
        super(num1, num2);
        this.operand = operand;
    }

    public void calculate(){
        System.out.println("");
        if (operand == '+') {
            int result = getNum1() + getNum2();
            System.out.println("Result = "+ result);
        } else if (operand == '-') {
            int result = getNum1() - getNum2();
            System.out.println("Result = "+ result);
        } else if (operand == '/') {
            double result = (double) getNum1() / getNum2();
            System.out.println("Result = "+ result);
        } else if (operand == '*') {
            int result = getNum1()*getNum2();
            System.out.println("Result = "+ result);
        } else {
            System.out.println("Enter valid operand!");
        }
    }
    
}