package HomeWork_Pro_1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<Fruit> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit (T fruit){
        if (!fruit.getInTheBox()){
            fruit.setInTheBox(true);
            this.fruits.add(fruit);
        } else {
            System.out.println("Этот фрукт уже в коробке");
        }
    }

    public float getWeightBox (){
        if (fruits.size() > 0){
            return fruits.size() * fruits.get(0).getWeight();
        }
        return 0;

    }

    public boolean compare (Box<?> boxIn){
        return Math.abs(boxIn.getWeightBox() - this.getWeightBox()) < 0.00001;
    }

    public void transfer (Box<T> box){
        box.fruits.addAll(this.fruits);
        this.fruits.clear();
    }





}
