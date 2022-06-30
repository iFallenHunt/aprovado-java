import java.util.Scanner;

public class Aprovado {
  public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	  int n1, n2, nota;
	  
	  System.out.printf("digite a primeira nota: ");
	  n1 = ler.nextInt();
	  
	  System.out.printf("digite a segunda nota: ");
	  n2 = ler.nextInt();
	  
	  nota = n1 + n2;
	  
	  if (nota >= 60) {
		  System.out.printf("Nota: %d \nAPROVADO", nota);
	  }else {
		  System.out.printf("Nota: %d \nREPROVADO", nota);
	  }
  }
}