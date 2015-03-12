package entity.jboss;

import driver.Driver;
import entity.SoftwareProcessImpl;

public class JBossEntity extends SoftwareProcessImpl {

    @Override
    public Class<? extends Driver> getCloudFoundryDriver() {

        super.getCloudFoundryDriver();
        return (Class<? extends Driver>) JBossCloudFoundryDriver.class;
}

    @Override
    public Class<? extends Driver> getHerokuDriver() {
        super.getHerokuDriver();
        return (Class<? extends Driver>) JBossHerokuDriver.class;
    }

    @Override
    public Class<? extends Driver> getSshDriver() {
        super.getSshDriver();
        return (Class<? extends Driver>) JBossSshDriver.class;
    }

}
