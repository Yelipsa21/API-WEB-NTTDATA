Feature: Registrar un usuario

  @RegistrarUsuario @HappyPath
  Scenario Outline: Registrar de manera existosa a un usuario con credenciales validas
    Given el usuario esta en la pagina de inicio
    And selecciona el boton de registro
    And ingresa un nombre de usuario "<username>" y contrasenia "<password>"
    When selecciona el boton registrar
    Then se realiza el registro de manera exitosa

    Examples:
      | username    | password |
      | usuarioqwer | pass123  |


  @RegistrarUsuario2 @HappyPath
  Scenario Outline: Registrar un usuario
    Given el usuario esta en la pagina de inicio
    When se registra con un nombre de usuario "<username>" y contrasenia "<password>"
    Then se realiza el registro de manera exitosa

    Examples:
      | username    | password |
      | usuarioqwerq | pass123  |

  @LoginUsuario @HappyPath
  Scenario Outline: Login de un usuario
    Given el usuario esta en la pagina de inicio
    And selecciona el boton de Sing Up
    And ingresa el nombre de usuario "<username>" y contrasenia "<password>"
    When selecciona el boton Sing Up
    Then se realiza el registro de manera exitosa

    Examples:
      | username    | password |
      | usuarioLesly | pass123  |

  @SeleccionarProducto @HappyPath
  Scenario: Seleccionar producto
    Given el usuario esta en la pagina de inicio
    When selecciona el producto "<productname>" de la web
    Then se muestra producto de manera exitosa

  @AniadirCarro @HappyPath
  Scenario: Aniadir producto a carrito
    Given el usuario esta en la pagina del producto
    And selecciona el boton de Add Carrito "<productname>"
    When selecciona el boton Aceptar de ventana emergente
    Then se realiza el registro de manera exitosa
