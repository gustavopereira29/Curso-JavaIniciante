package cap1;

public class OperadorTernario {
	public static void main(String args[]){
		int dia = 21;
		
		/*if(dia <= 15){
			System.out.println("Primeira quinzena");
		}else{
			System.out.println("Segunda quinzena");
		}*/
		
		String mensagem = (dia <= 15)? "Primeira quinzena" : "Segunda quinzena";
		System.out.println(mensagem);
	}
}

// sendo string eu poderia direto no System.out.println e colocar a mensagem sem precisar criar uma variavel do tipo string

