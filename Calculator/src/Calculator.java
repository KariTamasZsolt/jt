import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import calc.utils.*;

public class Calculator {
	
	public void print(BinaryOperator<Double> operation, double d, double e){
		System.out.println(operation.apply(d, e));
	}
	public static void main(String... args){
		
		/*Operation add = (p1, p2) -> p1 + p2;
		Operation sub = (p1, p2) -> p1 - p2;
		Operation mul = (p1, p2) -> p1 * p2;
		Operation div = (p1, p2) -> { if (p2==0) 
			throw new IllegalArgumentException("divide by zero");
		return (p1 / p2);};*/
		
		
		Calculator calculator = new Calculator();
		
		/*calculator.print(add,2D,3D);
		calculator.print(sub,2D,3D);
		calculator.print(mul,2D,3D);
		calculator.print(div,2D,3D);*/
		
		
		Operation a=new Add();
		
		BinaryOperator<Double> adds = a::calc;
		BinaryOperator<Double> subber = (n1, n2) -> n1-n2;
		BinaryOperator<Double> muller = (n1, n2)->n1*n2;
		BinaryOperator<Double> divver = (p1, p2) -> { if (p2==0) 
			throw new IllegalArgumentException("divide by zero");
		return (p1 / p2);};
		calculator.print(adds,2D,3D);
		calculator.print(subber,2D,3D);
		calculator.print(muller,2D,3D);
		calculator.print(divver,2D,3D);
		
		BinaryOperator<Double> add=(p1, p2)->p1+p2;
		Consumer<BinaryOperator<Double>> printer =p -> System.out.println(p.apply(2d, 2d));
		printer.accept(add);
		
	}
	 
		
		
	

}
