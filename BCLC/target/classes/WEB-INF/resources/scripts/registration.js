$(document).ready(function() {
	var oTable = $('#bc-registration-table');
	oTable.DataTable({
		"paging" : true,
		"bLengthChange" : false,
		"ordering" : false,
		"info" : true,
		"bSort" : false,
		"bFilter" : true,
		"bDestroy" : true,
		"processing" : true,
		"serverSide" : true,
		"ajax" : {
			"url" : "getRangeOfHospitalsForHmo",
			"type" : "POST",
			"dataType" : "json",
            "contentType" : "application/json",
			"data" : function(data, callback, settings) {
                data = JSON.stringify(data);
                return data;
            }
		},
		"deferRender" : true,
		"columnDefs": [
           	{
           		"targets":0,
           		"visible": false,
           		"render":function(data,type,full,meta) {
           			return full.id;
           		}
           	}, 
           	{
           		"targets":1,
           		"render":function(data,type,full,meta) {
           			return full.name;
           		}
           	}, 
           	{
           		"targets":2,
           		"render":function(data,type,full,meta) {
           			return full.address;
           		}
           	}, 
           	{
           		"targets":3,
           		"render":function(data,type,full,meta) {
           			return full.latitude;
           		}
           	}, 
           	{
           		"targets":4,
           		"render":function(data,type,full,meta) {
           			return full.longitude;
           		}
           	}, 
           	{
           		"targets":5,
           		"visible": false,
           		"render":function(data,type,full,meta) {
           			return "<div class='actions'><button class='btn btn-default edit-btn' title='View'><span class='glyphicon glyphicon-eye-open'></span></button></div>";
               	}
           	}
       	]
	});
});