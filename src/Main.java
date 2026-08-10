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
/*
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
*/


// LC - 3014. Minimum Number of Pushes to Type Word I
/*
import java.util.HashMap;

class Main{
    public static int minimumPushes(String word) {
        if(word.length() <= 8){
            return word.length();
        }
        int count = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int assign = 2;
        for(char ch : word.toCharArray()){
            if(assign > 9){
                assign = 2;
            }
            mp.put(assign, mp.getOrDefault(assign,0) + 1);
            count += mp.get(assign);
            assign++;
        }
        return count;
    }
    public static void main(String args[]){
        String word = "xycdefghij";

        System.out.println(minimumPushes(word));

    }
}
*/



//Removing Stars From a String
/*
import java.util.Stack;

class Main {
    public static String removes(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String args[]) {
        String s = "le*tco*e";
        System.out.println(removes(s));
    }
}
*/

//Dijkstra Algorithm
//TC - o(v + E)

/*
import java.util.*;
class Main{
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

//        for(int i = 0; i < E.length; ++i) {
//            int a = E[i][0] , b = E[i][1] , c = E[i][2];
//            graph[a].add(new Edge(a , b , c));
//            graph[b].add(new Edge(b , a , c));
//        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path; //path based sorting for pairs
        }
    }



    public static void dijkstra(ArrayList<Edge> graph[], int src){
        int dist[] = new int[graph.length]; //dist = src to i
        for(int i = 0; i < graph.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;  // src ko chhor ke subko + infinty bana diya
            }
        }

        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        //loop for BFS

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                // loop for neighbours
                for(int i = 0; i < graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]){  //update distance of src to v
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        //print all source to vertices shortest dist
        for(int i = 0; i < dist.length; i++){
            System.out.print(dist[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]){
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        int src = 0;

        dijkstra(graph, src);
    }
}
*/


// DP -> Climbing Stairs TC- o(n)
/*
import java.util.Arrays;
class Main{
    public static int SolveMemo(int n, int ways[]){
        //base case
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = SolveMemo(n-1, ways) + SolveMemo(n-2, ways);

        return ways[n];
    }

    public static int solveTab(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;

        //tabulation loop
        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i-1] + 0;
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String args[]){
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(SolveMemo(n, ways));
        System.out.println(solveTab(n));
    }
}
*/

//Rotten Orange
/*
import java.util.LinkedList;
import java.util.Queue;

class Main {

    public static int Solve(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int minutes = 0;

        int[][] direction = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();

                int x = current[0];
                int y = current[1];

                for (int[] dir : direction) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx >= 0 && nx < row &&
                            ny >= 0 && ny < col &&
                            grid[nx][ny] == 1) {

                        grid[nx][ny] = 2;
                        fresh--;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println(Solve(grid));
    }
}
*/


//2Sum

/*
import java.util.HashSet;

class Main{
    public static boolean twoSum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            int solve = target - num;
            if(set.contains(solve)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {0, -1, 2, -3, 1};
        int target = -2;
        System.out.println(twoSum(arr, target));
    }
}
*/

// Two Sum in Sorted Array

/*
import java.util.ArrayList;

class Main{
    public static ArrayList<Integer> twoSum(int[] arr, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(arr, target));
    }
}
*/


//fractional Knapsack
/*
import java.util.*;

class Main {
    public static void main(String args[]) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // Sort in ascending order according to ratio
        Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));

        int capacity = w;
        double finalVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value: " + finalVal);
    }
}
*/


//01 knapsack using memoization
/*
class Main{
    public static int knapsack(int val[], int[] wt, int w, int n, int dp[][]){
        if(w == 0 || n == 0){
            return 0;
        }

        if(dp[n][w] != -1){
            return dp[n][w];
        }

        if(wt[n-1] <= w){ //valid
            //include
            int ans1 = val[n-1]+knapsack(val, wt, w-wt[n-1], n-1, dp);

            //exclude
            int ans2 = knapsack(val, wt, w, n-1, dp);
            dp [n][w] = Math.max(ans1, ans2);
            return dp[n][w];
        }else {
            dp[n][w] = knapsack(val, wt, w, n-1, dp);
            return dp[n][w];
        }
    }
    public static void main(String args[]){
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int w = 7;
        int dp[][] = new int[val.length+1][w+1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsack(val, wt, w, val.length, dp));
    }
}
*/

//Coin change problem
/*
public class Main{
    public static int coinsPossibleCombinations(int[] coins, int amount){
        int dp[] = new int[amount + 1];
        //Base Case

        dp[0] = 1;

        for(int coin : coins){
            for(int i = coin; i <= amount; i++){
                dp[i] = dp[i] + dp[i - coin];
            }
        }
        return dp[amount];
    }
    public static void main(String args[]){
        int coins[] = {1, 2, 5};
        int amount = 5;
        System.out.println(coinsPossibleCombinations(coins, amount));
    }
}
*/

//count the no if integer
/*
class Main{
    public static void main(String args[]){
        int n = 716501;
        int count = 0;
        while(n != 0) {
            int digit = n % 10;
            n = n / 10;
            count++;
        }
        System.out.print(count);
    }
}
*/

