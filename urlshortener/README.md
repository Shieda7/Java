# Desafio Encurtador de URLs ✂️

Desafio proposto pela comunidade [Back-End Brasil](https://github.com/backend-br).  
Saiba mais: [Encurtador de URLs](https://github.com/backend-br/desafios/blob/master/url-shortener/PROBLEM.md).
 
---

#### ☕ Tecnologias utilizadas:

- Java
- Spring Boot
- MongoDB
- Postman
---

## ⚙️ Passo a passo

#### 1 - Instale o [Docker](https://www.docker.com) em sua máquina. 

#### 2 - Abra o terminal na pasta raiz do projeto e execute o seguinte comando:

`docker compose up`

#### 3 - Crie o banco de dados necessário para a aplicação

- MongoDB:   
Crie um banco com o nome: db_urls  
`Usuário: admin`   
`Senha: 123`   

#### 4 - Após terminar a configuração, inicie a aplicação e ela estará disponível em:

- http://localhost:8080/v1/shorten-url


#### 5 - Abra algum aplicativo para realizar suas requisições

- Algumas recomendações:  
[Insomnia](https://insomnia.rest/)  
[Postman](https://www.postman.com/)  
[Bruno](https://www.usebruno.com/)  

--- 

## 📨 Requisições

| Método | URL                            | Descrição                       | Corpo da requisição     |
| ------ | ------------------------------ | ------------------------------- | ----------------------- |
| POST   | /v1/shorten-url                | Encurte uma nova URL.           | [JSON](#encurtarurl)    |

---

## 📄 Corpo das requisições

##### <a id="encurtarurl">/v1/shorten-url - Encurtando uma URL.</a>

```json
{
  "url": "https://github.com/"
}
---

## 📂 Onde encontrar os dados no MongoDB

Após realizar uma requisição com sucesso para o endpoint `/v1/shorten-url`, os dados são salvos no MongoDB local. Você pode visualizá-los utilizando o [MongoDB Compass](https://www.mongodb.com/products/compass):

### 🔍 Passo a passo no MongoDB Compass:

1. Abra o **MongoDB Compass** e conecte-se à instância local:

   ```
   localhost:27017
   ```

2. No painel esquerdo, procure pelo banco de dados:

   ```
   shortenerdb
   ```

3. Clique na collection:

   ```
   urls
   ```

4. Você verá os documentos salvos, como o exemplo abaixo:

```json
{
  "_id": "nr2Wqr4",
  "fullUrl": "https://www.google.com",
  "expiresAt": "2025-06-11T01:12:29.803+00:00",
  "_class": "shieda.project.urlshortener.entities.UrlEntity"
}
```

Esses dados representam as URLs encurtadas, com o código gerado (`_id`), a URL original (`fullUrl`), a data de expiração (`expiresAt`) e a classe da entidade (`_class`).

---


