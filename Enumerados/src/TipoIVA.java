public enum TipoIVA {
    IVAGENERAL(21), IVAR(4), IVASR(1), IVAG(40);

    TipoIVA(double porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }

    private double porcentajeIVA;
    public double getPorcentajeIVA() {
        return porcentajeIVA/100+1;
    }
}
