public int numberOfExporters(CSVParser parser, String exportItem) {
    int count = 0;
    for (CSVRecord record : parser) {
        String exports = record.get("Exports");
        if (exports.contains(exportItem)) {
            count++;
        }
    }
    return count;
}
