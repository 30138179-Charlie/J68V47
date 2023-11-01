public class L8E2 {
    public static void main(String[] args) {


        int[] scores = {78, 84, 65, 46, 90, 68, 87, 25, 100, 57};
        int total = 0;
        float avg = 0;
        for (int value :scores) {
            System.out.println(value);
            total = total + value;
            avg = (float)total / (float)scores.length;

        }
        System.out.println("the average score is " + Float.toString(avg));
    }
}
