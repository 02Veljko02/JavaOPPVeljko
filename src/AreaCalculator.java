public class AreaCalculator {
    public Apartment apartment;

    public AreaCalculator(Apartment apartment){
        this.apartment = apartment;
    }
    public int ApartmentArea(){
        return this.apartment.getHeight() * this.apartment.getWidth();
    }
}
