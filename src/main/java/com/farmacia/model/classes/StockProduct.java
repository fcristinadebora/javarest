package com.farmacia.model.classes;

import com.farmacia.model.dao.StockProductDAO;
import java.util.List;

public class StockProduct extends Product{

	public StockProduct() {
		super();
	}
	
	public StockProduct(String name, int price, int quantity) {
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}
        
        public List<StockProduct> listar(){
            StockProductDAO dao = new StockProductDAO();
            
            return dao.listar();
        }

    @Override
    public int increaseQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int decreaseQuantity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
