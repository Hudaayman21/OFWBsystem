public class Participant extends Person {
    private String phone;
    private String address;
    private String gender;

    public Participant(String name, String email, String phone, String address, String gender) {
        super(name, email);
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getGender() { return gender; }

    public void setPhone(String phone) { this.phone = phone; }
    public void setAddress(String address) { this.address = address; }
    public void setGender(String gender) { this.gender = gender; }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Email: " + getEmail() +
               ", Phone: " + phone + ", Address: " + address + ", Gender: " + gender;
    }
}
