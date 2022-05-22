public class Audi extends Araba {

    public String getModel()
    {
        return super.model;
    }

    public void setModel(String model)
    {
        super.model = model;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("AUDI %s \n\r",model));

        for(int i=0;i<=zorunlu_parcalar.size()-1;i++)
        {
            sb.append(zorunlu_parcalar.get(i)+"\n\r");
        }

        for(int i=0;i<=super.getOpsiyonel_parcalar().size()-1;i++)
        {
            sb.append(super.getOpsiyonel_parcalar().get(i)+"\n\r");
        }

        return sb.toString();
    }
}
