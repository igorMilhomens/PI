
public class InteirosPar
{
    public static void main(String[] args)
    {
       
       int i=0, n=1;
       float par;
    
        while(i<100)
        {
            i=i+1;
            par=i%2;
            if(par == 0)
            System.out.print(" " + i);
        }
       
    }
}