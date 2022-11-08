Feature: Logowanie do aplikacji

  Jako uzytkownik chce miec mozliwosc zalogowania sie
  do aplikacji aby moc korzystac z zaawansowanych funkcji systemu

  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik otwiera przegladarke
    And Uzytkownik wpisuje adres https://the-internet.herokuapp.com/login
    When Uzytkownik wpisuje poprawny username
    And Uzytkownik wpisuje poprawne haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik został poprawnie zalogowany
