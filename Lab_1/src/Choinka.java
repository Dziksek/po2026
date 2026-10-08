public class Choinka {
    public static void main(String[] args) {
        String wysokosc = args[0];
        int wysokosc2 = Integer.parseInt(wysokosc);
        for(int i=0; i<wysokosc2; i++){
            for(int a=0; a<=i;a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}