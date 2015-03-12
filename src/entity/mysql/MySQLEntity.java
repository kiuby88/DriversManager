package entity.mysql;

import driver.Driver;
import entity.SoftwareProcessImpl;
import entity.jboss.JBossCloudFoundryDriver;
import entity.jboss.JBossHerokuDriver;
import entity.jboss.JBossSshDriver;

public class MySQLEntity extends SoftwareProcessImpl {

    @Override
    public Class<? extends Driver> getCloudFoundryDriver() {

        super.getCloudFoundryDriver();
        return (Class<? extends Driver>) MySQLCloudFoundryDriver.class;
    }

    @Override
    public Class<? extends Driver> getHerokuDriver() {
        super.getHerokuDriver();
        return (Class<? extends Driver>) MySQLHerokuDriver.class;
    }

    @Override
    public Class<? extends Driver> getSshDriver() {
        super.getSshDriver();
        return (Class<? extends Driver>) MySQLSshDriver.class;
    }
}
