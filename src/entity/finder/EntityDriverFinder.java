package entity.finder;

/**
 * Created by Jose on 11/03/15.
 */
public interface EntityDriverFinder {

    public void getCloudFoundryDriver();
    public void getHerokuDriver();
    public void getSshDriver();

}
