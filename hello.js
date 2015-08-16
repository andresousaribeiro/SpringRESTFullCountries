
function Country($scope, $http) {
    $http.get('http://localhost:8080/countries/all').
        success(function(data) {
            $scope.countries = data;
        });
}