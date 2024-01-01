import java.util.ArrayList;
import java.util.List;

public class ProfilStudenta
    {
    private static int GlobalId = 0;
    private final int Id;
    private final String Email;
    private final String Haslo;
    List<Podanie> podania;
    List<Platnosc> platnosci;
    private Student student;

    public ProfilStudenta(String Email, String Haslo)
        {
        this.Id = GlobalId++;
        this.Email = Email;
        this.Haslo = Haslo;
        }

    public boolean Logowanie(String haslo)
        {
        return true;
        }

    }
