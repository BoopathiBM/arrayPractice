/*
Write a Java program that performs the following tasks:

    Create an array of integers with 5 elements.
    Populate the array with values (e.g., 10, 20, 30, 40, 50).
    Print the elements of the array.
    Find the sum of all elements in the array and print the result.
    */

   package demo;

   public class ArrayTask{
    public void arrayCreation(){
        int[] firstArray = new int[5];
        firstArray[0] = 10;
        firstArray[1] = 20;
        firstArray[2] = 30;
        firstArray[3] = 40;
        firstArray[4] = 50;
        
        System.out.println("Length of the array: "+ firstArray.length);

        for(int i=0; i <firstArray.length; i++){
            System.out.println("Element of the array: "+ firstArray[i]);

        }

    }

   }