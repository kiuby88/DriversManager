package location;

import driver.Driver;
import entity.SoftwareProcessImpl;

public interface MachineLocation {

    public Class<? extends Driver> findLocationDriverForEntity(SoftwareProcessImpl entity);
}
