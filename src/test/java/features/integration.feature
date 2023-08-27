# language : pt
Funcionalidade: Testar Integration

  Esquema do Cenário: Pendencia
    Dado leio uma <pendencia> JSON
    E preencho os campos <nome>, <cpf>
    #Quando envio a requisicao
    Quando valido o status code
    Entao valido o conteudo gravado no banco

    Exemplos: 
      | pendencia     | nome              | cpf           |
      | "teste1.json" | "NOME ALTERADO 1" | "12345678901" |
