## Java I/O Ringkas

- **Scanner**: Mudah untuk input token, int, dan baris. Waspadai `nextInt()` + `nextLine()` issue.
- **BufferedReader**: Lebih cepat, cocok untuk baca baris penuh dan parsing manual.
- **Args**: Gunakan `String[] args` untuk input via command-line.
- **File I/O Teks**: Gunakan `BufferedReader` / `BufferedWriter` atau `Files.readAllLines()` untuk file kecil.
- **File I/O Biner**: Gunakan `FileInputStream` / `FileOutputStream` atau `Files.copy()`.
- **Try-with-resources**: Disarankan untuk otomatis menutup stream.
- **Output**: Gunakan `System.out.printf()` untuk format.
- **Pitfalls**: newline Scanner, encoding, EOF, file besar → pakai BufferedReader.
