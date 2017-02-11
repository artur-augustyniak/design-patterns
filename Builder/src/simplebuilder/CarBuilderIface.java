package simplebuilder;

/**
 * Created by aaugustyniak on 11.02.17.
 */

/**
 * The builder abstraction.
 */
interface CarBuilderIface {
    CarBuilderIface setWheels(final int wheels);

    CarBuilderIface setColor(final String color);

    Car build();
}
