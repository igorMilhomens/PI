import java.util.Scanner;

public class Cha
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int cha,i=0, n, total = 0;
        
        cha = scan.nextInt();
        
        
       while(i<5)
       {
            i++;
            n = scan.nextInt();
            if(cha==n)
            {
                total = total+1;
            } 
       }
        System.out.println(total);
    }
}