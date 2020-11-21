import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger big1 = scanner.nextBigInteger();
        BigInteger big2 = scanner.nextBigInteger();
        BigInteger sum = big1.add(big2);
        System.out.println(sum);
    }
}
