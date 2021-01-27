import java.util.Scanner;

public class DiaAnterior
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int d,m,a,x,y,z;
        boolean bis=false;
        
        d = scan.nextInt();
        m = scan.nextInt();
        a = scan.nextInt();
        
        if (d!= 1)
        {
            x = d-1;
            System.out.println(x+" "+m+" "+a);
        }
        else
        {
            if (m == 2|| m == 4|| m == 6|| m== 8|| m == 9|| m == 11 )
            {
                x = d=31;
                y = m-1;
                System.out.println(x+" "+y+" "+a);
            }
            else
            {
                if (m==1 )
                {
                    x=31;
                    y=12;
                    z=a-1;
                    System.out.println(x+" "+y+" "+z);
                }
                
                else
                {
                    if( m == 5 || m == 7 || m == 10 || m == 12  )
                    {
                        x=30;
                        y = m-1;
                        System.out.println(x+" "+y+" "+a);
                    }
                    else
                    {
                        if(a%400==0 || a%100!=0 && a%4==0)
                        {
                            bis=true;
                        
                            if(m==3 && bis==true && d!=1)
                            {
                                x=d-1;
                                System.out.println(x+" "+m+" "+a);
                            }
                            else
                            {
                                if(m==3 && bis==true )
                                {
                                    x = 29;
                                    y = m-1;
                                    System.out.println(x+" "+y+" "+a);
                                }
                            }
                        }
                        else
                        {
                            
                            if(m==3 && bis==false )  
                            {
                                x = 28;
                                y = m-1;
                                System.out.println(x+" "+y+" "+a);
                            }
                            
                        }    
                    }    
                }
            }
        }
    }
}