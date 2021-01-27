import java.util.Scanner;

public class Pangrama
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine())
        {
            String frase = scan.nextLine();
            int cont = frase.length(); 
            boolean letra1 = true;
            boolean letra2 = true;
            boolean letra3 = true;
            boolean letra4 = true;
            boolean letra5 = true;
            boolean letra6 = true;
            boolean letra7 = true;
            boolean letra8 = true;
            boolean letra9 = true;
            boolean letra10 = true;
            boolean letra11 = true;
            boolean letra12 = true;
            boolean letra13 = true;
            boolean letra14 = true;
            boolean letra15 = true;
            boolean letra16 = true;
            boolean letra17 = true;
            boolean letra18 = true;
            boolean letra19 = true;
            boolean letra20 = true;
            boolean letra21 = true;
            boolean letra22 = true;
            boolean letra23 = true;
            boolean letra24 = true;
            boolean letra25 = true;
            boolean letra26 = true;
            int condtador = 0;
            
            for(int i = 0; i<cont; i++)
            {
                char letra = frase.charAt(i);
                boolean test1= letra == 'a' || letra == 'A';
                if(test1)
                {
                    letra1 = false;
                }
                boolean test2= letra == 'b' || letra == 'B';
                if(test2)
                {
                    letra2 = false;
                }
            
                boolean test3= letra == 'c' || letra == 'C';
                if(test3)
                {
                    letra3 = false;
                }
            
                
                boolean test4= letra == 'd' || letra == 'D';
                if(test4)
                {
                    letra4 = false;
                }
            
               
                boolean test5= letra == 'e' || letra == 'E';
                if(test5)
                {
                    letra5 = false;
                }
           
                boolean test6= letra == 'f' || letra == 'F';
                if(test6)
                {
                    letra6 = false;
                }
            
                
                boolean test7= letra == 'g' || letra == 'G';
                if(test7)
                {
                    letra7 = false;
                }
            
                boolean test8= letra == 'h' || letra == 'H';
                if(test8)
                {
                    letra8 = false;
                }
            
                boolean test9= letra == 'i' || letra == 'I';
                if(test9)
                {
                    letra9 = false;
                }
            
                boolean test10= letra == 'j' || letra == 'J';
                if(test10)
                {
                    letra10 = false;
                }
           
                boolean test11 = letra == 'k' || letra == 'K';
                if(test11)
                {
                    letra11 = false;
                }
          
                boolean test12= letra == 'l' || letra == 'L';
                if(test12)
                {
                    letra12 = false;
                }
            
                boolean test13= letra == 'm' || letra == 'M';
                if(test13)
                {
                    letra13 = false;
                }
            
                boolean test14= letra == 'n' || letra == 'N';
                if(test14)
                {
                    letra14 = false;
                }
            
                boolean test15= letra == 'o' || letra == 'O';
                if(test15)
                {
                    letra15 = false;
                }
           
                boolean test16= letra == 'p' || letra == 'P';
                if(test16)
                {
                    letra16 = false;
                }
            
                boolean test17= letra == 'q' || letra == 'Q';
                if(test17)
                {
                    letra17 = false;
                }

                boolean test18= letra == 'r' || letra == 'R';
                if(test18)
                {
                    letra18 = false;
                }
            
                boolean test19= letra == 's' || letra == 'S';
                if(test19)
                {
                    letra19 = false;
                }
            
                boolean test20= letra == 't' || letra == 'T';
                if(test20)
                {
                    letra20 = false;
                }
            
                boolean test21= letra == 'u' || letra == 'U';
                if(test21)
                {
                    letra21 = false;
                }
           
                boolean test22= letra == 'v' || letra == 'V';
                if(test22)
                {
                    letra22 = false;
                }
            
                boolean test23= letra == 'w' || letra == 'W';
                if(test23)
                {
                    letra23 = false;
                }
            
                boolean test24= letra == 'x' || letra == 'X';
                if(test24)
                {
                    letra24 = false;
                }
            
                boolean test25= letra == 'y' || letra == 'Y';
                if(test25)
                {
                    letra25 = false;
                }
           
                boolean test26= letra == 'z' || letra == 'Z';
                if(test26)
                {
                    letra26
                    = false;
                }
            }
            if( letra1 || letra2 || letra3 || letra4 || letra5 || letra6 || letra7 || letra8 || letra9 || letra10 || letra11 || letra12 || letra13 ||
            letra14 || letra15 || letra16 || letra17|| letra18 || letra19 || letra20|| letra21 || letra22 || letra23 || letra24 || letra25 || letra26)
            {
                System.out.println("nao");
            }
            else
            {
                System.out.println("sim");
            }
        }
    }
}