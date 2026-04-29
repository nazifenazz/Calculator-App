# Calculator App

Bu projede Spring Boot ile basit bir hesap makinesi API projesi yaptım.

Projede toplama çıkarma çarpma ve bölme işlemleri yapılabiliyor. Kullanıcı birden fazla sayı gönderiyor ve uygulama sonucu hesaplayıp geri döndürüyor.

Bu projeyi Java ve Spring Boot kullanmayı öğrenmek için hazırladım. Kodları controller service ve dto olarak ayırdım.

Bu şekilde proje daha düzenli oldu ve her dosyanın görevi daha anlaşılır hale geldi.

## Özellikler

- Toplama işlemi yapma
- Çıkarma işlemi yapma
- Çarpma işlemi yapma
- Bölme işlemi yapma
- Birden fazla sayı ile işlem yapma
- API üzerinden istek alma
- Sonucu kullanıcıya geri döndürme
- Sabit kişi bilgisi döndüren örnek alan
- Controller service ve dto yapısı kullanma
- Spring Boot ile çalışma

## Kullanılan Teknolojiler

- Java
- Spring Boot
- Maven
- Lombok
- REST API

## Projeyi Çalıştırma

Projeyi çalıştırmak için önce proje klasörü açılır.

Sonra Maven ile uygulama başlatılır.

```txt
./mvnw spring-boot:run
```

Uygulama çalışınca API istekleri gönderilebilir.

Proje varsayılan olarak seksen numaralı portta çalışır.

```txt
http://localhost
```

## API İşlemleri

Toplama işlemi için bu adres kullanılır.

```txt
/api/topla
```

Çıkarma işlemi için bu adres kullanılır.

```txt
/api/cikar
```

Çarpma işlemi için bu adres kullanılır.

```txt
/api/carp
```

Bölme işlemi için bu adres kullanılır.

```txt
/api/bol
```

Örnek kişi bilgisi için bu adres kullanılır.

```txt
/api/kisi/getir
```

## Proje Yapısı

```txt
src/
  main/
    java/
      com/
        naz/
          hesapmakinesi/
            HesapMakinesiApplication.java
            controller/
              HesapController.java
              KisiController.java
            dto/
              Kisi.java
              Sayilar.java
            service/
              HesapService.java
              KisiService.java
    resources/
      application.properties
pom.xml
```

## Dosyalar Kısaca

- HesapMakinesiApplication java dosyası uygulamayı başlatıyor
- HesapController java dosyası hesaplama isteklerini alıyor
- HesapService java dosyası toplama çıkarma çarpma ve bölme işlemlerini yapıyor
- Sayilar java dosyası kullanıcıdan gelen sayı listesini tutuyor
- KisiController java dosyası kişi bilgisi için örnek istek alanı oluşturuyor
- KisiService java dosyası sabit kişi bilgisini döndürüyor
- Kisi java dosyası kişi bilgilerini tutuyor
- application properties dosyası uygulama ayarlarını tutuyor
- pom xml dosyası proje paketlerini ve Maven ayarlarını tutuyor

## Kısa Açıklama

Bu proje basit bir hesap makinesi API projesidir.

Java Spring Boot ve Maven kullanılarak yapılmıştır.

Projede temel REST API mantığı kullanılmıştır.

Amaç kullanıcının gönderdiği sayılarla dört işlem yapmaktır.
