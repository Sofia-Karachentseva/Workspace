package Projects.HW.HW7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HW7 {
    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }


    public static void writeNumOfPlayersPerTeam(GameType gameType, String text) {
        try {
            switch (gameType) {
                case SOCCER:
                case HOCKEY:
                case RUGBY:
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        File gameFile = new File(String.valueOf(gameType));
        try {
            gameFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter gameFileWriter = new FileWriter(String.valueOf(gameType));
            gameFileWriter.write(text);
            gameFileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

