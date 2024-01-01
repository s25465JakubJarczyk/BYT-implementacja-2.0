import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Test
    {
    private static int GlobalId = 0;
    private final int Id;
    List<Student> studenci;
    List<Przedmiot> przedmioty;
    private LocalDateTime Data;
    private String Tresc;
    private Wykladowca wykladowca;
    List<Ocena> oceny;

    public Test(LocalDateTime Data, String Tresc)
        {
        this.Id = GlobalId++;
        this.Data = Data;
        this.Tresc = Tresc;
        }

    public void PisanieEgzaminowIKolokwiow(String tresc)
        {
        this.Tresc += tresc;
        }

    public Test TworzenieEgzaminu(LocalDateTime Data, String Tresc)
        {
        return new Test(Data, Tresc);
        }

    public void UstalanieTerminowEgzaminuKolokwiow(LocalDateTime time)
        {
        this.Data = time;
        }
    }
