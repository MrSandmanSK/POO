import java.util.*;

// Nome: Pedro Ouverney Sepulveda Valente
// Matricula: 0050015561
public class Ex1PedroValente {
	public static void main(String[] args) {
		int num = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero entre 0 e 9: ");
		num = teclado.nextInt();
		
		if (num >= 0 && num <=9) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(num + " x " + i + " = " + num*i);
			}
		}
		else System.out.println("O numero deve ser entre 0 e 9!");
		teclado.close();
	}
}
