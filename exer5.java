import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		
		
		float x;
		
		System.out.println("Digite um n�mero:");
		x = leitor.nextFloat(); 
		
		if (x%2==0) 
	    System.out.println("O n�mero "+x+"  par.");
		else
		System.out.println("O n�mero "+x+"  �mpar.");	
	}

}
