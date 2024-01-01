import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Student extends Uzytkownik
    {
    private final String kontoWplat;
    private final int rok;
    List<Ocena> listaOcen;
    List<PrzynaleznoscGrupy> przynaleznosci;
    List<ProgramStudiow> programyStudiów;
    private ProfilStudenta Profil;


    public Student(String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, String kontoWplat, int rok)
        {
        super(adres, imie, nazwisko, nrTel, obywatelstwo, pesel);
        this.kontoWplat = kontoWplat;
        this.rok = rok;
        }

    public static Student dodawanieNowegoStudenta(
            String adres, String imie, String nazwisko, String nrTel, String obywatelstwo, String pesel, String kontoWplat, Grupa domyslnaGrupa
    )
        {
        int rok = Year.now().getValue();

        var student = new Student(
                adres,
                imie,
                nazwisko,
                nrTel,
                obywatelstwo,
                pesel,
                kontoWplat,
                rok
        );

        student.przynaleznosci.add(new PrzynaleznoscGrupy(student, domyslnaGrupa));

        return student;
        }

    }
