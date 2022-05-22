public class BMWFabrika extends Fabrika{

    private BMW bmw = new BMW();
    @Override
    public void parcaEkle(String parca) {
        bmw.getOpsiyonel_parcalar().add(parca);
    }

    @Override
    public Araba Uret(String model) {
        bmw.setModel(model);
        return bmw;
    }
}
