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
		
		// Calculos dados + experiencia //
		System.out.println(" ");
		int pontos, pontosAno; 
		pontos = 0;
		pontosAno = 0;
		if(escolaridade == 1) {
			pontos = 10;
		}else if(escolaridade == 2) {
			pontos = 20;
		}else if(escolaridade == 3) {
			pontos = 30;
		}else if(escolaridade == 4) {
			pontos = 40;
		}
		
		System.out.println("Pontos por escolaridade: " + pontos);
		
		if(anosExperiencia == 0) {
			pontosAno = 0;
		}else if(anosExperiencia <= 2) {
			pontosAno = 10;
		}else if(anosExperiencia <= 5) {
			pontosAno = 20;
		}else if(anosExperiencia > 5) {
			pontosAno = 40;
		}
		
		System.out.println("Pontos por experi�ncia: " + pontosAno);
		
		
		// Cargos //
		System.out.println(" ");
		
		if((escolaridade < 2)) {
			System.out.println("Infelizmente seu perfil n�o atende a empresa");
		}else {
			System.out.println("Voc� est� habilitado para o(s) seguinte(s) cargo(s): ");
			if((escolaridade >= 2)&&(Character.toLowerCase(habilitacao) == 's')) {
				System.out.println("ASSISTENTE");
			}
			if((escolaridade >= 3)&&(anosExperiencia > 2)) {
				System.out.println("GERENTE");
			}
			if((escolaridade >= 3)&&(Character.toLowerCase(viajar) == 's')&&(anosExperiencia > 5)) {
				System.out.println("ANALISTA");
			}
		}
		
		sc.close();
	}

}
