public class Main {
    private long startTime;
    private boolean isRunning;

    public void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Stopwatch started.");
        } else {
            System.out.println("Stopwatch is running.");
        }
    }
    public void stop() {
        if (isRunning) {
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            isRunning = false;
            System.out.println("Stopwatch stopped. Elapsed time: " + formatElapsedTime(elapsedTime));
        } else {
            System.out.println("Stopwatch is not running.");
        }
    }
    public void reset() {
        isRunning = false;
        System.out.println("Stopwatch reset.");
    }
    private String formatElapsedTime(long elapsedTime) {
        long seconds = elapsedTime / 1000;
        long milliseconds = elapsedTime % 1000;
        return String.format("%d seconds, %d milliseconds", seconds, milliseconds);
    }

    public static void main(String[] args) {
        Main stopwatch = new Main();

        // Start
        stopwatch.start();

        // Stop
        stopwatch.stop();

        // Reset
        stopwatch.reset();
    }
}
