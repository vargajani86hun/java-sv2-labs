package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter {
    @Override
    public String writeBill(List<String> billItems) {
        if (billItems == null || billItems.isEmpty()) {
            throw new IllegalStateException("There's no bill items!");
        }
        StringBuilder sb = new StringBuilder();
        for (String actual : billItems) {
            sb.append(toStringBillItem(actual)).append("\n");
        }
        return sb.toString();
    }

    private String toStringBillItem(String billItem) {
        StringBuilder sb = new StringBuilder();
        String[] items = billItem.split(";");
        sb.append(items[0]).append(", ");
        sb.append(items[2]).append(" * ");
        sb.append(items[1]).append(" = ");
        sb.append(Integer.parseInt(items[1]) * Integer.parseInt(items[2]));
        sb.append(" Ft");
        return sb.toString();
    }
}
