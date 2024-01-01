import java.util.ArrayList;
import java.util.List;

public class Przedmiot
    {
    private static int GlobalId = 0;
    private final int Id;
    private final String Nazwa;
    private final int Semestr;
    List<Test> egzaminyKolokwia;
    List<KierunekStudiow> kierunekiStudiow;
    List<BlokZajec> blokiZajec;
    private Wykladowca prowadzacy;


    public Przedmiot(String Nazwa, int Semestr)
        {
        this.Id = GlobalId++;
        this.Nazwa = Nazwa;
        this.Semestr = Semestr;
        }

    public void WstawianiaZaliczeniaPrzedmiotow()
        {
        return;
        }
    }
