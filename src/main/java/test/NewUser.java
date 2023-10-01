
package test;

public class NewUser {

    private String UserID;
    private String FullName;
    private int Age;
    private String Address;
    private String Email;
    private String UserType;
     
   public NewUser(){
}
   
    public NewUser(String UserID, String FullName, int Age,
            String Address, String Email, String UserType) {
        this.UserID = UserID;
        this.FullName = FullName;
        this.Age = Age;
        this.Address = Address;
        this.Email = Email;
        this.UserType = UserType;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    
    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }  
}
