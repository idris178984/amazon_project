

Feature:amazon

  1-https://www.amazon.com.tr/ sitesi açılır.
  2-Ana sayfanın açıldıgı kontrol edilir.
  3-Çerez tercihlerinden çerezler kabul et seçilir.
  4-Siteye login olunur.
  5-login işlemi kontrol edilir.
  6-Hesabım bölümünden "cydeo liste" isimli yeni bir liste oluşturulur.
  7-Arama butonu yanındaki katagoriler tabından bilgisayr seçilir.
  8-Bilgisayar kategorisi seçildiği kontrol edilir.
  9-Arama alanına msi yazılır ve arama yapılır.
  10-Arama yapıldıgı kontrol edilir.
  11-Arama sonuçları sayfasından 2.sayfa seçilir.
  12-2.sayfanın açıldıgı kontrol edilir.
  13-Sayfadaki 2.ürün, oluşturulan "cydeo liste" listesine eklenir.
  14-2.ürünün listeye eklendiği kontrol edilir.
  15-Hesabım> Alışveriş listesi sayfasına gidilir.
  16-"Alışveriş listesi" sayfası açıldıgı kontrol edilir.
  17- Eklenen ürün "cydeo liste" sinden silinir.
  18-Silme işleminin gerçekleştiği kontrol edilir.
  19-Üye çıkış işlemi yapılır.
  20-Çıkış işleminin yapıldıgı kontrol edilir.

  @amazon
  Scenario: Amazon'da ürün sepete ekleme
    Given https://www.amazon.com.tr/ sitesi açılır.
    Then Ana sayfanın açıldıgı kontrol edilir.
    And Çerez tercihlerinden çerezler kabul et seçilir.
    When Siteye login olunur.
    Then login işlemi kontrol edilir
    When Hesabım bölümünden "cydeo liste" isimli yeni bir liste oluşturulur.
    Then Arama butonu yanındaki katagoriler tabından bilgisayr seçilir.
    And Bilgisayar kategorisi seçildiği kontrol edilir.
    When Arama alanına "msi" yazılır ve arama yapılır.
    Then Arama yapıldıgı kontrol edilir.
    When Arama sonuçları sayfasından 2.sayfa seçilir.
    And 2.sayfanın açıldıgı kontrol edilir.
    Then Sayfadaki ikinci ürün, oluşturulan "cydeo liste" listesine eklenir.
    And 2.ürünün listeye eklendiği kontrol edilir.
    When Hesabım> Alışveriş listesi sayfasına gidilir.
    Then "Alışveriş listesi" sayfası açıldıgı kontrol edilir.
    And Eklenen ürün "cydeo liste" sinden silinir.
    Then Silme işleminin gerçekleştiği kontrol edilir.
    Then Üye çıkış işlemi yapılır.
    And Çıkış işleminin yapıldıgı kontrol edilir.
