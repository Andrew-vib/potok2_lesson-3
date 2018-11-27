package lesson3;

public class PhoneRecord {
    private String secondName;
    private int phoneNum;

    public PhoneRecord(String secondName, int phoneNum){
        this.secondName = secondName;
        this.phoneNum = phoneNum;
    }

    public String getSecondName (){
        return secondName;
    }

    public int getPhoneNum (){
        return phoneNum;
    }

    public static void main (String[] args){
//        PhoneRecord user1 = new PhoneRecord("Иванов", 8-958-321-1254);
//        PhoneRecord user2 = new PhoneRecord("Петров", 8-971-951-6547);
//        PhoneRecord user3 = new PhoneRecord("Иванов", 8-977-956-1254);
    }
}
