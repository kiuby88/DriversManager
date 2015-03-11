package location;

import entity.SoftwareProcessImpl;

public class SshMachineLocation implements MachineLocation{
    @Override
    public void findLocationDriverForEntity(SoftwareProcessImpl entity) {
        entity.getSshDriver();
    }
}
