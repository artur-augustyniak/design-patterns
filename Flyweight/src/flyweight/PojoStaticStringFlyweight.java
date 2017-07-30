package flyweight;

public class PojoStaticStringFlyweight {

    private final String firstName;
    private final String lastName;
    private static final Footer intrinistic = new Footer("Dat complany footer");


    public PojoStaticStringFlyweight(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static class Footer {

        private final String txt;

        private Footer(String footerText) {
            this.txt = footerText;
        }

        public String getTxt() {
            return txt;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Footer getFooter() {
        return intrinistic;
    }



}
