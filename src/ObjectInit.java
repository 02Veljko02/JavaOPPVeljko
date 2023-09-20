public class ObjectInit {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(10, 15);
        AreaCalculator calculator = new AreaCalculator(apartment);
        System.out.println(calculator.ApartmentArea());
    }
}
