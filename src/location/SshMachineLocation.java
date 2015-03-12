package location;

import driver.Driver;
import entity.SoftwareProcessImpl;

public class SshMachineLocation implements MachineLocation {
    @Override
    public Class<? extends Driver> findLocationDriverForEntity(SoftwareProcessImpl entity) {
        return entity.getSshDriver();
    }
}
