import java.util.Scanner;

public class DecToPort
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            int num = scan.nextInt();
            String vet[] = new String[10];
            vet[0] = "-"; vet[1] = "-"; vet[2] = "duzentos"; vet[3] = "trezentos";   vet[4] = "quatrocentos";   vet[5] = "quinhentos";  vet[6] = "seiscentos";
            vet[7] = "setecentos";  vet[8] = "oitocentos";  vet[9] = "novecentos";
            
            String vet1[] = new String[10];
            vet1[0] = "-"; vet1[1] = "-"; vet1[2] = "vinte"; vet1[3] = "trinta";   vet1[4] = "quarenta";   vet1[5] = "cinquenta";  vet1[6] = "sessenta";
            vet1[7] = "setenta";  vet1[8] = "oitenta";  vet1[9] = "noventa";
            
            String vet2[] = new String[20];
            vet2[0] = "-"; vet2[1] = "um"; vet2[2] = "dois"; vet2[3] = "tres";   vet2[4] = "quatro";   vet2[5] = "cinco";  vet2[6] = "seis";
            vet2[7] = "sete";  vet2[8] = "oito";  vet2[9] = "nove"; vet2[10] = "dez"; vet2[11] = "onze"; vet2[12] = "doze";
            vet2[13] = "treze"; vet2[14] = "quatorze"; vet2[15] = "quinze"; vet2[16] = "dezesseis"; vet2[17] = "dezessete";
            vet2[18] = "dezoito"; vet2[19] = "dezenove";
            
            int contador = 0;
            int contador2 = 0;
            
            if(num==0)
            {
                System.out.print("zero");
            }
            if(num>=100000)
            {
                if(num/1000 == 100)
                {
                    System.out.print("cem mil");
                }
                else
                {
                    if(num/1000<200 && num/1000>100)
                    {
                        System.out.print("cento e ");
                    }
                    else
                    {
                        if(num/100<10000)
                        {
                            int aux = num/100000;
                            int aux2 = num/1000;
                            
                            System.out.printf("%s%s", vet[aux], aux2%100!=0 ? " e " : " mil");
                        }
                    }
                }
                
                num = num%100000;
                contador++;
            }
            if(num >= 1000)
            {
                 
                if(num/1000 >= 20)
                {
                    int aux = num/10000;
                    int aux2 = num/1000;
                    
                    System.out.printf("%s%s", vet1[aux], aux2%10 != 0 ? " e " : " mil");
                    
                    int aux3 = aux2%10;
                    if(aux3 != 0)
                    {
                        System.out.printf("%s%s", vet2[aux3]," mil");
                    }
                    
                }
                else
                {
                        int aux = num/1000;
                        System.out.printf("%s%s" ,vet2[aux], " mil");
                        
                    
                }
                num = num%1000;
                contador= 1;
            }
            if(num<1000 && num>=100)
            {
                if(num == 100)
                {
                    System.out.printf("%s", contador ==0 ? "cem" : " e cem");
                }
                else
                {
                    if(num<200 && num>100)
                    {
                        System.out.printf("%s", contador ==0 ? "cento e " : " e cento e ");
                    }
                    else
                    {
                        if(num>=200)
                        {
                            int aux = num/100;
                            int aux2 = num%100;
                            
                            System.out.printf("%s%s", contador == 0? "" : " e " , vet[aux]);
                            
                            if(aux2!=0)
                            {
                                System.out.print(" e ");
                            }
                            
                        }
                    }
                }
                num = num%100;
                contador2 = 1;
            }
            if(num<100 && num>=20)
            {
                if( contador2 == 1 || contador == 0)
                {
                    int aux = num/10;
                    System.out.printf("%s", vet1[aux]);
                    int aux2 = num%10;
                    
                    if(aux2 != 0)
                    {
                        System.out.print( " e ");
                        num = num%10;
                        System.out.printf("%s", vet2[num]);
                    }
  
                }
                else
                {
                    System.out.print(" e ");
                    
                    int aux = num/10;
                    System.out.print(vet1[aux]);
                    int aux2 = num%10;
                    
                    if( aux2 != 0 )
                    {
                        System.out.print( " e ");
                        num = num%10;
                        System.out.printf("%s", vet2[num]);
                    }
   
                }
                num = 0;
            }
            if(num<20 && num>0)
            {
                if(contador2 == 1 || contador == 0)
                {
                    System.out.printf("%s", vet2[num]);
                }
                else
                {
                     System.out.printf("%s%s", " e ", vet2[num]);
                }
            }
            System.out.printf("%n");
        }
    }
}