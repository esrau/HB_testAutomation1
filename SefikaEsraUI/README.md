UI Otomasyonu

Tarayıcı driver dosyaları macos işletim sistemi için eklenmiştir. Otomasyon Windows işletim sisteminde çalıştırılmak istenirse "drivers" dosyasındaki "chromedriver" ve "geckodriver" Windows için download edilerek güncellenmelidir.
Driver güncellemesi sonrası "src/main/utils/DriverFactory" dosyasında bulunan satırlar da Windows uyumlu driver isimlerine göre güncellenmelidir.
- Chrome tarayıcısı için 23.satır aşağıdaki gibi güncellenmelidir.
  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
- Mozilla tarayıcısı için 29.satır aşağıdaki gibi güncellenmelidir.
  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/drivers/geckodriver.exe");

* Otomasyon içerisinde <keyword> olarak "hepsiburada" kullanılmıştır. Değiştirilmek istenirse "src/test/java/test/TestClass" dosyasından aşağıdaki satırlar güncellenmelidir.

googleKeywordPage.googleKeywordSearch("hepsiburada");
bingKeywordPage.bingKeywordSearch("hepsiburada");

* Keyword ve browser belirlendikten sonra otomasyon çalıştırılabilir. Çalıştırmak için;

"src/main/test/java/test/TestClass" açılıp run edilmelidir.

* Arama sonuçları "title, link ve detail" olarak gruplandırılır. Google arama motoru için aşağıdaki gibi örnek verilebilir:

for (SearchResultsGoogle result:results)
{
addResult.add(result.getTitle());
addResult.add(result.getLink());
addResult.add(result.getDetail());
}
System.out.println("GOOGLE "+addResult);
