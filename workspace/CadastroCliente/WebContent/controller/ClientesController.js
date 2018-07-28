var clienteModule = angular.module('clienteModule',[]);
clienteModule.controller("clienteCtrl",function($scope,$http){
	urlClientes = 'http://localhost:8080/CadastroCliente/rest/clientes';
	$scope.listarClientes = function(){
		$http.get(urlClientes).success(function(cliente){
			$scope.clientes = cliente;
		}).error (function (erro){
			alert(erro);
		});
	}
	//Execurar a listar
	$scope.listarClientes();
});