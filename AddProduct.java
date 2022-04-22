package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test addProduct
        Warehouse warehouse = new Warehouse();
        int numProductDescrip = StdIn.readInt();
        int counter = 0;

        while (counter < numProductDescrip ){
            
            int currentDay = StdIn.readInt();
            int productId = StdIn.readInt();
            String productName = StdIn.readString();
            int initProdStock = StdIn.readInt();
            int initProdDemand = StdIn.readInt();

            warehouse.addProduct(productId, productName, initProdStock, currentDay, initProdDemand);
        
            counter++;
        }

        
        StdOut.print(warehouse);

    }
}
