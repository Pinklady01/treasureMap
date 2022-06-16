package core.adventurer.models.orientation;

public record West() implements Orientation{
    @Override
    public Orientation goRight() {
        return new South();
    }

    @Override
    public Orientation goLeft() {
        return new North();
    }
}
