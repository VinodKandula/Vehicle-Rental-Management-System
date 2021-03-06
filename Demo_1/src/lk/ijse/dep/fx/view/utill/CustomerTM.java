package lk.ijse.dep.fx.view.utill;

public class CustomerTM {
    private String nic;
    private String name;
    private String address;
    private String telephone;

    public CustomerTM() {
    }

    public CustomerTM(String nic, String name, String address, String telephone) {
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "CustomerTM{" +
                "nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
