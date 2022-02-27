# Invariant

- Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah `invariant`
- Invariant artinya tidak boleh di substitusi dengan `subtype (child)` atau `supertype (parent)`
- Artinya saat kita membuat object `Contoh<String>`, maka `tidak sama dengan Contoh<Object>`
- Begitupun sebaliknya, saat membuat object `Contoh<Object>`, maka tidak sama dengan `Contoh<String>`
- Ingat! Ini berhubungan dengan struktur pewarisan Class di Java
- Bahwa class Object itu adalah sebagai parent dari semua class, termasuk String dan Integer