Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos para validar 'Slip de salida'
    Given el usuario ha iniciado sesión y navega al formulario de carga de documentos
    When el usuario completa la carga de documentos necesarios
    And el usuario inicia el procesamiento de documentos
    Then el sistema debe generar el 'Slip de salida'
    And el sistema debe guardar los documentos originales en el historial de la solicitud
    And el sistema debe guardar los datos extraídos en el historial de la solicitud