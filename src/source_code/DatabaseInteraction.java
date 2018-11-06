/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source_code;

/**
 *
 * @author coolj
 */
public abstract class DatabaseInteraction {
    
    
    public abstract boolean add();
    public abstract boolean delete();
    public abstract String[] getAllRows();
    public abstract String getARow();
    public abstract String[] getRowInRange();
}
