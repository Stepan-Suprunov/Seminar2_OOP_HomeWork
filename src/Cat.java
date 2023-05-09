public class Cat {

    private String name;
    private int appetite;

    private boolean satiety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        if (appetite > 0)
            this.appetite = appetite;
        else this.appetite = 1;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.setFood(plate.getFood() - appetite);
            appetite = 0;
            satiety = true;
            System.out.println("Кот " + name + " покушал и сыт.");
        } else System.out.println("Кот " + name + " остася голодным. В тарелке не хватило еды.");
    }
}
