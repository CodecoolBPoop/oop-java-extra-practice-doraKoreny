package exercises.java;

public class Exercise3 {
    public static void main(String[]args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for(int element:numbers) {
            sum += element;
        }
        System.out.println(sum);
    }
}
