package exercises;

public class Practice {

    public static int sumOfFirstAndLast(int[] array) {
        return array[0] + array[array.length - 1];

    }

    public static void main(String[] args) {
        int[] anArray = {11, 2, 3, 3, 4, 5};

        int[] nextArray = {2, -2, 2434, 90, 100};

        int answer = sumOfFirstAndLast(anArray);

        //System.out.println(sumOfFirstAndLast(nextArray));

       System.out.println(answer);
    }

}
