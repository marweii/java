package paixu;

public class jiandanxuanzepaixu {

    public static void paixu(int[] a){
        int temp = 0;
        for(int j=0;j<a.length-1;j++) {
            int max = a[j];
            for (int i = j+1; i < a.length; i++) {
                if (max < a[i]) {
                    max = a[i];
                    temp = i;
                }
            }
            a[temp] = a[j];
            a[j] = max;
        }
    }
}
