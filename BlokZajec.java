import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BlokZajec
    {
    Grupa grupa;
    Przedmiot przedmiot;
    LocalDateTime Poczatek;
    LocalDateTime Koniec;
    boolean Zdalnie;
    List<Sala> sale; // blok może odbywać się w kilku salach, przykładowo WSI na PJATK
    private PlanZajec planZajec;
    List<Wykladowca> wykladowcy; // do bloku zjaęć może być przypisanych kilku prowadzących - przykład WSI na PJATK

    public BlokZajec(Przedmiot przedmiot, LocalDateTime poczatek, boolean zdalnie)
        {
        this.przedmiot = przedmiot;
        this.Poczatek = poczatek;
        this.Koniec = getKoniec();
        this.Zdalnie = zdalnie;
        }

    LocalDateTime getKoniec()
        {
        return this.Poczatek.plusMinutes(90);
        }

    }
