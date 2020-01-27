public class StudnetMainClass {
    public static void main(String[] args) {
    StudnetMainClass s1 = new StudnetMainClass();
    int[] str = new int[]{4,6,3,1};
    System.out.println(s1.nonDec(str));

    }

    public boolean nonDec(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j< arr.length-1; j++) {
                if (arr[i] < arr[j]) {
                    return true;
                }
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
            if (count > 2) {
                return false;
            }
            else return true;
    }
}