package com.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CloudVendor {
   
	//attributes of vendor
	
	
	private String vendorID;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhNum;
	
	//constructors
	
		public CloudVendor() {
			super();
		}
		
		public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhNum) {
			super();
			this.vendorID = vendorID;
			this.vendorName = vendorName;
			this.vendorAddress = vendorAddress;
			this.vendorPhNum = vendorPhNum;
		}
		
		//getters and setters
			public String getVendorID() {
				return vendorID;
			}
			public void setVendorID(String vendorID) {
				this.vendorID = vendorID;
			}
			public String getVendorName() {
				return vendorName;
			}
			public void setVendorName(String vendorName) {
				this.vendorName = vendorName;
			}
			public String getVendorAddress() {
				return vendorAddress;
			}
			public void setVendorAddress(String vendorAddress) {
				this.vendorAddress = vendorAddress;
			}
			public String getVendorPhNum() {
				return vendorPhNum;
			}
			public void setVendorPhNum(String vendorPhNum) {
				this.vendorPhNum = vendorPhNum;
			}
		
	
}
