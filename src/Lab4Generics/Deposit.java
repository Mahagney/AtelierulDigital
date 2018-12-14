package Lab4Generics;

import java.util.HashMap;
import java.util.Random;


public class Deposit <T extends CodedItem>{
    private HashMap<String, T> items=new HashMap<String, T>();
    private int index=0;
    private Random r=new Random();

    public String depositItem(T item){
        String password= generatePassword(item.getCode());
        items.put(password,item);
        index++;
        return password;
    }

    private String generatePassword(String code){
        String password = "";
        password+=(r.nextInt(100)+1) + index + code;
        return password;
    }

    public T getItem(String password, String code){
        T item=items.get(password);
        if(item.getCode().equals(code)){
            return item;
        }
        return null;
    }
}
