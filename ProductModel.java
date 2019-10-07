public class ProductModel {
    public int mProductID;
    public String mName, mVendor;
    public double mPrice,mTax;
    public double mQuantity;

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(mProductID).append(",");
        sb.append("\"").append(mVendor).append("\"").append(",");
        sb.append("\"").append(mName).append("\"").append(",");
        sb.append(mPrice).append(",");
        sb.append(mQuantity).append(",");
        sb.append(mTax).append(")");
        return sb.toString();
    }
}

