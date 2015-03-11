package entity;

import entity.finder.EntityDriverFinder;
import location.MachineLocation;

/**
 * Created by Jose on 11/03/15.
 */
public interface Entity extends EntityDriverFinder {

    public void startEffector(MachineLocation location);
}
