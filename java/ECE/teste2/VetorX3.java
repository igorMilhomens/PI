import java.util.Scanner;

public class VetorX3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int vet[] = new int[n];
        int vetX3[] = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            vet[i] = scan.nextInt();
            vetX3[i] = vet[i] * 3;
            System.out.printf("%d%c", vetX3[i], i == n-1 ? '\n' : ' ');
        }
    }
}