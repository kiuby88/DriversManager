import entity.Entity;
import entity.jboss.JBossEntity;
import entity.mysql.MySQLEntity;
import location.MachineLocation;
import location.SshMachineLocation;
import location.paas.CloudFoundryContainerLocation;
import location.paas.HerokuContainerLocation;

public class Main {

    public static void main(String[] args) {

        MachineLocation cloudFoundryContainer = new CloudFoundryContainerLocation();
        MachineLocation herokuContainer = new HerokuContainerLocation();
        MachineLocation sshMachine = new SshMachineLocation();

        Entity jbossEntity = new JBossEntity();
        Entity mySQLEntity = new MySQLEntity();


        /*TEST-JBoss*/
        System.out.println("Calling to JBoss ** ");
        jbossEntity.startEffector(cloudFoundryContainer);
        jbossEntity.startEffector(herokuContainer);
        jbossEntity.startEffector(sshMachine);
        System.out.println();
        System.out.println();


        /*TEST-MYSQL*/
        System.out.println("Calling to MySQL ** ");
        mySQLEntity.startEffector(cloudFoundryContainer);
        mySQLEntity.startEffector(herokuContainer);
        mySQLEntity.startEffector(sshMachine);
    }
}
