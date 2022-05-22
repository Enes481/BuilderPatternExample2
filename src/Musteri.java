public class Musteri {

    public static void ArabaIstegi(int marka,String model,String... istek_parcalar )
    {
        Acenta acenta = new Acenta();

        switch (marka){
            case Markalar.AUDI:
                Audi audi = acenta.AudiTalebi(model,istek_parcalar);
                System.out.println(audi.toString());
                break;

            case Markalar.BMW:
                BMW bmw = acenta.BMWTalebi(model,istek_parcalar);
                System.out.println(bmw.toString());
                break;
        }
    }
}
