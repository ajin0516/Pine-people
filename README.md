# ๐PinePeople

### ์๊ฐ

> ํ์ธํผํ์ด๋ ์ํ๋ฅผ ํจ๊ป ๋ณด๊ฑฐ๋, ๋ฐฐ๋ฌ๋ฃ๋ฅผ ๋๋๋ ๋น์ฅ์ ๋ง๋จ๋ถํฐ
OTT๋ฅผ ํจ๊ป ๊ฒฐ์ ํ๊ฑฐ๋, ์คํฐ๋๋ฅผ ๋ง๋๋ ๊พธ์คํจ ๋ง๋จ๊น์ง ๋๊ตฐ๊ฐ ํ์ํ  ๋ ์ธ์ ๋ ์ง ์ฌ๋์ ์ฐพ์ ์ ์๋ ๊ธฐ๋ฅ์ ์ ๊ณตํ๋ ์น์๋น์ค์๋๋ค.
>

<br/>

### ๊ตฌ์ฑ์

- ๋ฐ์์ง(PM)
- ์์ ํฌ
- ์ด์์ง
- ๊น์ง์
- ๊น์ง์

<br/>

### PinePeople ์คํ๋ฐฉ๋ฒ

์๋์ ํ๊ฒฝ๋ณ์๋ฅผ ์ค์ ํ ํ ์คํ

| No | ํ๊ฒฝ๋ณ์ | ๊ฐ |
| --- | --- | --- |
| 1 | IMP_KEY | ์์ํฌํธ ๊ฒฐ์  api key |
| 2 | IMP_SECRET | ์์ํฌํธ ๊ฒฐ์  api secret key |
| 3 | OAUTH_CLIENT_ID | ๊ตฌ๊ธ ํด๋ผ์ด์ธํธ ID |
| 4 | OAUTH_CLIENT_SECRET | ๊ตฌ๊ธ ํด๋ผ์ด์ธํธ secret key |
| 5 | REDIS_HOST | Redis host ์ฃผ์ |
| 6 | S3_ACCESS_KEY | ์๋ง์กด S3 access key |
| 7 | S3_BUCKET | ์๋ง์กด S3 bucket key |
| 8 | S3_SECRET_KEY | ์๋ง์กด S3 secret key |
| 9 | SMS_KEY | cool SMS api key |
| 10 | SMS_PHONE | cool SMS api ๋ฐ์  ๋ํ ๋ฒํธ |
| 11 | SMS_SECRET | cool SMS api secret key |
| 12 | SPRING_DATASOURCE_PASSWORD | mysql ํจ์ค์๋ |
| 13 | SPRING_DATASOURCE_URL | mysql ํธ์คํธ ์ฃผ์ |

<br/>

### ํ๋ก์ ํธ URL

๐ [PinePeople  ๋ธ์ URL](https://www.notion.so/22c235d2439f45c0a0601e75664babb0)

๐ง [PinePeole ERD Cloud URL](https://www.erdcloud.com/d/faY3ovvTNDFa7zzsj)

๐ [PinePeople Swagger URL](http://pinepeople.site:8080/swagger-ui/index.html)

๐ [PinePeople ์น์๋น์ค URL](http://pinepeople.site:8080/pinepeople)

<br/>

### ๊ธฐ์  ์คํ

- ์๋ํฐ : Intellij Ultimate
- ๊ฐ๋ฐ ํด : Spring Boot 2.7.7
- ์๋ฐ : JAVA 11
- ๋น๋ : Gradle
- ์๋ฒ : AWS EC2, AWS S3
- ๋ฐ์ดํฐ๋ฒ ์ด์ค : MySql 8.0
- ํ๋ก ํธ์๋ :  HTML/CSS/JavaScript, Thymeleaf

<br/>

### Work Flow

![Work Flow](README_Img/WorkFlow.png)

<br/>

### ERD

![ERD](README_Img/ERD.png)

<br/>

### API ๋ช์ธ์ ๋ฐ URL ๋ช์ธ์

โ๏ธ [REST API ๋ช์ธ์](https://www.notion.so/e7dd562f87624ecca98ba67fd99084dd)

โ๏ธ [UI URL ๋ช์ธ์](https://www.notion.so/8ec5eac350b340b1aa595a20a60fbdf0)


<br/>

### ๊ธฐ๋ฅ ๋ฆฌ์คํธ

**User**

- ํ์๊ฐ์, ๋ก๊ทธ์ธ, ๋ก๊ทธ์์
- ์ ์  ์ ๋ณด ์์ , ํํด
- ์ ์  ๋ฆฌ์คํธ ์กฐํ, ์์ธ ์กฐํ, ๊ฒ์
- ์ ์  ๋ง์ดํ์ด์ง
- ์ ์  ์ ๊ณ 

Party

- ํํฐ ์นดํ๊ณ ๋ฆฌ ์์ฑ, ์์ , ์ญ์ 
- ํํฐ ์นดํ๊ณ ๋ฆฌ์ ๋ฐ๋ฅธ ํํฐ ๊ฒ์
- ํํฐ ์์ฑ, ์์ , ์ญ์ 
- ํํฐ ๋ฆฌ์คํธ ์กฐํ, ์์ธ ์กฐํ, ๊ฒ์
- ์ฐธ๊ฐํ ํํฐ ์กฐํ ๋ฐ ๋๊ธฐ ์ค์ธ ํํฐ ์กฐํ
- ํํฐ ๋๊ธ ์์ฑ, ์กฐํ, ์ญ์ 
- ํํฐ์ ์์ฑ, ์์ , ํํด
- ํํฐ์ ์ ์ฒด ์กฐํ, ์น์ธ ๋๊ธฐ ์ค์ธ ํํฐ์ ์กฐํ

๋น๋

- ์ ์  ๋น๋ ํ๊ฐ
- ์ ์  ๋น๋ ์กฐํ

๊ฒฐ์ 

- ํํฐ ๊ฐ์๋น ๊ฒฐ์ 
- ๊ฒฐ์  ์ทจ์

์ปค๋ฎค๋ํฐ

- ์์  ๊ฒ์ํ ๊ธ ์์ฑ, ์์ , ์ญ์ 
- ๊ฒ์ํ ๋๊ธ ์์ฑ, ์ญ์ 

ADMIN

- ๋ธ๋๋ฆฌ์คํธ ๋๊ธฐ ์น์ธ ๋ฐ ๋ฐ๋ ค
- ๋ธ๋๋ฆฌ์คํธ ์กฐํ ๋ฐ ๊ฒ์
- ์ ์  ๊ด๋ฆฌ์ ๋ฑ๊ธ ๋ณ๊ฒฝ

์๋

- ํํฐ ๋๊ธ, ํฌ์คํธ ๋๊ธ ์๋
- ํํฐ์ ์น์ธ ๋ฐ ๊ฑฐ์  ์๋

<br/>

### Weekly Log

| ์ฃผ์ฐจ | ์ํด๋ฆฌ ์ฃผ์ |
| --- | --- |
| 1 | https://gitlab.com/GunLABS/pine-people/-/blob/developer/Weekly_Log/%5B1%EC%A3%BC%EC%B0%A8%5D%ED%8C%8C%EC%9D%B8%ED%94%BC%ED%94%8C_7%ED%8C%80_%EC%A7%84%ED%96%89%EC%83%81%ED%99%A9_%EA%B3%B5%EC%9C%A0.md |
| 2 | https://gitlab.com/GunLABS/pine-people/-/blob/developer/Weekly_Log/%5B2%EC%A3%BC%EC%B0%A8%5D%ED%8C%8C%EC%9D%B8%ED%94%BC%ED%94%8C_7%ED%8C%80_%EC%A7%84%ED%96%89%EC%83%81%ED%99%A9_%EA%B3%B5%EC%9C%A0.md |
| 3 | https://gitlab.com/GunLABS/pine-people/-/blob/developer/Weekly_Log/%5B3%EC%A3%BC%EC%B0%A8%5D%ED%8C%8C%EC%9D%B8%ED%94%BC%ED%94%8C_7%ED%8C%80_%EC%A7%84%ED%96%89%EC%83%81%ED%99%A9_%EA%B3%B5%EC%9C%A0.md |
| 4 | https://gitlab.com/GunLABS/pine-people/-/blob/developer/Weekly_Log/%5B4%EC%A3%BC%EC%B0%A8%5D%ED%8C%8C%EC%9D%B8%ED%94%BC%ED%94%8C_7%ED%8C%80_%EC%A7%84%ED%96%89%EC%83%81%ED%99%A9_%EA%B3%B5%EC%9C%A0.md |