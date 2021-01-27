import java.util.Scanner;

public class DataToStr
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext())
        {
            int d = scan.nextInt();
            int m = scan.nextInt();
            int a = scan.nextInt();
            
            String mes = meses(m);
            String dia = dias(d);
          
            System.out.printf("%s de %s de %d%n", dia, mes, a);
        }
    }
    public static String meses (int m)
    {
        String [] mes = new String[12];
        
            mes[0] = "Janeiro";
            mes[1] = "Fevereiro";
            mes[2] = "Marco";
            mes[3] = "Abril";
            mes[4] = "Maio";
            mes[5] = "Junho";
            mes[6] = "Julho";
            mes[7] = "Agosto";
            mes[8] = "Setembro";
            mes[9] = "Outubro";
            mes[10] = "Novembro";
            mes[11] = "Dezembro";
            
        return mes[m-1];
    }
    public static String dias (int d)
    {
        String x = "";
        
        if(d < 10)
        {
            x+= "0";
            x += d;
        }
        else
        {
            x += d;
        }
        
        return x;
    }
}
