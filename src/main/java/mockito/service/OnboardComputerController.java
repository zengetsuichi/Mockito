package mockito.service;

import mockito.interfaces.RoofController;
import mockito.interfaces.SpeedSensor;

public class OnboardComputerController {

    private SpeedSensor speedSensor;
    private RoofController roofController;

    public OnboardComputerController(SpeedSensor speedSensor, RoofController roofController) {
        this.speedSensor = speedSensor;
        this.roofController = roofController;
    }

    public void closeRoof() {
        double speed = speedSensor.getSpeed();

        if (speed <= 30) {
            roofController.close();
        } else {
            throw new IllegalArgumentException("blad");
        }
    }

    public void openRoof() {
        double speed = speedSensor.getSpeed();

        if (speed <= 30) {
            roofController.open();
        } else {
            System.out.println("dupa");
        }
    }
}
