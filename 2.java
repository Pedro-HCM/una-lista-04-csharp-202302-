import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String usuario;
        String senha;
        
        do {
            System.out.print("Digite o nome de usuário");
            usuario = scanner.nextLine();
            
            System.out.print("Digite a senha ");
            senha = scanner.nextLine();
            
            if (usuario.equals(senha)) {
                System.out.println("A senha não pode ser igual ao seu nome de usuário.");
            }
        } while (usuario.equals(senha));
        
        System.out.println("Cadastro realizado com sucesso,obrigado!");
        
    
        scanner.close();
    }
}
