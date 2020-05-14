package simulado;

import java.util.Scanner;

public class candidato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		
		System.out.println("Digite uma opção: ");
		int escolaridade = sc.nextInt();
		
		
		// Dados Demais //
		int anosExperiencia;
		char viajar, habilitacao;
		System.out.println(" ");
		System.out.println("Você tem quantos anos de experiência profissional? ");
		anosExperiencia = sc.nextInt();
		System.out.println("Você tem disponibilidade para viajar (S/N)? ");
		viajar = sc.next().charAt(0);
		System.out.println("Você tem habilitação de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
		sc.close();
	}

}
