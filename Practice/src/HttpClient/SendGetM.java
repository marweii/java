package HttpClient;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SendGetM {
    private static final String GET_URL = "http://localhost:8080/user";

    public static String sendGET() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(GET_URL);
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
        InputStream inputStream = httpResponse.getEntity().getContent();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String getinput;
        StringBuffer getrep = new StringBuffer();
        while((getinput =bufferedReader.readLine())!=null){
            getrep.append(getinput);
        }
        bufferedReader.close();
        httpClient.close();
        return getrep.toString();
    }
}
