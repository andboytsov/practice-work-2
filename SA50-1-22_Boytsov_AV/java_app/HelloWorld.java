public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("Hello from Java Docker container!");
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("=================================");
        
        // Дополнительная информация
        Runtime runtime = Runtime.getRuntime();
        long memory = runtime.maxMemory() / (1024 * 1024);
        System.out.println("Max memory: " + memory + " MB");
        System.out.println("Available processors: " + runtime.availableProcessors());
    }
}