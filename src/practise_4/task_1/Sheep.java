package practise_4.task_1;

public class Sheep extends Animal implements Movable{

    public Sheep(int _age, int _size) {
        super(_age, _size);
    }

    public int toHumanAge() {
        return this._age * 4 + 14;
    }

    public void move() {
        System.out.println(this);
    }
}
