import java.util.Scanner;

public class OrdenacaoMarciana
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        
        int n = scan.nextInt();
        int vetMarciano[] = new int [n];
        int vet[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            vetMarciano[i] = scan.nextInt();
            vet[i]= vetMarciano[i];
        }
        
         for(int i = 0; i<n; i++)
        {
            int aux = vet[i];
            boolean aux2 = aux>0;
            int contador = 0;
            int aux4 = 0;
            
            while(aux2)
            {
                int aux3 = aux%10;
                contador++;
                aux = aux/10;
                
                if(aux3 == 5)
                {
                    aux3 = 1;
                }
                else
                {
                    if(aux3 == 6)
                    {
                        aux3 = 2;
                    }
                    else
                    {
                        if(aux3 == 4)
                        {
                            aux3 = 3;
                        }
                        else
                        {
                            if(aux3 == 8)
                            {
                                aux3 = 4;
                            }
                            else
                            {
                                if(aux3 == 9)
                                {
                                    aux3 = 5;
                                }
                                else
                                {
                                    if(aux3 == 7)
                                    {
                                        aux3 = 6;
                                    }
                                    else
                                    {
                                        if(aux3 == 3)
                                        {
                                            aux3 = 7;
                                        }
                                        else
                                        {
                                            if(aux3 == 1)
                                            {
                                                aux3= 8;
                                            }
                                            else
                                            {
                                                if(aux3 == 2)
                                                {
                                                    aux3 = 9;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if(contador == 2 )
                {
                    aux3 = aux3*10;
                }
                else
                {
                    if(contador == 3 )
                    {
                        aux3 = aux3*100;
                    }
                    else
                    {
                        if(contador == 4 )
                        {
                            aux3 = aux3*1000;
                        }
                        else
                        {
                            if(contador == 5 )
                            {
                                aux3 = aux3*10000;
                            }
                            else
                            {
                                if(contador == 6 )
                                {
                                    aux3 = aux3*100000;
                                }
                                else
                                {
                                    if(contador == 7 )
                                    {
                                        aux3 = aux3*1000000;
                                    }
                                }
                            }
                        }
                    }
                }
                
                aux4 += aux3;
                vet[i] = aux4;
                aux2 = aux>0;
            }
            
        }
        
        ordenar(vet, n);
        
        for(int i = 0; i<n; i++)
        {
            int aux = vet[i];
            boolean aux2 = aux>0;
            int contador = 0;
            int aux4 = 0;
            
            while(aux2)
            {
                int aux3 = aux%10;
                contador++;
                aux = aux/10;
                
                if(aux3 == 1)
                {
                    aux3 = 5;
                }
                else
                {
                    if(aux3 == 2)
                    {
                        aux3 = 6;
                    }
                    else
                    {
                        if(aux3 == 3)
                        {
                            aux3 = 4;
                        }
                        else
                        {
                            if(aux3 == 4)
                            {
                                aux3 = 8;
                            }
                            else
                            {
                                if(aux3 == 5)
                                {
                                    aux3 =9;
                                }
                                else
                                {
                                    if(aux3 == 6)
                                    {
                                        aux3 = 7;
                                    }
                                    else
                                    {
                                        if(aux3 == 7)
                                        {
                                            aux3 = 3;
                                        }
                                        else
                                        {
                                            if(aux3 == 8)
                                            {
                                                aux3= 1;
                                            }
                                            else
                                            {
                                                if(aux3 == 9)
                                                {
                                                    aux3 = 2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if(contador == 2 )
                {
                    aux3 = aux3*10;
                }
                else
                {
                    if(contador == 3 )
                    {
                        aux3 = aux3*100;
                    }
                    else
                    {
                        if(contador == 4 )
                        {
                            aux3 = aux3*1000;
                        }
                        else
                        {
                            if(contador == 5 )
                            {
                                aux3 = aux3*10000;
                            }
                            else
                            {
                                if(contador == 6 )
                                {
                                    aux3 = aux3*100000;
                                }
                                else
                                {
                                    if(contador == 7 )
                                    {
                                        aux3 = aux3*1000000;
                                    }
                                }
                            }
                        }
                    }
                }
                
                aux4 += aux3;
                vet[i] = aux4;
                aux2 = aux>0;
            }
            
        }
        
        for(int i= 0; i< n; i++)
        {
         System.out.printf("%d%c", vet[i], i<n-1 ?  ' ' : '\n') ;  
        }
    } 
    
    public static void ordenar(int[] vet, int n)
    {
        int ordena;
        
        for(int i = 0; i < n-1; i++)
        {
            for(int j = 0; j < n-i-1; j++)
            {
                if(vet[j] > vet[j+1])
                {
                    ordena = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = ordena;
                }
            }
        }
    }
}