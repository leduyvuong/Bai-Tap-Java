/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;


import java.util.Vector;


public class DTanClass{
    public Vector ds;

    public DTanClass() {
        super();
        ds = new Vector();
        
    }
    

    
    public void addSV(String MSSV, String ten, float diem){
            if(ds.contains(MSSV)){
                ds.add(MSSV);
                ds.add(ten);
                ds.add(diem);
                
            }
            
        
        
    }
  
    public Object getDS(){
       
        return ds.get(0);
    }
    public Object getDL(int i) {
        return ds.get(i);
    }
    public boolean delSV(String MSSV){
        int index;
        if (ds.indexOf(MSSV) != -1){
            index = ds.indexOf(MSSV);
            ds.remove(index);
            ds.remove(index +1);
            ds.remove(index +2);
            return true;
        }else{
            return false;
        }
            
    }
    public int searchSV(String MSSV){
        if(ds.contains(MSSV)) {
            int i = ds.indexOf(MSSV);
            return i;
        }
        return 0;
    }
    
}
