import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;

        if (n == 1) {
            index = 0;
        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    if (arr[i] >= arr[i + 1]) {
                        index = i;
                        break;
                    }
                } else if (i == n - 1) {
                    if (arr[i] >= arr[i - 1]) {
                        index = i;
                        break;
                    }
                } else {
                    if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                        index = i;
                        break;
                    }
                }
            }
        }

        System.out.print(index);
    }
}

