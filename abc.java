import java.util.Scanner;
public class abc {
    public static void main(String[]args){
      
        Scanner in = new Scanner(System.in);
        int   n = 2; // NUMBER OF ACCOUNTS ADDED WE TAKE 2 

        String CREATE[] = new String[n];
        long DEPOSIT[] = new long[n];
        long WITHDRAW[] = new long[n];
        
        for ( int i = 0; i < n; i++){ 
            System.out.print("CREATE ACC00" + (i+1)+ " ");
            CREATE[i] = in.next(); 

            System.out.print("DEPOSIT ACC00" + (i+1)+ " ");
            DEPOSIT[i] = in.nextInt();
            
            System.out.print("WITHDRAW ACC00" + (i+1)+ " ");
            WITHDRAW[i] = in.nextInt();
        } 
            {
                for (int j = n; j >= 1; j--){
                System.out.println("BALANCE ACC00"+(j));     
                }
            }  
            
            for (int i = n-1; i >= 0; i--) {
            DEPOSIT[i] = DEPOSIT[i] - WITHDRAW[i];
            System.out.println(CREATE[i]+" "+ DEPOSIT[i]);
            }              
    }   
}