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

        Set<Aluno> set = new HashSet<>(); // Instanciação do set tipo Aluno, utilizando o HashSet (mais rápido).

        try {
            System.out.print("Quantos cursos o professor Alex leciona? ");
            Integer n = sc.nextInt();
            for (int i=1; i <= n; i++) {
                System.out.println();
                System.out.print("Quantos alunos no curso " + i + "? ");
                Integer qtdeAlunos = sc.nextInt();
                for (int j=1; j <= qtdeAlunos; j++) {
                    System.out.print("Digite o código do aluno " + j + ": ");
                    Integer codAluno = sc.nextInt();
                    set.add(new Aluno (qtdeAlunos, codAluno)); // Adiciona à coleção set a instanciação de um novo objeto aluno.
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