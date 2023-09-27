import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");
        
  
        int menor = Math.min(numero1, numero2);
        int maior = Math.max(numero1, numero2);

        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }
  
        scanner.close();
    }
}
