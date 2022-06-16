package core.adventurer.ports;

import core.adventurer.models.Adventurer;

public interface AdventurerWriter {

    Adventurer add();

    void doMoves();
}
