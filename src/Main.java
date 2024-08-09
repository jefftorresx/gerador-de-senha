import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       try {
           System.out.println("Quer adicionar minusculas? S/N");
           boolean minuscula = sc.nextLine().equalsIgnoreCase("s");
           System.out.println("Quer adicionar maiucuslas? S/N");
           boolean maiuscula =  sc.nextLine().equalsIgnoreCase("s");
           System.out.println("Quer adicionar numeros? S/N");
           boolean numeros =  sc.nextLine().equalsIgnoreCase("s");
           System.out.println("Quer adicionar caracteres especiais? S/N");
           boolean especiais = sc.nextLine().equalsIgnoreCase("s");
           System.out.println("Qual o tamanho da senha? ");
           int tamanho = sc.nextInt();

           sc.nextLine();

           System.out.println(    Gerador.gerarSenha(minuscula, maiuscula, numeros, especiais, tamanho));

       }catch (IllegalArgumentException e ) {
           e.printStackTrace();
       }catch (InputMismatchException e) {
               System.out.println("Adicione um número inteiro na opção tamanho");
           } finally {
           sc.close();
       }


    }
}
