package com.toss.payments.dto;

import com.toss.payments.entity.Payment;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {

    @NonNull
    private PayType payType;

    @NonNull
    private Long amount;

    @NonNull
    private String orderName;

    private String yourSuccessUrl;

    private String yourFailUrl;

    public Payment toEntity() {
        return Payment.builder()
                .payType(payType)
                .amount(amount)
                .orderName(orderName)
                .orderId(UUID.randomUUID().toString())
                .paySuccessYN(false)
                .build();
    }



}
