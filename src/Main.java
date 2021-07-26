public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

               double MyBmi = service.calculate(1.75,79.5);
        System.out.println(MyBmi);
    }
}

