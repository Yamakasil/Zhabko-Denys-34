public class Singleton {
    private static Singleton instance;
    
    private Singleton() {
        // приватний конструктор
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // інші методи
}
