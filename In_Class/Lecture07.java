package In_Class;

import java.util.ArrayList;

public class Lecture07{
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<Integer>();

        for (int index = 7; index <= 10; index++){
            myList.add(index);

        }

        int sum = 0;
        for (int num: myList){
            sum += num;
        }
        System.out.println(myList); // [7,8,9,10]
        System.out.println(sum); // 34
    }
}