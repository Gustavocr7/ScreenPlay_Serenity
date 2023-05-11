Feature: login fundacion santa fe

  @IniciarSesion
  Scenario: iniciar sesion
    Given el usuario ingresa a la url
    When el usuario ingresa sus credenciales gustavo,patiño,gustavopatino@cbit-online.com,July,5,2000 en el apartado de registro
    Then el usuario culmina el primer paso del registro correctamente



