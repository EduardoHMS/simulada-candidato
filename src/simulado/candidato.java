package simulado;

import java.util.Scanner;

public class candidato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		
		System.out.println("Digite uma op��o: ");
		int escolaridade = sc.nextInt();
		
		
		// Dados Demais //
		int anosExperiencia;
		char viajar, habilitacao;
		System.out.println(" ");
		System.out.println("Voc� tem quantos anos de experi�ncia profissional? ");
		anosExperiencia = sc.nextInt();
		System.out.println("Voc� tem disponibilidade para viajar (S/N)? ");
		viajar = sc.next().charAt(0);
		System.out.println("Voc� tem habilita��o de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
		sc.close();
	}

}
