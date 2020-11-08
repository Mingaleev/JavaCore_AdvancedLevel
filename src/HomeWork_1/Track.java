package HomeWork_1;

public class Track {
    private int distance;
    private int height;

    public Track(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }

    public void start (Running running){
        running.run(distance);
        running.jump(height);
    }
}
