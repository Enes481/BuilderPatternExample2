import java.util.ArrayList;

public abstract class Araba {

    protected ArrayList<String> zorunlu_parcalar;
    private ArrayList<String> opsiyonel_parcalar;
    protected String model;

    public ArrayList<String> getOpsiyonel_parcalar() {
        return opsiyonel_parcalar;
    }

    public void setOpsiyonel_parcalar(ArrayList<String> opsiyonel_parcalar) {
        this.opsiyonel_parcalar = opsiyonel_parcalar;
    }

    public Araba()
    {
        String zs[] = new String[]{"Rotil"
        ,"salınacak","egzantirik mili","krank mili","radyatör","buji","tekerlek","egzos","direksiyon","pedal","motor"};

        zorunlu_parcalar = new ArrayList<String>();

        for(int i=0;i<=zs.length;i++)
            zorunlu_parcalar.add(zs[i]);

        opsiyonel_parcalar = new ArrayList<String>();
    }
}
