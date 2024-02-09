package GameEx3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AbstractGame abstractGame = new NumberGame();
        abstractGame.start(5,3);
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите значения: 1.Числа, 2.Русский алфавит 3.Английский алфавит");
        System.out.println("Введите свой выбор: ");

        switch (scanner.nextLine()) {
            case "1":
                abstractGame.getGameStatus().equals(GameStatus.NUM);

                while (abstractGame.getGameStatus().equals(GameStatus.START)) {
            
                    System.out.println("Введи значение : ");
                    Answer answer = abstractGame.inputValue(scanner.nextLine());
                    System.out.println(answer);
                }
                
                if (abstractGame.getGameStatus().equals(GameStatus.WIN)) {
        
                    System.out.println("Победа");
                }else if (abstractGame.getGameStatus().equals(GameStatus.LOSE)) {
                    System.out.println("Поражение");
                    
                }else{
                    System.out.println("Непонятный статус");
                }
                break;
            case "2":
                abstractGame.getGameStatus().equals(GameStatus.RUS);

                while (abstractGame.getGameStatus().equals(GameStatus.START)) {
            
                    System.out.println("Введи значение : ");
                    Answer answer = abstractGame.inputRuValue(scanner.nextLine());
                    System.out.println(answer);
                }
                if (abstractGame.getGameStatus().equals(GameStatus.WIN)) {
        
                    System.out.println("Победа");
                }else if (abstractGame.getGameStatus().equals(GameStatus.LOSE)) {
                    System.out.println("Поражение");
                    
                }else{
                    System.out.println("Непонятный статус");
                }
                break;
            case "3":
                abstractGame.getGameStatus().equals(GameStatus.ENG);
                while (abstractGame.getGameStatus().equals(GameStatus.START)) {
            
                    System.out.println("Введи значение : ");
                    Answer answer = abstractGame.inputEnValue(scanner.nextLine());
                    System.out.println(answer);
                }
                if (abstractGame.getGameStatus().equals(GameStatus.WIN)) {
        
                    System.out.println("Победа");
                }else if (abstractGame.getGameStatus().equals(GameStatus.LOSE)) {
                    System.out.println("Поражение");
                    
                }else{
                    System.out.println("Непонятный статус");
                }
                break;
            default:
                System.out.println("Некорректный ввод");
                break;
        }


        System.out.println("Хотите посмотреть историю? 1.Да 2.Нет ");
        System.out.println("Введите свой выбор: ");

        switch (scanner.nextLine()) {
            case "1":
                abstractGame.getGameStatus().equals(GameStatus.HISTORY);
                abstractGame.getHistory();
                break;
            case "2": 
                break;
            default:
                break;
        }
        scanner.close(); 
    }
}
