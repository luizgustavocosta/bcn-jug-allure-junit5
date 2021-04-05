package com.costa.luiz.domain.payment;

import java.util.List;

public class PaymentBuyerRepository implements PaymentRepository<Buyer> {

    InMemoryStore<Buyer> store = new InMemoryStore<>();

    @Override
    public void save(Buyer buyer) {
        store.save(buyer);
    }

    @Override
    public void delete(Buyer buyer) {
        store.delete(buyer);
    }

    @Override
    public List<Buyer> findAll() {
        return store.findAll();
    }
}
