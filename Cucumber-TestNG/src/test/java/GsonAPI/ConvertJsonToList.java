package GsonAPI;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ConvertJsonToList {

	public static void main(String[] args) {
		
		    Gson gson = new Gson();
	        String json = "[{\"name\":\"mkyong\"}, {\"name\":\"laplap\"}]";
	        List<Employee> list = gson.fromJson(json, new TypeToken<List<Employee>>() {}.getType());
	        list.forEach(x -> System.out.println(x));

	        
	        

	        //convert json into map 
	        String json1 = "{\"name\":\"mkyong\", \"age\":33}";
	        Map<String, Object> map = gson.fromJson(json1, new TypeToken<Map<String, Object>>() {}.getType());
	        map.forEach((x, y) -> System.out.println("key : " + x + " , value : " + y));


	        
	}

}
