/// ////l1
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrayss arr= new Arrayss();
        int[] numbers={1,2,3,4,5};
        arr.input(numbers);
        arr.Traversal(numbers);

////////l2
        numbers[3]=8;
        arr.update(numbers,3,8);
        arr.delete(numbers,7);

//////L3
        arr.ShiftLeft_Delete(numbers,0);

/////////////l4
        int result= arr.LinearSearch(numbers, 6);
        if(result!=1)
        System.out.println("the value is : "+ result);
        else
            System.out.println("The value not found");


    }

}