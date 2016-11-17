package pooteste1;

import java.math.*;
public class Calculadora {

	private BigInteger num=BigInteger.ZERO;
	
	public Calculadora(BigInteger num){
		this.num=num;
	}
	public BigInteger SOMA(BigInteger valor){
		this.num=this.num.add(valor);
		return num;
	}
	public BigInteger SUB(BigInteger valor){
		this.num=this.num.subtract(valor);
		return num;
	}
	public BigInteger MULT(BigInteger valor){
		this.num=this.num.multiply(valor);
		return num;
	}
	public BigInteger DIV(BigInteger valor){
		this.num=this.num.divide(valor);
		return num;
	}
	public BigInteger POT(int valor){
		this.num=this.num.pow(valor);
		return num;
	}
}
