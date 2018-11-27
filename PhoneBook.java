package lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, Integer> recordsByName = new HashMap<String, Integer>();

    public void addNewRecord (PhoneRecord user){
        recordsByName.put(user.getSecondName(), user.getPhoneNum());
    }

    public void setRecordsByName (Map<String, Integer> recordsByName){
        this.recordsByName = recordsByName;
    }

    public Map<String, Integer> getRecordsByName(){
        return recordsByName;
    }


    public static void main (String[] args){
        PhoneRecord user1 = new PhoneRecord("Иванов", 8-958-321-1254);
        PhoneRecord user2 = new PhoneRecord("Петров", 8-971-951-6547);
        PhoneRecord user3 = new PhoneRecord("Иванов", 8-977-956-1254);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.recordsByName(user1);

        phoneBook.getRecordsByName();

    }

}
