@main
Feature:
  AC :

  -https://www.amazon.com.tr/ sitesi açılır.
  -Ana sayfanın açıldıgı kontrol edilir.
  -Çerez tercihlerinden çerezleri kabul et seçilir.
  -Siteye login olunur.


  Scenario:Amazon sitesine gidilir, login olunur.
    Given https://www.amazon.com.tr/ sitesi açılır.
    Then Ana sayfanın açıldıgı kontrol edilir.
    And Çerez tercihlerinden çerezler kabul et seçilir.
    When Siteye login olunur.
    Then login işlemi kontrol edilir