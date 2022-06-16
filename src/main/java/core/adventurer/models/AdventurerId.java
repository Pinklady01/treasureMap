package core.adventurer.models;

import java.util.UUID;

public record AdventurerId(UUID value) {

    public AdventurerId(String value) {
        this(UUID.fromString(value));
    }
}
