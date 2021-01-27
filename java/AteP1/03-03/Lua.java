import java.util.Scanner;

public class Lua
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x,y,lua;
        
        x = scan.nextInt();
        y = scan.nextInt();
    
        
        if( 0<=y && y<=2)
        {
            System.out.println("Nova");
        }
        else
        {
            if(y>x && 3<=y && y<=96 ) 
            {
                System.out.println("Crescente");
            }
            else
            {
                if( 97<=y && y<=100 ) 
                {
                  System.out.println("Cheia");  
                }
                
                else
                {
                    if( y<x && 3<=y && y<=96) 
                    {
                    System.out.println("Minguante");
                    }
                }
            }
        }
    }
}