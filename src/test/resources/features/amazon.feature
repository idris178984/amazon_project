@amazon
Feature:
  Usery Story :
  Virgosol Listesini oluşturup, listeye ürün ekleme ve aynı ürünü kaldırma.

  AC :
  1-https://www.amazon.com.tr/ sitesi açılır.
  2-Ana sayfanın açıldıgı kontrol edilir.
  3-Çerez tercihlerinden çerezleri kabul et seçilir.
  4-Siteye login olunur.
  5-login işlemi kontrol edilir.
  6-Hesabım bölümünden "Virgosol Liste" isimli yeni bir liste oluşturulur.
  7-Arama butonu yanındaki katagoriler tabından bilgisayr seçilir.
  8-Bilgisayar kategorisi seçildiği kontrol edilir.
  9-Arama alanına msi yazılır ve arama yapılır.
  10-Arama yapıldıgı kontrol edilir.
  11-Arama sonuçları sayfasından 2.sayfa seçilir.
  12-2.sayfanın açıldıgı kontrol edilir.
  13-Sayfadaki 2.ürün, oluşturulan "Virgosol Liste" listesine eklenir.
  14-2.ürünün listeye eklendiği kontrol edilir.
  15-Hesabım> Alışveriş listesi sayfasına gidilir.
  16-"Alışveriş listesi" sayfası açıldıgı kontrol edilir.
  17- Eklenen ürün "Virgosol Liste" sinden silinir.
  18-Silme işleminin gerçekleştiği kontrol edilir.
  19-Üye çıkış işlemi yapılır.
  20-Çıkış işleminin yapıldıgı kontrol edilir.

  Background:
    Given https://www.amazon.com.tr/ sitesi açılır.
    Then Ana sayfanın açıldıgı kontrol edilir.
    And Çerez tercihlerinden çerezler kabul et seçilir.
    When Siteye login olunur.
    Then login işlemi kontrol edilir

  @createList
  Scenario:Liste oluşturulur.
    When Hesabım bölümünden "Virgosol Liste" isimli yeni bir liste oluşturulur.

  @addProduct
  Scenario:Oluşturulan listeye ürün eklenir.
    Then Arama butonu yanındaki katagoriler tabından bilgisayr seçilir.
    And  Bilgisayar kategorisi seçildiği kontrol edilir.
    When Arama alanına "msi" yazılır ve arama yapılır.
    Then Arama yapıldıgı kontrol edilir.
    When Arama sonuçları sayfasından 2.sayfa seçilir.
    And  2.sayfanın açıldıgı kontrol edilir.
    Then Sayfadaki ikinci ürün, oluşturulan "Virgosol Liste" listesine eklenir.
    And 2.ürünün listeye eklendiği kontrol edilir.


  @deleteProduct
  Scenario:Oluşturulan listeden ürün silinir
    When Hesabım> Alışveriş listesi sayfasına gidilir.
    Then "Alışveriş listesi" sayfası açıldıgı kontrol edilir.
    And Eklenen ürün "Virgosol Liste" sinden silinir.
    Then Silme işleminin gerçekleştiği kontrol edilir.

  @exit
  Scenario:Çıkış işlemleri yapılır.
    Then Üye çıkış işlemi yapılır.
    And Çıkış işleminin yapıldıgı kontrol edilir.

