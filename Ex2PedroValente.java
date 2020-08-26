import java.util.Scanner;

// Nome: Pedro Ouverney Sepulveda Valente
// Matricula: 0050015561
public class Ex2PedroValente {
	public static void main(String[] args) {
		float num = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		num = teclado.nextFloat();
		
		if (num%2 == 0) {
			System.out.println("O numero é par!");
		}
		else System.out.println("O numero é impar!");
		teclado.close();
	}
}
