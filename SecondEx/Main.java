package SecondEx;

public class Main {
    public static void main(String[] args) {

        Fruts fruts = Fruts.APPLE;


        switch (fruts) {
            case APPLE,PINAPLE,MANDARINE,
            OPANGE,BANANA -> System.out.println(fruts.getRuName());
            default -> System.out.println("Такого фрукта нету");
   
        }
        
    }
}
