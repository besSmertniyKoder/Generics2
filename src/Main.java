import java.util.ArrayList;
//Задача:
// Напишите обобщенный класс VetClinic,
// который представляет собой ветеринарную клинику
// для различных видов животных. Класс должен иметь
// методы для записи на прием, обработки пациентов и выдачи отчетов.
// Продемонстрируйте использование этого класса для работы
// с пациентами - собаками, кошками и другими животными.


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
class Box<T extends Animal> {
    private T content; // Содержимое коробки

    // Конструктор класса Box
    public Box(T content) {
        this.content = content;
    }

    // Метод доступа к содержимому коробки
    public T getContent() {
        content.voice();
        return content;
    }

    // Метод изменения содержимого коробки
    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
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
        Pair<Integer, String > pair2 = new Pair<>(7, "1");
        System.out.println(pair2);

        // Использование класса Box
        Box<Cat> box = new Box<>(new Cat());
        System.out.println(box.getContent());
        Box<wildcat> box1 = new Box<>(new wildcat());
        System.out.println(box1.getContent());



        // Использование класса GenericList
//        GenericList<Box<Pair<String, Integer>>> list = new GenericList<>();
//        list.add(new Box<>(new Pair<>("6", 8)));
//        list.add(new Box<>(new Pair<>("hfrre", 3)));
//        list.add(new Box<>(new Pair<>("jrtj",80)));
//
//        System.out.println("List: " + list);
    }
}