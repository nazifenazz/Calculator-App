Calculator App.

Bu proje Spring Boot ile yaptığım basit bir hesap makinesi API projesidir.

Projede toplama çıkarma çarpma ve bölme işlemleri yapılabiliyor.

Kullanıcı birden fazla sayı gönderiyor.

Uygulama gelen sayılara göre sonucu hesaplayıp geri döndürüyor.

Bu projeyi Java ve Spring Boot kullanmayı öğrenmek için yaptım.

Kodları controller service ve dto olarak ayırdım.

Bu şekilde proje daha düzenli oldu.

Özellikler.

Toplama işlemi yapar.

Çıkarma işlemi yapar.

Çarpma işlemi yapar.

Bölme işlemi yapar.

Birden fazla sayı ile işlem yapabilir.

Sabit kişi bilgisi döndüren örnek bir alan vardır.

API mantığını öğrenmek için hazırlanmıştır.

Kullanılan teknolojiler.

Java.

Spring Boot.

Maven.

Lombok.

REST API.

Projeyi çalıştırma.

Projeyi çalıştırmak için önce proje klasörü açılır.

Sonra Maven ile uygulama başlatılır.

Uygulama çalışınca istekler API üzerinden gönderilir.

Proje varsayılan olarak seksen numaralı portta çalışır.

Proje yapısı.

Controller klasörü dışarıdan gelen istekleri karşılar.

Service klasörü hesaplama işlemlerini yapar.

Dto klasörü gelen ve dönen verilerin modelini tutar.

Application dosyası projenin başlangıç dosyasıdır.

Application properties dosyasında uygulama ayarları vardır.

Dosyalar kısaca.

HesapMakinesiApplication java dosyası uygulamayı başlatır.

HesapController java dosyası hesaplama isteklerini alır.

HesapService java dosyası toplama çıkarma çarpma ve bölme işlemlerini yapar.

Sayilar java dosyası kullanıcıdan gelen sayı listesini tutar.

KisiController java dosyası kişi bilgisi için örnek istek alanıdır.

KisiService java dosyası sabit kişi bilgisini döndürür.

Kisi java dosyası kişi bilgilerini tutar.

Pom xml dosyası proje paketlerini ve Maven ayarlarını tutar.

Kısa açıklama.

Bu proje basit bir hesap makinesi API projesidir.

Java Spring Boot ve Maven kullanılarak yapılmıştır.

Projede temel REST API mantığı kullanılmıştır.

Amaç kullanıcının gönderdiği sayılarla dört işlem yapmaktır.
