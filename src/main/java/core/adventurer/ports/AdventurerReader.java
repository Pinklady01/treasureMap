package core.adventurer.ports;

import core.adventurer.models.Adventurer;

import java.util.Collection;

public interface AdventurerReader {

    Collection<Adventurer> findAll();

    Adventurer findById();

    String getResult(String id);
}
