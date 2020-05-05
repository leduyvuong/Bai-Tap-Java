/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtra;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hi-XV
 */
public class Staff {
    ArrayList<Employee> stafflist;

    public Staff() {
        super();
        stafflist = new ArrayList<Employee>();
    }
    void Add(Employee e){
        for ( int i = 0; i < stafflist.size(); i++) {
            if ( stafflist.get(i).employeeId.equalsIgnoreCase(e.employeeId) ){
                JOptionPane.showMessageDialog(null, "Trung ID Roi");
                return;
            }
        }
        stafflist.add(e);
        
    }
    public void Delete(String employeeid){
        for ( int i = 0; i < stafflist.size(); i++) {
            if ( stafflist.get(i).employeeId.equalsIgnoreCase(employeeid) ) {
                this.stafflist.remove(i);
                
            }
        }
    }
}
