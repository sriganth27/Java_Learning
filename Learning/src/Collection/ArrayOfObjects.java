package Collection;

import java.util.Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {

        Students[] st = new Students[3];

        st[0] = new Students("Sri", 23);
        st[1] = new Students("Ram", 24);
        st[2] = new Students("Kumar", 22);

       System.out.println(Arrays.toString(st));
    }
}

class Students {

    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}