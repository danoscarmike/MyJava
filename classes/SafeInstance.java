class Car {
    private String maker;
    private String color;
    private String bodyType;

    private String accelerate() {
        String motion = "Accelerating...";
        return motion;
    }

    public void setCar(String brand, String paint, String style) {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " paint is " + color);
        System.out.println(maker + " style is " + bodyType);
        System.out.println(maker + " is " + accelerate() + "\n");
    } 
}

class SafeInstance {
    public static void main(String[] args) {
        Car bentley = new Car();
        bentley.setCar("Bentley", "Silver", "Limousine");
        bentley.getCar();
    }
}