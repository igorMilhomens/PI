import java.util.Scanner;

public class BackToTheFuture
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int d,m,a;
        
        int n = scan.nextInt();
        
        for ( int k = 0; k < n; k++)
        {
            
            d = scan.nextInt();
            m = scan.nextInt();
            a = scan.nextInt();
            
            int teste = scan.nextInt();
            int cont = 0;
            String palavra = scan.next();
            
            for (int j = 0; j < teste; j++)
            {
                
                char c = palavra.charAt(j);
                
                if(c == '>')
                {
                    cont++;
                }
                else
                {
                    cont--;
                }
            }
      
            if (cont > 0)
            {
                for(int i = 0; i < cont; i++)
                {
                    if (d==30 && m!=1 && m!=3 && m!=5 && m!=7 && m!=8 && m!=10 && m!=12 && m!=2)
                    {
                       d = 1;
                       m++;
                    }
                    else
                    {
                        if (d!=30 && m!=1 && m!=3 && m!=5 && m!=7 && m!=8 && m!=10 && m!=12 && m!=2)
                        {
                            d++;
                        }
                        else
                        {
                            if (m==12 && d==31)
                            {
                                d = 1;
                                m = 1;
                                a++;
                            }
                            else
                            {
                                if(m!=4 && m!=6 && m!=9 && m!=11 && m!=2 && d!=31)
                                {
                                    d++;
                                }
                                else
                                {
                                    if(m!=4 && m!=6 && m!=9 && m!=11 && m!=2 && d==31)
                                    {
                                        d = 1;
                                        m++;
                                    }
                                    else
                                    {
                                        if(a%400==0 || a%100!=0 && a%4==0)
                                        {
                                            bis = true;
                                        
                                            if(m==2 && bis==true && d!=29)
                                            {
                                                d++;
                                            }
                                            else
                                            {
                                                if(m==2 && bis==true && d==29)
                                                {
                                                    d = 1;
                                                    m++;
                                                }
                                                
                                            }
                                        }
                                        else
                                        {
                                            if(m==2 && bis==false && d!=28)
                                            {
                                                d++;
                                                   
                                            }
                                            else
                                            {
                                                if(m==2 && bis==false && d==28)  
                                                {
                                                    d = 1;
                                                    m++;
                                                 
                                                }
                                            }
                                        } 
                                        
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else 
            {
                if(cont<0)
                {
                    for(int i = 0; i > cont; i--)
                    {
                        if (d!= 1)
                        {
                           d--;
                           
                        }
                        else
                        {
                            if (m == 2|| m == 4|| m == 6|| m== 8|| m == 9|| m == 11 )
                            {
                                d=31;
                                m--;
                            }
                            else
                            {
                                if (m==1 )
                                {
                                    d=31;
                                    m=12;
                                    a--;
                                }
                                
                                else
                                {
                                    if( m == 5 || m == 7 || m == 10 || m == 12  )
                                    {
                                        d = 30;
                                        m--;
                                    }
                                    else
                                    {
                                        if(a%400==0 || a%100!=0 && a%4==0)
                                        {
                                            bis=true;
                                            
                                            if(m==3 && bis==true && d!=1)
                                            {
                                                d--;
                                                
                                            }
                                            else
                                            {
                                                if(m==3 && bis==true )
                                                {
                                                    d = 29;
                                                    m = m-1;
                                                }
                                            }
                                        }
                                        else
                                        {
                                            if(m==3 && bis==false )  
                                            {
                                                d = 28;
                                                m--;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            System.out.printf("%d%c%d%c%d%n", d, '/', m, '/', a);
        }
    }
}
