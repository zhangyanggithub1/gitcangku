package redexcel;

public class fengzhuang {
    private String name;
    private String gender;
    private String address;
    private String phone;
    private int   age;


    public  fengzhuang(String Name,String gender,String address,String phone,int age) {
        this.name = Name;
        this.gender=gender;
        this.address=address;
        this.phone=phone;
        this.age=age;
    }
        public void setName(String name) {
        this.name = name;
    }
    public void getName() {
        return;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }
    public void getgender() {
        return;
    }


    public void setaddress(String address) {
        this.address = address;
    }
    public void getaddress() {
        return;
    }


    public void setphone(String phone) {
        this.phone = phone;
    }
    public void getphone() {
        return;
    }


    public void setage(int age) {
        this.age = age;
    }
    public void getage() {
        return;
    }
    public void tostring() {
            System.out.println(name + "" + gender + "" + address + "" + phone + "" + age);
    }
}



