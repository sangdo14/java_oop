package user;

// User 클래스가 사용할 전용 툴 (클래스 전용 커스텀 타입)
// 쓰는 목적 : 특정 클래스안에 약속된 메서드만 등록하가 위함

// getter와 setter는 선택적으로 등록 가능하다.
// setter는 보안상의 이유로 등록하지 않는 게 일반적이다.
// ㄴ 왜냐하면 interface는 외부에서 확인 가능하기 때문이다.

public interface IUser {
    String getName();
    String getEmail();
}