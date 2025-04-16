package user;

public class User {
    private String userid;
    private String email;

    public User(String userid, String email) {
       this.userid = userid;
       this.email = email;
    }

    public String getName(){
        return this.userid;
    }
    public String getemail(){
        return this.email;
    }

    public void setName(String userid){
        this.userid = userid;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void delAll(){
        this.userid = null;
        this.email = null;
    }
}
