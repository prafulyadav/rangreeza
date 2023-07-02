import java.util.Scanner;

public class Main {
    public static int countDigit(int number, int digit) {
        int count = 0;

        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            if (Character.getNumericValue(numberString.charAt(i)) == digit) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit = scanner.nextInt();
        int count = countDigit(number, digit);
        System.out.println(count);
    }
}
