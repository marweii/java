package bytetst;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;

public class bytetest {
    public static void main(String[] args){
        String date = "jiangqinan1fsafas";
        String date1 = "jiangqiann";

        try {
            String code= encode(date.getBytes(),date1);
            System.out.println(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String encode(byte[] data, String key) throws Exception {
        DESKeySpec dks = new DESKeySpec(key.getBytes());
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        Key secretKey = keyFactory.generateSecret(dks);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec("QnC8mLPF".getBytes());
        cipher.init(1, secretKey, iv);
        byte[] bytes = cipher.doFinal(data);
        return (new BASE64Encoder()).encode(bytes);
    }
}
