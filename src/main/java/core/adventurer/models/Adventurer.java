package core.adventurer.models;

public record Adventurer(
        String name,
        Coordinates position,
        Orientation orientation,
        int treasures
) {

}
