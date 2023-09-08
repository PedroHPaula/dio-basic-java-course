public class CensusSystem {
    public static void main(String[] args) {
        for (BrazilianState e: BrazilianState.values()) {
            System.out.println(e.getAbbreviation()+" - "+e.getUpperCaseName());
        }

        BrazilianState bs = BrazilianState.PIAUI;

        System.out.println(bs.getName());
    }
}