import javax.swing.undo.CannotUndoException;

public class StoreManager {
    IDataAdapter adapter = null;
    private static StoreManager instance = null;

    public static StoreManager getInstance() {
        if (instance == null)
            instance = new StoreManager("SQLite");
        return instance;
    }

    private StoreManager(String db) {
        if (db.equals("Oracle"))
            adapter = new OracleDataAdapter();
        else
        if (db.equals("SQLite"))
            adapter = new SQLiteDataAdapter();

        adapter.connect();
        ProductModel product = adapter.loadProduct(3);
        CustomerModel customer = adapter.loadCustomer( 3 );

        System.out.println("Loaded product: " + product);
        System.out.println("Loaded Customer: " + customer);

    }

    public IDataAdapter getDataAdapter() {
        return adapter;
    }

    public void setDataAdapter(IDataAdapter a) {
        adapter = a;
    }

    public static void main(String[] args) {
        System.out.println("Hello class!");
        AddProductUI ap = new AddProductUI();
        AddCustomerUI cp = new AddCustomerUI();
        ap.run();
        cp.run();


    }

}