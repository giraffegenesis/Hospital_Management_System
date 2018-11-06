/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_management_system;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author coolj
 */
public abstract class GenericList<K, T> {

	private static final long serialVersionUID = 1L;
	private HashMap<K, T> list;
	
	/**
	 * Returns the object at a given key
	 * @param key - The key for the object in the HashMap.
	 */
	public T search(K key) {
		return getList().get(key);
	}

	/**
	 * Adds an item to the list.
	 * 
	 * @param item
	 *            the item to be added
	 * @return true if the item could be added
	 */
	public boolean add(K key, T object) {
		try {
			getList().put(key, object);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Removes the item from the list
	 * 
	 * @param item
	 *            the item to be removed
	 * @return true if the item could be removed
	 */
	public Object remove(K key) {
		return getList().remove(key);
	}

	/**
	 * Returns an iterator for the collection
	 * 
	 * @return iterator for the collection
	 */
	public Iterator<T> getIterator() {
		return (Iterator<T>) getList().values().iterator();
	}

	/**
	 * Gets the key set iterator of the collection.
	 * 
	 * @return iterator for the key set of the collection.
	 */
	public Iterator<K> getKeyIterator() {
		return getList().keySet().iterator();
	}

	/**
	 * @return the list
	 */
	public HashMap<K, T> getList() {
		return list;
	}

	/**
	 * Setter for the collection list.
	 * 
	 * @param list
	 *            the list to set
	 */
	public void setList(HashMap<K, T> list) {
		this.list = list;
	}
}
