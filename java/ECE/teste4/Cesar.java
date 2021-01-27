import java.util.Scanner;

public class Cesar
{
    public static void main ( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());;
        
        while(scan.hasNext())
        {
            String palavra = scan.nextLine();
            int teste = palavra.length();
            String palavraNova = "";
            char c;
            for(int i = 0; i < teste; i ++)
            {
               c = palavra.charAt(i);
               
               char novo = c;
               
               if (c == 'a' ||c == 'b' ||c == 'c' ||c == 'd' ||c == 'e' ||c == 'f' ||c == 'g' ||c == 'h' ||c == 'i' ||
                   c == 'j' ||c == 'k' ||c == 'l' ||c == 'm' ||c == 'n' ||c == 'o' ||c == 'p' ||c == 'q' ||c == 'r' ||
                   c == 's' ||c == 't' ||c == 'u' ||c == 'v' ||c == 'w' ||c == 'x' ||c == 'y' ||c == 'z' )
                {
                    novo = cifraMin(c, n);
                } 
                else
                {
                    if(c == 'A' ||c == 'B' ||c == 'C' ||c == 'D' ||c == 'E' ||c == 'F' ||c == 'G' ||c == 'H' ||c == 'I' ||
                       c == 'J' ||c == 'K' ||c == 'L' ||c == 'M' ||c == 'N' ||c == 'O' ||c == 'P' ||c == 'Q' ||c == 'R' ||
                       c == 'S' ||c == 'T' ||c == 'U' ||c == 'V' ||c == 'W' ||c == 'X' ||c == 'Y' ||c == 'Z' )
                    {
                       novo = cifraMai(c , n);
                    }
                }
                
                palavraNova += novo;
            }
            System.out.println(palavraNova);
        }
    }
    public static char cifraMin(char c, int n)
    {
        char alfabeto[] = new char[26];
        int aux = 0;
        
        alfabeto[0] = 'a';
        alfabeto[1] = 'b';
        alfabeto[2] = 'c';
        alfabeto[3] = 'd';
        alfabeto[4] = 'e';
        alfabeto[5] = 'f';
        alfabeto[6] = 'g';
        alfabeto[7] = 'h';
        alfabeto[8] = 'i';
        alfabeto[9] = 'j';
        alfabeto[10] = 'k';
        alfabeto[11] = 'l';
        alfabeto[12] = 'm';
        alfabeto[13] = 'n';
        alfabeto[14] = 'o';
        alfabeto[15] = 'p';
        alfabeto[16] = 'q';
        alfabeto[17] = 'r';
        alfabeto[18] = 's';
        alfabeto[19] = 't';
        alfabeto[20] = 'u';
        alfabeto[21] = 'v';
        alfabeto[22] = 'w';
        alfabeto[23] = 'x';
        alfabeto[24] = 'y';
        alfabeto[25] = 'z';
        
        if(c == 'a') aux = 0;
       
        if(c == 'b') aux = 1;
        
        if(c == 'c') aux = 2;
       
        if(c == 'd') aux = 3;
      
        if(c == 'e') aux = 4;
       
        if(c == 'f') aux = 5;
       
        if(c == 'g') aux = 6;
        
        if(c == 'h') aux = 7;
        
        if(c == 'i') aux = 8;
        
        if(c == 'j') aux = 9;
        
        if(c == 'k') aux = 10;
        
        if(c == 'l') aux = 11;
        
        if(c == 'm') aux = 12;
        
        if(c == 'n') aux = 13;
        
        if(c == 'o') aux = 14;
        
        if(c == 'p') aux = 15;
        
        if(c == 'q') aux = 16;
    
        if(c == 'r') aux = 17;
    
        if(c == 's') aux = 18;
    
        if(c == 't') aux = 19;
    
        if(c == 'u') aux = 20;
    
        if(c == 'v') aux = 21;
    
        if(c == 'w') aux = 22;
    
        if(c == 'x') aux = 23;
    
        if(c == 'y') aux = 24;
        
        if(c == 'z') aux = 25;
        
        int total = aux + n;
        if(total>25)
        {
            total -= 26;
        }
        return alfabeto[total];
    }
    
    public static char cifraMai(char c, int n)
    {
        char alfabeto[]  = new char[26];
        int aux = 0;
        
        alfabeto[0] = 'A';
        alfabeto[1] = 'B';
        alfabeto[2] = 'C';
        alfabeto[3] = 'D';
        alfabeto[4] = 'E';
        alfabeto[5] = 'F';
        alfabeto[6] = 'G';
        alfabeto[7] = 'H';
        alfabeto[8] = 'I';
        alfabeto[9] = 'J';
        alfabeto[10] = 'K';
        alfabeto[11] = 'L';
        alfabeto[12] = 'M';
        alfabeto[13] = 'N';
        alfabeto[14] = 'O';
        alfabeto[15] = 'P';
        alfabeto[16] = 'Q';
        alfabeto[17] = 'R';
        alfabeto[18] = 'S';
        alfabeto[19] = 'T';
        alfabeto[20] = 'U';
        alfabeto[21] = 'V';
        alfabeto[22] = 'W';
        alfabeto[23] = 'X';
        alfabeto[24] = 'Y';
        alfabeto[25] = 'Z';
        
        if(c == 'A') aux = 0;
       
        if(c == 'B') aux = 1;

        if(c == 'C') aux = 2;
       
        if(c == 'D') aux = 3;
      
        if(c == 'E') aux = 4;
       
        if(c == 'F') aux = 5;
       
        if(c == 'G') aux = 6;
        
        if(c == 'H') aux = 7;
        
        if(c == 'I') aux = 8;
        
        if(c == 'J') aux = 9;
        
        if(c == 'K') aux = 10;
        
        if(c == 'L') aux = 11;
        
        if(c == 'M') aux = 12;
        
        if(c == 'N') aux = 13;
        
        if(c == 'O') aux = 14;
        
        if(c == 'P') aux = 15;
        
        if(c == 'Q') aux = 16;
    
        if(c == 'R') aux = 17;
    
        if(c == 'S') aux = 18;
    
        if(c == 'T') aux = 19;
    
        if(c == 'U') aux = 20;
    
        if(c == 'V') aux = 21;
    
        if(c == 'W') aux = 22;
    
        if(c == 'X') aux = 23;
    
        if(c == 'Y') aux = 24;
        
        if(c == 'Z') aux = 25;
        
        int total = aux + n;
        if(total>25)
        {
            total -= 26;
        }
        return alfabeto[total];
    }
}







