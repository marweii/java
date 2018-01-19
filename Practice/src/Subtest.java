public class Subtest {
    public static void main(String[] args) {
        String filename = "file.xls";
        String exg = filename.substring(0,1);
        //lastIndexOf返回这个字符串在的位置的数值filename.lastIndexOf(".")
        //substring()截取字符串(int a)a的位置到最后，(int a,int b)a到b的位置，不包含b
        System.out.println(exg);
    }
}
