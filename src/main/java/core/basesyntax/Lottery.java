package core.basesyntax;
import java.util.Random;

public class Lottery {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    static final int max_balls = 100;

    public Ball getRandomBall() {
        Ball ball = new Ball();
        random.nextInt(100);
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(random.nextInt(max_balls));
        return ball;
    }
}
