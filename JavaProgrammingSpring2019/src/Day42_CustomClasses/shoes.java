package Day42_CustomClasses;

public class shoes {
  String brand;
  double size;
	public void setShoesData(String newBrand, double nSize) {
		brand = newBrand;
		size = nSize;


	}
	//read only
	
	public String getShoesData() {
		return brand+ " | "+size;
	}

}
