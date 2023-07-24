import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        int total = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            total += array[i];
        }
        scanner.close();
        System.out.println(maxAmount(array, size, total));
    }

    public static int maxAmount(int array[], int size, int total) {
        int amount = 0;
        for (int i = 0; i < size; i += 2) {
            amount += array[i];
        }
        int diff = total - amount;
        if (amount > diff) {
            return amount;
        }
        return diff;
    }

}
