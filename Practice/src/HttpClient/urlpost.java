package HttpClient;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author jiangqn
 * @Date 2018-01-25 16:15
 * @Description HttpClient
 **/
public class urlpost {
    private static final String POST_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=6_w8Ao9x3F68Echk4Qc9DxksFZoBFFIjq9w7g-TN8RKmKJRz8kfCkiey3q24CeVdsYNVL8Sl5BE06cW7DHHGvG-guoWGFmBu1fayfk6bWazqXR_B0Cu37IEpUqm6XisreHmGM-kDLmMnqKMV2sUAZbAEAHNM";
    public static void main(String[] args){
        String a =post();
        System.out.println(a);
    }

    public static String post(){
    PrintWriter out = null;
    BufferedReader in = null;
    String result = "";
    try {
        URL realUrl = new URL(POST_URL);
        // 打开和URL之间的连接
        URLConnection conn = realUrl.openConnection();
        // 设置通用的请求属性
        conn.setRequestProperty("accept", "*/*");
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("user-agent",
                "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

        // 发送POST请求必须设置如下两行
        conn.setDoOutput(true);
        conn.setDoInput(true);

        // 获取URLConnection对象对应的输出流
        out = new PrintWriter(conn.getOutputStream());
        // 发送请求参数
        Gson gson = new Gson();
        Map map=new LinkedHashMap<String, Object>();
        map.put("touser","oRil10wokdKh7qnILRE5mENuJFT8");
        map.put("url","");
        map.put("template_id","pU-HdFc9OwqdbhNI-Arr2Azgh8Zk-ToQOYSCtSTtaAM");
        String json = gson.toJson(map);
        out.write(json);
        // flush输出流的缓冲
        out.flush();
        // 定义BufferedReader输入流来读取URL的响应
        in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            result += line;
        }


    } catch (Exception e) {
        e.printStackTrace();
    }
    //使用finally块来关闭输出流、输入流
    finally {
        try {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    return result;
}

}
