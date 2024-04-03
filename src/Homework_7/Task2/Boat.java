package Homework_7.Task2;

class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers) {
        super(passengers);
    }

    @Override
    void isSailing() {
        System.out.println("Boat is sailing");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}
