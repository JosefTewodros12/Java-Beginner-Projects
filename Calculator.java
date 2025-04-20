import java.util.Scanner;
class Calculator{
    private float number1;
    private float number2;
    void setnumber1(float number1){
        this.number1 = number1;
    }
    void setnumber2(float number2){
        this.number2 = number2;
    }
    float getnumber1(){
        return number1;
    }
    float getnumber2(){
        return number2;
    }
    
}
class Childcalculator extends Calculator{
    void menu(){
	    System.out.println("==================================");
	    System.out.println("             CALCULATOR           ");
	    System.out.println("==================================" + "\n");
        System.out.println("Choose an operation: ");
        System.out.println(" 1. + (Addition)");
        System.out.println(" 2. - (Subtraction)");
        System.out.println(" 3. * (Multiplication)");
        System.out.println(" 4. / (Division)");
        System.out.println(" 5. e/E (Exit)");
        
	    System.out.println("-----------------------------------\n");
    }
    void display(char ope){
        
        float result = 0;
        if(ope == '+'){
           result = getnumber1() + getnumber2(); 
        }else if(ope == '-'){
           result = getnumber1() - getnumber2(); 
        }else if(ope == '*'){
           result = getnumber1() * getnumber2(); 
        }else if (ope == '/'){
            if(!(getnumber2() == 0)){
                result = getnumber1() / getnumber2();     
            }else{
                System.out.println("\u001B[31mDivision by zero is not allowed!\u001B[0m");
            }
        }else{
            System.out.println("Invalid operation!");
        }
        
        System.out.println("\n\u001B[32mResult: "+ result + "\n\u001B[0m");
    }

    }
public class Main
{
	public static void main(String[] args) {
	    Scanner s1 = new Scanner(System.in);
	    Childcalculator c1 = new Childcalculator();
	    char operation;
	    float num1, num2;
	    while(true){
            c1.menu();
    	    System.out.println("Please enter numbers and an operation as shown below:");
            System.out.print("Enter 1st number: ");
            num1 = s1.nextFloat();
            System.out.print("Enter 2st number: ");
            num2 = s1.nextFloat();
            c1.setnumber1(num1);
            c1.setnumber2(num2);
            System.out.print("Enter the operation: " );
    	    operation = s1.next().charAt(0);
    	 
    	    if(operation == 'e' || operation == 'E'){
	            System.out.println("Thank you for using the Calculator. Goodbye!");
	            break;
	        }
	        c1.display(operation);
	    }
	}
}
