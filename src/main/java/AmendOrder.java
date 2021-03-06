public class AmendOrder extends NewOrder {
    private String origClOrderId;

    AmendOrder(String symbol, Side side, int quantity, double price, String clientOrderId, String newClientOrderId) {
        super(symbol, side, quantity, price, newClientOrderId);
        origClOrderId = clientOrderId;
    }

    public String getOrigClOrderId() {
        return origClOrderId;
    }

    public void setOrigClOrderId(String origClOrderId) {
        this.origClOrderId = origClOrderId;
    }

}