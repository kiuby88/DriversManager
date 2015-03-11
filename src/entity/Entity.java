package entity;

import entity.finder.EntityDriverFinder;
import location.MachineLocation;

public interface Entity extends EntityDriverFinder {

    public void startEffector(MachineLocation location);
}
