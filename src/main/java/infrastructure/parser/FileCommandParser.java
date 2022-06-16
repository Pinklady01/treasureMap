package infrastructure.parser;

import core.game.models.HuntRequest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import core.game.services.CommandParser;

public class FileCommandParser implements CommandParser {

    @Override
    public Collection<HuntRequest> parseCommands(){
        Collection<HuntRequest> huntRequests = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/treasureMap.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    huntRequests.add(parseString(line));
                }
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return huntRequests;
    }

    public HuntRequest parseString(String txt){
        return null;
    }
}
