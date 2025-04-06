package ref;

public class GraphPrint {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = (int)(Math.random() * 20)+1;
            for (int j = 0; j < nums[i]; j++) {
                System.out.print("*");
                System.out.println();
            }
            System.out.println(nums[i]);
        }



    }
}
