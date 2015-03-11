import entity.Entity;
import entity.JBossEntity;
import entity.MySQLEntity;
import location.CloudFoundryContainerLocation;
import location.HerokuContainerLocation;
import location.MachineLocation;
import location.SshMachineLocation;

public class Main {

    public static void main(String[] args) {


        MachineLocation cloudFoundryContainer= new CloudFoundryContainerLocation();
        MachineLocation herokuContainer = new HerokuContainerLocation();
        MachineLocation sshMachine = new SshMachineLocation();

        Entity jbossEntity = new JBossEntity();
        Entity mySQLEntity = new MySQLEntity();

        /*Llamadas a JBoss desde las distintas localizaciones*/
        System.out.println("Llamadas a JBoss ** ");
        jbossEntity.startEffector(cloudFoundryContainer);
        jbossEntity.startEffector(herokuContainer);
        jbossEntity.startEffector(sshMachine);

        System.out.println();
        System.out.println();


        /*Llamadas a JBoss desde las distintas localizaciones*/
        System.out.println("Llamadas a MySQL ** ");
        mySQLEntity.startEffector(cloudFoundryContainer);
        mySQLEntity.startEffector(herokuContainer);
        mySQLEntity.startEffector(sshMachine);







    }
}