import java.util.Random;

public class HW2 {
    public static String permission(int age, int temperature){
        String ResultData = ("Возраст человека: " + age + " " + "Температура на улице: " + temperature);
        System.out.println(ResultData);

        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature <= -10 && temperature >= 25)) {
            return "Можно идти гулять";
        } else
            return "Оставайтесь дома";
    }

    public static void main(String[] args) {
        System.out.println(permission(GenerateRandomAge(), 15));
        System.out.println(permission(GenerateRandomAge(), 27));
        System.out.println(permission(GenerateRandomAge(), 14));
        System.out.println(permission(GenerateRandomAge(), 17));
        System.out.println(permission(GenerateRandomAge(), 19));


    }

    public static int GenerateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }

}
