var app = angular.module('app', []);
app.controller('postcontroller', function($scope, $http, $location) {
   $scope.submitForm = function(){
    //var url = $location.absUrl()+"/searchLocation/?term=" ;
    let url="https://maps.googleapis.com/maps/api/place/autocomplete/json?input="+$scope.location+"&key=AIzaSyBSFB38kdqjxYGGxGHnpyoAJohEDQuPUjw";
    /*var config = {
                   headers : {
                    'Accept': 'text/plain'
                }
        }
    var data = {
    		LocationName: $scope.LocationName
        };*/
    
    $http.get(url).then(function (response) {
      $scope.response = response.data;
      $scope.complete =function(string){
    	  var output[];
    	  angular.forEach($scope.response.description,function(location){
    		  if(LocationName.toLowerCase().indexOf(string.toLowerCase())>=0)
    			  {
    			    output.push(location);
    			  }
    	  });
      $scope.filterLocation=output;  
     }
      $scope.fillTextbox = function(string){
    	  $scope.location= string;
    	  $scope.hidethis= true;
      }
    }, function error(response) {
      $scope.postResultMessage = "Error with status: " +  response.statusText;
    });
   }
    /* 2. app.factory('sendLocation',function($http,$rootScope,superCache){
    	var sendlocSer={
    			sendLocData:function() {
    				alert("posting location from factory to restcontroller");
    				res=$http.post('post2db',$scope.location);
    				res.success(function(data,status,headers,config){
    					alert("data sent to rest");
    				});
    				res.error(function(data,status,headers,config){
    					alert("failure message:"+JSON.stringify({data:data}));
    				});
    			}
    	};
    	return sendlocSer;
    });
    
    $scope.location = "";
  }*/
  
   $scope.post2mongo = function($scope){
	                  alert("posting location from factory to restcontroller");
	                  res=$http.post('post2db',$scope.location);
	    				res.success(function(data,status,headers,config){
	    					alert("data sent to rest");
	    				});
	    				res.error(function(data,status,headers,config){
	    					alert("failure message:"+JSON.stringify({data:data}));
	    			});
                }	
	                      
   
   $scope.funtion3 = function($scope){
	   var option = document.createElement("OPTION");
	   option.text = document.getElementById("location").value;
       option.value = document.getElementById("location").value;
       document.getElementById("dropDownList").options.add(option);
       document.getElementById("location").value = "";
   }
   
});
 
}

