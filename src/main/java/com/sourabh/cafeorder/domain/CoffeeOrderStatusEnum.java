package com.sourabh.cafeorder.domain;

public enum CoffeeOrderStatusEnum {
    NEW, CANCELLED, PENDING_VALIDATION, VALIDATED, VALIDATION_EXCEPTION,
    PENDING_ALLOCATION, ALLOCATED, ALLOCATION_ERROR, PENDING_INVENTORY,
    PICKED_UP, DELIVERED, DELIVERY_EXCEPTION

}