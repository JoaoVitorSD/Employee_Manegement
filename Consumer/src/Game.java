public class Game {
    private String name;
    private Double price;
    public Game(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public void increasePrice() {
        price *= (1.1);
    }
    @Override
    public String toString() {
        return name+", "+price;
    }
    public void print(){
        System.out.printf("%s, %.2f\n",name,price);
    }
}
