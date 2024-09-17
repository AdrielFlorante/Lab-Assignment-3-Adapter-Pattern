public class TestApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopRC = new LaptopAdapter(laptop);

        System.out.println(laptopRC.plugIn());

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorRC = new RefrigeratorAdapter(refrigerator);

        System.out.println(refrigeratorRC.plugIn());

        SmartphoneCharger smartphone = new SmartphoneCharger();
        PowerOutlet smartphoneRC = new SmartphoneAdapter(smartphone);

        System.out.println(smartphoneRC.plugIn());
    }
}
