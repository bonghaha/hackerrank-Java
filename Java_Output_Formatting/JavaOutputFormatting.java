import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		
        System.out.println("================================");
        
        for(int i=0; i<3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf( "%-15s%03d %n", s1, x);  // just this line instead of below
            
            /*
            System.out.print(s1);
            for(int j=0; j<(15-s1.length()); j++){
                System.out.print(" ");
            }
            
            if(x>=100) {
                System.out.println(x);
            } else if(x==0) {
                System.out.print("00");
                System.out.println(x);
            } else {
                System.out.print("0");
                System.out.println(x);
            }
            */
        }
        System.out.println("================================");
	}
}
