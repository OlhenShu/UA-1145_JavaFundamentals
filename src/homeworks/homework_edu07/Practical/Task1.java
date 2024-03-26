package homeworks.homework_edu07.Practical;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
        };
        for (var animal : animals) {
            animal.voice();
            animal.feed();

        }
    }
}

interface Animal {
    void voice();

    void feed();
}

class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    @Override
    public void feed() {
        System.out.println("The cat eats its food");

    }
}

class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("The dog eats its food");

    }
}
