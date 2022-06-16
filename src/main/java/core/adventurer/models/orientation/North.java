package core.adventurer.models.orientation;

public record North() implements Orientation{
    @Override
    public Orientation goRight() { return new East(); }

    @Override
    public Orientation goLeft() { return new West(); }
}
