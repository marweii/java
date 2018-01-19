package Http;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

public class ApacheHttpClientExample {

    private static final String USER_AGENT = "Mozilla/5.0";

    private static final String GET_URL = "http://localhost:8080/httptest";

    private static final String POST_URL = "http://localhost:8080/user/name";

    public static void main(String[] args) throws IOException {
/*        sendGET();
        System.out.println("GET DONE");*/
        sendPOST();
        System.out.println("POST DONE");
    }

    private static void sendGET() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(GET_URL);
        httpGet.addHeader("User-Agent", USER_AGENT);
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
        InputStream inputStream = null;
        inputStream = httpResponse.getEntity().getContent();
        System.out.println("input:"+inputStream);
        System.out.println("read:"+inputStream.read());
        System.out.println("GET Response Status:: "
                + httpResponse.getStatusLine().getStatusCode());

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                httpResponse.getEntity().getContent()));
        System.out.println("BufferedReader:"+reader);
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        reader.close();

        // print result
        System.out.println(response.toString());
        httpClient.close();
    }

    private static void sendPOST() throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(POST_URL);
        httpPost.addHeader("User-Agent", USER_AGENT);
        //类似Map
        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("name", "xxx"));
       /* urlParameters.add(new BasicNameValuePair("password", "4"));*/
        HttpEntity postParams = new UrlEncodedFormEntity(urlParameters);
        //加入Post实体
        httpPost.setEntity(postParams);

        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);

        System.out.println("POST Response Status:: "
                + httpResponse.getStatusLine().getStatusCode());

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                httpResponse.getEntity().getContent()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        reader.close();

        // print result
        System.out.println(response.toString());
        httpClient.close();

    }

}