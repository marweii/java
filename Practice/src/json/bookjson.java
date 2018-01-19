package json;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class bookjson {
    public static void main(String[] args){
/*        String bookentity = "name = jiangqn , id = 31404104 ,money = 23";
        String params = "{\""+bookentity.replaceAll("=","\":\"")+"\"}";
        String bookentity1 = "{\"name\":\"jiangqn\" , \"id\":\" 31404104\" ,\"money\":\"23\"}";
        System.out.println(bookentity1);*/
        Map map= new HashMap();
        map.put("name","jiangqinan");
        map.put("money",23);
        map.put("id",31401404);
        String mapjson = new  Gson().toJson(map);
        Book book = new Book();
        book = new Gson().fromJson(mapjson,Book.class);
        System.out.println(book.getId());
    }
}
