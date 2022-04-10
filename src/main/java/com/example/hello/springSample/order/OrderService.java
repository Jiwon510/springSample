package com.example.hello.springSample.order;

/*주문 서비스*/
public interface OrderService {
    /*주문 생성*/
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
