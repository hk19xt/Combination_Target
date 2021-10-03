package Combination_Sum;

public class Main {
    public static void main(String[] args){
        Combination c = new Combination();
        int[] userArray = new int[]{1,2,3};
        int target = 4;
        int output;
        output = c.combination_sum(userArray,target);
        System.out.println(output);
    }
}
