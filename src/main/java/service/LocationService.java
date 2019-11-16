package service;

import repo.LocationRepository;

public class LocationService {
 
	LocationRepository locrep=new LocationRepository();
	public LocationService(){
		
	}

	public void post2mongodb(String locationName) {
		locrep.storeMongodb(locationName);
	}
}
