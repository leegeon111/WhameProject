package spring.mvc.whame.region;

import java.util.ArrayList;
import java.util.List;

public class MapTest  {
		 
		
		public List<Double> run(double lat, int m){
			
			List<Double> list = new ArrayList<Double>();
			
			double diffLatitude = LatitudeInDifference(m);
			double diffLongitude = LongitudeInDifference(lat, m);
			
			list.add(diffLatitude);
			list.add(diffLongitude);
			
			return list;
		}
		
	    //반경 m이내의 위도차(degree)
	    public double LatitudeInDifference(int diff){
	        //지구반지름
	        final int earth = 6371000;    //단위m
	 
	        return (diff*360.0) / (2*Math.PI*earth);
	    }
	 
	    //반경 m이내의 경도차(degree)
	    public double LongitudeInDifference(double _latitude, int diff){
	        //지구반지름
	        final int earth = 6371000;    //단위m
	 
	        double ddd = Math.cos(0);
	        double ddf = Math.cos(Math.toRadians(_latitude));
	 
	        return (diff*360.0) / (2*Math.PI*earth*Math.cos(Math.toRadians(_latitude)));
	    }
	    
	    public double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
	         
	        double theta = lon1 - lon2;
	        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
	         
	        dist = Math.acos(dist);
	        dist = rad2deg(dist);
	        dist = dist * 60 * 1.1515;
	         
	        if (unit == "kilometer") {
	            dist = dist * 1.609344;
	        } else if(unit == "meter"){
	            dist = dist * 1609.344;
	        }
	 
	        return (dist);
	    }
	     
	 
	    // This function converts decimal degrees to radians
	    private static double deg2rad(double deg) {
	        return (deg * Math.PI / 180.0);
	    }
	     
	    // This function converts radians to decimal degrees
	    private static double rad2deg(double rad) {
	        return (rad * 180 / Math.PI);
	    }

}