package location.paas;

import driver.Driver;
import entity.SoftwareProcessImpl;

public class HerokuContainerLocation extends PaasMachineLocation {
    @Override
    public Class<? extends Driver> findLocationDriverForEntity(SoftwareProcessImpl entity) {
        return entity.getHerokuDriver();
    }
}
