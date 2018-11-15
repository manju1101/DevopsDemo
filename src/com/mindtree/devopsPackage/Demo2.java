/**
 * Author : M1040615
 * Create date : Nov 15, 2018 | 12:33:21 PM
 * Modified : 12:33:21 PM
 */
package com.mindtree.devopsPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));

	}

}
