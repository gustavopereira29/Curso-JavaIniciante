package cap1;

public class OperadoresAtribuicao {
	public static void main(String args[]){
		int a = 10;
		//a = a + 2;
		//a += 2;
		a += 2; // a recebe a e soma 2
		int b = 20;
		b -= 2; // b recebe b e subtrai 2
		int c = 30;
		c *= 2; // c recebe c e multiplica por 2
		int d = 40;
		d /= 2; // d recebe d e divide por 2
		int e = 67;
		e %= 2; // e recebe e, que divide o valor e gera a sobra da divisao
		
		System.out.println("o valor de A: "+ a);
		System.out.println("o valor de B: "+ b);
		System.out.println("o valor de C: "+ c);
		System.out.println("o valor de D: "+ d);
		System.out.println("o valor de E: "+ e);
	}

}
