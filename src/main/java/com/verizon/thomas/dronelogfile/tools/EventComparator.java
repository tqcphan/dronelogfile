package com.verizon.thomas.dronelogfile.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 * @author thomasphan
 *
 */
public class EventComparator implements Comparator<ArrayList<Object>> {
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSZ");
	    @Override
        public int compare(ArrayList<Object> arrayObject, ArrayList<Object> otherarrayObject) {
	    	    Date d1=null;
	    	    Date d2=null;
                try {
					d1 = df.parse(arrayObject.get(0).toString());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                try {
					d2 = df.parse(otherarrayObject.get(0).toString());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return d1.compareTo(d2);
		
	
	    }

}
