public class EarlySingleton {
    private static final EarlySingleton instance = new EarlySingleton();

    private EarlySingleton() {}

    public static EarlySingleton getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        EarlySingleton singleton1 = EarlySingleton.getInstance();
        EarlySingleton singleton2 = EarlySingleton.getInstance();

        System.out.println("Are both instances equal? " + (singleton1 == singleton2));
    }
    
}
