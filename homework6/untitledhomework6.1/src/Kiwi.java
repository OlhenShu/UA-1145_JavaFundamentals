class Kiwi extends NonFlyingBird {
    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi cannot fly due to its size and weight");
    }
}