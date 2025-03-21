public class HW3 {
    public static void main(String[] args) {
      double[] numbers = {12.5, 11.4, -14.2, 18.5, 9.5, -13.8, 17.3, 8.6, -9.9, 4.8, 3.4, 9.2, 7.4, 12.3, 16.4,};
      double sum = 0;
      int count = 0;

        for (int i = 0; i < numbers.length ; i++) {
            double num = numbers[i];

            if(num > 0) {
                sum += num;
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Среднее арифметическое число: " + (sum / count));
        }


    }









}
