public class Array_Part1_T1 {

    public static void update(int marks[]) {
        
        for (int i = 0; i < marks.length; i++) {

            marks[i] = marks[i] + 2;
        }
    }

    public static void main(String[] args) {

        // - Array as Function Arguments

        int marks[] = { 55, 56, 57, 58, 59, 60 };

        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }

}
