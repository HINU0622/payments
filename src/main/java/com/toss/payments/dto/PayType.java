package com.toss.payments.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum PayType {
    CARD("카드"), CASH("현금"), POINT("포인트");

    private final String payType;

    PayType(String value) {
        this.payType = value;
    }

    public String getDescription() { return payType; }
}
