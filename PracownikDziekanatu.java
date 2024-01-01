import java.time.LocalDateTime;
import java.util.List;

public class PracownikDziekanatu extends Pracownik
    {
    int dzial;
    String funkcjonalnosc;

    private Dziekanat dziekanat;
    List<Podanie> podania;
        public PracownikDziekanatu(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, LocalDateTime zatrudnienie, int stawka, int dzial, String funkcjonalnosc, Dziekanat dziekanat) {
            super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel, zatrudnienie, stawka);
            this.dzial = dzial;
            this.funkcjonalnosc = funkcjonalnosc;
            this.dziekanat = dziekanat;
        }

    }
