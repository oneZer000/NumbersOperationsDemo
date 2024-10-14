import java.util.Scanner;

public class IntegersOperationsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int givenNum = in.nextInt();
        if (givenNum % 2 == 0){
            IntegersOperationsDemo.multiplyByFloat(givenNum);
        }else {
            IntegersOperationsDemo.increaseByInt(givenNum);
        }
        in.close();
    }
    private static void multiplyByFloat(float multiplicand){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a float: ");
        float multiplier = in.nextFloat();
        float product = multiplicand * multiplier;
        System.out.printf("%f", product);
        in.close();
    }
    private static void increaseByInt(int augend){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int addend = in.nextInt();
        int sum = augend + addend;
        System.out.printf("%d", sum);
        in.close();
    }
}
