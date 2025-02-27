public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    public void setDataHP(String jenis, int tahun) {
        jenis_hp = jenis;
        tahun_pembuatan = tahun;
    }

    public String getJenisHP() {
        return jenis_hp;
    }

    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("Smartphone", 2023); // Memberikan nilai langsung
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan());
    }
}