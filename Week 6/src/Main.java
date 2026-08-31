// Week 6
// 31-01-2026

// LC- 171. Excel Sheet Column Number
class Main{
    public static int f(String columnTitle){
        int result = 0;
        for(char c : columnTitle.toCharArray()){
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
    public static void main(String args[]){
        String columnTitle = "AB";
        System.out.println(f(columnTitle));
    }
}