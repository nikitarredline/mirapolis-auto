Feature: Login User

  Scenario: Login User
    When Input login
    And Input password
    And Click "Войти" button
    Then Content with " Сотрудник" visible

  Scenario: Incorrect Login User
    When Input incorrect login "login"
    And Input password
    And Click "Войти" button
    Then Alert have text "Неверные данные для авторизации"

  Scenario: Incorrect Password User
    When Input incorrect password "password"
    And Input login
    And Click "Войти" button
    Then Alert have text "Неверные данные для авторизации"

  Scenario: Incorrect Login and Password User
    When Input incorrect login "login"
    And Input incorrect password "password"
    And Click "Войти" button
    Then Alert have text "Неверные данные для авторизации"

  Scenario: Forget Password
    When Click Forget Password
    Then Content with "Назад к входу в систему" visible