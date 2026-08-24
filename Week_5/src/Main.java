// Week- 05 24/08/2026
//28. Find the Index of the First Occurrence in a String
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