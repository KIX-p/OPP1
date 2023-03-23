package napoje;

public class Woda_mineralna extends Napoje{
    private String jakascecha;
    private String nazwa;

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getJakascecha() {
        return jakascecha;
    }

    public void setJakascecha(String jakascecha) {
        this.jakascecha = jakascecha;
    }

    public Woda_mineralna(String jakascecha) {
        this.jakascecha = jakascecha;
    }

    @Override
    public void pij() {
        super.pij();
        System.out.println("woda_mineralna");
    }
}
