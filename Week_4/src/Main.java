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

