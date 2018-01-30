package HttpClient;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author jiangqn
 * @Date 2018-01-29 14:01
 * @Description HttpTest
 **/
public class httptest {
    private static final String URLPOST = "http://localhost:8080/compost";
    public static void main(String[] args) throws IOException {
        //Closetest();
        Urltest();
    }
    public static void Closetest() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(URLPOST);

        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("json","jiangqn"));
        HttpEntity entity = new UrlEncodedFormEntity(params,"UTF-8");

        post.setEntity(entity);
        CloseableHttpResponse response = client.execute(post);
        InputStream inputStream = response.getEntity().getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String temp;
        StringBuffer getmsg = new StringBuffer();
        while((temp = reader.readLine())!=null){
            getmsg.append(temp);
        }
        System.out.println(getmsg.toString());
    }
    public static void Urltest()  {
        PrintWriter out = null;
        BufferedReader in = null;
        try {
            URL url =new URL(URLPOST);
            URLConnection conn =url.openConnection();
            // 设置通用的请求属性
            //一定要设置 Content-Type 要不然服务端接收不到参数
            conn.setRequestProperty("Content-Type", "application/Json; charset=UTF-8");

            conn.setDoOutput(true);
            conn.setDoInput(true);

            out = new PrintWriter(conn.getOutputStream());

            out.write("123");
            out.flush();
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String temp;
            StringBuffer sb = new StringBuffer();
            while((temp=in.readLine())!=null){
                sb.append(temp);
            }
            System.out.println(sb.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
