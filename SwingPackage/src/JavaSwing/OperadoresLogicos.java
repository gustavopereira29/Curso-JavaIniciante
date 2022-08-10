package cap1;

public class OperadoresLogicos {
public static void main(String args[]){
		
		int num1 = 5 * 4;
		int num2 = 6 + 7;
		boolean res = num1 < num2 && num1 != 20; // && = and 
		boolean res2 = num1 > num2 || num2 == 5; // || = or 
		
		System.out.println(res);
		System.out.println(res2);
	}

}
