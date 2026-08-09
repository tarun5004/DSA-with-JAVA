package oops;

public class Student {
    String name;
    int age;
    int rollNo;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    Student(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("[name = " + name + " , age = " + age + " , rollNo= " + rollNo + " ]");
    }
}

class Temp {
    public static void main(String[]agrs) {
        String s12 = "I am a good boy ";

        










        // crte student obj

        // Student s1 = new Student("Golu",21, 555);
        // s1.print();

        // Student s2 = new Student("tolu", 51, 252);
        // s2.print();

        // // string litreal ye string constant pool mai save hoga and string are immutable 
        // String s11 = "Golu";

        // //ye heap mai store hoga becayse of new kwyword 
        // String s22 = new String ("hello");

        // //ye bhi heap mai save hoga 
        // String s23 = new String();
        // s23 = "hello";

        // char ch[] = {'a', 'b', 'c', 'd'};
        // String s4 = new String(ch);


    }
}

