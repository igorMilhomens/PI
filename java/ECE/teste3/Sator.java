import java.util.Scanner;

public class Sator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean repete = true;
        
        while (repete)
        {
            int n = scan.nextInt();
            if(n != 0)
            {
                if(n%2 != 0)
                {
                    String [][] M = new String[n][n];
                    for(int i = 0; i < n; i++)
                    {
                        
                        for(int j = 0; j < n ; j++)
                        {
                            M[i][j] = scan.next();
                        }
                    }
                    
                    int k = n/2;
                    String palavra = "";
                    String palavra1 = "";
                    
                    for(int i = 0; i < n; i++)
                    {
                        palavra += M[i][k];
                        palavra1 += M[k][i];
                    }
                    boolean palindromo = true;
                    for (int i =0; i<n && palindromo; i++)
                    {
                        boolean comparacao = palavra.charAt(i) == palavra.charAt(n-1-i);
                        palindromo &= comparacao;
                    }
                    boolean palindromo1 = true;
                    for (int i =0; i<n && palindromo1; i++)
                    {
                        boolean comparacao1 = palavra1.charAt(i) == palavra1.charAt(n-1-i);
                        palindromo1 &= comparacao1;
                    }
                    
                    boolean test = true;
                    for(int i = 0; i < n/2 && test ; i++)
                    {
                        String test1 = "";
                        String test2 = "";
                        
                        for(int j = 0; j < n && test ; j++)
                        {
                           test1 += M[i][j];
                           test2 += M[n-1-i][n-1-j];
                           
                           test = test1.intern() == test2.intern();
                        }
                    }
                    System.out.printf("%s%n", palindromo && palindromo1 && test ? "S" : "N");
    
                    
                }
                else
                {
                    String [][] M = new String[n][n];
                    for(int i = 0; i < n; i++)
                    {
                        
                        for(int j = 0; j < n ; j++)
                        {
                            M[i][j] = scan.next();
                        }
                    }
                    
                    boolean test = true;
                    for(int i = 0; i < (n/2)-1 && test ; i++)
                    {
                        String test1 = "";
                        String test2 = "";
                        
                        for(int j = 0; j < n && test ; j++)
                        {
                           test1 += M[i][j];
                           test2 += M[n-1-i][n-1-j];
                           
                           test = test1.intern() == test2.intern();
                        }
                    }
                    System.out.printf("%s%n", test ? "S" : "N");
                    
                    
                    
                }
            }
            else
            {
                repete = false;
            }
        }
    }
}