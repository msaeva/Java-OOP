package OOPExams.glacialExpedition.models.suitcases;

import java.util.Collection;

public class Carton implements Suitcase{
    private Collection<String> exhibits;

    @Override
    public Collection<String> getExhibits() {
        return this.exhibits;
    }
}
