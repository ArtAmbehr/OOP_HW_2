public abstract class HomeAnimal extends Animal implements Home {
    private String name;
    private String breed;
    private String vaccination;
    private String color;
    private String birthDate;


    protected HomeAnimal(String name, String breed, String vaccination, String color, String birthDate, int height, int weight, String eyeColor) {
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.color = color;
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return String.format(
            "Имя: %s; Порода: %s; Наличие прививок: %s; Цвет шерсти: %s; Дата рождения: %s; %s;", 
            this.name, this.breed, this.vaccination, this.color, this.birthDate, super.toString());
    }

    @Override
    public abstract void caressing();

    @Override
    public abstract void animalSay();

}
