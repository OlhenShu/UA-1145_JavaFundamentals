package edu06.HomeWork01;

abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    protected Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

}
