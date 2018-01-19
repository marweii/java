import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args){
        Map<Integer,Map<Integer,Object>> map = new HashMap<Integer, Map<Integer,Object>>();
        Map<Integer,Object> value = new HashMap<Integer, Object>();
        value.put(1,"1");
        map.put(1,value);
        System.out.println(map.get(1));
    }
}
