package napoje;

public class Sok extends Napoje{
    private String smak;
    private String nazwa;

    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Sok(String smak) {
        this.smak = smak;
    }

    public String getSmak() {
        return smak;
    }

    public void setSmak(String smak) {
        this.smak = smak;
    }

    @Override
    public void pij() {
        super.pij();
        System.out.println("sok");
    }
}
