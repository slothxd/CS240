import java.util.Scanner;

public class ExprConverterTest {

	public static void main(String args[]){

		System.out.println("Enter your input: example input and out put: ((a+b)*(c+d))");
		String infix1 = "((a+b)*(c+d))";
		ExprConverter obj = new ExprConverter();
        System.out.println("Postfix : " + obj.printPostFix(infix1));
        System.out.println("Prefix : " + obj.printPreFix(infix1));

System.out.println("---------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        String expression = input.next();
        ExprConverter obj1 = new ExprConverter();
        System.out.println("Postfix : " + obj1.printPostFix(expression));
        System.out.println("Prefix : " + obj1.printPreFix(expression));


	}
}

