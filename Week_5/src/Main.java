// Week- 05 24/08/2026
import java.util.*;
//28. Find the Index of the First Occurrence in a String
/*
class Main{
    public static int f(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        for(int i = 0; i <= n-m; i++){
            int j = 0;
            while(j < m && s1.charAt(i + j) == s2.charAt(j)){
                j++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String s1 = "sadbutsad";
        String s2 = "sad";
        System.out.println(f(s1, s2));
    }
}
*/

//Merge Two Sorted Array without extra space
/*
class Main {
    public static void f(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int i = n - 1;
        int j = 0;

        // Traverse backwards in nums1 and forwards in nums2
        while (i >= 0 && j < m) {
            if (nums1[i] > nums2[j]) {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4, 7, 10};
        int[] nums2 = {2, 3};

        f(nums1, nums2);

        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("nums2: " + Arrays.toString(nums2));
    }
}
*/

// 2149. Rearrange Array Elements by Sign
/*
class Main{
    public static int[] f(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0;
        int r = l+1;

        for(int num : nums){
            if(num > 0){
                ans[l] = num;
                l += 2;
            }else{
                ans[r] = num;
                r += 2;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(f(nums)));
    }
}
*/

//All Divisors of a Number
class Main{
    public ArrayList<Integer> f(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                divisors.add(i);

                if(i != n / i){
                    divisors.add(n / i);
                }
            }
        }
        Arrays.sort(divisors);
        return divisors;
    }
    public static void main(String args[]) {
        int n = 20;
        System.out.println(f(n));
    }
}

//Basic Patterns
/*
class Main{
    public static void main(String args[]){
        int n = 4;
        for(int i = 0; i <= n; i++){
            for(int s = 1; s <= i; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*