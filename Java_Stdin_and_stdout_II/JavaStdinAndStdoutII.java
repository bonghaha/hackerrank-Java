import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        // Write your code here.
        double d = scan.nextDouble();
        String s = scan.nextLine(); // nextDouble�� �����ϰ� ���� ���Ͱ� �������� double�� �ִ� ������ �������κ�("")�� s�� �����Ѵ�
        
        // ���� input�� �����ִ°��� �ְų�, s�� ������̸� input�������ο� �ִ� ���� s�� ����
        if(scan.hasNext() || s.isEmpty()) {
            s = scan.nextLine();
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
}