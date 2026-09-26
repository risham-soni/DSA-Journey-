//Week 8
//21-09-2026

import javax.naming.Name;
import java.util.*;
import java.util.Collection;

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

/*
public class Main {
    public static void main(String args[]){
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Apple");
        a1.add("Kiwi");
        a1.add("Banana");
        a1.add("Apple");

        Collections.sort(a1);

        System.out.println(a1);
    }
}
*/

//Using Math
/*
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
*/

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

//Sort ArrayList of ArrayList
/*
public class Main {
    static class myComp implements Comparator<ArrayList<Integer>> {
        @Override
        public int compare(ArrayList<Integer> left , ArrayList<Integer> right) {
            if(left.get(0).compareTo(right.get(0)) == 0) {
                if(right.get(1).compareTo(left.get(1)) == 0)
                    return left.get(2).compareTo(right.get(2));

                return right.get(1).compareTo(left.get(1));
            }

            return left.get(0).compareTo(right.get(0));
        }
    }

    public static void main(String args[]){
        ArrayList<ArrayList <Integer>> A = new ArrayList<>();

        A.add(new ArrayList<>(List.of(4 , 6 , 1)));
        A.add(new ArrayList<>(List.of(1 , 7 , 8)));
        A.add(new ArrayList<>(List.of(4 , 6 , 9)));
        A.add(new ArrayList<>(List.of(1  , 13 , 8)));
        A.add(new ArrayList<>(List.of(4 , 1 , 19)));
        A.add(new ArrayList<>(List.of(1 , 7 , 1)));

        Collections.sort(A , new myComp());

        for(int i = 0; i < A.size(); ++i)
            System.out.println(A.get(i));
    }
}
*/

//OOPS
/*
class Main{
    static class Bags{
        String Material;
        int Rate;
        int Quantity;

        void material(String newMaterial){
            Material = newMaterial;
        }
        void rateOfP(int newRate){
            Rate = newRate;
        }

        void quantityOfP(int newQuantity){
            Quantity = newQuantity;
        }
    }
    public static void main(String args[]){
        Bags Adidas = new Bags();
        Adidas.material("Leather");
        Adidas.rateOfP(700);
        Adidas.quantityOfP(2000);

        Bags SkyBag = new Bags();
        SkyBag.material("Denum");
        SkyBag.rateOfP(1400);
        SkyBag.quantityOfP(400);

        System.out.println(Adidas.Material);
        System.out.println(Adidas.Quantity);
        System.out.println(Adidas.Rate);
    }
}
*/

/*
class Main{
    static class Electronic{
        String ProductName;
        int LaunchDate;
        int Price;
        String ColorOption;

        void setProductName(String newName){
            ProductName = newName;
        }

        void setLaunchDate(int newDate){
            LaunchDate = newDate;
        }

        void setPrice(int newPrice){
            Price = newPrice;
        }

        void setColorOption(String newColor){
            ColorOption = newColor;
        }
    }
    public static void main(String args[]){
        Electronic HP = new Electronic();
        HP.setProductName("HP Laptop FS-201545");
        HP.setPrice(40000);
        HP.setLaunchDate(26_08_2024);
        HP.setColorOption("Black");

        System.out.println(HP.ProductName);
        System.out.println(HP.LaunchDate);
        System.out.println(HP.Price);
        System.out.println(HP.ColorOption);

        Electronic Dell = new Electronic();
        Dell.setProductName("Dell Laptop DS-20146463");
        Dell.setLaunchDate(26_04_2021);
        Dell.setPrice(7000);
        Dell.setColorOption("Silver");

        System.out.println(Dell.ProductName);
        System.out.println(Dell.LaunchDate);
        System.out.println(Dell.Price);
        System.out.println(Dell.ColorOption);
    }
}
*/

/*
class Main{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Risham";
        s1.age = 18;
        s1.calPercentage(85, 90, 88);

        System.out.println(s1.name);
        System.out.println(age);
        System.out.println(percentage);
    }
    static class Student{
        String name;
        int age;
        float percentage;

        void calPercentage(int phy, int chem, int math){
            percentage = (phy + chem + math) / 3.0f;
        }

    }
}
*/

//Access Modifiers
/*
class Main{
    public static void main(String args[]){
        BankAccount SBI = new BankAccount();
        SBI.username = "rishamsoni02";
        //SBI.password = "risham@7322";

        SBI.setPassword("risham@7322");
    }

     static class BankAccount{
        public String username;
        private String password;

        public void setPassword(String pwd){
            password = pwd;
        }
    }
}
*/

//Getters and Setters
/*
class Main{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }

    static class Pen{
        private String color;
        private int tip;

        String getColor(){
            return this.color;
        }

        int getTip(){
            return this.tip;
        }

        void setColor(String newColor){
            this.color = newColor;
        }
        void setTip(int tip){
            this.tip = tip;
        }
    }
}
*/

//Constructors
/*
class Main{
    static class Laptops{
        String BrandName;
        int ModelNo;
        int LaunchDate;

        //constructor
        Laptops(String BrandName, int ModelNo, int LaunchDate){
            this.BrandName = BrandName;
            this.ModelNo = ModelNo;
            this.LaunchDate = LaunchDate;
        }
    }

    public static void main(String args[]){
        Laptops Hp = new Laptops("Hp_Victus", 45856, 2026);

        System.out.println(Hp.BrandName);
        System.out.println(Hp.ModelNo);
        System.out.println(Hp.LaunchDate);
    }
}
*/

/*
class Main{
    static class Students{
        String Name;
        int RollNo;
        String Section;
        int ClassRoom;

        //Constructor
        Students(String Name, int RollNo, String Section, int ClassRoom){
            this.Name = Name;
            this.RollNo = RollNo;
            this.Section = Section;
            this.ClassRoom = ClassRoom;
        }
    }
    public static void main(String args[]){
        Students S1 = new Students("Ankit", 14, "4A", 11);
        Students S2 = new Students("Rahul", 17, "1A", 26);

        System.out.println(S1.Name);
        System.out.println(S2.Name);
    }
}
*/

//1. Non-Parameterized Constructor
/*
class Student {
    String name;
    int age;

    // Non-parameterized constructor
    Student() {
        name = "Risham";
        age = 21;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
*/

//Parameterized Constructor
/*
class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Student s = new Student("Risham", 21);
        s.display();
    }
}
*/

//Copy Constructor
/*
class Main {
    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //copy constructor
        Student(Student s) {
            this.name = s.name;
            this.age = s.age;
        }


        public static void main(String args[]) {
            Student s1 = new Student("Alice", 21); // original
            Student s2 = new Student(s1); // copy

            System.out.println(s1.name + s1.age);
            System.out.println(s2.name + s2.age);
        }
    }
}
*/

/*
//LC 347 Top K Most Frequent Element
class Main{
     public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> fmap = new HashMap<>();
        List<Integer> []bucket = new List[nums.length + 1];

        for(int n : nums){
            fmap.put(n, fmap.getOrDefault(n, 0) + 1);
        }

        for(int key : fmap.keySet()){
            int f = fmap.get(key);
            if(bucket[f] == null){
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(key);
        }
        int[] res = new int[k];
        int counter = 0;

        for(int pos = bucket.length-1; pos >= 0 && counter < k; pos--){
            if(bucket[pos] != null){
                for(Integer integer : bucket[pos]){
                    res[counter++] = integer;
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.println(Arrays.toString(result));
    }
}
*/



