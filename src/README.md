#  Program Concert Ticket
Program ini merupakan sistem sederhana untuk Manajemen Tiket Konser yang memungkinkan pengelolaan tiket, mencakup informasi tentang category, price, stock, dan pengaturan stock. Dirancang untuk memberikan pemahaman dasar tentang pemanfaatan objek dan kelas dalam pemrograman Java.
## Fitur
- Merepresentasi concert ticket dengan category, price, dan jumlah stock 
- Mengimplementasikan interface TicketDetailsPrinter untuk mencetak detail mengenai tiket
## Struktur Proyek
Proyek ini terdiri dari beberapa main class

- *ConcertTicket*: Kelas yang mewakili tiket konser dengan atribut seperti tujuan, harga, dan stok. Termasuk metode untuk mencetak detail tiket dan menyesuaikan stok.
- *Seat*: Kelas yang mewakili seat number yang memiliki tiket dan seat number. Termasuk metode untuk menampilkan nama seat dan detail tiket yang terkait.
- *Main*: Main class berfungsi sebagai titik masuk untuk menjalankan program. Menciptakan objek tiket konser dan seat, serta menampilkan detail tiket dan melakukan penyesuaian stok.

## Cara Menjalankan Proyek
1. Persyaratan: Pastikan Anda memiliki Java Development Kit (JDK) yang terinstal di komputer Anda.
2. Menjalankan Program:
- Setelah kompilasi berhasil, jalankan program dengan perintah:
  ```bash
    java Main
    ```

3. Atau pada Main Class di bagian kanan atas terdapat tulisan Current File, lalu click ikon segitiga warna hijau untuk menjalan kan program.
4. Hasil program akan menampilkan detail concert ticket dan informasi mengenai seat number, serta menunjukkan hasil penyesuaian stock.

## Output 
## Category: CAT A
## Location: Jakarta International Stadium
## Price: Rp1250000.0
## Discounted Price: Rp1000000.0
## Stock: 220
## Stock adjusted. New stock: 230
## Category: CAT A
## Location: Jakarta International Stadium
## Price: Rp1250000.0
## Discounted Price: Rp1000000.0
## Stock: 230