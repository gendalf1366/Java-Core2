package HumanCatRobot1;

public class Wall implements Obstacles{
    private int width;

    public Wall(int width) {
        this.width = width;
    }

    public void check(Runner runner) {
        runner.jump();
        runner.setSuccess(runner.getMaxWeight() >= width);
        if (runner.getSuccess()) {
            System.out.println("Прыгун " + runner.getName() + " выполнил испытание, перепрыгнув стену высотой: " + width);
        } else {
            System.out.println("Прыгун " + runner.getName() + " не перепрыгнул стену высотой: " + width);
        }
    }
}
