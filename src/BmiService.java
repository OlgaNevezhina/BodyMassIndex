public class BmiService {
    public float calculate (float mass, float height) {
        float BMI = (float) (mass / Math.pow(height, 2));
        return BMI;
    }
}
