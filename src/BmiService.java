public class BmiService {
    public float calculate (float mass, float height) {
        float bmi = (float) (mass / Math.pow(height, 2));
        return bmi;
    }
}
