public class Bicycle extends Transport {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки велосипеда");
    }

    @Override
    public void transportService() {
        updateTyre();
    }
}