package edu06.Task1;

public abstract class Bird {
    private boolean feathers;

    private boolean layEggs;

    public boolean isFeathers(boolean feathers) {
        return feathers;
    }


    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();

}
