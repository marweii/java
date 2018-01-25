package paixu;

public class kuaisucharu {
    public static void main(String[] s){
        int[] a ={1,2,4,5,6,7,8};
        int[] b = kuaisupaixu(a);
        for (int x:b
             ) {
            System.out.print(x);
        }
    }
    public static int[] kuaisupaixu(int[] a){
        int temp;
        for(int i =1;i<a.length;i++){
            for(int j = i;j>0;j--){
                if(a[j]>a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        return a;
    }
}
