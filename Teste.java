package pooteste1;

import java.math.*;
import java.util.*;
public class Teste {
	public static void main(String[] args) {
		
		BigInteger num;
		String op=" ",pas;
		int x=0;
		Scanner io = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		num=io.nextBigInteger();
		io.nextLine();
		Calculadora t1 = new Calculadora(num);
		do{
			System.out.println("Digite a operação: ");
			op=io.nextLine();
			if(op.equals("=")){
				System.out.println("Resultado final igual: " + num);
			}else{
			System.out.println("Digite o valor: ");
			num=io.nextBigInteger();
			io.nextLine();
			}
			if(op.equals("^")){
				pas= num.toString();
				x=Integer.parseInt(pas);
			}
			switch  (op){
				case "+" : num=t1.SOMA(num); System.out.println("Resultado Parcial: " + num.toString());;break;
				case "-" : num=t1.SUB(num); System.out.println("Resultado Parcial: " + num.toString());;break;
				case "*" : num=t1.MULT(num); System.out.println("Resultado parcial: " + num.toString());;break;
				case "/" : num=t1.DIV(num); System.out.println("Resultado parcial: " + num.toString());;break;
				case "^" : num=t1.POT(x);System.out.println("Resultado parcial: " + num);;break;
			}
		}while (!op.equals("="));
	}
}
