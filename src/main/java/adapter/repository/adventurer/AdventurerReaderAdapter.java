package adapter.repository.adventurer;

import core.adventurer.models.Adventurer;
import core.adventurer.ports.AdventurerReader;

import java.util.Collection;

public class AdventurerReaderAdapter implements AdventurerReader {
    @Override
    public Collection<Adventurer> findAll() {
        return null;
    }

    @Override
    public Adventurer findById() {
        return null;
    }

    @Override
    public String getResult(String id) {
        return null;
    }
}
