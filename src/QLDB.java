public class QLDB {
    int numberPhone;
    String contactGroup;
    String name;
    String gender;
    String address;
    String date;
    String email;
    public QLDB(int numberPhone,String contactGroup,String name,String gender,String address,String date,String email) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.contactGroup = contactGroup;
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "QLDB{" +
                "numberPhone=" + numberPhone +
                ", contactGroup='" + contactGroup + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
