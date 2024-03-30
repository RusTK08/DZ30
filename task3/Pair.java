package task3;

class Pair<T, V extends T> {
    T first;
    V second;

    // Конструктор класса Pair, принимающий два объекта совместимых типов.
    Pair(T a, V b) {
        first = a;
        second = b;
    }

    // Методы для получения первого и второго объектов.
    T getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }
}