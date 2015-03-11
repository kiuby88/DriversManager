package location.paas;

import entity.SoftwareProcessImpl;

public class HerokuContainerLocation extends PaasMachineLocation{
    @Override
    public void findLocationDriverForEntity(SoftwareProcessImpl entity) {
        entity.getHerokuDriver();
    }
}
