package edu06;

class Aclass {
    int field1 = 10;
}

class Bclass extends Aclass {
    int field2 = 20;
}

class TestAEqualsB {
    public static void main(String[] args) {
        Aclass a = new Aclass();
        Bclass b = new Bclass();
        // if (a instanceof Bclass) {
        a = (Aclass) b;
        //}
        System.out.println(b.field1);
        System.out.println(b.field2);
    }
}
