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

