public class Number {
    public static void main(String args[]) {
      System.out.println("Hello Aeru These are prime number from 1 up to 100");
        for (int i=1; i<100; i++){
            boolean prima = true;
            for (int j=2; j<i ; j++){
                if (i % j == 0){
                    prima = false;
                }
            }
            if(prima)
            System.out.println(i);
        }
    }
}
