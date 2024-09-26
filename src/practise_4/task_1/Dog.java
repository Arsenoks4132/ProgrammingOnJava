package practise_4.task_1;

public class Dog extends Animal implements Movable{

    public Dog(int _age, int _size) {
        super(_age, _size);
    }

    public int toHumanAge() {
        return this._age * 7;
    }

    public void move() {
        System.out.println(this);
    }
}
