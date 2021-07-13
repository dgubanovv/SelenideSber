#Sberbank Simple Test (Java + Selenide + PageObject) 

Run test - `mvn test -Dbrowser=chrome -Dheadless=1` or just `mvn test`

**parameters:**

- `browser` - chrome or firefox. default - chrome 
- `headless` - 0 or 1. default - 0 (means show browser UI or not)

Generate allure report  - `allure serve target/allure-results`
