//Week 8
//21-09-2026

import java.util.*;

//BaseBall Game
/*
class Main {
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                int one = st.peek();
                st.push(one * 2);
            } else if (op.equals("+")) {
                int last = st.peek();
                int Seclast = st.get(st.size() - 2);
                st.push(last + Seclast);
            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int total = 0;
        while (!st.isEmpty()) {
            total = total + st.pop();
        }
        return total;
    }

    public static void main(String args[]) {
        String[] operations = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(operations));
    }
}
*/

//JAVA COLLECTION
import java.util.Collection;

//public class Main {
//    public static void main(String args[]){
//        ArrayList<String> a1 = new ArrayList<>();
//
//        a1.add("Apple");
//        a1.add("Kiwi");
//        a1.add("Banana");
//        a1.add("Apple");
//
//        Collections.sort(a1);
//
//        System.out.println(a1);
//    }
//}

//Using Math
public class Main {
    public static void main(String args[]){
        ArrayList<Integer> A = new ArrayList<>(List.of(4, -1, 1, 9, 5, 7));

        for(int i = 0; i < A.size(); i++){
            A.set(i, -A.get(i));
        }

        System.out.println(A);

        Collections.sort(A);

        for(int i = 0; i < A.size(); i++){
            A.set(i, -A.get(i));
        }

        System.out.println(A);
    }
}

// Using Comparator
/*
public class Main {

    static class myComp implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b){
            return a.compareTo(b);
        }
    }

    public static void main(String args[]){
        ArrayList<Integer> A = new ArrayList<>(List.of(4, -1, 1, 9, 5, 7));


        System.out.println(A);

        Collections.sort(A, new myComp());

        System.out.println(A);
    }
}
*/