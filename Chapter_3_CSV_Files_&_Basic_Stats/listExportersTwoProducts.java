public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2) {
    for (CSVRecord record : parser) {
        String exports = record.get("Exports");
        if (exports.contains(exportItem1) && exports.contains(exportItem2)) {
            System.out.println(record.get("Country"));
        }
    }
}
