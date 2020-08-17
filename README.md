Данная работа выполнена для дипломного проекте курса "Тестирования ПО" , в работе представлено тестирование веб-сервиса с использованием СУБД и API банка

1. Запустить Docker
2. Ввести в терминале `docker-compose up -d`
3. Ввести в терминале `cd artifacts`
4. Ввести в терминале `java -jar aqa-shop.jar`
5. Открыть новую вкладку в терминале (не закрывая предыдущую)
7. Ввести в терминале `gradlew clean test`
8. Для произведения отчета Allure  ввести в терминале `gradlew allureReport`
9. Для получения отчета Allure ввести в терминале `gradlew allureServe`

[![Build status](https://ci.appveyor.com/api/projects/status/h659a2j53tjbvjtm/branch/master?svg=true)](https://ci.appveyor.com/project/l75800/diplom2-0/branch/master)
