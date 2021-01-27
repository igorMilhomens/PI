import java.util.Scanner;

public class Conversa
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int testes,pessoas,i,j,lingua;
        
        testes= scan.nextInt();
        
        for(i=0;i<testes;i++)
        {
            pessoas = scan.nextInt();
            String vet[] = new String[pessoas];
            
            for(j=0;j<pessoas;j++)
            {
                vet[j] = scan.next();
            }
            
            lingua = result(vet,pessoas);
            if(lingua==0)
            {
                System.out.println(vet[0]);
            }
            else
            {
                System.out.println("ingles");
            }
        }
    }   
    public static int result(String[] vet, int pessoas)
    {
        pessoas=pessoas-1;
        int contador=0;
        String padrao="ingles";
        for(int x=0;x<pessoas;x++)
        {
            int y = vet[x].compareTo(vet[x+1]);
            if(y!=0)
                {
                    contador=contador+1;
                }
        }    
        return contador;
    }
}