package calc.utils;

public class Divide implements Operation{

	@Override
	public Double calc(Double a, Double b) {
		if(b==0)
			throw new IllegalArgumentException();
		return a/b;
	}

}
