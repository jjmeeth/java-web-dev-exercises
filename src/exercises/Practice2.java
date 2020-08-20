package exercises;

import java.util.ArrayList;

public class Practice2 {

    public static ArrayList<Integer> sumArrayList(ArrayList<Integer> first, ArrayList<Integer> second) {

        //declare variables
        //make an array list to hold the result
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> longer = new ArrayList<>();
        ArrayList<Integer> shorter = new ArrayList<>();

        //check the lengths of the arrayLists, figure out which one is longer
        if(first.size() > second.size()) {
            longer = first;
            shorter = second;
        } else {
            longer = second;
            shorter = first;
        }
            //for each element in the longer arrayList
            for(int i = 0; i < longer.size(); i++) {

                //if I haven't run out of ints from shorter list
                if(i < shorter.size()) {
                    //add the two ints together
                    Integer sum = longer.get(i) + shorter.get(i);
                    result.add(sum);
                } else {
                    //keep the value from the longer list
                    result.add(longer.get(i));
                }

            }





        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();

        one.add(3);
        one.add(4);
        one.add(5);
        one.add(1);
        two.add(1);
        two.add(6);

        System.out.println(sumArrayList(one, two));

    }

}
