public abstract class WildAmimal extends Animal{
    private String place;
    private String date;

    protected WildAmimal(int height, int weight, String eyeColor, String place, String date) {
        super(height, weight, eyeColor);
        this.place = place;
        this.date = date;
    }
    
    @Override
    public abstract void animalSay();

    @Override
    public String toString() {
        return String.format("Место Обитания: %s; Дата нахождения: %s; %s", 
        this.place, this.date, super.toString());
    }
}
