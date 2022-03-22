/*public class Sample3{
	public static void main(String args[]){
		int a=5,b=5,sum,sub,mul,div;
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		System.out.println("Sum ="+sum);
		System.out.println("Difference ="+sub);
		System.out.println("Product ="+mul);
		System.out.println("Division ="+div);
	}
}*/
import java.util.Scanner;
public class Sample3 {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        //sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
