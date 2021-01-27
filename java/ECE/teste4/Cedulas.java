import java.util.Scanner;

public class Cedulas
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int novo = n;
        int controle100 = 0; 
        int controle50 = 0; 
        int controle20 = 0; 
        int controle10 = 0; 
        int controle5 = 0; 
        int controle2 = 0; 
        int controle1 = 0; 
        int [] vet  = new int [2]; 
        
        while(novo > 0)
        {
            if(novo >= 100)
            {
                vet = cem(novo);
                controle100 = vet[0];
                novo = vet[1];
            }
            else
            {
                if(novo >= 50)
                {
                    vet = cinq(novo);
                    controle50 = vet[0];
                    novo = vet[1];
                }
                else
                {
                    if(novo >= 20)
                    {
                        vet = vinte(novo);
                        controle20 = vet[0];
                        novo = vet[1];
                    }
                    else
                    {
                        if(novo >= 10)
                        {
                            vet = dez(novo);
                            controle10 = vet[0];
                            novo = vet[1];
                        }
                        else
                        {
                            if(novo >= 5)
                            {
                                vet = cinco(novo);
                                controle5 = vet[0];
                                novo = vet[1];
                            }
                            else
                            {
                                if(novo >= 2)
                                {
                                    vet = dois(novo);
                                    controle2 = vet[0];
                                    novo = vet[1];
                                }
                                else
                                {
                                    if(novo >= 1)
                                    {
                                        vet = um(novo);
                                        controle1 = vet[0];
                                        novo = vet[1];
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        float novo2 = n;
        System.out.printf("R$%.2f%n" , novo2 );
        System.out.println( controle100 + " nota(s) de R$100.00" );
        System.out.println( controle50 + " nota(s) de R$50.00" );
        System.out.println( controle20 + " nota(s) de R$20.00" );
        System.out.println( controle10 + " nota(s) de R$10.00" );
        System.out.println( controle5 + " nota(s) de R$5.00" );
        System.out.println( controle2 + " nota(s) de R$2.00" );
        System.out.println( controle1 + " nota(s) de R$1.00" );
    }
    
    public static int[] cem(int x)
    {
        int [] cont = new int [2];
        cont[0] = x/100;
        int aux = cont[0]*100;
        cont[1] = x - aux;
        return cont;
    }
    public static int[] cinq(int x)
    {
        int [] cont = new int [2];
        cont[0] = x/50;
        int aux = cont[0]*50;
        cont[1] = x - aux;
        return cont;
    }
    public static int[] vinte(int x)
    {
        int [] cont = new int [2];
        cont[0] = x/20;
        int aux = cont[0]*20;
        cont[1] = x - aux;
        return cont;
    }
    public static int[] dez(int x)
    {
        int [] cont = new int [2];
        cont[0] = x/10;
        int aux = cont[0]*10;
        cont[1] = x - aux;
        return cont;
    }
    public static int[] cinco(int x)
    {
        int [] cont = new int [2];
        cont[0] = x/5;
        int aux = cont[0]*5;
        cont[1] = x - aux;
        return cont;
    }
    public static int[] dois(int x)
    {
        int [] cont = new int [2];
        cont[0] = x/2;
        int aux = cont[0]*2;
        cont[1] = x - aux;
        return cont;
    }
    public static int[] um(int x)
    {
        int [] cont = new int [2];
        cont[0] = x/1;
        int aux = cont[0]*1;
        cont[1] = x - aux;
        return cont;
    }
}