package HomeWork_1;

public class Main {
    public static void main(String[] args) {

        Running[] running = {
                new Human("Artur",200,2),
                new Cat("Murzik",500,3),
                new Robot("K500",1000,4)
        };

        Track[] tournament = {
                new Track(100,0),
                new Track(200,1),
                new Track(600,4)
        };


        for (int j = 0; j < tournament.length; j++) {
            for (int i = 0; i < running.length; i++) {
                System.out.print("Track №" + (j+1) + " ");
                tournament[j].start(running[i]);
            }
        }




    }
}
