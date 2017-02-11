package simplebuilder;

/**
 * Created by aaugustyniak on 11.02.17.
 */
class CarBuilderImpl implements CarBuilderIface {
    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }

    @Override
    public CarBuilderIface setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public CarBuilderIface setColor(final String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
