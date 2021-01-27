import java.util.Scanner;

public class Lua
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x,y,lua;
        
        x = scan.nextInt();
        y = scan.nextInt();
        lua =(y-x);
    
        
        if(0<=lua && lua<=2 && 0<=y && y<=2)
        {
            System.out.println("Nova");
        }
        else
        {
            if(0<=lua && lua<=94 && 3<=y && y<=96 ) 
            {
                System.out.println("Crescente");
            }
            else
            {
                if(-3<=lua && lua<=3 && 97<=y && y<=100 ) 
                {
                  System.out.println("Cheia");  
                }
                
                else
                {
                    if(lua<0 && y<x) 
                    {
                    System.out.println("Minguante");
                    }
                }
            }
        }
    }
}
