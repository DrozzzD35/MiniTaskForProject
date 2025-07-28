package stage_1.task_8;

public class Car {
    private String model;
    private String color;
    private int speed;

    public Car(String color, String model) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' + '\'' + ", speed='" + speed +
                '}';
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public Car() {
    }

}
