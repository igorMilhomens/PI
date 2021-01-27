import java.util.Scanner;
public class DivResto
{
  public static void main(String[] args)
  {
    int A;
    int B;
    long div;
    long res;
    Scanner scan = new Scanner(System.in);
    A = scan.nextInt();
    B = scan.nextInt();
    div = A / B;
    res = A % B;
  System.out.println(div +" " + res);
  }
}
