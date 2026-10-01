//Week 9
//27-09-2026

//Binary Search
/*
class Main {
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Avoids integer overflow compared to (left + right) / 2
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is greater, ignore the left half
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Key was not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 14, 19, 20, 25};
        int key = 20;

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not present in array");
        }
    }
}
*/


//Example of copy constructor
/*
class Main{
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //copy constructor
        Person(Person other) {
            this.name = other.name;
            this.age = other.age;
        }
    }
    public static void main(String args[]){
        Person first = new Person("Riya", 20);
        Person second = new Person(first);
        System.out.println(second.name + "," + second.age);
    }
}
*/

//Inheritance
//Single level Inheritance
/*
class Main{
    static class Animal{
        void eat(){
            System.out.println("Animal is Eating");
        }
    }
    static class Dog extends Animal{
        void bark(){
            System.out.println("Dog is Barking");
        }
    }
    public static void main(String args[]){
        Animal Horse = new Animal();
        Horse.eat();
        Dog D1 = new Dog();
        D1.eat();
        D1.bark();
    }
}
*/

//Multilevel Inheritance
/*
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Main {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // inherited from Animal
        puppy.bark();  // inherited from Dog
        puppy.weep();
    }
}
*/

//Hierarchical inheritance
/*
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}
*/

//Hybrid inheritance
//Java supports hybrid inheritance using a combination of a class and interfaces.
// A class can extend one class and implement multiple interfaces.

/*
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {
    void play();
}

interface Guard {
    void protect();
}

class Dog extends Animal implements Pet, Guard {
    public void play() {
        System.out.println("Dog is playing");
    }

    public void protect() {
        System.out.println("Dog is protecting the house");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();      // inherited from Animal
        dog.play();     // implemented from Pet
        dog.protect();  // implemented from Guard
    }
}
*/
//Heaters LC 475
/*
import java.util.Arrays;
class Main{
    public static int f(int[] houses, int[] heaters){
        Arrays.sort(heaters);
        int ans = 0;
        for(int h : houses){
            int left = 0;
            int right = heaters.length-1;
            while(left <= right){
                int mid = left + (right-left)/2;
                if(heaters[mid] < h){
                    left = mid + 1;
                }else {
                    right = mid-1;
                }
                int leftDistance = Integer.MAX_VALUE;
                int rightDistance = Integer.MAX_VALUE;

                if(left < heaters.length){
                    rightDistance = heaters[left] - h;
                }
                if(left > 0){
                    leftDistance = h - heaters[left -1];
                }

                int nearestDistance = Math.min(leftDistance, rightDistance);
                ans = Math.max(ans, nearestDistance);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int[] houses = {1, 2, 3, 4};
        int[] heaters = {1, 4};
        System.out.println(f(houses, heaters));
    }
}
*/

//LC - 1832
class Main{
    public static boolean f(String sentence){
        boolean[] seen = new boolean[26];
        for(char c : sentence.toCharArray()){
            seen[c - 'a'] = true;
        }
        for(boolean b : seen){
            if(!b) return false;
        }
        return true;
    }
    public static void main(String args[]){
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(f(sentence));
    }
}