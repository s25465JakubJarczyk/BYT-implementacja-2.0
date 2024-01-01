import java.util.ArrayList;
import java.util.List;

public class Sala
    {
    List<BlokZajec> odybawajaSieW; // zajęcia odbywają się w danej sali (asocjacja)
    int numerSali;
    int IloscKomputerow;
    int IloscMiejsc;


    public Sala(int iloscKomputerow, int iloscMiejsc, int numerSali)
        {
        this.numerSali = numerSali;
        this.IloscKomputerow = iloscKomputerow;
        this.IloscMiejsc = iloscMiejsc;
        }

    }
