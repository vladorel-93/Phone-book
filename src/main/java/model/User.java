package model;

public class User {
    private String name;
    private int id;
    private String phone;
    private String address;



    public User() {
    }

    public User(String name, String phone, String address, int id) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }


    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
