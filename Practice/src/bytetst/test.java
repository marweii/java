package bytetst;

public class test {
    public static void main(String[] args){
        byte a = 16;
        byteToHexStr(a);

    }
    public static String byteToHexStr(byte by) {
        String hexString = Integer.toHexString(by & 255);
        switch(hexString.length()) {
            case 0:
                hexString = "00";
                break;
            case 1:
                hexString = "0" + hexString;
        }

        return hexString;
    }
}
