public class Tiger extends WildAmimal {

    protected Tiger(int height, int weight, String eyeColor, String place, String date) {
        super(height, weight, eyeColor, place, date);
    }

    @Override
    public void animalSay() {
        System.out.println("Тигр сказал - Ааагггррр");
        
    }

    @Override
    public String toString() {
        return String.format("Тигр; %s;", super.toString());
       }
    
}
