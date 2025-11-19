package Arrays;

import java.util.Scanner;

public class Arrayss {
    public void  input(int []a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter"+ a.length+"elements");

        for (int i =0; i<a.length; i++){
            a[i]=scanner.nextInt();
        }
    }


    public void Traversal(int[]a){
        System.out.println("**** the element are:");
              for (int i =0; i<a.length; i++){
                  System.out.println("Index["+i+"]="+a[i]);
              }

        }



}
