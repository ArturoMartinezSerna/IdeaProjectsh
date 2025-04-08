package socios;

import java.util.Comparator;

public class OrdenarPorFecha implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Socio) o1).fechaNacimiento().compareTo(((Socio) o2).fechaNacimiento());
    }
}
