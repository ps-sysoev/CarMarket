package com.example.carmarket.repository.interfaces;

import java.util.List;

public interface Repository<K, V> {
    V add(V v);

    boolean delete(K k);

    boolean update(K k, V v);

    List<V> getAll();

    V getById(K k);
}
