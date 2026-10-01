//Exception

import java.util.Arrays;

class Exceptions {
    public static void main(String[] args) {
        int[] numbersArr = {2 , 3 , 5 , 1 ,4};
        Arrays.sort(numbersArr);
        
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        
        System.out.println(numbersArr.length);
        System.out.println(Arrays.toString(numbersArr));
        System.out.println(Arrays.toString(numbers));
    }
}