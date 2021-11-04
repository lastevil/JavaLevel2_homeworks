package homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class PhoneBook {
    private HashMap <String, HashSet> a = new HashMap<>();

    public void add(String lastname, String phone){
        if (this.a.get(lastname)==null){
            HashSet phoneSet = new HashSet();
            this.a.put(lastname,phoneSet);
            phoneSet.add(phone);
        }
        else {
            this.a.get(lastname).add(phone);
        }
    }
    public void get(String lastname){
        System.out.println(lastname+" : "+this.a.get(lastname));
    }

}
