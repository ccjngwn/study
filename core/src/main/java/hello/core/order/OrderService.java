package hello.core.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice); // Order를 주문하면 최종 결과 Order를 반환
}
