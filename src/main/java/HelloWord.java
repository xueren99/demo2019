import com.alibaba.fastjson.JSONObject;

public class HelloWord {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("word","hello json");


        System.out.println("hello word!");
        System.out.println(jsonObject);
    }


}
