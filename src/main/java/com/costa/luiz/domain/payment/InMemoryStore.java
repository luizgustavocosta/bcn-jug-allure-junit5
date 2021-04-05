package com.costa.luiz.domain.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
