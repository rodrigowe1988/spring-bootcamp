# DS Catalog

Sobre o projeto

DS Catalog é uma aplicação Full Stack web e mobile construída durante o Bootcamp Spring React, ministrado pela DevSuperior.

O software consiste em uma aplicação de catálogo de produtos, onde há três tipos de permissões, a do usuário não autenticado, que pode apenas visualizar os produtos, a do usuário com perfil operador, que pode também adicionar categorias ou produtos e a do usuário administrador, que além das outras permissões, também pode gerenciar os outros usuários da aplicação.

Neste projeto também foram trabalhados tópicos como testes com Junit, integração com storage de imagens na AWS, além de CI/CD e implantação com Docker e AWS.

<img src="images/home-frontend.png"/>
<img src="images/catalogo-frontend.png"/>
<img src="images/formulario-usuarios-frontend.png"/>
<img src="images/produtos-edicao-frontend.png"/>
<img src="images/produtos-frontend.png"/>


## Modelo Conceitual
<img src="images/modelo-conceitual.png"/>

## Tecnologias utilizadas
### Back end
* Java
* Spring Boot
* JPA / Hibernate
* Maven
* OAuth/JWT
* Junit
### Front end
* HTML / CSS / Sass/ Bootstrap/ JS / TypeScript
* ReactJS
* Axios
* React Hook Forms
* React Select

### Implantação em produção
* Back end: Heroku
* Front end web: Netlify
* Banco de dados: Postgresql
* Upload de imagens: Amazon S3


# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```
# clonar repositório
git clone https://github.com/rodrigowe1988/spring-bootcamp.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end web
Pré-requisitos: npm / yarn

```
# clonar repositório
git clone https://github.com/rodrigowe1988/spring-bootcamp.git

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start
```

Autor
Rodrigo Weber

https://www.linkedin.com/in/rodrigo-weber-41446b74/
