//12-08-2026
//3-Sum
import java.util.*;
/*
class Main{
    public static List<List<Integer>> ThreeSum(int nums[]){
        if(nums == null || nums.length < 3 ){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0; i < nums.length-2; i++){
            int left = i + 1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i] , nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static void main(String args[]){
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(ThreeSum(nums));
    }
}
*/

//Triplet Sum in Array
// TC - o(n^3)
/*
class Main{
    public static boolean TripletSum(int arr[], int target){
        int n = arr.length;

        for(int i = 0; i < n-2; i++){
            for(int j = i + 1; j < n-1; j++){
                for(int k = j + 1; j < n; k++){
                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(TripletSum(arr, target));
    }
}
*/

//optimal solution using Hash Set - O(n^2) Time and O(n) Space
/*
class Main{
    public static boolean TripletSum(int arr[], int target){
        int n = arr.length;

        for(int i = 0; i < n-2; i++){
            Set<Integer> st = new HashSet<>();

            for(int j = i + 1; j < n; j++){
                int second = target - arr[i] - arr[j];

                if(st.contains(second)){
                    return true;
                }
                st.add(arr[j]);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(TripletSum(arr, target));
    }
}
*/

//Root to Left OverAll Sum is equal to target sum
/*
public class Main {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean hasPathOverallSum(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return target == root.data;
        }

        int remaining = target - root.data;

        return hasPathOverallSum(root.left, remaining)
                || hasPathOverallSum(root.right, remaining);
    }

    public static void main(String[] args) {

        int target = 26;

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(16);
        root.left.left.left = new Node(7);

        root.right.right = new Node(4);
        root.right.left = new Node(9);
        root.right.right.left = new Node(6);

        System.out.println(hasPathOverallSum(root, target));
    }
}
*/

// Maximum Path sum
/*
class Main{
    static int findMaxsumRes(Node root, int[] res){
        //Base Case
        if(root == null){
            return 0;
        }

        int l = Math.max(0, findMaxsumRes(root.left, res));
        int r = Math.max(0, findMaxsumRes(root.right, res));
        res[0] = Math.max(res[0], l + r + root.data);

        return root.data + Math.max(l ,r);
    }

    static int findMaxSum(Node root){
        int[] res = {root.data};

        findMaxsumRes(root, res);

        return res[0];
    }

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String args[]){

        Node root = new Node(10);
        root.left = new Node(2);
        root.left.left = new Node(20);
        root.left.right = new Node(1);

        root.right = new Node(10);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        System.out.println(findMaxSum(root));
    }
}
*/

//Count Complete Tree Node LC- 222
/*
class Main{
    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftDepth = leftDepth(root);
        int rightDepth = rightDepth(root);

        if(leftDepth == rightDepth){
            return (int) Math.pow(2, leftDepth) - 1;
        }else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    private static int leftDepth(Node root){
        int dep = 0;
        while(root != null){
            root = root.left;
            dep++;
        }
        return dep;
    }

    private static int rightDepth(Node root){
        int dep = 0;
        while(root != null){
            root = root.right;
            dep++;
        }
        return dep;
    }

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root. left.left = new Node(3);
        root.left.right = new Node(4);
        root.right = new Node(5);
        root.right.left = new Node(6);

        int result = countNodes(root);
        System.out.println(result);

    }
}
*/

//Maximum Average subarray 1
//Sliding window ka concept hai
/*
class Main{
    public static double maxAvgSub(int arr[], int k){
        int windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        for(int i = k; i < arr.length; i++){
            windowSum += arr[i];
            windowSum -= arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return (double) maxSum / k;
    }
    public static void main(String args[]){
        int arr[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(maxAvgSub(arr, k));
    }
}
*/

//3090. Maximum Length Substring With Two Occurrences
/*
class Main{
    public static int lenSubsWithTwoOccu(String str){
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < str.length(); right++){
            char ch = str.charAt(right);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            while(freq.get(ch) > 2){
                char leftChar = str.charAt(left);

                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String args[]){
        String str = "bcbbbcba";
        System.out.println(lenSubsWithTwoOccu(str));
    }
}
*/

//LC  - 2341. Maximum Number of Pairs in Array
/*
class Main{
    public static int[] maxNoPair(int arr[]){
        int n = arr.length;
        int Pcount = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] != -1 && arr[i] == arr[j]){
                        Pcount++;
                        arr[i] = -1;
                        arr[j] = -1;
                        break;
                }
            }
        }
        int RemArr = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != -1){
                RemArr++;
            }
        }
        int ans[] = {Pcount, RemArr};
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1,3,2,1,3,2,2};
        int output[] = maxNoPair(arr);
        System.out.println("pairs" + " " + output[0]);
        System.out.println("Remainig" + " " + output[1]);
    }
}
*/

//713. Subarray Product Less Than K
/*
class Main{
    public static int numSubarrayProductLessThanK(int[] nums, int target) {
        if (target <= 1) {
            return 0;
        }

        int product = 1;
        int start = 0;
        int count = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (product >= target) {
                product /= nums[start];
                start++;
            }

            count += end - start + 1;
        }

        return count;
    }
    public static void main(String args[]){
        int[] nums = {10,5,2,6};
        int target = 100;
        System.out.println(numSubarrayProductLessThanK(nums, target));
    }
}
*/

//Print Alternate of an Array
/*
class Main{
    public static ArrayList<Integer> printAlter(ArrayList<Integer> arr){
        int n = arr.size();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < n; i = i + 2){
            result.add(arr.get(i));
        }
        return result;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(3);
        arr.add(1);
        arr.add(6);

        System.out.print(printAlter(arr));
    }
}
*/

// sum of element in Binary tree
/*
class Main{
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    public static int BinaryTreeSum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = BinaryTreeSum(root.left);
        int rightSum = BinaryTreeSum(root.right);

        return root.data + leftSum + rightSum;
    }
    public static void main(String args[]){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(16);
        root.left.left.left = new Node(7);

        root.right.right = new Node(4);
        root.right.left = new Node(9);
        root.right.right.left = new Node(6);

        System.out.println(BinaryTreeSum(root));
    }
}
*/
