public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 85;
        float height = 1.65f;
        float BMI = service.calculate(85, 1.65f);
        System.out.println(BMI);
    }
}
