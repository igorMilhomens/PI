import java.util.Scanner;
public class Soma
{
  public static void main(String[] args)
  {
    long A;
    long B;
    long soma;
    Scanner scan = new Scanner(System.in);
    A = scan.nextLong();
    B = scan.nextLong();
    soma = A + B;
    System.out.println(soma);
  }
}