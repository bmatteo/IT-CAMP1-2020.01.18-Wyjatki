package pl.camp.it;

public class App2 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i%3 == 2) {
                break;
            }

            System.out.println(i);
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i%3 == 2) {
                continue;
            }

            System.out.println(i);
        }
    }
}
