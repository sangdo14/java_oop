public class User {
    public String name = "David";
    private int age = 20;

    // 생성자 constructor : new 연산자로 인스턴스 생성시 자동으로 실행되는 생성자 안쪽의 함수
    // 클래스에서 인스턴스 생성시 전달되는 인자가 생성자함수 내부로 전달
    public User(String n, int a) {
        name = n;
        age = a;
        System.out.println("내부 출력"+name);
        System.out.println("내부 출력"+age);
    }
}
