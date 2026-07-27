//27-07-2026
/*
class main{
    public static  void BubbleSort(int arr[]){
        int n = arr.length;
        // i = turns
        boolean swapped = fasle;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
            break;
        }
    }
    //Print Arrays
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        BubbleSort(arr);
        printArr(arr);
    }
}
*/

//Binary Search
/*
class Main {
    public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 9, 11, 15, 22};
        int key = 11;

        System.out.println(binarySearch(arr, key));
    }
}
*/

//Maximum product of two digit TC= o(log n)
/*
class Main{
    public static int maxProductofTwo(int n){
        int largest = 0;
        int SecLargest = 0;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            if(digit >= largest){
                SecLargest = largest;
                largest = digit;
            }else if(digit > SecLargest){
                SecLargest = digit;
            }
        }
        return largest * SecLargest;
    }
    public static void main(String args[]){
        int n = 54691;
        System.out.println("Maximum product of two digit is = " + maxProductofTwo(n));
    }
}
*/
