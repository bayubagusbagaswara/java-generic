# Contravariant

- Contravariant artinya kita bisa melakukan subtitusi `supertype (parent)` dengan `subtype (child)`
- Caranya agar generic object kita menjadi contravariant adalah dengan menggunakan kata kunci `(? super SubClass)`
- Artinya saat kita membuat object `Contoh<Object>`, maka bisa disubtitusi menjadi `Contoh<? super String>`
- Contravariant adalah bisa `write` dan `read`
- Namun perlu berhati-hati ketika melakukan read, terutama jika sampai parent nya punya banyak child