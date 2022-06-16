package core.adventurer.models.orientation;

public record South() implements Orientation{
    @Override
    public Orientation goRight() {
        return new West();
    }

    @Override
    public Orientation goLeft() {
        return new East();
    }
}
