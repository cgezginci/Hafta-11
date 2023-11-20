# Hafta-11 Kütüphane Projesi

Kitap : Kitapların özelliklerini içeren entity/tablo.

Yazar : Yazarların özelliklerini içeren entity/tablo.

Kategori : Kitap kategorilerini içeren entity/tablo.

Yayın Evi : Yayınevlerinin özelliklerini içeren entity/tablo.

Kitap Ödünç Alınması : Kitap ödünç alma işlemlerini izleyen entity/tablo. Bu tablo, ödünç alınan kitabın kim tarafından alındığını, alınma tarihini ve teslim tarihini içerecektir.

Her bir varlık için temel değişkenler aşağıdaki gibidir.

Kitap (Book):
id (Benzersiz kitap kimliği)

name(Kitap adı)

publicationYear (Yayın yılı)

stock (Kütüphanedeki miktarı)

Yazar (Author):
id (Benzersiz yazar kimliği)

name (Yazarın adı)

birthDate (Yazarın doğum yılı)

country (Yazarın ülkesi)

Kategoriler (Category):
id (Benzersiz kategori kimliği)

name (Kategori adı)

description (Kategori tanımı)

Yayınevi (Publisher)
id (Benzersiz kimliği)

name (Yayınevi ismi)

establishmentYear (Kuruluş yılı)

address (Yayınevi adresi)

Kitap Ödünç Alma (BookBorrowing)
id (Benzersiz kimliği)

borrowerName (Kitap ödünç alan kişi adı soyadı)

borrowingDate (Kitap ödünç alma tarihi)

returnDate (Kitabın teslim edildiği tarih, ilk kayıtta null olacak. Kitap teslim edilince tarih güncellenecek)


