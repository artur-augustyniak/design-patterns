package simplebuilder;

/**
 * Created by aaugustyniak on 11.02.17.
 */
public class CarBuildDirector {
    private CarBuilderIface builder;

    public CarBuildDirector(final CarBuilderIface builder) {
        this.builder = builder;
    }

    public Car construct() {
        //return builder.setWheels(4).setColor("Red").build();
        return builder.setWheels(4).build();
    }

    public static void main(final String[] arguments) {
        CarBuilderIface builder = new CarBuilderImpl();
        CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.construct());
    }
}
