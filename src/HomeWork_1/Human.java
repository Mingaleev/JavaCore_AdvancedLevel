package HomeWork_1;

public class Human implements Running {
    private String name;
    private int distance;
    private int heightJump;
    boolean inGame = true;

    public Human(String name, int distance, int heightJump) {
        this.name = name;
        this.distance = distance;
        this.heightJump = heightJump;
    }

    @Override
    public void jump(int height) {
        if (inGame){
            if (height <= this.heightJump){
                System.out.println("Human " + name + " jump " + height );
            } else {
                System.out.println("Human " + name + " go out" );
                inGame = false;
            }
        }
    }

    @Override
    public void run(int distance) {
        if (inGame){
            if (distance <= this.distance){
                System.out.println("Human " + name + " run " + distance );
            } else {
                System.out.println("Human " + name + " go out" );
                inGame = false;
            }
        }
    }
}
