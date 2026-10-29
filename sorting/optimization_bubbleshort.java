
class Main {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        // Bubble sort
        int[] arr = {10, 32, 22, 44, 22};

        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0; // Reset for every pass

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                    sum++;
                }
            }

            if (sum == 0) break;
        }

        print(arr);
    }
}
