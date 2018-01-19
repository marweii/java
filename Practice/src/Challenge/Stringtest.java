package Challenge;

public class Stringtest {
    public static void main(String[] args){
       String a = "()sdfj)";
       String b = a.replaceAll("([s])","+");
        System.out.println(b);
    }
}
