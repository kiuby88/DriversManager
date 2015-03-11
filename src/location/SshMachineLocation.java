package location;

import entity.SoftwareProcessImpl;

/**
 * Created by Jose on 11/03/15.
 */
public class SshMachineLocation implements MachineLocation{
    @Override
    public void findLocationDriverForEntity(SoftwareProcessImpl entity) {
        entity.getSshDriver();
    }
}
