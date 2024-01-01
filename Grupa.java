import java.util.ArrayList;
import java.util.List;

public class Grupa
    {
    private static int globalGrupaID = 0;
    private final int numerGrupy;
    List<PrzynaleznoscGrupy> studenci;
    List<BlokZajec> blokiZajec;

    public Grupa()
        {
        numerGrupy = globalGrupaID++;
        }

    public void powiazanieStudenta(PrzynaleznoscGrupy student) {
        if (this.studenci.size() >= 20)
            {
            throw new RuntimeException("Grupa jest pełna");
            }
        studenci.add(student);
        }

        public void utworzGrupe(){

        }
    }
