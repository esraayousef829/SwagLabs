package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.util.LinkedHashMap;

public class jesonFile {
    LinkedHashMap<String, String> data;

    public jesonFile(String filepath) {
        try {
            data = new Gson().fromJson(new FileReader(filepath),new TypeToken<LinkedHashMap<String,Object>>(){}.getType());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public Object getValue(String key){
        return data.get(key);
    }
}
