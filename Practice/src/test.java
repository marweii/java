import com.google.gson.Gson;
import soyea.SoyeaEncryptUtils;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args){
        Map<String,Object> map = new HashMap();
        Map<String,Object> map1 = new HashMap();
        map.put("name","jiangqian");
        map.put("age","23");
        map.put("id","123");
        map1.put("student",map);
        Gson gson = new Gson();
        String json = gson.toJson(map1);
        String encodeJson = SoyeaEncryptUtils.encode(json);
        System.out.println(encodeJson);
        System.out.println(SoyeaEncryptUtils.decode(encodeJson));

    }

}
