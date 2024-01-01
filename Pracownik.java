import java.time.LocalDateTime;

public class Pracownik extends Uzytkownik {
    LocalDateTime zatrudnienie = LocalDateTime.now();
    int stawka = 0;

    public Pracownik(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, LocalDateTime zatrudnienie, int stawka) {
        super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel);
        this.zatrudnienie = zatrudnienie;
        this.stawka = stawka;
    }

    public void zatrudnij(LocalDateTime zatrudnienie, int stawka){
        this.stawka = stawka;
        this.zatrudnienie = zatrudnienie;
    }
}


