package Challenge;

import java.util.ArrayList;

public class SortedArray {
    public static void main(String[] args){
        int[] a = {2,4,6,8};
        int[] b = {1,2,3,4,5};
        int[] c = mergeSortedArray(a,b);
        for(int i =0;i<c.length;i++){
            System.out.println(c[i]);
        }

    }
    public static int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        int ai=0,bi=0;
        for(int i =ai;i<A.length;i++){
            for(int j=bi;j<B.length;j++){
                if(A[i]<B[j]){
                    arrayList.add(A[i]);
                    break;
                }else {
                    arrayList.add(B[j]);
                    bi++;
                }
            }
            if(bi==B.length){
                arrayList.add(A[i]);
            }
        }
        if(bi<B.length){
            for(int j=bi;j<B.length;j++){
                arrayList.add(B[j]);
            }
        }
        int size = arrayList.size();
        int[] c =new int[size];
        for(int x= 0;x<size;x++){
            c[x] =arrayList.get(x);
        }
        return c;
    }

}
