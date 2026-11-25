# Spring MVC, jQuery ve PrimeUI Örnekleri

Spring MVC 4'ü XML ve Java tabanlı yapılandırmayla tanıtan, ardından JSP sayfalarında jQuery ve PrimeUI
bileşenlerinin kullanımını gösteren üç küçük eğitim projesi.

> **Not:** Bu depo 2017 yılında eğitim/örnek amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları eskidir
> ve bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

| Klasör | Ne yapar |
|---|---|
| `Spring-Hello/` | XML yapılandırmalı (`web.xml`, `mvc-dispatcher-servlet.xml`) ilk Spring MVC uygulaması. `/hi` ve `/si` adreslerindeki denetleyicilerle `singleton` ve `prototype` bean kapsamlarını ve yol parametresi (`@PathVariable`) kullanımını gösterir. |
| `Spring-Hello-Web/` | Aynı örneğin XML'siz, Java sınıflarıyla (`WebInitializer`, `WebConfig`, `ViewConfig`) yapılandırılmış hali; `request` ve `session` kapsamlı denetleyiciler içerir. |
| `SpringMVC-PrimeUI/` | Java yapılandırmalı Spring MVC üzerinde `/hi/jquery` ve `/hi/primeui` sayfaları. PrimeUI sayfası, yerel verilerle sayfalanan ve süzülebilen bir `puidatatable` tablosu gösterir. jQuery ve PrimeUI dosyaları `WebContent/resources/lib/` altında depoya gömülüdür. |

Her klasör ayrı bir Maven `war` projesidir; JSP'ler `WebContent/WEB-INF/jsp/` altındadır.

## Teknolojiler

- Java 8
- Spring Framework 4.0.0 (spring-core, spring-web, spring-webmvc)
- Servlet API 3.0, JSP + JSTL 1.2
- jQuery 3.2.1 ve PrimeUI (gömülü statik dosyalar)
- Maven, `maven-war-plugin` 3.0.0 (kaynak klasörü `src/`, web içeriği `WebContent/`)

## Çalıştırma

1. İlgili klasörde `mvn package` çalıştırın; `target/` altında bir `.war` dosyası oluşur.
2. Bu dosyayı Servlet 3.0 destekleyen bir sunucuya (ör. Tomcat 7/8) kopyalayın.
3. Tarayıcıdan `http://localhost:8080/<war-adı>/hi` (PrimeUI örneği için `/hi/primeui`) adresini açın.

Projeler Eclipse'te *Dynamic Web Project* olarak hazırlanmıştı. Eclipse ayar dosyaları artık depoda yok;
Eclipse'e *Existing Maven Project* olarak aktarıp sunucuya oradan da ekleyebilirsiniz.
