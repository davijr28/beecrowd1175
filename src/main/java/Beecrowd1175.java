
import java.util.Scanner;

public class Beecrowd1175 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 20;
        int N[] = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            N[i] = scanner.nextInt();
        }
        int M[] = new int[quantidade];
        int contador = quantidade;
        for (int i = 0; i < quantidade; i++) {
            M[i] = N[contador - 1];
            contador--;
            System.out.printf("N[%d] = %d%n", i, M[i]);
        }
    }
}
