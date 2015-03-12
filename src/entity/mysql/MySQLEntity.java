package entity.mysql;

import driver.Driver;
import entity.SoftwareProcessImpl;

public class MySQLEntity extends SoftwareProcessImpl {

    @Override
    public Class<? extends Driver> getCloudFoundryDriver() {

        super.getCloudFoundryDriver();
        return (Class<? extends Driver>) MySQLCloudFoundryDriver.class;
    }

    @Override
    public Class<? extends Driver> getHerokuDriver() {
        System.out.println("**Exception**. Heroku is not supported by MySQL.");
        return null;
    }

    @Override
    public Class<? extends Driver> getSshDriver() {
        super.getSshDriver();
        return (Class<? extends Driver>) MySQLSshDriver.class;
    }
}
