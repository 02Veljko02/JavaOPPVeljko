public class Farm {
    public static void main(String[] args) {
        Animal duck = new Duck();

        Animal pig = new Pig();

        jede(duck);
    }
    public static void jede(Animal animal){
        if(animal instanceof Duck){
            System.out.println("leba");
        } else if (animal instanceof Pig) {
            System.out.println("kukuruz");

        }
    }
}
