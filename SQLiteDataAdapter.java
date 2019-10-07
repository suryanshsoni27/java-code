import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDataAdapter implements IDataAdapter {

Connection conn = null;
    public int connect() {
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/hsoni/Desktop/comp3700/Assignment3_szs0177.db";
            // create a connection to the database
             conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return CONNECTION_OPEN_FAILED;
        }

        return CONNECTION_OPEN_OK;
    }



    public int disconnect() {
        try {
            conn.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
            return CONNECTION_CLOSE_FAILED; }
        return CONNECTION_CLOSE_OK;
    }

    public ProductModel loadProduct(int productID) {
        ProductModel product = new ProductModel();

        try {
            String sql1 = "SELECT*  FROM Products WHERE ProductId = " + productID;
            Statement stmt1 = conn.createStatement();
            ResultSet rs = stmt1.executeQuery(sql1);
            product.mProductID = rs.getInt("ProductId");
            product.mVendor = rs.getString("Supplier");
            product.mName = rs.getString("Name");
            product.mPrice = rs.getDouble("Pricee");
            //product.mQuantity = rs.getDouble("Quantityy");
            product.mTax = rs.getDouble("Taxx");



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return product;
    }


    public CustomerModel loadCustomer(int customerID) {
        CustomerModel customer = new CustomerModel();

        try {
            String sql = "SELECT Customerid, Name, Phone, Address, paymentinfo FROM customers WHERE Customerid = " + customerID;
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            customer.mCustomerId = rs.getInt("Customerid");
            customer.mNCame = rs.getString("Name");
            customer.mAddress= rs.getString("Address");
            customer.mPin = rs.getString("paymentinfo");
            customer.mPhone = rs.getString("Phone");




        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return customer;
    }
    public int saveProduct(ProductModel product) {
        try {
            String sql1 = "INSERT INTO Products VALUES " + product;
            System.out.println(sql1);
            Statement stmt1 = conn.createStatement();
            stmt1.executeUpdate(sql1);

        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
            if (msg.contains("UNIQUE constraint failed"))
                return PRODUCT_DUPLICATE_ERROR;
        }

        return PRODUCT_SAVED_OK;
    }



    public int saveCustomer(CustomerModel customer) {
        try {
            String sql = "INSERT INTO customers VALUES " + customer;
            System.out.println(sql);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            String msg = e.getMessage();
            System.out.println(msg);
            if (msg.contains("UNIQUE constraint failed"))
                return CUSTOMER_DUPLICATE_ERROR;
        }

        return CUSTOMER_SAVED_OK;
    }

}



