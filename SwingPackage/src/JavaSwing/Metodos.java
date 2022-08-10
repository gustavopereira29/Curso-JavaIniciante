package cap1;

public class Metodos {
public static void main(String args[]){
		
		int res = Somar(21, 17);
		
		System.out.println("A soma é: " + res);
	}
	
	public static int Somar(int n1, int n2){
		int num1 = n1;
		int num2 = n2;
		int resultado = num1 + num2;
		return resultado;
		
	}
} 

//Método simples sem o return

/*public class Metodos{
	public static void main(String args[]){
		Somar(8, 15);
		Somar(21, 17);
		Somar(93, 48);
	}
	
	public static void Somar(int n1, int n2){
		int num1 = n1;
		int num2 = n2;
		int resultado = num1 + num2;
		System.out.println("A soma é: " + resultado);
	}

}*/
