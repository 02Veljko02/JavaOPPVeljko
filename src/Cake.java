public class Cake {
    private int price;
    private String flavor;

    public Cake(){
    }
    public Cake(String flavor){
        System.out.println(flavor);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public void cena(){
        System.out.println("Defaultna cena");
    }

}
