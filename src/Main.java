// 외부 클래스 Car 생성
class Car {
    String color;
    void drive() {
        System.out.println("달립니다!");
    }
}

public class Main {
    public static void main(String[] args) {

        // 예제 2: 동일한 경로에 있는 class는 import가 필요 없다.
         new User("a", 2);
         User user1 = new User("b", 3);
         System.out.println("외부 출력"+user1.name);
         System.out.println("외부 출력"+user1.age);

         // 예제 1
//        // 외부 클래스로 부터 Car타입의 인스턴스 생성
//        Car myCar = new Car(); // 객체 생성
//        //인스턴스의 멤버변수에 값등록
//        myCar.color = "빨강";
//
//        // 인스턴스에 내장 메서드 호출
//        myCar.drive();
//        System.out.println(myCar.color);

    }
}
/*
위와 같은 방법으로 클래스를 생성해야 하는 이유
예를 들어 게시판 생성시 모든 게시물은 동일한 형식을 틀을 가지고 있는 맵 형식
- 수많은 맵 데이터를 일일이 생성하기에는 비효율
- 올바르지 않는 형식의 데이터가 DB에 들어가는 문제가 발생할 수 있음
- 위와 같은 문제를 방지하기 위해서 우리는 동일한 품질의 데이터를 생성하기 위한 클래스를 만들고 클래스에서 데이터의 정보 형식을 강제하기 위함
*/