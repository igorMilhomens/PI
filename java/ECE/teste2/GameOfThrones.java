import java.util.Scanner;

public class GameOfThrones
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
            }
            
            if(letra =='b')
            {
                b++;
            }
            
            if(letra =='c')
            {
                c++;
            }
            
            if(letra =='d')
            {
                d++;
            }
            
            if(letra =='e')
            {
                e++;
            }
            
            if(letra =='f')
            {
                f++;
            }
            
            if(letra =='g')
            {
                g++;
            }
            
            if(letra =='h')
            {
                h++;
            }
            
            if(letra =='i')
            {
                i++;
            }
            
            if(letra =='j')
            {
                j++;
            }
            
            if(letra =='k')
            {
                k++;
            }
            
            if(letra =='l')
            {
                l++;
            }
            
            if(letra =='m')
            {
                m++;
            }
            
            if(letra =='n')
            {
                n++;
            }
            
            if(letra =='o')
            {
                o++;
            }
            
            if(letra =='p')
            {
                p++;
            }
            
            if(letra =='q')
            {
                q++;
            }
            
            if(letra =='r')
            {
                r++;
            }
            
            if(letra =='s')
            {
                s++;
            }
            
            if(letra =='t')
            {
                t++;
            }
            
            if(letra =='u')
            {
                u++;
            }
            
            if(letra =='v')
            {
                v++;
            }
            
            if(letra =='w')
            {
                w++;
            }
            
            if(letra =='x')
            {
                x++;
            }
            
            if(letra =='y')
            {
                y++;
            }
            
            if(letra =='z')
            {
                z++;
            }
        }
        
        if(a%2 != 0)
        {
            a = 1;
        }
        else 
        {
            a = 0;
        }
        
        if(b%2 != 0)
        {
            b = 1;
        }
        else 
        {
            b = 0;
        }
        
        if(c%2 != 0)
        {
            c = 1;
        }
        else 
        {
            c = 0;
        }
        
        if(d%2 != 0)
        {
            d = 1;
        }
        else 
        {
            d = 0;
        }
        
        if(e%2 != 0)
        {
            e = 1;
        }
        else 
        {
            e = 0;
        }
        
        if(f%2 != 0)
        {
            f = 1;
        }
        else 
        {
            f = 0;
        }
        
        if(g%2 != 0)
        {
            g = 1;
        }
        else 
        {
            g = 0;
        }
        
        if(h%2 != 0)
        {
            h = 1;
        }
        else 
        {
            h = 0;
        }
        
        if(i%2 != 0)
        {
            i = 1;
        }
        else 
        {
            i = 0;
        }
        
        if(j%2 != 0)
        {
            j = 1;
        }
        else 
        {
            j = 0;
        }
        
        if(k%2 != 0)
        {
            k = 1;
        }
        else 
        {
            k = 0;
        }
        
        if(l%2 != 0)
        {
            l = 1;
        }
        else 
        {
            l = 0;
        }
        
        if(m%2 != 0)
        {
            m = 1;
        }
        else 
        {
            m = 0;
        }
        
        if(n%2 != 0)
        {
            n = 1;
        }
        else 
        {
            n = 0;
        }
        
        if(o%2 != 0)
        {
            o = 1;
        }
        else 
        {
            o = 0;
        }
        
        if(p%2 != 0)
        {
            p = 1;
        }
        else 
        {
            p = 0;
        }
        
        if(q%2 != 0)
        {
            q = 1;
        }
        else 
        {
            q = 0;
        }
        
        if(r%2 != 0)
        {
            r = 1;
        }
        else 
        {
            r = 0;
        }
        
        if(s%2 != 0)
        {
            s = 1;
        }
        else 
        {
            s = 0;
        }
        
        if(t%2 != 0)
        {
            t = 1;
        }
        else 
        {
            t = 0;
        }
        
        if(u%2 != 0)
        {
            u = 1;
        }
        else 
        {
            u = 0;
        }
        
        if(v%2 != 0)
        {
            v = 1;
        }
        else 
        {
            v = 0;
        }
        
        if(w%2 != 0)
        {
            w = 1;
        }
        else 
        {
            w = 0;
        }
        
        if(x%2 != 0)
        {
            x = 1;
        }
        else 
        {
            x = 0;
        }
        
        if(y%2 != 0)
        {
            y = 1;
        }
        else 
        {
            y = 0;
        }
        
        if(z%2 != 0)
        {
            z = 1;
        }
        else 
        {
            z = 0;
        }
        
        int soma = a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p + q + r + s + t + u + v + w + x + y + z;
        
        boolean portal = soma <= 1;
        
        System.out.printf("%s%n", portal ? "YES" : "NO");
        

    }
}





