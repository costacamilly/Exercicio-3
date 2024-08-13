import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int alcool = 0;
    int Gasolina = 0;
    int Diesel = 0;
    int fim = 0;
    System.out.println("Bem Vindo!!!");
    System.out.println(" ");
    System.out.println("Segue abaixo os combustíveis disponíveis:");
    System.out.println("Digite 1:para Àlcool");
    System.out.println("Digite 2 para Gasolina");
    System.out.println("Digite 3 para Diesel");
    System.out.println("Digite 4 para encerrar");
    System.out.println(" ");
    System.out.println("Qual Combustível você deseja:");

    int escolhido = sc.nextInt();

    while (escolhido != 4) {
      if (escolhido == 1) {
        System.out.println("àlcool");
        alcool = alcool + 1;
        escolhido = sc.nextInt();
      }
      if (escolhido == 2) {
        System.out.println("Gasolina");
        Gasolina = Gasolina + 1;
        escolhido = sc.nextInt();
      }
      if (escolhido == 3) {
        System.out.println("Diesel");
        Diesel = Diesel + 1;
        escolhido = sc.nextInt();
      }
    }

    System.out.println("Encerrado");

    System.out.println(" ");
    System.out.print("A quantidade de votos no alcool foi:");{
    System.out.print(alcool);
    }
    
    System.out.println(" ");
    System.out.print("A quantidade de votos para a gasolina foi:");{
    System.out.print(Gasolina);
    }
    System.out.println(" ");
    System.out.print("A quantidade de votos no diesel foi:");{
    System.out.print(Diesel);
    }
    sc.close();
  }

}