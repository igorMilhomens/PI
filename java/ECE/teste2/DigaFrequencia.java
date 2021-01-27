import java.util.Scanner;

public class DigaFrequencia
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

    
        String palavra = scan.nextLine();
        int tam = palavra.length();
        int a = 0, b = 0,c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0,
        u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
        
        for(int test = 0 ; test < tam ; test++)
        {
            char letra = palavra.charAt(test);
            if(letra =='a')
            {
                a++;
                if(a==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("a - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='a')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("a - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='b')
            {
                b++;
                if(b==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("b - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='b')
                            {
                                cont++;
                            }
                            if(test1 == tam-1)
                            {
                                System.out.println("b - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='c')
            {
                c++;
                if(c==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("c - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1< tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='c')
                            {
                                cont++;
                            }
                            if(test1 == tam-1)
                            {
                                System.out.println("c - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='d')
            {
                d++;
                if(d==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("d - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1< tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='d')
                            {
                                cont++;
                            }
                            if(test1 == tam-1)
                            {
                                System.out.println("d - " + cont);
                            }
                        }
                    }
                    
                    
                }
            }
            
            if(letra =='e')
            {
                e++;
                if(e==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("e - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='e')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("e - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='f')
            {
                f++;
                if(f==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("f - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='f')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("f - " + cont);
                            }
                        }
                    }
                    
                }
            }
            
            if(letra =='g')
            {
                g++;
                if(g==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("g - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='g')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("g - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='h')
            {
                h++;
                if(h==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("h - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='h')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("h - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='i')
            {
                i++;
                if(i==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("i - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='i')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("i - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='j')
            {
                j++;
                if(j==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("j - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='j')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("j - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='k')
            {
                k++;
                if(k==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("k - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='k')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("k - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='l')
            {
                l++;
                if(l==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("l - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='l')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("l - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='m')
            {
                m++;
                if(m==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("m - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='m')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("m - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='n')
            {
                n++;if(n==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("n - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='n')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("n - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='o')
            {
                o++;
                if(o==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("o - " + cont);
                    }
                    else
                    {
                         for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='o')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("o - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='p')
            {
                p++;
                if(p==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("p - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='p')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("p - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='q')
            {
                q++;
                if(q==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("q - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='q')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("q - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='r')
            {
                r++;
                if(r==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("r - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='r')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("r - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='s')
            {
                s++;
                if(s==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("s - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='s')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("s - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='t')
            {
                t++;
                if(t==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("t - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='t')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("t - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='u')
            {
                u++;
                if(u==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("u - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='u')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("u - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='v')
            {
                v++;
                if(v==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("v - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='v')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("v - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='w')
            {
                w++;
                if(w==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("w - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='w')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("w - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='x')
            {
                x++;
                if(x==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("x - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='x')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("x - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='y')
            {
                y++;
                if(y==1)
                {
                    int cont = 1;
                    
                    if(test==tam-1)
                    {
                        System.out.println("y - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='y')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("y - " + cont);
                            }
                        }
                    }
                }
            }
            
            if(letra =='z')
            {
                z++;
                if(z==1)
                {
                    int cont = 1;
                    if(test==tam-1)
                    {
                        System.out.println("z - " + cont);
                    }
                    else
                    {
                        for(int test1 = test+1; test1 < tam; test1++)
                        {
                            char letra1 = palavra.charAt(test1);
                            if(letra1 =='z')
                            {
                                cont++;
                            }
                            if(test1 == tam - 1)
                            {
                                System.out.println("z - " + cont);
                            }
                        }
                    }
                }
            }
        }
    }
}





