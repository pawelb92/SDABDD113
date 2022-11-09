Feature: Logowanie do aplikacji

  Jako uzytkownik chce miec mozliwosc zalogowania sie
  do aplikacji aby moc korzystac z zaawansowanych funkcji systemu


  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik wpisuje adres https://the-internet.herokuapp.com/login
    When Uzytkownik wpisuje poprawny username
    And Uzytkownik wpisuje poprawne haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik został poprawnie zalogowany


  Scenario: Niepoprawne logowanie do aplikacji
    Given Uzytkownik wpisuje adres https://the-internet.herokuapp.com/login
    When Uzytkownik wpisuje poprawny username
    And Uzytkownik wpisuje niepoprawne haslo
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie został poprawnie zalogowany


  Scenario: Poprawne logowanie do aplikacji ( druga wersja)
    Given Uzytkownik wpisuje adres "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje "tomsmith" w pole username
    And Uzytkownik wpisuje "SuperSecretPassword!" w pole password
    And Uzytkownik klika przycisk Login
    Then Uzytkownik został poprawnie zalogowany


    @now
  Scenario: Niepoprawne logowanie do aplikacji ( druga wersja )
    Given Uzytkownik wpisuje adres "https://the-internet.herokuapp.com/login"
    When Uzytkownik wpisuje "tomsmith" w pole username
    And Uzytkownik wpisuje "blablabla" w pole password
    And Uzytkownik klika przycisk Login
    Then Uzytkownik nie został poprawnie zalogowany