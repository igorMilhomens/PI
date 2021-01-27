import java.util.Scanner;

public class Datas
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int d,m,a,x,y,z, i=0;
        boolean bis=false;
        
        d = scan.nextInt();
        m = scan.nextInt();
        a = scan.nextInt();
        
        if (d==30 && m!=1 && m!=3 && m!=5 && m!=7 && m!=8 && m!=10 && m!=12 && m!=2)
        {
            
            System.out.println("DATA VALIDA");
        }
        else
        {
            if (d!=30 && m!=1 && m!=3 && m!=5 && m!=7 && m!=8 && m!=10 && m!=12 && m!=2)
            {
                System.out.println("DATA VALIDA");
            }
            else
            {
                if (m==12 && d==31)
                {
                    System.out.println("DATA VALIDA");
                }
                else
                {
                    if(m!=4 && m!=6 && m!=9 && m!=11 && m!=2 && d!=31)
                    {
                        System.out.println("DATA VALIDA");
                    }
                    else
                    {
                        if(m!=4 && m!=6 && m!=9 && m!=11 && m!=2 && d==31)
                        {
                           System.out.println("DATA VALIDA");
                        else
                        {
                            if(a%400==0 || a%100!=0 && a%4==0)
                            {
                                bis=true;
                                while(i<1)
                                {
                                    i++;
                            
                                    if(m==2 && bis==true && d!=29)
                                    {
                                        System.out.println("DATA VALIDA");
                                    }
                                    else
                                    {
                                        if(m==2 && bis==true && d==29)
                                        {
                                            System.out.println("DATA VALIDA");
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if(m==2 && bis==false && d!=28)
                                {
                                    System.out.println("DATA VALIDA");
                                else
                                {
                                    if(m==2 && bis==false && d==28)  
                                    {
                                        System.out.println("DATA VALIDA");
                                    }
                                    else
                                    System.out.println("DATA INVALIDA");
                                }
                            }    
                        }    
                    }
                }
            }
        }
    }
}