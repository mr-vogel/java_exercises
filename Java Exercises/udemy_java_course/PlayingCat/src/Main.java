public class Main {

    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));

    }
}


/*
 * isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45

 * isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)

 * isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
 */