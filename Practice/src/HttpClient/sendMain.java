package HttpClient;
import com.google.gson.Gson;
import net.sf.json.JSONObject;
import java.io.IOException;

/**
 * Json String串获取数据
 */
public class sendMain {
    public static void main(String[] args) throws IOException {
        //String sendget = SendGetM.sendGET();
        String senpost = SendPostM.SendPost();
        System.out.println(senpost);
        String abc = urlpost.post();
        System.out.println(abc);
        //取出String json串的值的2种方式。
        //以Gson结合实例来获取
        //GsongetStringJson(sendget);
        //以JsonObject来获取
        //JsonObjectgetStringJson(sendget);
    }
    public static  void GsongetStringJson(String str){
        people man = new people();
        man = new Gson().fromJson(str,people.class);
        System.out.println(man.getAccount());
        System.out.println(man.getName());
    }
    public static void JsonObjectgetStringJson(String str){
        JSONObject obj = new JSONObject();
        obj = JSONObject.fromObject(str);
        System.out.println(obj.getString("account"));
        System.out.println(obj.getString("name"));
    }
}
