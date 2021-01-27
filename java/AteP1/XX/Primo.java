import java.util.*;
import java.lang.*;

public class Primo {
    public static void main(String args[]) {
        int n;
        
        Scanner input = new Scanner(System.in);
        
        boolean aux = true;

        
        while(aux){
            n = input.nextInt();
            int aux0 = 0;
            for(int i=1; i<n; i++) {
                if(n%i == 0) aux0++;
                if(aux0 > 1) aux = true;
                else aux = false;
            }
            aux0 = 0;
        };
    }
}