public class CurrencyConverter {
    private static final double EXCHANGE_RATE = 74.5; // Exchange rate from dollars to rupees

    /**
     * Converts the given amount from dollars to rupees.
     *
     * @param dollars The amount in dollars to convert
     * @return The equivalent amount in rupees
     */
    public double convertDollarsToRupees(double dollars) {
        return dollars * EXCHANGE_RATE;
    }
}
