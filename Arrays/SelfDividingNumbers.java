import java.util.*;
class SelfDivingNumbers{
    public static void main(String[] args) {
        int left = 1;
        int right = 22;

        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int value = i;
            char ch[] = String.valueOf(value).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (value % (int)(ch[j]) == 0) {
                    list.add(value);
                }
            }
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}