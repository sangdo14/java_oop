package user;

public class User implements IUser{
    private String userid;
    private String email;
    private String address;

    public User(String userid, String email) {
       this.userid = userid;
       this.email = email;
    }

    // getter, setter 구분
    // getter: 이미 생성된 인스턴트 정보를 변경처리 하지 않음
    // setter: 이미 생성된 인스턴트 정보를 어떤식으로든 변경

    public String getName(){
        return this.userid;
    }
    public String getEmail(){
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
