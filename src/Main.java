//27-07-2026
/*
//Bubble sort TC-o(n^2)
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

//Binary Search TC-o(log n)
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
 // Copy ArrayList
/*
import java.util.*;
class Main{
    public static void main(String args[]){
        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        ArrayList1.add(3);
        ArrayList1.add(11);
        ArrayList1.add(6);
        ArrayList1.add(7);
        ArrayList1.add(5);

        System.out.println("Original ArrayList = " + ArrayList1);

        ArrayList<Integer> ArrayList2 = new ArrayList<>();
        ArrayList2.addAll(ArrayList1);
        System.out.println("Original ArrayList = " + ArrayList2);
    }
}
*/

// 628. Maximum Product of Three Numbers only for positive number
/*
class Main{
    public static int MaximumProduct(int arr[]){
        int l = 0;
        int s = 0;
        int t = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= l){
                t = s;
                s = l;
                l = arr[i];
            } else if(arr[i] >= s){
                t = s;
                s = arr[i];
            }else if(arr[i] >= t){
                t = arr[i];
            }
        }
        return s * l * t;
    }
    public static void main(String args[]){
        int arr[] = {4,11,3};
        System.out.println(MaximumProduct(arr));
    }
}
*/

//Find Permutation
/*
class Main{
    public static void FindPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i) + str.substring(i+1);
            FindPermutation(NewStr, ans+curr);
        }
    }

    public static void main(String args[]){
        String str = "abc";
        FindPermutation(str, " ");
    }
}
*/

/*
import java.util.Arrays;

//3517. Smallest Palindromic Rearrangement I
class Main{
    public static String PalindromicRearr(String str){
        int n = str.length();
        int left = 0;
        int right = n;
        int mid = left + (right-left)/2;

//        int n = str.length();
//        int mid = n / 2;

        char chars[] = str.toCharArray();
        Arrays.sort(chars, 0, mid);

        for(int i = 0; i < mid; i++){
            chars[n-1-i] = chars[i];
        }

        return new String(chars);
    }
    public static void main(String args[]){
        String str = "daccad";
        System.out.println(PalindromicRearr(str));
    }
}
*/

//Kadane's Algorithm
class main{
    public static int Kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < arr.length; i++){
            cs += arr[i];
            ms = Math.max(ms,cs);

            if(cs < 0){
                cs = 0;
            }
        }
        return ms;
    }
    public static void main(String args[]){
        int arr[] = {-2, -4};
        System.out.println(Kadanes(arr));
    }
}


