package homework3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private HashMap<String,String> a = new HashMap<>();

    public void add(String lastname, String phone){
        (this.a).put(phone,lastname);
    }
    public void get(String lastname){
        for (Map.Entry<String, String> o : this.a.entrySet()) {
            if (lastname.equals(o.getValue())){
            System.out.println(o.getKey() + ": " + o.getValue());
            }
        }
    }

}
