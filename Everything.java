package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test all methods
    Warehouse warehouse = new Warehouse();
        int numProductDescrip = StdIn.readInt();
        int counter = 0;

        while (counter < numProductDescrip ){
            String temp = StdIn.readString();
            if(temp.equals("add")){
                int currentDay = StdIn.readInt();
                int productId = StdIn.readInt();
                String productName = StdIn.readString();
                int initProdStock = StdIn.readInt();
                int initProdDemand = StdIn.readInt();

                warehouse.addProduct(productId, productName, initProdStock, currentDay, initProdDemand);
            }
            else if(temp.equals("restock")){
                int idn = StdIn.readInt();
                int amountNumber = StdIn.readInt();
                warehouse.restockProduct(idn, amountNumber);
            }
            else if(temp.equals("delete")){
                int idn = StdIn.readInt();
                warehouse.deleteProduct(idn);
            }
            else if(temp.equals("purchase")){
                int day = StdIn.readInt();
                int idn = StdIn.readInt();
                int amount = StdIn.readInt();
                warehouse.purchaseProduct(idn, day, amount);
            }
            counter++;
        }
        StdOut.print(warehouse);
    }
}
