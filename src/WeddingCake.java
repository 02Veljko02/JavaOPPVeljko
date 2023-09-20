public class WeddingCake extends Cake {
    private String tiers;
    public WeddingCake(String flavor){
        System.out.println(flavor);
    }
    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
    @Override
    public void cena(){
        System.out.println("200e");
    }
}
