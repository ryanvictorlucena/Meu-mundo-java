package leitura;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt(); 
        System.out.println("--------------------");
        System.out.println("Seu nome é " + nome + " e tem " + idade + " anos.");
        sc.close();    
    }
}