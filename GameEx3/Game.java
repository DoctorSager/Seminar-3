package GameEx3;



public interface Game {

    void start(Integer sizeWord,Integer tryCount);
    Answer inputValue(String value);
    Answer inputRuValue(String value);
    Answer inputEnValue(String value);
    void getHistory();
    GameStatus getGameStatus();
    
}
