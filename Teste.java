package pack2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual o dia, mês e ano que você deseja comparar?");
		int dia = teclado.nextInt();
		int mes = teclado.nextInt();
		int ano = teclado.nextInt();

		contaTempo(dia, mes, ano);
		
		teclado.close();
	}

	public static void contaTempo(int dia, int mes, int ano) {
		LocalDate atual = LocalDate.now();

		LocalDate estimado = LocalDate.of(ano, mes, dia);

		Period dif = Period.between(atual, estimado);

		dia = dif.getDays();
		mes = dif.getMonths();
		ano = dif.getYears();

		System.out.println("Existe uma diferença de " + dia + " dias, " + mes + " meses, " + ano + " anos");
		System.out.println("Entre a data atual até a desejada.");
	}
}
