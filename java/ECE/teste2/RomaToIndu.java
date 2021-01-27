import java.util.Scanner;

public class RomaToIndu
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine())
        {
            int milhar = 0, centena = 0, dezena =0, unidade =0, cont1 = 0, cont2 = 0, cont3 = 0;
            
            String num = scan.nextLine();
            int n = num.length();
            char vet[] = new char[n];
            
            for(int i =0; i<n; i++)
            {
                vet[i]= num.charAt(i);
            }
            
            if( vet[0] == 'M' )
            {
                if (n>2 && vet[1] == 'M' && vet[2] == 'M')
                {
                    milhar = 3000;
                    cont1 = 3;
                }
                else
                {
                    if (n>1 && vet[1]=='M' )
                    {
                        milhar = 2000;
                        cont1 = 2;
                    }
                    else
                    {
                        milhar = 1000;
                        cont1 = 1;
                        
                    }
                }   
            }
            
            if(n>0+cont1 && vet[0+cont1] == 'C')
            {
                if(n>0+cont1+1 && vet[0+cont1+1]== 'M')
                {
                    centena = 900;
                    cont2=2;
                }
                else
                {
                    if(n>0+cont1+1 && vet[0+cont1+1]== 'D')
                    {
                        centena = 400;
                        cont2=2;
                    }
                    else
                    {
                        if(n>0+cont1+2 && vet[0+cont1+1] == 'C' && vet[0+cont1+2] == 'C')
                        {
                            centena = 300;
                            cont2=3;
                        }
                        else
                        {
                            if(n>0+cont1+1 && vet[0+cont1+1] == 'C')
                            {
                                centena = 200;
                                cont2= 2;
                            }
                            else
                            {
                                centena = 100;
                                cont2=1;
                            }
                        }
                    }
                }
            }
            if( n> 0+cont1 && vet[0+cont1] == 'D')
            {
                if(n>0+cont1+3 && vet[0+cont1+1] =='C' && vet[0+cont1+2] =='C' && vet[0+cont1+3] =='C')
                {
                    centena = 800;
                    cont2 = 4;
                }
                else
                {
                    if(n>0+cont1+2 && vet[0+cont1+1] =='C' && vet[0+cont1+2] =='C' )
                    {
                        centena = 700;
                        cont2 = 3;
                    }
                    else
                    {
                        if(n>0+cont1+1 && vet[0+cont1+1] =='C')
                        {
                            centena = 600;
                            cont2 = 2;
                        }
                        else
                        {
                            centena = 500;
                            cont2 =1;
                        }
                    }
                }
            }
            if(n>0+cont1+cont2 && vet[0+cont1+cont2] =='X')
            {
                if(n>0+cont1+cont2+1 && vet[0+cont1+cont2+1] =='C' )
                {
                    dezena = 90;
                    cont3=2;
                }
                else
                {
                    if(n>0+cont1+cont2+1 && vet[0+cont1+cont2+1] =='L' )
                    {
                        dezena = 40;
                        cont3=2;
                    }
                    else
                    {
                        if(n>0+cont1+cont2+2 && vet[0+cont1+cont2+1] =='X' && vet[0+cont1+cont2+2] =='X')
                        {
                            dezena = 30;
                            cont3=3;
                        }
                        else
                        {
                            if(n>0+cont1+cont2+1 && vet[0+cont1+cont2+1] =='X')
                            {
                                dezena = 20;
                                cont3 =2;
                            }
                            else
                            {
                            
                                dezena = 10;
                                cont3 =1;
                                
                            }
                        }
                    }
                }
            }
            if(n>0+cont1+cont2 && vet[0+cont1+cont2] =='L')
            {
                if(n>0+cont1+cont2+3 && vet[0+cont1+cont2+1] =='X' && vet[0+cont1+cont2+2] =='X' && vet[0+cont1+cont2+3] =='X')
                {
                    dezena = 80;
                    cont3=4;
                }
                else
                {
                     if(n>0+cont1+cont2+2 && vet[0+cont1+cont2+1] =='X' && vet[0+cont1+cont2+2] =='X')
                     {
                         dezena = 70;
                         cont3=3;
                     }
                     else
                     {
                         if(n>0+cont1+cont2+1 && vet[0+cont1+cont2+1] =='X' )
                         {
                             dezena = 60;
                             cont3=2;
                         }
                         else
                         { 
                            
                            dezena = 50;
                            cont3=1;
                            
                         }
                     }
                }
            }
            if(n>0+cont1+cont2+cont3 && vet[0+cont1+cont2+cont3] == 'I')
            {
                if(n>0+cont1+cont2+cont3+1 && vet[0+cont1+cont2+cont3+1] =='X')
                {
                    unidade = 9;
                    
                }
                else
                {
                    if(n>0+cont1+cont2+cont3+1 && vet[0+cont1+cont2+cont3+1] =='V')
                    {
                        unidade = 4;
                        
                    }
                    else
                    {
                        if(n>0+cont1+cont2+cont3+2 && vet[0+cont1+cont2+cont3+1] =='I' && vet[0+cont1+cont2+cont3+2] =='I')
                        {
                            unidade = 3;
                            
                        }
                        else
                        {
                            if(n>0+cont1+cont2+cont3+1 && vet[0+cont1+cont2+cont3+1] =='I')
                            {
                                unidade = 2;
                                
                            }
                            else
                            {
                                unidade = 1;
                                
                            }
                        }
                    }
                }
            }
            
            if(n>0+cont1+cont2+cont3 && vet[0+cont1+cont2+cont3] =='V')
            {
                if(n>0+cont1+cont2+cont3+3 && vet[0+cont1+cont2+cont3+1] =='I' && vet[0+cont1+cont2+cont3+2] =='I' && vet[0+cont1+cont2+cont3+3] =='I')
                {
                    unidade = 8;
                    
                }
                else
                {
                     if(n>0+cont1+cont2+cont3+2 && vet[0+cont1+cont2+cont3+1] =='I' && vet[0+cont1+cont2+cont3+2] =='I')
                     {
                         unidade = 7;
                         
                     }
                     else
                     {
                         if(n>0+cont1+cont2+cont3+1 && vet[0+cont1+cont2+cont3+1] =='I' )
                         {
                             unidade = 6;
                             
                         }
                         else
                         {
                             unidade = 5;
                             
                         }
                     }
                }
            }
            
            int soma = milhar + centena + dezena + unidade;
            
            System.out.printf("%d%n" , soma);
        }
    }
}

























