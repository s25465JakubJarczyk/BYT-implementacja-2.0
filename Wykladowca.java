import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Wykladowca extends Uzytkownik
    {
    private static int GlobalId = 0;
    private final int Id;
    private final LocalDateTime DataZatrudnienia;
    private final int StawkaGodzinowa;
    private final String TytulNaukowy;
    List<Test> testy;
    List<Przedmiot> przedmioty;
    List<BlokZajec> blokiZajec;
    List<String> Certyfikaty;

    public Wykladowca(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, List<String> Certyfikaty, LocalDateTime DataZatrudnienia, int StawkaGodzinowa, String TytulNaukowy)
        {
        super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel);
        this.Id = GlobalId++;
        this.Certyfikaty = Certyfikaty;
        this.DataZatrudnienia = DataZatrudnienia;
        this.StawkaGodzinowa = StawkaGodzinowa;
        this.TytulNaukowy = TytulNaukowy;
        }


    }
