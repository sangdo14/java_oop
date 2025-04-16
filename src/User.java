public class User {
    // 멤버변수는 정보의 틀구조 생성
    // 아래 변수는 this로 접근한다.
    private String userid;
    private String email;

    // 생성자 constructor : new 연산자로 인스턴스 생성시 자동으로 실행되는 생성자 안쪽의 함수
    // 클래스에서 인스턴스 생성시 전달되는 인자가 생성자함수 내부로 전달
    public User(String userid, String email) {
       this.userid = userid;
       this.email = email;
    }

    //getter(클래스 내부정보 가져오기), setter(내부 정보 수정)
    public String getName(){
        return this.userid;
    }
    public String getemial(){
        return this.email;
    }

    // setter: 이미 생성된 인스턴스의 정보값을 변경
    public void setName(String userid){
        this.userid = userid;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
