package trim;

public class trimtest {
    public static void main(String[] args){
            String test = "   jiang qi nan    ";
            test.trim();//删去字符串开头和结尾的空格
            test.replaceAll(" ","");//删除字符串中的所有空格字符串可以用replace
    }
}
