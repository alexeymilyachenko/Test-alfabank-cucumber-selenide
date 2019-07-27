$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("alfabank.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: ru"
    }
  ],
  "line": 2,
  "name": "тест",
  "description": "",
  "id": "тест",
  "keyword": "Свойство"
});
formatter.scenario({
  "line": 3,
  "name": "Тест на корректность ввода данных",
  "description": "",
  "id": "тест;тест-на-корректность-ввода-данных",
  "type": "scenario",
  "keyword": "Сценарий"
});
formatter.step({
  "line": 4,
  "name": "открываем сайт на странице \"https://alfabank.ru/\"",
  "keyword": "Допустим "
});
formatter.step({
  "line": 5,
  "name": "вводим сумму стоимости недвижимости 15000000",
  "keyword": "И "
});
formatter.step({
  "line": 6,
  "name": "вводим первоночальный взнос 4000000",
  "keyword": "Также "
});
formatter.step({
  "line": 7,
  "name": "вводим срок кредитования 30",
  "keyword": "Также "
});
formatter.step({
  "line": 8,
  "name": "сравниваем таблицу со стоимостью, платежем и процентами",
  "keyword": "Также "
});
formatter.step({
  "line": 9,
  "name": "нажимаем кнопку заполнить заявку",
  "keyword": "И "
});
formatter.step({
  "line": 10,
  "name": "нажимаем кнопку Да",
  "keyword": "И "
});
formatter.match({
  "arguments": [
    {
      "val": "https://alfabank.ru/",
      "offset": 28
    }
  ],
  "location": "OdobrimCashSteps.открываем_сайт_на_странице(String)"
});
formatter.result({
  "duration": 8224990753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "15000000",
      "offset": 36
    }
  ],
  "location": "OdobrimCashSteps.вводим_сумму_стоимости_недвижимости(String)"
});
formatter.result({
  "duration": 661528627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4000000",
      "offset": 28
    }
  ],
  "location": "OdobrimCashSteps.вводим_первоночальный_взнос(String)"
});
formatter.result({
  "duration": 328956321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "30",
      "offset": 25
    }
  ],
  "location": "OdobrimCashSteps.вводим_срок_кредитования(String)"
});
formatter.result({
  "duration": 191969228,
  "status": "passed"
});
formatter.match({
  "location": "OdobrimCashSteps.сравниваем_таблицу_со_стоимостью_платежем_и_процентами()"
});
formatter.result({
  "duration": 593784919,
  "status": "passed"
});
formatter.match({
  "location": "OdobrimCashSteps.нажимаем_кнопку_заполнить_заявку()"
});
formatter.result({
  "duration": 194638455,
  "status": "passed"
});
formatter.match({
  "location": "OdobrimCashSteps.нажимаем_кнопку_Да()"
});
