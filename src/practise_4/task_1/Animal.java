package practise_4.task_1;

abstract public class Animal implements Movable {
    protected int _age;
    protected int _size;

    abstract public int toHumanAge();

    abstract public void move();

    public Animal() {
        this._age = 0;
        this._size = 0;
    }

    public Animal(int _age, int _size) {
        this._age = _age;
        this._size = _size;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public int get_size() {
        return _size;
    }

    public void set_size(int _size) {
        this._size = _size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "_age=" + _age +
                ", _size=" + _size +
                '}';
    }
}
