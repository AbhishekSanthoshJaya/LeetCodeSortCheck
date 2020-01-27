public class StudnetMainClass {
    public static void main(String[] args) {
    StudnetMainClass s1 = new StudnetMainClass();
    int[] str = new int[]{4,3,2,6};
    System.out.println(s1.nonDec(str));

    }

    public boolean nonDec(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] < arr[i+1]) {
                    return true;
                }
                if (arr[i] > arr[i+1]) {
                    count++;
                }
            }
            if (count >= 2) {
                return false;
            }
            else return true;
    }
}