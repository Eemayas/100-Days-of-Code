interface Computer {
    void code();
}
// abstract class Computer {
// abstract public void code();
// }

// class Laptop extends Computer {  //class inheritance
class Laptop implements Computer {  //interface
    public void code() {
        System.out.println("code,complile,run");
    }
}

// class Desktop extends Computer {  //class interface
class Desktop implements Computer {  //interface
    public void code() {
        System.out.println("code,compile,run Faster");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
        System.out.println("Codding in devApp");
    }

}

class NeedOfInheritance {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(desk);
    }
}