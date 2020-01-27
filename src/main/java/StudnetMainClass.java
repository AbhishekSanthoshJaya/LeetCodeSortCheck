public class StudnetMainClass {
    public static void main(String[] args) {
    StudnetMainClass s1 = new StudnetMainClass();
    int[] str = new int[]{3,4,2,3};
    System.out.println(s1.nonDec(str));

    }

    public boolean nonDec(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] < nums[j]) {
                    return true;
                }
                else if (nums[i] >= nums[j]) {
                    count++;
                }
            }
        }
        if (count >= 2) {
            return false;
        }
        else return true;
    }
}