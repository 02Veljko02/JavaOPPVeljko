public class Apartment {
    private static int height;
    private static int width;
    private static  int lenght;

      int getHeight() {
        return height;
    }

      void setHeight(int height) {

          Apartment.height = height;
    }

      int getWidth() {
        return width;
    }

      void setWidth(int width) {
        Apartment.width = width;
    }

      int getLenght() {
        return lenght;
    }

      void setLenght(int lenght) {
        Apartment.lenght = lenght;
    }
    public Apartment(int width, int height){
        setHeight(height);
        setWidth(width);
    }


}
