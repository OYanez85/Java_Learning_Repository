public void tester() {
    FileResource fr = new FileResource();
    CSVParser parser = fr.getCSVParser();

    System.out.println(countryInfo(parser, "Germany"));
    parser = fr.getCSVParser();
    listExportersTwoProducts(parser, "gold", "diamonds");
    parser = fr.getCSVParser();
    System.out.println("Number of exporters for gold: " + numberOfExporters(parser, "gold"));
    parser = fr.getCSVParser();
    bigExporters(parser, "$999,999,999");
}
