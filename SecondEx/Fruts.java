package SecondEx;


public enum Fruts {

    APPLE("Яблоко"),
    PINAPLE("Ананас"),
    OPANGE("Апельсин"),
    BANANA("Банан"),
    MANDARINE("Мандарин");

    private String ruName;

    
    private Fruts() {
    }
    
    private Fruts(String ruName) {
        this.ruName = ruName;
    }
    
    public String getRuName() {
        return ruName;
    }
    


}