# Hafta-11 Kütüphane Projesi

Kitap : Kitapların özelliklerini içeren entity/tablo.

Yazar : Yazarların özelliklerini içeren entity/tablo.

Kategori : Kitap kategorilerini içeren entity/tablo.

Yayın Evi : Yayınevlerinin özelliklerini içeren entity/tablo.

Kitap Ödünç Alınması : Kitap ödünç alma işlemlerini izleyen entity/tablo. Bu tablo, ödünç alınan kitabın kim tarafından alındığını, alınma tarihini ve teslim tarihini içerecektir.

Her bir varlık için temel değişkenler aşağıdaki gibidir.


# Kitap (books)

id (Benzersiz kitap kimliği)

name(Kitap adı)

publicationYear (Yayın yılı)

stock (Kütüphanedeki miktarı)

---

# Yazar (authors)

id (Benzersiz yazar kimliği)

name (Yazarın adı)

birthDate (Yazarın doğum yılı)

country (Yazarın ülkesi)

---

# Kategoriler (categories)

id (Benzersiz kategori kimliği)

name (Kategori adı)

description (Kategori tanımı)

---

# Yayınevi (publishers)

id (Benzersiz kimliği)

name (Yayınevi ismi)

establishmentYear (Kuruluş yılı)

address (Yayınevi adresi)

---

# Kitap Ödünç Alma (bookborrowings)


id (Benzersiz kimliği)

borrowerName (Kitap ödünç alan kişi adı soyadı)

borrowingDate (Kitap ödünç alma tarihi)

returnDate (Kitabın teslim edildiği tarih, ilk kayıtta null olacak. Kitap teslim edilince tarih güncellenecek)

* Yazar Tablosu
  
 ![Ekran Görüntüsü (34)](https://github.com/cgezginci/Hafta-11/assets/143842154/64f2c587-0146-430e-a6d1-7c0af23160e5)

* Yayınevi Tablosu

![Ekran Görüntüsü (36)](https://github.com/cgezginci/Hafta-11/assets/143842154/1baaf473-05ca-45e8-ba96-ba99d97ca9bd)

* Kitap Tablosu

![Ekran Görüntüsü (35)](https://github.com/cgezginci/Hafta-11/assets/143842154/583b5dae-0206-42ae-98fe-3b8dbb0b3368)

* Kategori Tablosu

![Ekran Görüntüsü (37)](https://github.com/cgezginci/Hafta-11/assets/143842154/e1f0c3d1-3af4-4b23-9c82-5d4abd553de7)

*Kitap Kategori Tablosu

![Ekran Görüntüsü (38)](https://github.com/cgezginci/Hafta-11/assets/143842154/c6a9e3e5-21c1-4345-8aa8-ea145b54a7c4)

* Kitap Ödünç Alma Tablosu
  
![Ekran Görüntüsü (39)](https://github.com/cgezginci/Hafta-11/assets/143842154/18335084-f775-42d5-a069-f4435c09e02e)






