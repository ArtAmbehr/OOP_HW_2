public abstract class Animal {
    private int height;
    private int weight;
    private String еyeColor;

    protected Animal(int height, int weight, String еyeColor) {
        this.height = height;
        this.weight = weight;
        this.еyeColor = еyeColor;
    }

    public abstract void animalSay();

    @Override
    public String toString() {
        return String.format("Рост: %d; Вес: %d; Цвет глаз: %s", this.height, this.weight, this.еyeColor);
    }    
}
