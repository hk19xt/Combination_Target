package Combination_Sum;

import java.util.Arrays;

public class Combination {

    public int[] new_array;

    public int combination_sum(int[] userArray, int target){

        this.new_array = new int[target + 1];
        Arrays.fill(new_array,-1);

        new_array[0]=1;
        return recursion_sum(userArray, target);
    }


    public int recursion_sum(int[] userArray, int target){

        int number_count = 0;

        if(target < 0){
            System.out.println("The target should be positive value.");

        }
        if(new_array[target]!=-1){
            return new_array[target];
        }
        //When the target is zero, then the output should be one because all element in the array cannot be chosen.
        if(target == 0){
            return 1;
        }
        for(int i=0; i<userArray.length; i++){
            if(target>=userArray[i]){
                number_count = number_count + recursion_sum(userArray,target - userArray[i]);
            }
        }
        new_array[target] = number_count;
        return number_count;
    }
}
