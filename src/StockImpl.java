public class StockImpl {
    public static void main(String[] args) {
        Stock obj = new Stock("ORCL","Oracle Corporation",34.5,34.35);

        double per = obj.getChangePercent();
        System.out.println("Price Change percentage " + per);
    }
}
