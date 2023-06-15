package application;

import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;

public class Program {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Aluno> set = new HashSet<>(); // Instancia��o do set tipo Aluno, utilizando o HashSet (mais r�pido).

        try {
            System.out.print("Quantos cursos o professor Alex leciona? ");
            Integer n = sc.nextInt();
            for (int i=1; i <= n; i++) {
                System.out.println();
                System.out.print("Quantos alunos no curso " + i + "? ");
                Integer qtdeAlunos = sc.nextInt();
                for (int j=1; j <= qtdeAlunos; j++) {
                    System.out.print("Digite o c�digo do aluno " + j + ": ");
                    Integer codAluno = sc.nextInt();
                    set.add(new Aluno (qtdeAlunos, codAluno)); // Adiciona � cole��o set a instancia��o de um novo objeto aluno.
                }
            }
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }

        System.out.println();
        System.out.println("Total de estudantes: " + set.size());
    }
}