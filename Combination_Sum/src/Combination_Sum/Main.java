package Combination_Sum;

/*This is the main class. 
The possible number of combination sum for the input array element will be calculated by the implementation class.
The users can change the input array element as well as the target value in the hardcoded line.
Name: Hyejin Kim
Date: 10/4/2021 */

public class Main {
    public static void main(String[] args){
        Combination c = new Combination();
        int[] userArray = new int[]{2,2,5}; //The users can change the input array here.
        int target = 7; //The users also can change the targer value here.
        int output;
        output = c.combination_sum(userArray,target);
        System.out.println("The possible number of combination for the input array is:" + output);
    }
}//Main
