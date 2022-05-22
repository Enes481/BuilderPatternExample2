import java.applet.AudioClip;

public class Acenta {

    private Fabrika fabrika ;

    public BMW BMWTalebi(String model,String... istekler)
    {
        fabrika = new BMWFabrika();

        for(String istek:istekler)
        {
            fabrika.parcaEkle(istek);
        }
        return (BMW) fabrika.Uret(model);
    }

    public Audi AudiTalebi(String model, String... istekler)
    {
        fabrika = new AudiFabrika();

        for(String istek:istekler)
        {
            fabrika.parcaEkle(istek);
        }
        return (Audi) fabrika.Uret(model);
    }

}

