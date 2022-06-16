package core.adventurer.models.orientation;

public record East() implements Orientation{
    @Override
    public Orientation goRight() {
        return new South();
    }

    @Override
    public Orientation goLeft() {
        return new North();
    }
}
