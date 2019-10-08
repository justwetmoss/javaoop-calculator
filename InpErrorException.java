import java.io.*;

public class InpErrorException extends Exception {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	String inp;

    public InpErrorException(String inp2){
        this.inp = inp2;
    }

    public String toString(){
        return inp;
    }
}
