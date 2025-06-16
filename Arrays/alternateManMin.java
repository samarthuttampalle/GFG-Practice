lass Solution {
    public static void rearrange(int arr[]) {
        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Create a temporary array
        int[] arr1 = new int[n];

        // Step 3: Use two pointers
        int left = 0;
        int right = n - 1;
        int index = 0;

        // Step 4: Fill arr1[] in max-min pattern
        while (left <= right) {
            if (index % 2 == 0) {
                arr1[index++] = arr[right--];  // even index → max value
            } else {
                arr1[index++] = arr[left++];   // odd index → min value
            }
        }

        // Step 5: Copy result back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }
    }
}
