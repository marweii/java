package Challenge;

public class searchMatrix {
    public static  void main(String[] arfa){
        int[][] matrix= {{1,2,8,10,16,21,23,30,31,37,39,43,44,46,53,59,66,68,71},{90,113,125,138,157,182,207,229,242,267,289,308,331,346,370,392,415,429,440},{460,478,494,506,527,549,561,586,609,629,649,665,683,704,729,747,763,786,796},{808,830,844,864,889,906,928,947,962,976,998,1016,1037,1058,1080,1093,1111,1136,1157},{1180,1204,1220,1235,1251,1272,1286,1298,1320,1338,1362,1378,1402,1416,1441,1456,1475,1488,1513},{1533,1548,1563,1586,1609,1634,1656,1667,1681,1706,1731,1746,1760,1778,1794,1815,1830,1846,1861}};
        System.out.println( searchMatrix1(matrix,1861));
    }
    public static  boolean searchMatrix1(int[][] matrix, int target) {
        // write your code here
        for (int i = 0; i < matrix.length; i++) {
            if (target < matrix[0][0]) {
                return false;
            }
            if (target < matrix[i][0]) {
                for (int j = 0; j < matrix[i - 1].length; j++) {
                    if (target == matrix[i - 1][j]) {
                        return true;
                    }
                }
                break;
            } else if (i == matrix.length - 1) {
                for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
                    if (target == matrix[matrix.length - 1][j]) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}

