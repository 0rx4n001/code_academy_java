package ls6;

public class Quslar extends Animals{
    protected boolean dimdikli = true;
    protected boolean qanadli = true;
    protected void coxalma(){
        System.out.println("yumurta ile cogalir");
    }
    protected void nefesAlma(){
        System.out.println("agciyerleri ile nefes alir");
    }

    public void dispInfo(boolean dimdikli, boolean qanadli){
        coxalma();
        nefesAlma();
        if(dimdikli){
            System.out.println("Dimdikli");
        }else {
            System.out.println("Dimdiksiz");
        }
        if(qanadli){
            System.out.println("Qanadli");
        }else {
            System.out.println("Qanadsiz");
        }
    }
}
