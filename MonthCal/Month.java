package MonthCal;


public enum Month {
    JAN(1,"Январь",31),
    FEB(2,"Февраль",28),
    MAR(3,"Март",31),
    APR(4,"Апрель",30),
    MAY(5,"Май",31),
    JUN(6,"Июнь",30),
    JUL(7,"Июль",31),
    AUG(8,"Август",31),
    SEP(9,"Сентябрь",30),
    OCT(10,"Октыбрь",31),
    NOV(11,"Ноябрь",30),
    DEC(12,"Декабрь",31);

    private int numberMonth;
    private String ruNameMonth;
    private int countDay;

    
    private Month(int numberMonth, String ruNameMonth, int countDay) {
        this.numberMonth = numberMonth;
        this.ruNameMonth = ruNameMonth;
        this.countDay = countDay;
    }

    Month() {
    }

    public int getNumberMonth() {
        return numberMonth;
    }
    public String getRuNameMonth() {
        return ruNameMonth;
    }
    public int getCountDay() {
        return countDay;
    }

    

 
     
    
    


}
