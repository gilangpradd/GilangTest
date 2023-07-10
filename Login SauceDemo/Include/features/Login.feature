@Login
Feature: Login

  @Positifcase
  Scenario: Positive Case Login
    Given User membuka browser
    When User berada di login page
    And User memasukkan credential yang benar
    And User click tombol login
    Then User berhasil login
   
   @Negatifcase
   Scenario: Positive Case Login
    Given User membuka browser
    When User berada di login page
    And User memasukkan credential yang salah
    And User click tombol login
    Then User berhasil login
   
   