/// /////////l1

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




//////////////l2




    public  void  update (int [] a , int index , int nvalue){
        if (index<0 || index>=a.length)
            System.out.println("Index Doesn't exist");
        else
            a[index]=nvalue;
    }

    public  void  delete (int [] a , int index ){
        if (index<0 || index>=a.length)
            System.out.println("Index Doesn't exist");
        else
            a[index]=0;
    }

 /////////L3 ShiftLeft_Delete
    public void  ShiftLeft_Delete(int []a , int intex){
        for (int i=intex ; i<a.length-1 ; i++){
            a[i]=a[i+1];

            a[a.length-1]=Integer.MIN_VALUE;
        }
    }

////////// L3(hw ShiftRight_Insert )
public void ShiftRight_Insert(int[] a, int index, int value) {
    for (int i = a.length - 1; i > index; i--) {
        a[i] = a[i - 1];
    }
    a[index] = value;
}


/////////////l4 LinearSearch
  public int LinearSearch(int[]a , int svalue){
        for (int i=0; i<a.length ; i++){
            if(svalue==a[i])
                return -1;

        }
        return -1;
    }

///////////l5



}



