package edu07;

@FunctionalInterface
public interface Worker {
    int getSalary();// public abstract
}

interface A extends Worker {

}

class Director implements Worker, A {

    @Override
    public int getSalary() {
        return 0;
    }
}