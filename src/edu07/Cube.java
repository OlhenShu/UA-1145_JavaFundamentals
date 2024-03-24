package edu07;

class Cube extends Shape implements Volumetric {//Vertexable
    private final double side;

    public Cube(double side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side, 2);
    }


    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

//    @Override
//    public int getNumberOfVertex() {
//        return 12;
//    }
}
