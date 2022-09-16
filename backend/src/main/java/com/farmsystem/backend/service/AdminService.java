package com.farmsystem.backend.service;

import java.util.List;

import com.farmsystem.backend.entity.Admin;
import com.farmsystem.backend.entity.Buyer;
import com.farmsystem.backend.entity.Farmer;

public interface AdminService {
	
	String adminLogin(Admin admin);
	
	List<Buyer>getAllBuyers();
	
	List<Farmer>getAllFarmers();
	
	List<Farmer>getAllOrders();
	
	List<Farmer>getAllProducts();
	
}
