package question5;

public class Product {

	
	private String productID;
	
	private String productName;
	
	private String productCategory;
	
	private double price;
	
	private int stock;
	
	private ProductStatus productStatus;

	public Product(String productID, String productName, String productCategory, double price, int stock) {
		this.productID = productID;
		this.productName = productName;
		this.productCategory = productCategory;
		this.price = price;
		this.stock = stock;
		
		this.productStatus = stock > 0 ? ProductStatus.AVAILABLE : ProductStatus.OUT_OF_STOCK;
	}

	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public ProductStatus getProductStatus() {
		return productStatus;
	}
	
	
	public void reduceStock(int quantity) throws OutOfStockException{
		if (quantity > stock) {
			throw  new OutOfStockException("Stock not Available");
		}
		
		stock -= quantity;
		
		if(stock  == 0 ) {
			productStatus = ProductStatus.OUT_OF_STOCK;
		}
	}
	
	public void addStock(int quantity) {
		
		stock += quantity;
		
		if (stock > 0 ) {
			productStatus = ProductStatus.AVAILABLE;
		}
		
		
		
	}
	
	
	public void showProductInfo() {
		
		System.out.println("Product ID : "+ productID);
		System.out.println("Name : "+ productName);
		System.out.println("Category  : "+ productCategory);
		
		System.out.println("Price : "+ price);
		System.out.println("Stock  : "+ stock);
		System.out.println("Product Status : "+ productStatus);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}