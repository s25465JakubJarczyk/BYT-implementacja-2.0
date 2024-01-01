import java.time.LocalDateTime;

enum AccessLevel
    {
        FORBIDDEN, BASIC, ELEVATED, ROOT
    }

public class Administrator extends Pracownik {
    AccessLevel poziomDostepu;

    public Administrator(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, LocalDateTime zatrudnienie, int stawka, AccessLevel poziomDostepu) {
        super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel, zatrudnienie, stawka);
        this.poziomDostepu = poziomDostepu;
    }


    public void nadajUprawnienia(AccessLevel poziomDostepu) {
        this.poziomDostepu = poziomDostepu;
    }

}
