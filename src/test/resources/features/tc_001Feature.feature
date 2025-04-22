Feature: Validar selección de modo de carga de documentos

  Scenario: Selección de 'cargar documentos'
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona la opción 'cargar documentos'
    Then El sistema muestra opción para carga única y carga múltiple
    
  Scenario: Elegir 'carga en un solo archivo'
    Given El usuario visualiza opciones de carga
    When El usuario elige 'carga en un solo archivo'
    Then Se habilita un único recuadro para subir el archivo
    
  Scenario: Elegir 'cargar documentos por separado'
    Given El usuario visualiza opciones de carga
    When El usuario elige 'cargar documentos por separado'
    Then Se muestran múltiples recuadros correspondientes a cada documento requerido