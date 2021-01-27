import java.util.Scanner;

public class TamanhoMat
{
    public static void main(String[] args)
    {
        int mat[][] = {{123, 23, 23}, {12, 3,5}, {12, 3}};
        {
            System.out.printf("Linhas: %d\n", mat.length);
            
            for(int i=0; i < mat.length; i++)
            {
                System.out.printf("Linhas: %d tem %d colunas\n", i, mat[i].length);
            }
        }
    }
}
