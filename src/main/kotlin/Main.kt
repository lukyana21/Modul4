/* Named Argument*/
//untuk mendeklarasikan isi dari parameter dengan menyebutkan nama parameternya lalu "="
//fun main(){
//    val hasil = cetak( awal="Luky", tengah="Ana",akhir="Adi")
//    print(hasil)
//}
//
//fun cetak(awal: String, tengah: String, akhir: String): String{
//    return "$awal $tengah $akhir"
//}


/*Default Argument*/
//default = setelan awal argument, digunakan ketika argumen tidak diberi nilai jadi yang dipakai nilai defaultnya
//fun main(){
//    val hasil = cetakNama("Ridian", akhir = "Putra")
//    print(hasil)
//}
//
//fun cetakNama(awal: String = "Luky", tengah: String = "Ana", akhir: String = "Adi"): String{
//    return "$awal $tengah $akhir"
//}


/*Variable Argument*/
//vararg = array tanpa batas, kelemahan hanya bisa menampung 1 type data,
//tidak boleh menaruh 2 vararg dalam 1 function,
//vararg dianjurkan berada di belakang,
//vararg bisa memasukkan datanya satu persatu.
//fun main(){
//    val hasil = jumlah(10,20,30,40,50,60)
//    print(hasil)
//}
//fun jumlah(vararg angka: Int):Int {
//    return angka.sum()
//}
//fun main(){
//    // (*)spread operator untuk memasukkan array ke dalam variabel argument
//    val bil = intArrayOf(1,2,3,4,5,6)
//    val hasil2 = jumlah2(1,2,3,4,5,6,*bil)
//    val hasil1 = jumlah1(bil)
//    println(hasil1)
//    println(hasil2)
//}
//fun jumlah1(angka: IntArray) = true
//fun jumlah2(vararg angka: Int) = true

/*Extension Function*/
//Int dibawah itu class yang bersifat final (semua type data final)
//Int bisa diganti dengan class yang menurunkan sifat.
//fun String.anak(){
//    println("Nilainya: $this")
//}
//
//fun main(){
//    "luky".anak()
//}
// *******type return*******//
//fun Int.anak(): Int{
//    return this + 10
//}
//fun main(){
//    print(90.anak())
//}

/*Extension Properties*/
//// properties = variabel lalu untuk get itu function yang digunakan untuk mengambil nilai dari anak.
//val Int.anak: Int
//    get() = this / 2
//
//fun main(){
//    print(10.anak)
//}

/*Nullable Receiver*/
//menjadikan variabel boleh null
//val Int?.luna: Int
//    get(){
//        if(this==null){
//            return 0
//        }else{
//            return this.div(2) //div adalah divide (/), dan times = kali (*)
//        }
//    }

// yang lebih singkat dari yang diatas menggunakan elvis
//val Int?.luna: Int
//    get() = this?.times(2) ?: 0
//
//fun main(){
//    val nilai: Int? = null
//    print(nilai.luna)
//}

////*****Contoh Yang Kedua*****//
//fun main(){
//    val value: Int? = null
//    val value1: Int? = null
//    println(value?.luna)
//    println(value1?.luna)
//}
//val Int.luna: Int
//    get() = this.div(2)

/*Function types*/
//model -> ()
//fun main(){
//    val angka: (Int, Int) -> Int =
//        {bil1, bil2 -> bil1 + bil2}
//
//    println(angka.invoke(5,5))
//    //boleh juga
//    println(angka(4,10))
//}
//// typealias digunakan untuk mengganti fungsi type
//typealias kalkulator = (Int, Int) -> Int
//fun main(){
//    val tambah: kalkulator = {a, b -> a + b}
//    val kali: kalkulator = {a, b -> a * b}
//
//    println(tambah.invoke(10,10))
//    print(kali(5,5))
//}
//Study Kasus
//typealias kenal = (String, Int) -> String
//typealias kalkulator = (Double, Double) -> Double
//fun main(){
//    val yuhuu: kenal = {nama, umur -> "namaku adalah $nama dan umurku $umur"}
//    val tambah: kalkulator = {a, b -> a + b}
//    val kurang: kalkulator = {a, b -> a - b}
//    val bagi: kalkulator = {a, b -> a / b}
//    val kali: kalkulator = {a, b -> a * b}
//
//    println(yuhuu.invoke("Luky", 21))
//    println(tambah.invoke(10.0,10.0))
//    println(kurang.invoke(10.0,10.0))
//    println(kali.invoke(10.0,9.0))
//    println(bagi.invoke(10.0,8.0))
//}
//? = boleh null ---nullable function type---
//typealias Aritmatic = ((Int, Int) -> Int)?
//fun main(){
//    val sum: Aritmatic =
//        {
//            valueA, valueB -> valueA + valueB
//        }
//
//    val hasil = sum?.invoke(10, 20)
//    print(hasil)
//}

/*lambda*/
//fun main(){
//    cetak1("luky")
//    cetak2()
//    cetak3("luky", 21)
//}
//
//val cetak1 = {nama: String -> println(nama)}
//val cetak2 = {println("Luky")}
//val cetak3 = {nama: String, umur: Int ->
//    print("nama saya adalah $nama, umur saya $umur")
//}
//Study kasus...
//fun main(){
//    tambah(1, 2)
//    println(kurang(4, 2))
//    println(kali(3, 6))
//    println(bagi(10.0, 2.0))
//    perkenalan("Luky", 21)
//}
//val tambah = {angka1: Int, angka2: Int -> println(angka1 + angka2)}
//val kurang = {angka1: Int, angka2: Int -> angka1 - angka2}
//val kali = {angka1: Int, angka2: Int -> angka1 * angka2}
//val bagi = {angka1: Double, angka2: Double -> angka1 / angka2}
//val perkenalan = {nama: String, umur: Int -> print("nama saya $nama, dan umur saya $umur")}

/*Catatan*/
//-----------------------------------------------------------------------------//

//cara1 = lambda saja (implicit)
//val cetak = { nilai: Int ->
//    nilai + nilai
//}

//cara2 = function type dan lambda (explicit)
//val cetak2: (Int) -> Int = { nilai ->
//    nilai + nilai
//}

//cara3 = anonymous fun
//val cetak3 = fun(nilai: Int) : Int =
//    nilai + nilai

//-----------------------------------------------------------------------------//

//Studi Kasus lain
//fun main(){
//    println(no1("Luky", 21, "Salatiga"))
//    no2(2)
//    println(no3(100))
//}
//
//val no1 = { nama: String, umur: Int, asal: String ->
//    "nama saya $nama, dan umur saya saat ini $umur, asal dari $asal"
//}
//
//val no2: (Int) -> Unit = {
//   nilai -> println(nilai*nilai)
//}
//
//val no3 = fun(nilai: Int) : Boolean = nilai <= 100

/*HOF*/
//memasukkan fun ke dalam parameter
//fun main(){
//    cetak(21.0, jumlah)
//    cetak(21.0, kurang)
//    cetak(21.0, kali)
//    cetak(21.0, bagi)
//}
//fun cetak(nilai: Double, coba: (Double) -> Double){
//    val hasil = coba(nilai)
//    println(hasil)
//}
//var jumlah: (Double) -> Double = {nilai -> nilai + nilai}
//var kurang: (Double) -> Double = {nilai -> nilai - nilai}
//var kali: (Double) -> Double = {nilai -> nilai * nilai}
//var bagi: (Double) -> Double = {nilai -> nilai / nilai}

//Studi Kasus//
//fun main(){
//    boss(karyawan, 21, "Salatiga")
//}
//fun boss(nama: (Int) -> String, umur: Int, kota: String){
//    val kenal = nama(4)
//    println("nama saya $kenal, umur saya $umur, asal dari $kota")
//}
//
//var karyawan: (Int) -> String = { nama ->
//    if(nama == 1){
//    "fahrul"
//    } else if(nama == 2){
//    "marchel"
//    } else if(nama == 3){
//    "nugroho"
//    } else if(nama == 4){
//    "luky"
//    } else {
//    "error"
//    }
//}

//Coba yang ke-2
//fun main(){
//    boss(20.0, 10.0, perhitungan,1.0)
//    boss(20.0, 20.0, perhitungan, 2.0)
//    boss(20.0, 10.0, perhitungan,3.0)
//    boss(20.0,10.0, perhitungan,4.0)
//}
//fun boss(nilai1: Double, nilai2: Double, coba: (Double, Double, Double) -> Double, pilihan: Double){
//    val hasil = coba(nilai1, nilai2, pilihan)
//    println(hasil)
//}
//var jumlah: (Double, Double) -> Double = {nilai1, nilai2 -> nilai1 + nilai2}
//var kurang: (Double, Double) -> Double = {nilai1, nilai2 -> nilai1 - nilai2}
//var kali: (Double, Double) -> Double = {nilai1, nilai2 -> nilai1 * nilai2}
//var bagi: (Double, Double) -> Double = {nilai1, nilai2 -> nilai1 / nilai2}

//var perhitungan: (Double, Double, Double) -> Double = { nilai1, nilai2, pilihan ->
//    if (pilihan == 1.0){
//        nilai1 + nilai2
//    }else if (pilihan == 2.0){
//        nilai1 - nilai2
//    }else if (pilihan == 3.0){
//        nilai1 * nilai2
//    }else if (pilihan == 4.0){
//        nilai1 / nilai2
//    }else{
//        0.0
//    }
//}

/*Lambda with Reciever*/
//fun main(){
//    print(buatKalimat())
//}
//fun buatKalimat(): String {
//    val alat = StringBuilder()
//    alat.append("Hallo ")
//    alat.append(" nama ")
//    alat.append("saya ")
//    alat.append("Luky")
//    return alat.toString()
//}

//Study Kasus
//fun main(){
//    print(buatKalimat("luky"))
//
//}
//fun buatKalimat(nama: String): String {
//    val alat = StringBuilder()
//    alat.append("Hallo")
//    alat.append(" nama ")
//    alat.append("saya ")
//    alat.append(nama)
//    return alat.toString()
//}
//

//fun main(){
//    boss ({
//        print("hallo")
//    })//Materi1

//    boss({
//        it.append("Hello")
//    })//Materi 2

//    boss({
//        append("Hello")
//    })//Materi 3
//}

//fun boss(gelas: () -> Unit){
//
//}//Materi 1

//fun boss(gelas: (StringBuilder) -> Unit){
//
//}//Materi 2

//fun boss(gelas: StringBuilder.() -> Unit){
//
//}//Materi 3

//fun main(){
//    val hasil = buatkalimat {
//        append("hello ")
//        append("nama ")
//        append("saya ")
//        append("Luky")
//    }
//    print(hasil)
//}
//fun buatkalimat(aksi: StringBuilder.() -> Unit): String{
//    val alat = StringBuilder()
//    alat.aksi()
//    return alat.toString()
//}

/*Kotlin Standard Library*/
//run, width, apply -> this
//let, also -> it
//fun main(){
//    val kalimat = "Hello"
//    val hasil = kalimat.run {
//        val dari = this
//        val ke = this.replace("Hello", "Babi")
//        "ganti kata dari $dari ke $ke"
//    }
//    println("Hasil : $hasil")
//}

//Studi Kasus (Run) -> mengembalikan nilai
//fun main(){
//    val angka = 21
//    val hasil = angka.run {
//        val dari = this
//        val pangkat = this*this
//        "Pangkat dua dari $dari adalah $pangkat"
//    }
//    println("Hasil : $hasil")
//}

//(with) -> Unit
//fun main(){
//    val pesan = "Hello Babi!"
//    with(pesan){
//        println("kalimat : $this")
//        println("pjng kalimat ${this.length}")
//    }
//}

//Studi kasus
//fun main(){
//    val angka = 1
//    val pangkat = 0
//    with(pangkat){
//        var hasil = 1
//        for (i in 1..this){
//            hasil = hasil * angka
//        }
//        print(hasil)
//    }
//}

//Apply
//fun main(){
//    val kalimat = StringBuilder().apply {
//        append("Hallo ")
//        append("Luky ")
//        append("Ana ")
//        append("Adi ")
//        append("Pratama")
//    }
//    print(kalimat.toString())
//}

//Let (biarkan dijalankan)
//fun main(){
//    val pesan: String? = "Luky"
//    pesan?.let{
//        val panjang = it.length
//        val teks = "panjang teks $panjang"
//        println(teks)
//    } ?: run{
//        val teks = "panjangnya null"
//        println(teks)
//    }
//}

//Also
//hanya dapat dipanggil sekali
//fun main(){
//    val botol = "Air"
//    val rian = botol
//    val luky = botol
//    println("Luky : $luky")
//    println("Rian : $rian")
//<-----Penulisan yang benar----->
//    val botol = "Air"
//    val rian = botol.also {
//        val luky = it
//        println("Luky : $luky")
//    }
//    println("Rian : $rian")
//}

//Referensi Member "::" digunakan untuk menggantikan fun type
//fun main(){
//    val jumlah: (Int, Int) -> Int = ::babi
//    println(jumlah(10, 20))
//}
//fun babi(angka1: Int, angka2: Int): Int{
//    return angka1+angka2
//}

//fun main() {
//    val rentang = 1..20
//    val angkaGenap = rentang.filter(::cariGenap)
//    println(angkaGenap)
//}
//fun cariGenap(bil: Int) = bil % 2 == 0

//fun main(){
//    val rentang = 1..20
//    val angkaGenap = rentang.filter(Int::cariGenap)
//    println(angkaGenap)
//}
//fun Int.cariGenap() = this % 2 == 0

//var pesan = "Luky"
//fun main(){
//    println(::pesan.name)
//    println(::pesan.get())
//    ::pesan.set("Ana")
//    println(::pesan.get())
//}

//var angka1 = 10.0
//val angka2 = 5.0
//fun main(){
//    val jumlah: luna = ::luky
//    println(jumlah(10.0,20.0))
//    val kurang: luna = ::ana
//    println(kurang(20.0,10.0))
//    val kali: luna = ::adi
//    println(kali(2.0,4.0))
//    val bagi: luna = ::pratama
//    println(bagi(4.0, 2.0))

//    ::angka1.set(12.0)
//    val jumlah: luna = ::perhitungan
//    println(jumlah(::angka1.get(), ::angka2.get(), 1))
//    val kurang: luna = ::perhitungan
//    println(kurang(10.0,5.0,2))
//    val kali: luna = ::perhitungan
//    println(kali(2.0,5.0,3))
//    val bagi: luna = ::perhitungan
//    println(bagi(10.0,5.0,4))
//
//}
//
//typealias luna = (Double, Double, Int) -> Double

//fun luky(angka1: Double, angka2: Double) = angka1 + angka2
//fun ana(angka1: Double, angka2: Double) = angka1 - angka2
//fun adi(angka1: Double, angka2: Double) = angka1 * angka2
//fun pratama(angka1: Double, angka2: Double) = angka1 / angka2
//fun perhitungan(angka1: Double, angka2: Double, angka3: Int): Double{
//    val hasil: Double
//    if (angka3 == 1){
//        hasil = angka1 + angka2
//    }else if (angka3 == 2){
//        hasil = angka1 - angka2
//    }else if (angka3 == 3){
//        hasil = angka1 * angka2
//    }else if (angka3 == 4){
//        hasil = angka1 / angka2
//    }else{
//        hasil = 0.0
//    }
//    return hasil
//}

//<-----fun inside fun----->
//fun main(){
//    tetapkanNama("Luky")
//}
//fun tetapkanNama(nama: String){
//    fun cetakNama(){
//        print(nama)
//    }
//    cetakNama()
//}

//fun main(){
//    jumlah(10, 0, 10)
//}
//fun jumlah(angka1: Int, angka2: Int, angka3: Int): Int{
//    fun validasi(nilai: Int){
//        if(nilai == 0){
//            throw IllegalArgumentException("Angka tidak boleh noll")
//        }
//    }
//    validasi(angka1)
//    validasi(angka2)
//    validasi(angka3)
//    return angka1+angka2+angka3
//}

//fun main() {
//    kalkulator(6.0, 0.0, 4)
//
//}
//
//fun kalkulator(angka1: Double, angka2: Double, pilihan: Int) {
//    fun validasi(nilai: Double) {
//        if (nilai == 0.0) {
//            throw IllegalArgumentException("Jangan dibagi 0 lah..")
//        }
//    }
//    if (pilihan == 1) {
//        println(angka1 + angka2)
//    } else if (pilihan == 2) {
//        println(angka1 - angka2)
//    } else if (pilihan == 3) {
//        println(angka1 * angka2)
//    } else if (pilihan == 4) {
//        validasi(angka2)
//        println(angka1 / angka2)
//    } else {
//        println("pilihan 1-4")
//    }
//}

//fun main(){
//    println(kalkulator(10.0, 0.0, "bagi"))
//}
//fun kalkulator(angka1: Double, angka2: Double, pilihan: String): String{
//    val luky: String
//    fun validasi(nilai: Double){
//        if (nilai == 0.0){
//            throw IllegalArgumentException("Jangan dibagi nol")
//        }
//    }
//    luky = when (pilihan) {
//        "tambah" -> ("${angka1 + angka2}")
//        "kurang" -> ("${angka1 - angka2}")
//        "kali" -> ("${angka1 * angka2}")
//        "bagi" -> {
//            validasi(angka2)
//            ("${angka1 / angka2}")
//        }
//        else -> "Pilihan tidak ada"
//    }
//    return luky
//}

//fun main(){
//    println(kalkulator(10.0, 0.0, "bagi"))
//}
//fun kalkulator(angka1: Double, angka2: Double, pilihan: String): String{
//    var luky: String
//    fun validasi(nilai: Double) {
//        if (nilai == 0.0) {
//            throw IllegalArgumentException("Jangan dibagi nol")
//        }
//    }
//        luky = if (pilihan == "jumlah"){
//            "Hasil jumlah : ${angka1 + angka2}"
//        }else if (pilihan == "kurang"){
//            "Hasil kurang : ${angka1 - angka2}"
//        }else if (pilihan == "kali"){
//            "${angka1 * angka2}"
//        }else if (pilihan == "bagi"){
//            validasi(angka2)
//            "${angka1 / angka2}"
//        }else{
//            "salah pilihan"
//        }
//        return luky
//    }

//<-----Fold----->
//fun main(){
//    val angka = listOf(1,2,3)
//    val hasil = angka.fold(10) {skrg,
//        item ->
//        println("Nilai saat ini $skrg")
//        println("Item : $item")
//        println()
//        skrg + item
//    }
//    println("Hasil fold: $hasil")
//}

//fun main(){
//    val angka = listOf(1,2,3)
//    val hasil = angka.foldRight(10) {item,
//        skrg ->
//        println("Nilai saat ini $skrg")
//        println("Item : $item")
//        println()
//        skrg + item
//    }
//    println("Hasil fold: $hasil")
//}

//<-----Drop-----> Drop = buang
//fun main(){
//    val angka = listOf(1,2,3,4,5,6)
//    val hasil = angka.drop(3)
//    println(hasil)
//}

//fun main(){
//    val angka = listOf(1,2,3,4,5,6)
//    val hasil = angka.dropLast(3)
//    println(hasil)
//}

//<-----Take-----> Take = mengambil dari depan
//fun main(){
//    val angka = listOf(1,2,3,4,5,6)
//    val hasil = angka.take(3)
//    println(hasil)
//}

//fun main(){
//    val angka = listOf(1,2,3,4,5,6)
//    val hasil = angka.takeLast(3)
//    println(hasil)
//}

//<-----slice-----> (potong atau ambil bagian)
//fun main(){
//    val total = listOf(1,2,3,4,5,6,7,8,9,10)
//
//    val hasil1 = total.slice(3..6)
//    val hasil2 = total.slice(3..6 step 3)
//
//    println(hasil1)
//    println(hasil2)
//}

//fun main(){
//    val index = listOf(0, 1, 6, 8)
//    val total = listOf(1,2,3,4,5,6,7,8,9,10)
//    val hasil = total.slice(index)
//    print(hasil)
//}

//<-----Distinct-----> (yang sama ditulis satu kali)
//fun main(){
//    val total = listOf(1,2,1,3,4,5,2,3,4,5)
//    val hasil = total.distinct()
//    println(hasil)
//}

//<-----Chunked-----> (membagi menjadi beberapa bagian)
//fun main(){
//    val kata = "QWERTY"
//    val hasil = kata.chunked(3)
//    val nama = "LukyAnaAdiPratama"
//    val coba = nama.chunked(2)
//
//    println(hasil)
//    println(coba)
//}

//fun main(){
//    val kata = "LUKY ANA"
//    val rubahdong = kata.chunked(3){
//        it.toString().toLowerCase()
//    }
//    print(rubahdong)
//}

/*<---------------Rekursif--------------->*/

//#tanpa rekursif
//fun main(){
//    print(factorial(5))
//}
//fun factorial(n: Int): Int{
//    return if (n == 1){
//        n
//    }else{
//        var result = 1
//        for(i in 1..n){
//            result *= i
//        }
//        result
//    }
//}

//#dengan rekursif 1
//fun main(){
//    print(factorial(9))
//}
//fun factorial(n: Int): Int{
//    return if (n == 1){
//        n
//    }else{
//        n * factorial(n-1)
//    }
//}

//#tailrec
//fun main(){
//    print(factorial(9999))
//}
//tailrec fun factorial(n: Int, hasil: Int = 1): Int{
//    val hasilBaru = n * hasil
//    return if (n == 1){
//        hasilBaru
//    }else{
//        factorial(n-1, hasilBaru)
//    }
//}

