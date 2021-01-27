import java.util.Scanner;

public class TicTacToy
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i= 0; i < n;i++)
        {
            String M [][] = new String [3][3];
            
            for(int k = 0; k < 3; k++)
            {
                for(int j = 0; j < 3; j++)
                {
                    M [k][j] = scan.next();
                }
            }
            
            String jogador1 = "OOO";
            String jogador2 = "XXX";
    
            String palavra1 = "";
            String palavra2 = "";
            String palavra3 = "";
            String palavra4 = "";
            String palavra5 = "";
            String palavra6 = "";
            String palavra7 = "";
            String palavra8 = "";
            
            for(int l = 0; l < 3; l++)
            {
                palavra1 += M[0][l];
                palavra2 += M[1][l];
                palavra3 += M[2][l];
                palavra4 += M[l][l];
                palavra5 += M[l][2-l];
                palavra6 += M[l][0];
                palavra7 += M[l][1];
                palavra8 += M[l][2];
            }
            
            boolean test1 = (palavra1.intern() == jogador1);
            boolean test2 = (palavra2.intern() == jogador1);
            boolean test3 = (palavra3.intern() == jogador1);
            boolean test4 = (palavra4.intern() == jogador1);
            boolean test5 = (palavra5.intern() == jogador1);
            boolean test6 = (palavra6.intern() == jogador1);
            boolean test7 = (palavra7.intern() == jogador1);
            boolean test8 = (palavra8.intern() == jogador1);
            
            
            boolean test9 = (palavra1.intern() == jogador2);
            boolean test10 = (palavra2.intern() == jogador2);
            boolean test11 = (palavra3.intern() == jogador2);
            boolean test12 = (palavra4.intern() == jogador2);
            boolean test13 = (palavra5.intern() == jogador2);
            boolean test14 = (palavra6.intern() == jogador2);
            boolean test15 = (palavra7.intern() == jogador2);
            boolean test16 = (palavra8.intern() == jogador2);
            
            int cont = 0;
            if(test1 || test2 || test3 || test4 || test5 || test6 || test7 || test8)
            {
                cont = 1;
            }
            else
            {
                if(test9 || test10 || test11 || test12 || test13 || test14 || test15 || test16)
                {
                    cont = 2;
                }
            }
            
            if (cont == 0)
            {
                System.out.println("o jogo deu velha");
            }
            else
            {
                if(cont == 1)
                {
                    System.out.println("o jogador O venceu");
                }
                else
                {
                    System.out.println("o jogador X venceu");
                }
            }
        }
    }
}