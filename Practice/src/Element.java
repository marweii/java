import net.sf.json.JSONObject;

/**
 * @Author jiangqn
 * @Date 2018-01-29 13:21
 * @Description JSONObject
 **/
public class Element {
    public static void main(String[] args){
        JSONObject obj = new JSONObject();
        obj.element("name","jiangqn");
        obj.element("age","23");
        System.out.println(obj.toString());
    }

}
