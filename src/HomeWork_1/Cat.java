package HomeWork_1;

public class Cat implements Running {
    String name;
    private int distance;
    private int heightJump;
    boolean inGame = true;

    public Cat(String name, int distance, int heightJump) {
        this.name = name;
        this.distance = distance;
        this.heightJump = heightJump;
    }

    public boolean isInGame() {
        return inGame;
    }

    @Override
    public void jump(int height) {
        if (inGame){
            if (height <= this.heightJump){
                System.out.println("Cat " + name + " jump " + height );
            } else {
                System.out.println("Cat " + name + " go out" );
                inGame = false;
            }
        }
    }

    @Override
    public void run(int distance) {
        if (inGame){
            if (distance <= this.distance){
                System.out.println("Cat " + name + " run " + distance );
            } else {
                System.out.println("Cat " + name + " go out" );
                inGame = false;
            }
        }
    }
}
