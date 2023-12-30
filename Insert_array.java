import java.util.Scanner;

public class New_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("\n");
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("\n");
        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();
        System.out.println("\n");
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        if (position >= 1 && position <= size + 1) {
            int[] newArray = new int[size + 1];

            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == position - 1) {
                    newArray[i] = element;
                } else {
                    newArray[i] = array[j];
                    j++;
                }
            }

            System.out.println("Array after insertion to specific position:");
            for (int value : newArray) {
                System.out.print(value + " ");
                  System.out.println("\n");
            }
        } else {
            System.out.println("Invalid position. Please enter a valid position.");
        }

        scanner.close();
    }
}
