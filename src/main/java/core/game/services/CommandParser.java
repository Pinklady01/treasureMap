package core.game.services;

import core.game.models.HuntRequest;

import java.util.Collection;

public interface CommandParser {

    Collection<HuntRequest> parseCommands();
}
