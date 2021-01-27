import java.util.Scanner;
public class Idade
{
  public static void main(String[] args)
  {
   int ano;
   String nome;
   int anoNascimento;
   int idade;
   Scanner scan = new Scanner(System.in);
   ano = scan.nextInt();
   nome = scan.next();
   anoNascimento = scan.nextInt();
   idade = ano - anoNascimento;
   System.out.println(nome + ", voce completa " + idade + " anos de idade neste ano.");
  }
}