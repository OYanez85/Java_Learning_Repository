public String countryInfo(CSVParser parser, String country) {
    for (CSVRecord record : parser) {
        String countryName = record.get("Country");
        if (countryName.equalsIgnoreCase(country)) {
            String exports = record.get("Exports");
            String value = record.get("Value (dollars)");
            return countryName + ": " + exports + ": " + value;
        }
    }
    return "NOT FOUND";
}
