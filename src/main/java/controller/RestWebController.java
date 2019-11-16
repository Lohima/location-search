package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Location;
import service.LocationService;

@RestController
public class RestWebController {
	
	LocationService locservice=new LocationService();
	
	@RequestMapping(value="/post2db",method=RequestMethod.POST)
	public void post2db(@RequestParam(value="$scope.location") String LocationName) {
		System.out.println("passing" +LocationName+" information to mongodb");
		locservice.post2mongodb(LocationName);
		return;
	}
	
}
