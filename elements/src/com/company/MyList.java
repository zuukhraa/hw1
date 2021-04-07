package com.company;

public interface MyList<T> {
    void add(T element);

    T get(int index);

    int size();

    void clear();

    // TODO: удалить элемент по индексу со сдвигом влево
    // [77, 11, 34, 50, 100] -> removeAt(2) -> [77, 11, 50, 100]
    void removeAt(int index);

    // TODO: вставить элемент со сдвигом вправо
    void insert(int element);
}
