public class BmiService {
    public double calculate(double growth, double weight) {
        double Bmi;
        double growthSquared = growth * growth;

        Bmi = weight / growthSquared;

        return Bmi;
    }
}

