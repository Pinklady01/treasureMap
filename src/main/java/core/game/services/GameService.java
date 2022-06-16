package core.game.services;

import core.game.models.AddFieldRequest;
import core.game.models.CreateAdventurerRequest;
import core.game.models.CreateMapRequest;
import core.game.models.HuntRequest;
import core.hunt.services.HuntService;

import java.util.Collection;

public class GameService {
    CommandParser commandParser;

    private final HuntService huntService = new HuntService();

    //TODO create constructor
    //TODO add outputWriter
    //injection de dépendances dans le constructeur


    public void executeAllRequests(Collection<HuntRequest> requestCollection){
        requestCollection.forEach(this::execute);
    }

    public void execute(HuntRequest request) {
        if (request instanceof CreateMapRequest) {
            //TODO huntService.createMap
            //TODO Change Request to enum
        } else if (request instanceof CreateAdventurerRequest) {
            //TODO huntService.createAdventurer
        } else if (request instanceof AddFieldRequest) {
            //TODO huntService.add
        }
    }

}
