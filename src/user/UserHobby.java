package user;
import java.util.List;

public class UserHobby extends User{
    // 새로운 취미 리스트가 담길 멤버 변수
    private List<String> hobbies;

    public UserHobby(String userid, String email, List<String> hobbies){
        // 상위 클래스인 User클래스를 호출해서 자동으로 1,2번째 인자값을 넘겨줌
        super(userid, email);
        // 추가적인 List값만 인스턴스에 추가로 넘겨줌
        this.hobbies = hobbies;
    }

    //getter
    public List<String> getHobbies(){
        return this.hobbies;
    }

    //setter
    public void setHobbies(List<String> hobbies){
        this.hobbies = hobbies;
    }
    public void addHobby(String hobby){
        this.hobbies.add(hobby);
    }

    //오버라이딩
    @Override
    public String getName(){
        return super.getName() + "["+String.join(",",hobbies)+"]";
    }
}
