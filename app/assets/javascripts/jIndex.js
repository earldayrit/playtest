$(document).ready(function(){
	$.ajax({ 
	    type: 'GET', 
	    url: '/employee', 
	    dataType: 'json',
	    success: function (employee) { 
	        $.each(employee, function(index, data) {
	        	var info = data.employee_id+" "+data.first_name+" "+data.middle_name+" "+data.last_name;
	        	$("#employees").append("<li>"+info);
	        });
	     }
	});
});