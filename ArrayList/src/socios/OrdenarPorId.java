package socios;

import java.util.Comparator;

public class OrdenarPorId implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Socio) o1).id() - ((Socio) o2).id();
    }
}
