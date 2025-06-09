package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); // 자기 자신을 내부에 private static으로 갖고 있음

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {} // 외부에서 new로 SingletonService 만드는 것을 막음

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

    // 자바가 시작하면서 static 영역에 있는 SingletonService를 생성하여 instance에 가지고 있고, getInstance()로만 instance를 가져올 수 있고,
    // 외부에서는 new 할 수 없음. instance를 호출하면 항상 같은 instance를 반환함.
}
