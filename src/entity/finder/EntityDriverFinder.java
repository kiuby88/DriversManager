package entity.finder;

import driver.Driver;

public interface EntityDriverFinder {

    public Class<? extends Driver> getCloudFoundryDriver();
    public Class<? extends Driver> getHerokuDriver();
    public Class<? extends Driver> getSshDriver();

}
