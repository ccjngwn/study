package jpabook.jpashop.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
@Setter
public class Delivery {

    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = LAZY)
    private Order order;

    @Embedded
    private Address address;

    // 이넘 넣을 때 이거 써줘야함.
    // ORDINAL은 상태가 숫자로 들어감. 스트링으로 들어가게
    // ORDINAL하면 중간에 새로운 상태가 생기면 망함
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status; // READY, COMP
}
