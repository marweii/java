package HttpClient;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author jiangqn
 * @Date 2018-01-29 9:48
 * @Description loginpost
 **/
public class loginpost {
    public static void main(String[] a){
        String fs  = postmsg();
        System.out.println(fs);
    }
    public static String postmsg(){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://localhost:8080/compost");
        StringBuffer Getrespone = new StringBuffer();
        //map
        Map map = new HashMap();
        map.put("name","jiangqn");
        map.put("age","23");
        map.put("id","1");
        Gson gson = new Gson();
        String json = gson.toJson(map);

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("json",json));
        try {
            HttpEntity entity = new UrlEncodedFormEntity(params,"UTF-8");
            httpPost.setEntity(entity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            InputStream inputStream =response.getEntity().getContent();
            BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while((line = read.readLine())!=null){
                Getrespone.append(line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Getrespone.toString();
    }

}
