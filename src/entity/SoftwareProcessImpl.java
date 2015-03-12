package entity;

import driver.Driver;
import location.MachineLocation;

public class SoftwareProcessImpl implements Entity {


    @Override
    public Class<? extends Driver> getCloudFoundryDriver() {

        showSelection("**CloudFoundry**");
        return Driver.class;
    }

    @Override
    public Class<? extends Driver> getHerokuDriver() {
        showSelection("**Heroku**      ");
        return Driver.class;
    }

    @Override
    public Class<? extends Driver> getSshDriver() {
        showSelection("**Ssh**         ");
        return Driver.class;
    }


    private void showSelection(String st) {
        System.out.println("Se selecciona el Driver de  " + st + "  para la clase" + this.getClass());
    }


    public void startEffector(MachineLocation location) {

        /*First, obtain the machine*/
        MachineLocation machine = obtain_setUp(location);
        this.initDriver(machine);

    }

    public void initDriver(MachineLocation machine) {
        Class<? extends Driver> driver = null;
        driver = machine.findLocationDriverForEntity(this);
        System.out.println("*Selected Driver Class: " + driver);
        System.out.println();
    }

    private MachineLocation obtain_setUp(MachineLocation location) {
        return location;
    }
}
