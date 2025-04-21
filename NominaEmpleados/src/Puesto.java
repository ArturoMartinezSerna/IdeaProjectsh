public enum Puesto {
    AGENTE_SERVICIOS("001"), EMPLEADO_OFICINA("002"), DIRECTIVO("003");
    String codigoPuesto;
    Puesto(String codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }

    public static Puesto getPuesto(String codigoPuesto) {
        for (Puesto p : Puesto.values()) {
            if (p.codigoPuesto.equals(codigoPuesto)) {
                return p;
            }
        }
        return null;
    }
}
