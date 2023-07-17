import java.util.Scanner;

public class BaseToDecimal {
    public static int basetoDecimal(int d,int b){
        int val=0;
        int i=0;
        int count=0;
        while(d>0){
            int digit=d%10;

            val= (int) (val+digit*Math.pow(b,i));
            i++;
            d=d/10;

        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal :");
        int d=sc.nextInt();
        System.out.println("Enter the base :");
        int b=sc.nextInt();

    int val=basetoDecimal(d,b);

        System.out.println(val);

    }
}