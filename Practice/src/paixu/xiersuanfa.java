package paixu;

public class xiersuanfa {
    public static void shellSort(int R[]){
        int k = R.length/2;//分组的增量
        int temp =0 ;
        int x = 0;
        while(k>=1){
            for(int i=0;i<k;i++){//每组的起始位置
                for(int j=i+k;j<R.length;j+=k){//前后记录位置的增量是k，而不是1
                    x=j-k;
                    temp=R[j];
                    while(x>=i&&temp<R[x]){
                        R[x+k]=R[x];//移动的增量是k不是1
                        x-=k;
                    }
                    R[x+k]=temp;
                }
            }
            k=k/2;
        }
    }
}
