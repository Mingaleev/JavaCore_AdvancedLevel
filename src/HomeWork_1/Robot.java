package HomeWork_1;

public class Robot implements Running {
    String name;
    private int distance;
    private int heightJump;
    boolean inGame = true;

    public Robot (String name, int distance, int heightJump) {
        this.name = name;
        this.distance = distance;
        this.heightJump = heightJump;
    }

    @Override
    public void jump(int height) {
        if (inGame){
            if (height <= this.heightJump){
                System.out.println("Robot " + name + " jump " + height );
            } else {
                System.out.println("Robot " + name + " go out" );
                inGame = false;
            }
        }
    }

    @Override
    public void run(int distance) {
        if (inGame){
            if (distance <= this.distance){
                System.out.println("Robot " + name + " run " + distance );
            } else {
                System.out.println("Robot " + name + " go out" );
                inGame = false;
            }
        }
    }
}
