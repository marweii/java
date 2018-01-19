package json;

import com.google.gson.Gson;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class tojson {
    public static void main(String[] args){
        Map map = new HashMap();
        map.put("age","23");
        map.put("name","jiangqn");
        map.put("number","31401404");
        Gson gson = new Gson();
        String  json = gson.toJson(map);
        JSONObject obj = new JSONObject();
        obj = JSONObject.fromObject(json);
        System.out.println(obj.getString("name"));

    }
}
