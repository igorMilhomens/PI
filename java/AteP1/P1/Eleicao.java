import java.util.Scanner;
public class Eleicao
{
    public static void main (String[] args) 
   {
        int  chapa1=0,chapa2=0,chapa3=0, brancos=0, n=0, num = 0;
        
        Scanner scan = new Scanner(System.in);
        
         while(num>=0)
         {
            num = scan.nextInt();
           
            if(num==0)
            {
                brancos=brancos+1;
            }
            else
            {
                if(num==1)
                {
                    chapa1=chapa1+1;
                }
                else
                {
                    if(num==2)
                    {
                        chapa2=chapa2+1;
                    }
                    else
                    {
                        if(num==3)
                        {
                            chapa3=chapa3+1;
                        }
                        else
                        {
                            if(num>=4)
                            {
                                n=n+1;
                            }
                            else
                            {
                                if(chapa1>chapa2 && chapa1>chapa3)  
                                {
                     
                                System.out.println("Votos chapa 1: " + chapa1);
                                System.out.println("Votos chapa 2: " + chapa2);
                                System.out.println("Votos chapa 3: " + chapa3);
                                System.out.println("Votos brancos: " + brancos);
                                System.out.println("Votos nulos  : " + n);
                                System.out.println("==Vitoria chapa 1==");
                                }
                                else
                                {
                                    if(chapa2>chapa1 && chapa2>chapa3)  
                                    {
                         
                                    System.out.println("Votos chapa 1: " + chapa1);
                                    System.out.println("Votos chapa 2: " + chapa2);
                                    System.out.println("Votos chapa 3: " + chapa3);
                                    System.out.println("Votos brancos: " + brancos);
                                    System.out.println("Votos nulos  : " + n);
                                    System.out.println("==Vitoria chapa 2==");
                                    }
                                    else
                                    {
                                        if(chapa3>chapa2 && chapa3>chapa1)  
                                        {
                             
                                        System.out.println("Votos chapa 1: " + chapa1);
                                        System.out.println("Votos chapa 2: " + chapa2);
                                        System.out.println("Votos chapa 3: " + chapa3);
                                        System.out.println("Votos brancos: " + brancos);
                                        System.out.println("Votos nulos  : " + n);
                                        System.out.println("==Vitoria chapa 3");
                                        }
                                        else
                                        {
                                            if((chapa1==chapa2) && chapa1>chapa3 || (chapa1==chapa3) && chapa1>chapa2 ||(chapa3==chapa2) && chapa3>chapa1)  
                                            {
                                 
                                            System.out.println("Votos chapa 1: " + chapa1);
                                            System.out.println("Votos chapa 2: " + chapa2);
                                            System.out.println("Votos chapa 3: " + chapa3);
                                            System.out.println("Votos brancos: " + brancos);
                                            System.out.println("Votos nulos  : " + n);
                                            System.out.println("==Empate==");
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
    }
}   