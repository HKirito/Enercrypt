import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.ConnectionInfo;
import ch.ethz.ssh2.Session;

public class SSH2RPMtest {

    private static Object ConnectionInfo;

    public static void main(String[] args) {
        try{
            Connection con = new Connection("rpm-ipaddress");
            ConnectionInfo = con.connect();
            boolean result = con.authenticateWithPassword("rpm-user","rpm-password");
            Session session = con.openSession();
            session.execCommand("command");//在此输入你的命令
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }

}
