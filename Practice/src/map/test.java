package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author jiangqn
 * @Date 2018-03-08 13:56
 * @Description
 **/
public class test {
    public static void main(String[] args){
        Map<String,Object> map =new HashMap<>();
        map.put("1",1);
        map.put("2",3);
        for (String key:map.keySet()){
            System.out.println(map.get(key));
        }
    }

}
