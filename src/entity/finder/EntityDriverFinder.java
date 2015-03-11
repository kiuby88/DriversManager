package entity.finder;

public interface EntityDriverFinder {

    public void getCloudFoundryDriver();
    public void getHerokuDriver();
    public void getSshDriver();

}
