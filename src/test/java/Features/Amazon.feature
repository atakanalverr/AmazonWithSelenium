Feature: Amazon.com
  Scenario: Amazon.com urun ekleme
    Given Kullanici anasayfaya gitsin
    When Cerezleri kabul etsin
    And Arama inputuna tiklasin
    And Urun ismini yazsin
    And Ara butonuna tiklasin
    And Amazon tarafindan gonderilir filtresini secsin
    And Markalar kismindan Apple filtresini secsin
    And Karsisina gelen ilk urune tiklasin
    And Sepete eklesin
    And Sepete gitsin