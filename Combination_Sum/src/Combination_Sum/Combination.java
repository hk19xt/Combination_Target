package Combination_Sum;

import java.util.Arrays;

/*This is the implementation class. The number of combination is calculated by the recursive function.
  First, before conducting the recursion, we need to create a new array which is stored '-1' to all elements in order to check whether it hit the end of the array. 
  Second, after creating and storting it, it recursively calculates the elements to get the target value. 
  If the target value is zero, then there will be 1 possible way. So, the output will be 1. */

public class Combination {

    public int[] new_array; //We should create a new array to check whether it hit the end of array.

    public int combination_sum(int[] userArray, int target){

        this.new_array = new int[target + 1];
        Arrays.fill(new_array,-1); //The array is filled '-1' to all element.

        new_array[0]=1; //The first element is initialized as 1.
        return recursion_sum(userArray, target);
    }//combination_sum

    //This method will check the three conditions.
    public int recursion_sum(int[] userArray, int target){

        int number_count = 0;

        //First, if the target is less than zero, then the message will pop up, and users should be changed their value to the positive one.
        if(target < 0){
            System.out.println("The target should be positive value.");

        }
        //Second, if the array hit the end of it, then it returns the value of the new array.
        if(new_array[target]!=-1){
            return new_array[target];
        }
        //When the target is zero, then the output should be one because all element in the array cannot be chosen.
        if(target == 0){
            return 1;
        }
        //This for loop recursively calculates, and store the number of possible ways into the new array. 
        for(int i=0; i<userArray.length; i++){
            if(target>=userArray[i]){
                number_count = number_count + recursion_sum(userArray,target - userArray[i]);
            }
        }
        new_array[target] = number_count;
        return number_count;
    }//recursion_sum
}
