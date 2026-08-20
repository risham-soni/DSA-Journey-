import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Week_4 - 17/08/2026
//Reverse a String
//using Stack
/*
class Main{
    public static String revString(String str){
        Stack<Character> st = new Stack<>();
        char idx = 0;
        while(idx < str.length()){
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder s = new StringBuilder();
        while(!st.isEmpty()){
            char curr = st.pop();
            s.append(curr);
        }
        return s.toString();
    }
    public static void main(String args[]){
        String str = "Risham";
        System.out.println("Reverse string is = " + revString(str));
    }
}
*/

//using Backward Traversal
/*
class Main{
    public static String revString(String str){
        StringBuilder result = new StringBuilder();
        int n = str.length();
        for(int i = n-1; i >= 0; i--){
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static void main(String args[]){
        String str = "Risham";
        System.out.println(revString(str));
    }
}
*/

//Using Two pointer
/*
class Main{
    public static String revString(String str){
        int l = 0;
        int r = str.length()-1;
        StringBuilder res = new StringBuilder(str);
        while(l < r){
            char temp = str.charAt(l);
            res.setCharAt(l, res.charAt(r));
            res.setCharAt(r, temp);
            l++;
            r--;
        }
        return res.toString();
    }
    public static void main(String args[]){
        String str = "Risham";
        System.out.println(revString(str));
    }
}
*/

//using char Array
/*
class Main{
    public static String revString(String str){
//        int l = 0;
//        int r = str.length()-1;
        char arr[] = str.toCharArray();
//        while(l < r){
//            char temp = arr[l];
//            arr[l] = arr[r];
//            arr[r] = temp;
//            l++;
//            r--;
//        }
//        return new String(arr);
        for(int l = 0; l < str.length(); l++){
            for(int r = str.length()-1; r >= 0; r--){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        return new String(arr);
    }
    public static void main(String args[]){
        String str = "risham";
        System.out.println(revString(str));
    }
}
*/
//check if a string is palindrome or  not
/*
class Main{
    public static boolean checkPalin(String str){
        int l = 0;
        int r = str.length()-1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }else{
                l += 1;
                r -= 1;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "level";
        System.out.println(checkPalin(str));
    }
}
*/

//using single variable
/*
class Main{
    public static boolean checkPalin(String str){
        int n = str.length();
        for(int i = 0; i < n / 2; i++){
            if(str.charAt(i) == str.charAt(n-i-1)){
                return true;
            }else{
                return false;
            }
        }
        return checkPalin(str);
    }
    public static void main(String args[]){
        String str = "level";
        System.out.println(checkPalin(str));
    }
}
*/

// check if a number is a palindrome
/*
class Main{
    public static boolean checkPalin(int n){
        if(n < 0){
            return false;
        }
        int original = n;
        int reverse = 0;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return original == reverse;
    }
    public static void main(String args[]){
        int n = 1551;
        System.out.println(checkPalin(n));
    }
}
*/

//using number as string
/*
class Main{
    public static boolean checkPalin(int n){
        String str = Integer.toString(n);
        int len = str.length();
        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n = 1551;
        System.out.println(checkPalin(n));
    }
}
*/


//reverse a integer
/*
class Main{
    public static int revString(int n){
        int rev = 0;
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String args[]){
        int n = 674231;
        System.out.println(revString(n));
    }
}
*/

//check if a number is prime or not
/*
class Main{
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n = 17;
        System.out.println(isPrime(n));
    }
}
*/

//print prime number in a range
/*
class Main{
    public static boolean printprimerange(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i * i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int start = 10;
        int end = 20;

        for(int i = start; i < end; i++){
            if(printprimerange(i)){
                System.out.print(i + " ");
            }
        }
    }
}
*/

//find factorial of a number
/*
class Main{
    public static int factNo(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println("Factorial = " + factNo(n));
    }
}
*/

//Generate the Nth Fibonacci Series
//using recursion
/*
class Main{
    public static int fibNo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f = fibNo(n-1);
        int s = fibNo(n-2);
        return f + s;
    }
    public static void main(String args[]){
        int n = 8;
        System.out.println(fibNo(n));
    }
}
*/

// using for loop
/*
class Main{
    public static int fibNo(int n){
        int f = 0;
        int s = 1;
        for(int i = 0; i < n; i++){
            int next = f + s;
            f = s;
            s = next;
        }
        return f;
    }
    public static void main(String args[]){
        int n = 3;
        System.out.println(fibNo(n));
    }
}
*/

//find ArmStrong Number
/*
class Main{
    public static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int digits = 0;
        int temp = n;
        //count the digits
        while(temp > 0){
            digits++;
            temp = temp / 10;
        }

        temp = n;
        while(temp > 0){
            int digit = temp % 10;
            int power = 1;

            for(int i = 0; i < digits; i++){
                power = power * digit;
            }
            sum = sum + power;
            temp = temp / 10;
        }
        if(sum == original){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int n = 9474;
        System.out.println(isArmstrong(n));
    }
}
*/

//Check if a number is Perfect
/*
class Main{
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int n = 6;
        //System.out.println(isPerfect(n) ? "true" : "false");
        System.out.println(isPerfect(n));
    }
}
*/

//Leetcode Question - 3005. Count Elements With Maximum Frequency
/*
class Main{
    public static int f(int[] arr){
        Map<Integer, Integer> Fmap = new HashMap<>();

        for(int a : arr){
            int CountFreq = Fmap.getOrDefault(a, 0) + 1;
            Fmap.put(a, CountFreq);
        }

        int MaxFreq = 0;
        int total = 0;

        for(int freq : Fmap.values()){
            MaxFreq = Math.max(MaxFreq, freq);
        }

        for(int freq : Fmap.values()){
            if(freq == MaxFreq){
                total += freq;
            }
        }
        return total;
    }
    public static void main(String args[]){
        int[] arr = {1,2,2,3,1,4};
        System.out.println(f(arr));
    }
}
*/

//Find GCD or HCF of two numbers
/*
class Main{
    public static int findHCF(int f, int s){
        while(s != 0){
            int rem = f % s;
            f = s;
            s = rem;
        }
        return f;
    }
    public static void main(String args[]){
        int f = 48;
        int s = 18;
        System.out.println(findHCF(f, s));
    }
}
*/

//Count Digits in a number
/*
class Main{
    public static int countDigit(int n){
        int count = 0;
        if(n == 0){
            return 1;
        }
        while(n > 0 || n < 0){
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main(String args[]){
        int n = -426;
        System.out.println(countDigit(n));
    }
}
*/


//Sum of Digits of a Number
/*
class Main{
    public static int f(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        int n = 12345;
        System.out.println(f(n));
    }
}
*/

//Count vowels and Consonants
/*
class Main{
    public static int[] f(String str){
        int n = str.length();
        int vowels = 0;
        int Consonents = 0;

        for(int i = 0; i < n; i++){

            char ch = str.charAt(i);

            if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
                ch = Character.toLowerCase(ch);
            }

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;

            }else if(ch != ' '){
                Consonents++;
            }
        }
        return new int[]{vowels, Consonents};
    }
    public static void main(String args[]){
        String str = "geeks for geeks";
        int[] result = f("geeks for geeks");

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}
*/

