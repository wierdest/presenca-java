package aula01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConferidorPresenca {
	
    static final int NUMERO_DE_ALUNOS = 34; // Número total de alunos
    
    // lista com todos os nomes
	private static final String[] nomes = {
			"Allan Lima Angelo",
		    "André De Oliveira Toyomoto",
		    "Andre Sathler Gonçalves",
		    "Andressa Rodrigues Combat",
		    "Arthur Canto Frederico",
		    "Arthur Pereira Leal",
		    "Carolina Rocha Floro",
		    "Cristiano Gonçalves De Arruda",
		    "Daniel Ribeiro Gabriel",
		    "Daniela Bulhões Da Silva",
		    "Danilo Ramos Siqueira",
		    "Evelyn Cristine Chamorro Aniceto",
		    "Gustavo Becario Rodrigues Godinho De Oliveira",
		    "Johon Da Cunha Gomes",
		    "Jonathan Pinho Cardoso",
		    "José Luiz Da Silva Barbosa",
		    "Julia Ferreira Coelho",
		    "Karen Soares Câmara",
		    "Kenny Lucas Bitencourt Dos Santos",
		    "Larissa Rahal Coelho",
		    "Leilson Marques Felicio",
		    "Leonard Himmelseher",
		    "Luciano Oliveira Da Costa",
		    "Luis Fernando Da Silva Neves",
		    "Marcelo Souza Affonso",
		    "Marcio Bokel Pereira Das Neves",
		    "Miguel Ferreira Ramos",
		    "Pábullo Muniz Da Silva Motta",
		    "Paula Beatriz Murtha Menezes",
		    "Paulo Henrique de Mendonça Dias",
		    "Raphael Gomes Jorge",
		    "Rodrigo Silva Marques",
		    "William Soares Da Cunha Silva",
		    "Douglas Braga França"
	};
	
	public static void main(String[] args) {
		// escaneia o input linha a linha
        Scanner scanner = new Scanner(System.in);
        // pede o input para o usuário
        System.out.println("Digite o histórico do chat:");
        // cria uma string
        StringBuilder rawBuilder = new StringBuilder();
        // extrai a stringg linha a linha
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
        	// enquanto a linha não for vazia, ou seja: Enter Enter quita o programa
        	// usa o string builder para criar a raw string
            rawBuilder.append(line).append("\n");
        }
        // converte o builder para string
        String raw = rawBuilder.toString();
        // confere a presença
        conferirPresenca(raw);
        scanner.close(); // fecha o Scanner após a leitura
    }

	public static void conferirPresenca(String raw) {
		// listas para contar
        List<String> ausentes = new ArrayList<>();
        List<String> presentes = new ArrayList<>();

        for (String aluno : nomes) {
            boolean presente = conferirSeAlunoEstaPresente(aluno, raw);
            if (presente) {
                presentes.add(aluno);
            } else {
                ausentes.add(aluno);
            }
        }

        System.out.println(presentes.size() + " alunos presentes:");
        for (String aluno : presentes) {
            System.out.println(aluno);
        }

        System.out.println("\n\n" + ausentes.size() + " alunos ausentes:");
        for (String aluno : ausentes) {
            System.out.println(aluno);
        }
    }

    public static boolean conferirSeAlunoEstaPresente(String aluno, String historico) {
    	// indexOf é a mesma coisa do Portugol!
        int posicaoTexto = historico.indexOf(aluno);
        return posicaoTexto != -1;
    }


}
