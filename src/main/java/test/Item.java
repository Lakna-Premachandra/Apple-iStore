
package test;

public class Item {

    private String ItemCode;
    private String ItemName;
    private int ItemPrice;
    private String ItemType;
  
    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the ItemName
     */
    
    public String getItemName() {
        return ItemName;
    }

    /**
     * @param ItemName the ItemName to set
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }
    /**
     * @return the ItemPrice
     */
    public int getItemPrice() {
        return ItemPrice;
    }

    /**
     * @param ItemPrice the ItemPrice to set
     */
    public void setItemPrice(int ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    /**
     * @return the ItemType
     */
    public String getItemType() {
        return ItemType;
    }

    /**
     * @param ItemType the ItemType to set
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }
    
   public Item(){
     
}

    Item(String ItemCode, String ItemName, String ItemPrice, String ItemType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
