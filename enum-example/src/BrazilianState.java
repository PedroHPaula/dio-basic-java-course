public enum BrazilianState {
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI("PI", "Piauí"),
    MARANHAO("MA", "Maranhão"),
    CEARA("CE", "Ceará"),
    ;

    private String name;
    private String abbreviation;

    private BrazilianState(String abbreviation, String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public String getUpperCaseName() {
        return name.toUpperCase();
    }
}
