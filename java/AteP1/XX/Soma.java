import java.util.Scanner;

public class Soma
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n, div2, div3;
        
        System.out.println("Digite um numero primo:");
        n = scan.nextInt();
        
        div2 =n%2;
        div3 =n%3;
        
        while(div2==0 || div3==0)
        {
            if(n>3)
                {
                    System.out.println("Digite um numero primo:");
                    n = scan.nextInt();
                        
                    System.out.println("O n " + n + " e um numero primo");
                }
            else 
                {
                  
                    if(n>=2)
                    {
                        System.out.println("O n " + n +" e um numero primo");
                    }
                    else
                            {
                                System.out.println("Digite um numero primo:");
                                n = scan.nextInt();
                            }
                    }
                }
        
        
    }
}



