// 외부 클래스 Car 생성
class Car {
    String color;
    void drive() {
        System.out.println("달립니다!");
    }
}

public class Main {
    public static void main(String[] args) {

        // 예제4 - Create, Read, Update, Delete
        // 클래스를 통해 초기 인스턴스 생성 (Create: 데이터 생성)
        User user1 = new User("David", "abc@naver.com");

        // 초기 인스턴스 출력 (Read)
        String userName = user1.getName();
        System.out.println(userName);

        // 인스턴스 값 변경 후 출력 (Update, Read)
        user1.setName("Andy");
        userName = user1.getName();
        System.out.println(userName);

        // 인스턴스 값 삭제 후 출력 (Delete)
        user1.delAll();
        System.out.println(user1.getName());
        System.out.println(user1.getemail());

        // 예제3
//        User user1 = new User();
////        System.out.println(user1.name);
//
//        // setAge메서드로 내부 정본 변경 처리
//        user1.setAge(21);
//
//        // 변경된 값을 getAge 메서드로 가져옴
//        int userAge = user1.getAge();
//        System.out.println(userAge);

        //getter, setter를 통해서 사전에 약속된 방식으로만 중요한 정보값 변경처리



        // 예제 2: 동일한 경로에 있는 class는 import가 필요 없다.
//         new User("a", 2);
//         User user1 = new User("b", 3);
//         System.out.println("외부 출력"+user1.name);
//         System.out.println("외부 출력"+user1.age);

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