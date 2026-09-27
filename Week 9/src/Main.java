//Week 9
//27-09-2026

//Binary Search
class Main {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Avoids integer overflow compared to (left + right) / 2
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is greater, ignore the left half
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Key was not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 14, 19, 20, 25};
        int key = 20;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not present in array");
        }
    }
}