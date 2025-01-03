/*
Write a Java program that performs the following tasks:

    Create an array of strings to store names.
    Populate the array with 4 names of your choice.
    Print the names from the array in reverse order.
    Find and print the longest name in the array.
    */
   package demo;

   public class ArrayString{

    public void createAndPrintString(){
        String[] names = new String[4];
        names[0] = "Aaaa";
        names[1] = "Bbbbb";
        names[2] = "Cccc";
        names[3] = "Dddd";

        System.out.println("names in reverse order: ");
        

        for( int i = names.length-1;i>=0;i--){
            System.out.println(names[i]);
        }

        String longestName = names[0];
        for(int i =1 ; i <= names.length;i++){
            if(names[i].length()>longestName.length()){
                longestName = names[i];
            }
            System.out.println(longestName);
        }

    }
   }