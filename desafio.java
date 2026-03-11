import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        System.out.print("Quantos livros deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nLivro " + (i + 1));

            System.out.print("Digite o título: ");
            String titulo = sc.nextLine();

            System.out.print("Digite o autor: ");
            String autor = sc.nextLine();

            System.out.print("Digite o ano: ");
            int ano = sc.nextInt();
            sc.nextLine();

            Livro livro = new Livro(titulo, autor, ano);
            livros.add(livro);
        }

        System.out.println("\nLivros cadastrados:");
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.titulo);
            System.out.println("Autor: " + livro.autor);
            System.out.println("Ano: " + livro.ano);
            System.out.println("---------------------");
        }

        sc.close();
    }
}