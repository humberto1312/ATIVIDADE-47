import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.print("Digite o nome do ginasta: ");
        String nomeGinasta = scanner.nextLine();

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        Collections.sort(notas);
        double melhorNota = notas.get(6);
        double piorNota = notas.get(0);
        double somaNotas = 0.0;
        for (int i = 1; i <= 5; i++) {
            somaNotas += notas.get(i);
        }
        double mediaNotas = somaNotas / 5.0;

        System.out.println("\nResultado final:");
        System.out.println("Atleta: " + nomeGinasta);
        System.out.println("Melhor nota: " + melhorNota);
        System.out.println("Pior nota: " + piorNota);
        System.out.printf("Média: %.2f%n", mediaNotas);

        scanner.close();
    }
}
