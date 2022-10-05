package eyo;

public class HandPhone {
    String Jenis_Hp;
    int Tahun_Pembuaatan;
    public void setDataHP(String Jenis_Hp, int Tahun_Pembuaatan){
        this.Jenis_Hp=Jenis_Hp;
        this.Tahun_Pembuaatan=Tahun_Pembuaatan;
    }

    String getJenisHp(){
        return this.Jenis_Hp;
    }

    int getTahunPembuatan(){
        return this.Tahun_Pembuaatan;
    }

    public static void main(String[] args) {
        HandPhone hp=new HandPhone();
        hp.setDataHP("Realme", 2021);
        System.out.println(hp.getJenisHp());
        System.out.println(hp.getTahunPembuatan());
    }
}





