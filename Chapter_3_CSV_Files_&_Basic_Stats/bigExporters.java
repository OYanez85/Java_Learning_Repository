public void bigExporters(CSVParser parser, String amount) {
    for (CSVRecord record : parser) {
        String value = record.get("Value (dollars)");
        if (value.length() > amount.length()) {
            System.out.println(record.get("Country") + " " + value);
        }
    }
}
