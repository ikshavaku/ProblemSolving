import java.util.Random;

class RandomNumberGenerator {
    public static void main(String[] args) {
        Random r = new Random();
        int x=50;
        while(x!=0){
            System.out.println(r.nextInt(2));
            x--;
        }
    }
}