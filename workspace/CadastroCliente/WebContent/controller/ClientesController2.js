var clienteModule = angular.module('clienteModule',[]);
clienteModule.controller("clienteCtrl",function($scope,$http){
	$http.get('../controller/Clientes.json').then(function(response){
		$scope.clientes = response.data.clientes;
		
	})
});