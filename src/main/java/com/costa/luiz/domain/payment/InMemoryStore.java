package com.costa.luiz.domain.payment;

import com.costa.luiz.domain.infrastructure.Store;

import java.util.ArrayList;
import java.util.List;

@Store
public class InMemoryStore<T> {

    private final List<T> data;

    public InMemoryStore() {
        this.data = new ArrayList<>();
    }

    public void save(T t) {
        data.add(t);
    }

    public void delete(T t) {
        int indexToDelete = -1;
        for (int index = 0; index < data.size(); index++) {
            if (data.get(index).equals(t)) {
                indexToDelete = index;
            }
        }
        data.remove(indexToDelete);
    }

    public List<T> findAll() {
        return data;
    }
}
