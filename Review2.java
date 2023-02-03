
public class Review2 {

    public static void main(String[] args) {
        // iの値が1から101より小さい間、処理を繰り返す
        for (int i = 1; i < 101; i++) {
            //　iの値が 3 で割り切れ、5で割り切れる時
            if (i % 3 == 0 && i % 5 == 0) {
                // FizzBuzzと表示する
                System.out.println("i =" + "FizzBuzz");}
            //iの値が 3 で割り切れる時
            else if (i % 3 == 0) {
                // Fizzを表示する
                 System.out.println("i =" + "Fizz");}
            //iの値が 5 で割り切れる時
            else if (i % 5 == 0) {
                // Buzzを表示する
                 System.out.println("i =" + "Buzz");}
            //それ以外の時、その数をそのまま表示する
            else {
                System.out.println("i =" + i);
            }

        }
}
}
