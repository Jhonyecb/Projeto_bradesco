# Sistema Pix Bradesco

Este é um sistema bancário simulado, desenvolvido em Java com interface gráfica no NetBeans e banco de dados MySQL.
O projeto foi pensado para treinar habilidades em desenvolvimento de software, modelagem de dados, lógica de negócios e segurança em operações financeiras como transferências via Pix.

##  Funcionalidades principais

- Cadastro, busca e visualização de clientes
- Sistema de score de confiabilidade
- Transferência de Pix entre clientes com validações de segurança
- Verificação de saldo com autenticação por senha
- Depósito e saque com atualização direta no banco de dados
- Sistema de denúncias com motivos personalizados e impacto no score
- Alertas de segurança
  
## Score de confiabilidade

- Cada cliente começa com score alto (100)
- Denúncias diminuem o score gradualmente (10 pontos por denúncia)
- O sistema mostra alertas de segurança quando um cliente tenta enviar um Pix para um destinatário com score de confiança entre 40 e 70, pedindo uma confirmação extra. 
- Se o score de um usuário cair abaixo de 40, ele passa a ter restrições no sistema como não poder receber Pix por questões de segurança, as transações são automaticamente bloqueadas. 

## Estrutura Esperada da Interface
![2025-06-04](https://github.com/user-attachments/assets/44f37df8-595b-4bfa-acd0-dcefe0f84470)

## Estrutura Esperada do Banco de Dados
O sistema foi desenvolvido com duas tabelas principais:

- clientes: armazena informações pessoais, financeiras e de segurança do cliente.
- denuncias: registra denúncias feitas por usuários com CPF, motivo e data.

![2025-06-01 (6)](https://github.com/user-attachments/assets/995bfffc-1e93-4cd8-9b4c-0b911c0b990a) 

*Clientes Fictícios gerados por IA.

![2025-06-01 (21)](https://github.com/user-attachments/assets/5bf50a7b-1495-467d-8eb3-3d6d86a19876) 

*Clientes Fictícios gerados por IA.

## Habilidades desenvolvidas

- Conexão Java + MySQL (JDBC)
- Criação e manipulação de tabelas com SQL
- Interface gráfica com Java Swing
- Lógica de negócios e controle de fluxo
- Segurança em aplicações: validações e autenticação
- Boas práticas com MVC e modularização do código

## Tecnologias utilizadas

- Java (NetBeans IDE)
- MySQL 8+
- JDBC
- Maven

## Como executar

- Clone o repositório
- Importe no NetBeans como projeto Maven
- Configure o banco de dados MySQL e execute o script de criação
- Rode a aplicação a partir do SistemaPixBradesco.java





