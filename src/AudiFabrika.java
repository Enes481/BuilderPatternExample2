public class AudiFabrika extends Fabrika{


    private Audi audi = new Audi();
    @Override
    public void parcaEkle(String parca) {
        audi.getOpsiyonel_parcalar().add(parca);
    }

    @Override
    public Araba Uret(String model) {
        audi.setModel(model);
        return audi;
    }
}
