
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BaseController.BaseController;
import Helper.Helper;
import MODEL.MainModel;
import Query.MainQuery;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author miqba
 */
public class MainController extends BaseController {
    
    Helper helper = new Helper();
    MainQuery query = new MainQuery();

public boolean create(MainModel model) throws ParseException {
    String date = helper.parseDateToString(model.getTanggal());
    
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getNama());
        map.put(2, model.getTipe());
        map.put(3, model.getJumlah());
        map.put(4, model.getHarga());
        map.put(5, date);
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }

    }

