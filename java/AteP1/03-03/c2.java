import java.util.Scanner;

public class ContaDigitos
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int x, dig1, dig2 ,dig3 ,dig4 ,dig5, dig6, dig7, dig8, dig9, total;
        while(scan.hasNext())
        {
            x= scan.nextInt();

            dig1=x/100000000;
            x=x%100000000;
            dig2=x/10000000;
            x=x%10000000;
            dig3=x/1000000;
            x=x%1000000;
            dig4=x/100000;
            x=x%100000;
            dig5=x/10000;
            x=x%10000;
            dig6=x/1000;
            x=x%1000;
            dig7=x/100;
            x=x%100;
            dig8=x/10;
            dig9=x%10;

            total=(dig1 + dig2 + dig3 + dig4 + dig6 + dig7 + dig8 + dig9);
            System.out.println(total);


        }

        scan.close();
    }
}


=====================================

import java.util.Scanner;


public class ContaDigitos
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int i=0, x, n =0, dig1, dig2 ,dig3 ,dig4 ,dig5, dig6, dig7, dig8, dig9, total;
        while(i==n)
        {
            i++;
            x = scan.nextInt();

            if(x>0 && x<=100000000 )
            {
                n++;
            }
            else
            {
                n--;
            }

            dig1=x/100000000;
            x=x%100000000;
            dig2=x/10000000;
            x=x%10000000;
            dig3=x/1000000;
            x=x%1000000;
            dig4=x/100000;
            x=x%100000;
            dig5=x/10000;
            x=x%10000;
            dig6=x/1000;
            x=x%1000;
            dig7=x/100;
            x=x%100;
            dig8=x/10;
            dig9=x%10;

            total=(dig1 + dig2 + dig3 + dig4 + dig6 + dig7 + dig8 + dig9);
            System.out.println(total);


        }


    }
}

-----------------------------------



 int x, dig1, dig2 ,dig3 ,dig4 ,dig5, dig6, dig7, dig8, dig9, total;
        while(scan.hasNext())
        { 
            x= scan.nextInt();
            
            dig1=x/100000000;
            x=x%100000000;
            dig2=x/10000000;
            x=x%10000000;
            dig3=x/1000000;
            x=x%1000000;
            dig4=x/100000;
            x=x%100000;
            dig5=x/10000;
            x=x%10000;
            dig6=x/1000;
            x=x%1000;
            dig7=x/100;
            x=x%100;
            dig8=x/10;
            dig9=x%10;
            
            total=(dig1 + dig2 + dig3 + dig4 + dig6 + dig7 + dig8 + dig9);
            System.out.println(total);
            
            
        }
        
        
        
        