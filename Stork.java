public class Stork extends Bird implements BirdFly{

    protected Stork(int height, int weight, String eyeColor, int hightFly) {
        super(height, weight, eyeColor, hightFly);
    }

    @Override
    public void toFly() {
        System.out.printf("Я лечу на высоте %d метров", super.getHightFly());

        
    }

    @Override
    public void animalSay() {
        System.out.println("Аист что-то сказал на своем птичьем");
        
    }

    @Override
    public String toString() {
        return String.format("Аист; %s", super.toString());
    }
}
