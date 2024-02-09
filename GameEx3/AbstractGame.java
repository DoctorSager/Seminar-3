package GameEx3;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public abstract class AbstractGame implements Game {

    abstract List<String> generateCharList();
    abstract List<String> generateRuCharList();
    abstract List<String> generateEnCharList();
    private String word;
    private String wordRU;
    private String wordENG;
    Integer tryCount;
    GameStatus gameStatus = GameStatus.INIT;

    List<String> history = new ArrayList<>();

    @Override
    public void start(Integer sizeWord, Integer tryCount) {

       word  = generateWord(sizeWord);
       wordRU = generateRUWord(sizeWord); 
       wordENG = generateENWord(sizeWord);
       this.tryCount = tryCount;
       gameStatus = GameStatus.START;
          
    }
    private String generateWord(Integer sizeWord) {

        List<String> alfabet = generateCharList();
        String resoult = "";
        Random rnd = new Random();

            for (int i = 0; i < sizeWord; i++) {

                int randomInex = rnd.nextInt(alfabet.size());
                resoult += alfabet.get(randomInex);
                alfabet.remove(randomInex);
            }
        return resoult; 
    }
    private String generateRUWord(Integer sizeWord) {

        List<String> alfabetRU = generateRuCharList();
        String resoult = "";
        Random rnd = new Random();

            for (int i = 0; i < sizeWord; i++) {

                int randomInex = rnd.nextInt(alfabetRU.size());
                resoult += alfabetRU.get(randomInex);
                alfabetRU.remove(randomInex);
            }
        return resoult; 
    }
    private String generateENWord(Integer sizeWord) {

        List<String> alfabetENG = generateEnCharList();
        String resoult = "";
        Random rnd = new Random();

            for (int i = 0; i < sizeWord; i++) {

                int randomInex = rnd.nextInt(alfabetENG.size());
                resoult += alfabetENG.get(randomInex);
                alfabetENG.remove(randomInex);
            }
        return resoult; 
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    @Override
    public Answer inputValue(String value) {
        
        int cowCounter = 0;
        int bullCounter = 0;
        
        if (!getGameStatus().equals(GameStatus.START)) {

            throw new RuntimeException("Игра не запущена");   
        }
        for (int i = 0; i < word.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) {

                cowCounter ++;
                bullCounter ++;

            }else if (word.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++; 
            }   
        }
        history.add(value);
        tryCount --;
        if (tryCount == 0) {gameStatus = GameStatus.LOSE;}
        if (bullCounter == word.length()) {gameStatus = GameStatus.WIN;}
        return new Answer(cowCounter,bullCounter,tryCount); 
    }

    @Override
    public Answer inputRuValue(String value) {

        int cowCounter = 0;
        int bullCounter = 0;

        if (!getGameStatus().equals(GameStatus.START)) {

            throw new RuntimeException("Игра не запущена");   
        }

        for (int i = 0; i < wordRU.length(); i++) {
            if (value.charAt(i) == wordRU.charAt(i)) {
                cowCounter ++;
                bullCounter ++;
            }else if (wordRU.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++; 
            }  
          
        }
        history.add(value);
        tryCount --;
        if (tryCount == 0) {gameStatus = GameStatus.LOSE;}
        if (bullCounter == word.length()) {gameStatus = GameStatus.WIN;}
        return new Answer(cowCounter,bullCounter,tryCount); 
    }
    @Override
    public Answer inputEnValue(String value) {

        int cowCounter = 0;
        int bullCounter = 0;
        
        if (!getGameStatus().equals(GameStatus.START)) {

            throw new RuntimeException("Игра не запущена");   
        }

        for (int i = 0; i < wordENG.length(); i++) {
            if (value.charAt(i) == wordENG.charAt(i)) {
                cowCounter ++;
                bullCounter ++;
            }else if (wordENG.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++; 
            }else{
            }    
        }
        history.add(value);
        tryCount --;
        if (tryCount == 0) {gameStatus = GameStatus.LOSE;}
        if (bullCounter == word.length()) {gameStatus = GameStatus.WIN;}
        

        return new Answer(cowCounter,bullCounter,tryCount);  
    } 

    @Override
    public void getHistory() {

        for (String string : history) {

            System.out.println(string);
  
        }
    }
}
