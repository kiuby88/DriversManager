package location.paas;

import entity.SoftwareProcessImpl;

public class CloudFoundryContainerLocation extends PaasMachineLocation {
    @Override
    public void findLocationDriverForEntity(SoftwareProcessImpl entity) {
        entity.getCloudFoundryDriver();
    }

}
