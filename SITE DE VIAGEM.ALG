Algoritmo " site de viagem"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : CRIAR UM MENU PARA CADASTRAR CLIENTE E DESTINO
// Autor(a)    : TAYN� KAROLINA FERREIRA DA SILVA
// Data atual  : 06/07/2022
Var
   // Se��o de Declara��es das vari�veis
   clientes:vetor[1..3] de caractere
   nome , endereco , destino : caractere
   cpf , nasc , cep , rg , opcao , i , j, contato :inteiro
   cadastro:vetor [1..3] de inteiro
Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   para  i de 1 ate 3 faca
      escreval(" *** MENU DE OP��ES *** ")              //O MENU SERA ACIONADO
      escreval("[1] PARA CADASTRAR CLIENTE ")          //AO ESCOLHER A OPCAO
      escreval("[2] PARA CADASTRAR DESTINO ")           //CADASTRADA
      escreval("[3] PARA CONSULTAR ")
      leia(opcao)
      limpatela
      escolha (opcao)
      caso 1
         escreval(" QUAL O SEU NOME COMPLETO:")        //SE A OP��O FOR [1]
         leia(nome)                                  //PODERA FAZERO O CADASTRO
         escreval(" QUAL O CPF: ")                   //ADICIONANDO OS DADOS
         leia(cpf)
         escreval(" DATA DE NASCIMENTO:")
         leia(nasc)
         escreval(" QUAL O RG:")
         leia(rg)
         escreval(" CADASTRE O SEU ENDERECO ")
         leia(endereco)
         escreval(" NUMERO DE CONTATO:")
         leia(contato)
         escreval()
      caso 2
         escreval(" QUAL LUGAR DE DESTINO?")     //SE A  OP��O FOR[2]
         leia(destino)                          //REALIZA O CADASTRO DO DESTINO
         escreval( " O CADASTRO DO SEU DESTINO PARA " , DESTINO ," FOI REALIZADO!")
         escreval()
      caso 3                                       //SE A OP��O FOR[3]
         escreval(" QUAL CPF DESEJA CONSULTAR?")   //SER� REALIZADO A CONSULTA
         leia(cpf)                                //CONSULTA SER� FEITA POR CPF
      fimescolha
   fimpara
   escreval(" --- FIM DOS DADOS --- ")
   escreval()
   escreva(" *** DADOS DIGITADOS *** ")
   para j de 1 ate 1 faca
      escreval()
      escreval(" NOME: "  ,NOME)                  //AP�S ENTRAR TODOS OS DADOS
      escreval(" CPF: " , CPF)                    //SER� IMPRESSO NA TELA
      escreval(" NASC: " , NASC )                 //TODOS OS DADOS DIGITADOS
      escreval(" RG: " , RG )
      escreval(" ENDERECO: " , ENDERECO )
      escreval(" CONTATO: " , CONTATO )
      escreval()
      escreval(" DESTINO PARA "  ,DESTINO ," FOI AGENDADO!"   )
      escreval(" CPF CONSULTADO FOI: " , cpf)
   fimpara
fimalgoritmo





