package HttpClient;

import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.*;
import java.util.*;

public class SendPostM {
    private static final String POST_URL = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=6_T1pgvg_04zJ24035NzNW5TozKgMS6zNaaTJSk4Zrko0F8D7xDCzyi34F7x87BT7Bf4oF5xbXO4aEqdl8h3kNLQ2b6o0vkHlwFGdv1tKUkg6vXqtktYqqdHOsjbQRDHjAIANZD";
    public static String SendPost() throws IOException {
        Map map=new LinkedHashMap<String, Object>();
        map.put("touser","oRil10wokdKh7qnILRE5mENuJFT8");
        map.put("url","");
        map.put("template_id","pU-HdFc9OwqdbhNI-Arr2Azgh8Zk-ToQOYSCtSTtaAM");
        Gson gson = new Gson();
        String  json = gson.toJson(map);
        System.out.println(json);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(POST_URL);


        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("touser","oRil10wokdKh7qnILRE5mENuJFT8"));
        params.add(new BasicNameValuePair("url",""));
        params.add(new BasicNameValuePair("template_id","pU-HdFc9OwqdbhNI-Arr2Azgh8Zk-ToQOYSCtSTtaAM"));
        UrlEncodedFormEntity  httpEntity = new UrlEncodedFormEntity(params,"UTF-8");
        httpPost.setEntity(httpEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        InputStream inputStream = response.getEntity().getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        StringBuffer Getrespone = new StringBuffer();
        while((line = reader.readLine())!=null){
            Getrespone.append(line);
        }
        reader.close();
        httpClient.close();
        return Getrespone.toString();
    }

}
