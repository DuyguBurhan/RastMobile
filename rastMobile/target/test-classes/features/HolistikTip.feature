@run
Feature: Holistik Tip Odeme Sayfası Negatif Testi

  Background:
    Given kullanici url ye gider
    When  kullanici login olur


  Scenario:odemeSayfasi
    And    kullanici sepete urun ekler
    And    sepetteki urun icin gecersiz kart bilgileri girer
    And    yanlis kart bilgileri ile odeme yapilamadigini dogrular
    Then   sayfayi kapatir


