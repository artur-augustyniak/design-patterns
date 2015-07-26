//ALSO POSSIBLE
//public final class Singleton {
//
//    private final static Singleton ourInstance = new Singleton();
//
//    public static Singleton getInstance() {
//        return ourInstance;
//    }
//
//    //żeby uniknąć automatycznego tworzenia domyślnego, publicznego, bezargumentowego konstruktora
//    private Singleton() {
//    }
//}
//
//public class Singleton {
//
//    //żeby uniknąć automatycznego tworzenia domyślnego, publicznego, bezargumentowego konstruktora
//    private Singleton() {
//    }
//
//    private static class SingletonHolder {
//
//        private final static Singleton instance = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//        return SingletonHolder.instance;
//    }
//}
//
//
//Java 5 i nowsza
//public enum Singleton {
//
//    //synchronizacja oraz unikatowość zapewniona przez maszynę wirtualną Javy
//    INSTANCE
//}
package singleton.model;

/**
 * (tylko Java 5 i nowsza)
 * @author artur
 */
public final class DispatchConnection {

    private DispatchConnection() {
    }
    /**
     * What is the Java volatile keyword?
     *
     * Essentially, volatile is used to indicate that a variable's value will be
     * modified by different threads.
     *
     * Declaring a volatile Java variable means:
     *
     * The value of this variable will never be cached thread-locally: all reads
     * and writes will go straight to "main memory"; Access to the variable acts
     * as though it is enclosed in a synchronized block, synchronized on itself.
     * * We say "acts as though" in the second point, because to the programmer
     * at least (and probably in most JVM implementations) there is no actual
     * lock object involved. Here is how synchronized and volatile compare:
     */
    private static volatile DispatchConnection instance = null;

    public static DispatchConnection getInstance() {
        if (instance == null) {
            synchronized (DispatchConnection.class) {
                if (instance == null) {
                    System.out.println("Singleton creation");
                    instance = new DispatchConnection();
                }
            }
        }
        return instance;
    }

    public void sendMulticastMessage() {
        System.out.println("Msg. All trains stop NOW!, msg provided by object id: " + this.toString());
    }
}
