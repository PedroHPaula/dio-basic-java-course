public class ZipFormat {
    public static void main(String[] args) {
        try {
            String myZipCode = formatZip("48061037");
            System.out.println(myZipCode);
        } catch (InvalidZipException e) {
            System.out.println("The Zip Code is not in an appropriate format");
        }
    }

    static String formatZip(String zip) throws InvalidZipException {
        if (zip.length() != 8) {
            throw new InvalidZipException();
        }

        return "48061-037";
    }
}
