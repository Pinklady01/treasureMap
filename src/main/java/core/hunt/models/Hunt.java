package core.hunt.models;

import core.adventurer.models.Adventurers;
import core.map.models.Map;

public record Hunt(
        Map map,
        Adventurers adventurers
) {

}
