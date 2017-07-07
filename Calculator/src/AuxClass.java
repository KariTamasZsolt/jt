import calc.utils.I1;
import calc.utils.I2;

public class AuxClass implements I1, I2{


	public void calc() {
		// TODO Auto-generated method stub
		I1.super.calc();
	}
	
	public static void main(String[] args){
		new AuxClass().calc();
	}
	
}
