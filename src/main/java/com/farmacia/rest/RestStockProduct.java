 
package com.farmacia.rest;

import com.farmacia.database.DatabaseMySQL;
import com.farmacia.model.classes.StockProduct;
import com.farmacia.model.dao.StockProductDAO;
import com.mysql.jdbc.Connection;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author debs
 */
@Path("/StockProduct")
public class RestStockProduct {

    private StockProductDAO proDAO;
    
    public RestStockProduct(){
        Connection con = DatabaseMySQL.getConnection();        
        
        this.proDAO = new StockProductDAO();
        proDAO.setConnection(con);
    }
    
    @GET
    @Path("/getStockProduct")
    @Produces("application/json")
    public List<StockProduct> getStockProduct(){
        return proDAO.listar();       
    }
}