package com.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.CloudVendor;

@RestController
public class CloudVendorAPIServices {
    
	@GetMapping("/vendordetails/{vendorId}")
	public CloudVendor getVendorDetails(@PathVariable String vendorId)
	{
		CloudVendor c;
		if(vendorId.equals("c1"))
		{
			 c= new CloudVendor("C1","James","India","12345");
		}
		else if(vendorId.equals("c2"))
		{
			c= new CloudVendor("C2","Bond","Greenland","98765");
		}
		else
		{
			 c= new CloudVendor(" "," "," "," ");
		}
		
		return c;
	}
	
}
