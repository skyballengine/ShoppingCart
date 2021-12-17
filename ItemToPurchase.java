public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity
   private String itemName;
   private int itemPrice;
   private int itemQuantity;
   

   /*Default Constructor
    itemName - Initialized to "none"
    itemPrice - Initialized to 0
    itemQuantity - Initialized ito 0
   */
   public ItemToPurchase() {
      this.itemName = "";
      this.itemPrice = 0;
      this.itemQuantity = 0;
   }
    
   //public member methods (mutators & accessors)
   
   //setName() & getName() 
   public void setName(String newName) {
      itemName = newName;
   }
      
   public String getName() {
      return this.itemName;
   }
   //setPrice() & getPrice() 
   public void setPrice(int newPrice) {
      itemPrice = newPrice;
   }
   
   public int getPrice() {
      return this.itemPrice;
   }
   
   //setQuantity() & getQuantity() 
   public void setQuantity(int newQuantity) {
      itemQuantity = newQuantity;
   }
   
   public int getQuantity() {
      return this.itemQuantity;
   }
   
   //print item to purchase
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}



