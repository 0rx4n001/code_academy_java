package ls6;

public class hinQuslari extends Quslar{


    protected void hereket(){
        System.out.println("Hin quslari uca bilmir. Geze bilirler");
    }

    public void dispInfo(){
        super.dispInfo(true, false);
        this.hereket();
    }


}
