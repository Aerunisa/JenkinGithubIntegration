public class Number {
    public static void main(String args[]) {
<<<<<<< HEAD
      System.out.println("Hello Aeru These are prime number from 1 up to 100");
=======
      System.out.println("Hello Aeru Yhese are Prime Number from 1 up to 100");
>>>>>>> 9e1706530b38abaee63d972975eb299ddbae1ffa
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
