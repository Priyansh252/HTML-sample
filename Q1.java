import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("\nEnter no. of elements in array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("\nEnter Scores(elements of array): ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int duplicates = 0;
        int a= 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < a; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                duplicates++;
            } else {
                temp[a] = arr[i];
                a++;
            }
        }

        System.out.println("\nThere are " + duplicates + " duplicates in the array");
        System.out.print("The duplicate elements are: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(" " + arr[i]);
                    break;
                }
            }
        }

        System.out.println("\nArray after removing duplicates is: ");
        for (int i = 0; i < a; i++) {
            System.out.print(" " + temp[i]);
        }
    }
    
}
