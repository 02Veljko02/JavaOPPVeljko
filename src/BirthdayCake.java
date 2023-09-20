public class BirthdayCake extends Cake{
    private String candles;
    public BirthdayCake(String flavor){
        System.out.println(flavor);
    }
    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }
    @Override
    public void cena(){
        System.out.println("100e");
    }



}
