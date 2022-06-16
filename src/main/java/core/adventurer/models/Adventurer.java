package core.adventurer.models;

import core.adventurer.models.move.Movements;
import core.adventurer.models.orientation.Orientation;

import java.util.UUID;

public record Adventurer(
        UUID id,
        String name,
        Coordinate position,
        //previousPosition
        Orientation orientation,
        Movements moves,
        int treasures
) {

}
