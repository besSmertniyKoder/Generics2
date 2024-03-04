import java.util.ArrayList;

// Класс Pair представляет пару значений любых типов T и U
class Pair<T, U> {
    private T first; // Первый элемент пары
    private U second; // Второй элемент пары

    // Конструктор класса Pair
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Методы доступа к элементам пары
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    // Методы изменения элементов пары
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    // Переопределение метода toString для красивого вывода пары
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

// Класс Box представляет коробку с содержимым заданного типа T
class Box<T> {
    private T content; // Содержимое коробки

    // Конструктор класса Box
    public Box(T content) {
        this.content = content;
    }

    // Метод доступа к содержимому коробки
    public T getContent() {
        return content;
    }

    // Метод изменения содержимого коробки
    public void setContent(T content) {
        this.content = content;
    }

    // Переопределение метода toString для красивого вывода содержимого коробки
    public String toString() {
        return "Box containing: " + content;
    }
}

// Класс GenericList представляет список объектов заданного типа T
class GenericList<T> {
    private ArrayList<T> list; // Список объектов типа T

    // Конструктор класса GenericList
    public GenericList() {
        list = new ArrayList<T>();
    }

    // Метод добавления элемента в список
    public void add(T item) {
        list.add(item);
    }

    // Метод доступа к элементу списка по индексу
    public T get(int index) {
        return list.get(index);
    }

    // Метод получения размера списка
    public int size() {
        return list.size();
    }

    // Переопределение метода toString для красивого вывода списка
    public String toString() {
        return list.toString();
    }
}

// Пример использования классов Pair, Box и GenericList
public class Main {
    public static void main(String[] args) {
        // Использование класса Pair
        Pair<String , Integer> pair = new Pair<>("1", 7);
        System.out.println(pair);

        // Использование класса Box
        Box<Double> box = new Box<>(3.14);
        System.out.println(box);
        Box<String> box2 = new Box<>("Hello world!");

        // Использование класса GenericList
        GenericList<String> list = new GenericList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        System.out.println("List: " + list);
    }
}