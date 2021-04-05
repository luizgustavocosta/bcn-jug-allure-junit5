package com.costa.luiz.domain.payment;

import java.util.List;

interface PaymentRepository<T> {

    void save(T t);
    void delete(T t);
    List<T> findAll();
}
