package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    
    public static int arrayListSummer(ArrayList<Integer> arrayList) {
        int sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(2);
        intArray.add(4);
        intArray.add(3);
        intArray.add(2);

        System.out.println(intArray);

        System.out.println(arrayListSummer(intArray));

        
    }
}
