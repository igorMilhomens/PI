import java.util.Scanner;

public class Meses
{
    public static void main( String[] args)
    {
        int mes;
        Scanner scan = new Scanner(System.in);
        mes = scan.nextInt();

        if(mes == 1)
        {
            System.out.println("JANEIRO");
        }
        else
        {
            if(mes == 2)
            {
                System.out.println("FEVEREIRO");
            }
            else
            {
                if(mes == 3)
                {
                    System.out.println("MARCO");
                }
                else
                {
                    if(mes == 4)
                    {
                        System.out.println("ABRIL");
                    }
                    else
                    {
                        if(mes == 5)
                        {
                            System.out.println("MAIO");
                        }
                        else
                        {
                            if(mes == 6)
                            {
                                System.out.println("JUNHO");
                            }
                            else
                            {
                                if(mes == 7)
                                {
                                    System.out.println("JULHO");
                                }
                                else
                                {
                                    if(mes == 8)
                                    {
                                        System.out.println("AGOSTO");
                                    }
                                    else
                                    {
                                        if(mes ==9)
                                        {
                                            System.out.println("SETEMBRO");
                                        }
                                        else
                                        {
                                            if(mes ==10)
                                            {
                                                System.out.println("OUTUBRO");
                                            }
                                            else
                                            {
                                                if(mes == 11)
                                                {
                                                    System.out.println("NOVEMBRO");
                                                }
                                                else
                                                {
                                                    if(mes == 12)
                                                    {
                                                        System.out.println("DEZEMBRO");
                                                    }
                                                    else
                                                    {
                                                        if( mes<1 || mes>12)
                                                        {
                                                            System.out.println("MES INVALIDO");
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
         }
    }
}
