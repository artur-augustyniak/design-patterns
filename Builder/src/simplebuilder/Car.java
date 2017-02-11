package simplebuilder;

/**
 * Created by aaugustyniak on 11.02.17.
 */

/**
 * Represents the product created by the builder.
 */
class Car {
    private int wheels;
    private String color;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car [wheels = " + wheels + ", color = " + color + "]";
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }
}
