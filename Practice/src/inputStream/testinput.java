package inputStream;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class testinput {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\ceshi\\ceshi.txt");
            FileInputStream fin = new FileInputStream(file);
            byte[] filebt = readStream(fin);
            for(int i = 0;i<filebt.length;i++){
                 System.out.println(byteToHexStr(filebt[i]));
            }
            System.out.println(new String(filebt,"gbk"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static byte[] readStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = inStream.read(buffer)) != -1) {
            outSteam.write(buffer, 0, len);
        }
        outSteam.close();
        inStream.close();
        return outSteam.toByteArray();
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
