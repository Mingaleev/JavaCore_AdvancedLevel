package HomeWork_Pro_1;

public abstract class Fruit {
    private float weight;
    private boolean inTheBox = false;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setInTheBox (Boolean set){
        inTheBox = set;
    }

    public boolean getInTheBox() {
        return inTheBox;
    }
}
