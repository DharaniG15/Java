import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter an integer to add: ");
                    integers.add(input.nextInt());
                    System.out.println("Added!");
                    break;

                case 2:
                    System.out.println("Enter an integer to remove: ");
                    int elementToRemove = input.nextInt();
                    if (integers.contains(elementToRemove)) {
                        integers.remove(Integer.valueOf(elementToRemove));
                        System.out.println("Removed!");
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case 3:
                    System.out.println("Your List: " + integers);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    input.close(); 
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("Enter 1 to Add");
        System.out.println("Enter 2 to Remove");
        System.out.println("Enter 3 to Display");
        System.out.println("Enter 4 to Exit");
        System.out.println();
    }
}
