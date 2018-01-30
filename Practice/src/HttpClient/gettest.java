package HttpClient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author jiangqn
 * @Date 2018-01-29 9:23
 * @Description httpget
 **/
public class gettest {
    public static  void  main(String[] a) throws IOException {
        gethttp();
    }
    public static void gethttp() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://localhost:8080/login");
        CloseableHttpResponse httpResponse = httpClient.execute(httpget);
        InputStream inputStream = httpResponse.getEntity().getContent();
        BufferedReader read = new BufferedReader(new InputStreamReader(inputStream));
        while(read.readLine()!=null){
            System.out.println(read.readLine());
        }
    }
}
