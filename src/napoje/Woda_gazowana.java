package napoje;

public class Woda_gazowana extends Napoje {
    private String moc_gazu;
    private String nazwa;

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Woda_gazowana(String moc_gazu) {
        this.moc_gazu = moc_gazu;
    }

    public String getMoc_gazu() {
        return moc_gazu;
    }

    public void setMoc_gazu(String moc_gazu) {
        this.moc_gazu = moc_gazu;
    }

    @Override
    public void pij() {
        super.pij();
        System.out.println("woda_gazowana");
    }
}
