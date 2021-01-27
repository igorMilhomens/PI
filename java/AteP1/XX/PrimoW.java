import java.util.*;

public class PrimoW
{
    public static void main(String[] args)
    {
        int n, aux1=0, i=1;
        boolean aux = true;
        Scanner scan = new Scanner(System.in);
        
        while(aux)
        {
            n=scan.nextInt();
            while(i<n)
            {
                i++;
                if(n%i==0)
                {
                    aux1++;
                }
                if(aux1>1)
                {
                    aux=true;
                }
                else
                {
                    aux=false;
                }

                
            }
            
            i=1;
            aux1=0;
        }
        
    }
}
