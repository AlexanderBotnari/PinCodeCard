import java.io.IOException;

public class Aplication {
	public static void main(String[] args) throws IOException {
          
	final int  VALID_PIN  = 1234;  
	      int  scannedPin = 0;
	       
	   System.out.print("Enter your pin ! >>>");
           int number1 = System.in.read();
           int number2 = System.in.read();
           int number3 = System.in.read();
           int number4 = System.in.read();
           
        scannedPin = (Character.getNumericValue(number1)*1000) + (Character.getNumericValue(number2)*100) 
                     + (Character.getNumericValue(number3)*10) + Character.getNumericValue(number4);
          
           if(VALID_PIN == scannedPin) {
        	   System.out.println("True ! Account accesible !");
           }else {
        	   System.err.println("False ! Incorect pin !");
           }
    }
}
