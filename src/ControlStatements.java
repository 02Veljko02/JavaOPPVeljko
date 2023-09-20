public class ControlStatements {
    public static void main(String[] args) {
  //      System.out.println(imeiprezime("Veljko", "Jovkovic"));

        int [] x = {1,2,3,4};
        int y = 0;
        for(y = 0; y < x.length; y++) {

     //       if(x[y] == 3) {
      //          continue;
      //      }
     //   System.out.println(x[y]);
        }
        while(x.length > y){
      //      System.out.println(x[y]);
            y++;
        }
        parni(21);
    }

    public static int sumadvabroja(int a, int b){
        return a + b;
    }

    public static String imeiprezime(String ime, String prezime) {
        return ime + " " + prezime;
    }

    public static String tekst(int a, int b){
        if(a>b){
           return "vece";
        }
        else {
            return "manje";
        }

    }
     public static void parni(int maxNumber){
       for(int i = 1;i<=maxNumber; i++){
            if (i%2==0) {
                if (i == 4 || i == 6){
                continue;
            }
                System.out.println(i);
            }



        }
     }
}
