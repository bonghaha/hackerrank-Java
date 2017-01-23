import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        // Write your code here.
        double d = scan.nextDouble();
        String s = scan.nextLine(); // nextDouble을 실행하고 아직 엔터가 안쳐져서 double이 있던 라인의 나머지부분("")을 s에 대입한다
        
        // 만약 input에 남아있는것이 있거나, s가 빈공간이면 input다음라인에 있는 것을 s에 대입
        if(scan.hasNext() || s.isEmpty()) {
            s = scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
}