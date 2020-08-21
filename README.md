---
title: Mastertech Sistema de CEP v1.0
language_tabs:
  - http: HTTP
language_clients:
  - http: ""
toc_footers: []
includes: []
search: false
highlight_theme: darkula
headingLevel: 2

---

<!-- Generator: Widdershins v4.0.1 -->

<h1 id="mastertech-sistema-de-cep">Mastertech Sistema de CEP v1.0</h1>

> Scroll down for code samples, example requests and responses. Select a language for code samples from the tabs above or the mobile navigation menu.

# Introdução
API para o sistema de Cadastro de Usuários pelo CEP

# Overview
Sistema de testes criado no curso da Mastertech

Base URLs:

* <a href="http://localhost:8080/cep">http://localhost:8080/cep</a>

* <a href="http://localhost:7000/cep">http://localhost:7000/cep</a>

* <a href="http://localhost:8081">http://localhost:8081</a>

<h1 id="mastertech-sistema-de-cep-misc">Misc</h1>

## Get CEP

<a id="opIdGetCEP"></a>

> Code samples

```http
GET http://localhost:8080/cep/03630010 HTTP/1.1
Host: localhost:8080

```

`GET /03630010`

Obtém as informações do CEP.

<h3 id="get-cep-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Post Registry

<a id="opIdPostRegistry"></a>

> Code samples

```http
POST http://localhost:8080/cep/registry HTTP/1.1
Host: localhost:8080
Content-Type: application/json

```

`POST /registry`

Adiciona um novo cadastro com o nome e o CEP informados.

> Body parameter

```json
{
  "nome": "Thiago Cardoso Silva",
  "cep": "03041000"
}
```

<h3 id="post-registry-parameters">Parameters</h3>

|Name|In|Type|Required|Description|
|---|---|---|---|---|
|body|body|[PostRegistryRequest](#schemapostregistryrequest)|true|none|

<h3 id="post-registry-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

## Get All Registries

<a id="opIdGetAllRegistries"></a>

> Code samples

```http
GET http://localhost:8080/cep/registry HTTP/1.1
Host: localhost:8080

```

`GET /registry`

Obtém todos os cadastros.

<h3 id="get-all-registries-responses">Responses</h3>

|Status|Meaning|Description|Schema|
|---|---|---|---|
|200|[OK](https://tools.ietf.org/html/rfc7231#section-6.3.1)|none|None|

<aside class="success">
This operation does not require authentication
</aside>

# Schemas

<h2 id="tocS_PostRegistryRequest">PostRegistryRequest</h2>
<!-- backwards compatibility -->
<a id="schemapostregistryrequest"></a>
<a id="schema_PostRegistryRequest"></a>
<a id="tocSpostregistryrequest"></a>
<a id="tocspostregistryrequest"></a>

```json
{
  "nome": "Thiago Cardoso Silva",
  "cep": "03041000"
}

```

PostRegistryRequest

### Properties

|Name|Type|Required|Restrictions|Description|
|---|---|---|---|---|
|nome|string|true|none|none|
|cep|string|true|none|none|

