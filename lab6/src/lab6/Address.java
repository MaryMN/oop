package lab6;

public class Address {
    String homeAddress;
    String address;
        public Address(String homeAddress, String ad) {
            this.homeAddress = homeAddress;
            this.address = address;
        }



    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
