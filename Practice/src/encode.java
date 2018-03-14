import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author jiangqn
 * @Date 2018-01-31 9:08
 * @Description encode
 **/
public class encode {
    public static void main(String[] args){
        String code = "a?&abc=zh中";
        try {
            code = URLEncoder.encode(code,"UTF-8");
            System.out.println(code);
            code = URLDecoder.decode(code);
            System.out.println(code);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
