package GameEx3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
  
        return new ArrayList<>(Arrays.asList(
            "0","1","2","3","4",
            "5","6","7","8","9"));
    }

    @Override
    List<String> generateRuCharList() {
        return new ArrayList<>(Arrays.asList(
   "А","Б","В","Г","Д",
        "Е","Ё","Ж","З","И",
        "К","Л","М","Н","О",
        "П","Р","С","Т","У",
        "Ф","Х","Ц","Ч","Ш",
        "Щ","Ъ","Ы","Ь","Э",
        "Ю","Я"));
    }

    @Override
    List<String> generateEnCharList() {
        return new ArrayList<>(Arrays.asList(
            "A","B","C","D",
            "E","F","G","H","I",
            "J","K","L","M","N",
            "O","Q","R","S","T",
            "U","V","W","X","Y",
            "Z"));
        
    }

  

    

  

    

}
