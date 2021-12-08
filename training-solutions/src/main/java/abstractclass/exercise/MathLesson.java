package abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise adder = new Adder();
        MathExercise subtracter = new Subtracter();
        MathExercise multiplier = new Multiplier();
        MathExercise divisor = new Divisor();
        System.out.println("5 + 7 = " + adder.getSolution(5, 7));
        System.out.println("5 - 7 = " + subtracter.getSolution(5, 7));
        System.out.println("5 * 7 = " + multiplier.getSolution(5, 7));
        System.out.println("5 / 7 = " + divisor.getSolution(5, 7));
    }
}
