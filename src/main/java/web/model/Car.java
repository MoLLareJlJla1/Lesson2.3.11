package web.model;

import java.util.Objects;

public class Car {
    private String name;
    private String engine;
    private String color;

    public Car(String name, String engine, String color) {
        this.name = name;
        this.engine = engine;
        this.color = color;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(engine, car.engine) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine, color);
    }
}
