package com.example.aplikasikotlin

fun main() {
    println("+=======================================================================+") //Judul
    println("|------------------------------BIODATA SAYA-----------------------------|") //Judul
    println("+=======================================================================+") //Judul

    bio("Indikasari Tita Rahmadani", "Perempuan", "Ponorogo, 22 Oktober 2004", 19, "Tegalsari, Jetis, Ponorogo",
        "812-3208-8457", "titarahmadani22@gmail.com") //Data pribadi

    hobi("membaca,Membaca adalah hobi saya sejak kecil.    \n",
        "|Membaca adalah hobi saya sejak kecil.                                  | \n" +
                "|Bagi saya, buku adalah jendela ilmu dan sumber inspirasi.              | \n" +
                "|Setiap buku yang saya baca membawa saya ke dunia yang baru,            | \n" +
                "|memberikan saya pelajaran hidup yang berharga, dan memperluas wawasan. |") //hobi dan deskripsi

}
fun bio(nama:String, jenis_kelamin:String, TTL:String, umur: Int, alamat:String, no:String, email:String){ //function biodata
    val bio ="""
  | Nama           : $nama                            |  
  | Jenis Kelamin  : $jenis_kelamin                                            |
  | TTL            : $TTL                            |
  | Umur           : $umur tahun                                             |
  | Alamat         : $alamat                           |
  | No. HP         : 0$no                                       |
  | E-mail         : $email                            |
    """.trimIndent()
    println(bio) //Cetak biodata
    println("+-------+---------------------------------------------------------------+")} //garis
fun hobi(jenis:String, desc:String){ //function hobi
    val hobi = """
|  Hobi |                                                               |
+-------+                                                               |
$desc                                                                  |
+_______________________________________________________________________+
""".trimIndent();
    println(hobi) //Cetak hobi
}