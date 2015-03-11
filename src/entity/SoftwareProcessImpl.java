package entity;

import location.MachineLocation;

import javax.crypto.Mac;

/**
 * Created by Jose on 11/03/15.
 */
public class SoftwareProcessImpl implements Entity {


    @Override
    public void getCloudFoundryDriver() {
        showSelection("**CloudFoundry**");
    }

    @Override
    public void getHerokuDriver() {
        showSelection("**Heroku**      ");

    }

    @Override
    public void getSshDriver() {
        showSelection("**Ssh**         ");

    }

    private void showSelection(String st){
        System.out.println("Se selecciona el Driver de  " + st+ "  para la clase"+this.getClass());
    }


    public void startEffector(MachineLocation location){

        /*First, obtain the machine*/
        MachineLocation machine= obtain_setUp(location);

        this.initDriver(machine);

    }

    public void initDriver(MachineLocation machine){
        machine.findLocationDriverForEntity(this);
    }

    private MachineLocation obtain_setUp(MachineLocation location){
        return location;
    }
}
