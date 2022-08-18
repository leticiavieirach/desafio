# Desafio Neki

Backend
Spring Boot
Criar um projeto Spring Boot que contemple as seguintes funcionalidades:
1. Serviço de Login
    - Esse serviço deve receber login e senha e verificar se está igual ao da base
    - A senha deverá ser criptografada
    - Deverá retornar um token para acesso aos demais serviços
2. Serviço de Cadastro
    - Esse serviço receberá o login e senha para ser cadastrado na base de dados
    - A senha deve ser armazenada criptografada
3. Serviço de Listagem de Skills
    - Esse serviço deve receber o id do usuário e retornar todas as skills associadas a
ele
4. Serviço de Associar Skill
    - Esse serviço deve receber o usuário, a skill e o level para persistir na base de
dados
5. Serviço de Atualizar Associação de Skill
    - Esse serviço deve receber o id da associação da skill e o level para atualização
na base de dados
6. Serviço de Excluir Associação de Skill
    - Esse serviço deve receber o id da associação da skill e excluir da base de dados
7. Apenas o Serviço de Login deve ser público. Os demais devem ter segurança JWT e
ser acessados apenas com um token válido
8. Seguir o modelo de dados que está neste repositório teste_residencia.sql
9. O projeto deve conter o Spring Fox para gerar documentação automática dos serviços
pelo swagger.
10. Lembre-se de seguir as boas práticas de API RESTFul
11. O projeto deve ser compartilhado no github num repositório público
12. Os ids devem usar a sequence criada no arquivo sql
