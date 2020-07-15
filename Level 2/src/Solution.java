public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,3,3,3,3,0,3,3,3}));
    }

    public static int solution(int[] l)  {
        sort(l);
        int sum = 0;
        int num = 0;

        for (int a : l) {
            num = (num * 10) + a;
            sum += a;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Num: " + num);

        //Covert to string format
        String numStr = String.valueOf(num);

        int mod = sum % 3;

        if (mod== 0) {
            return num;
        }
        else {
            for (int i = numStr.length() - 1; i >= 0; i--) {
                if (mod == l[i] % 3 && l.length > 1) {
                    int seq = Integer.valueOf(removeCharAt(numStr,i));
                    return seq;
                }
            }
        }
        return 0;
    }

    /**
     * Remove char at specific index
     * @param s
     * @param pos
     * @return
     */
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    /**
     * Bubble sort array from largest to smallest
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp;
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

}
