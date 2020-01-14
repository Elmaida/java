-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jan 2020 pada 03.10
-- Versi server: 10.3.15-MariaDB
-- Versi PHP: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fakultas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dosen`
--

CREATE TABLE `dosen` (
  `Id_DOSEN` int(15) NOT NULL,
  `NAMA_DOSEN` varchar(30) NOT NULL,
  `ALAMAT` varchar(20) NOT NULL,
  `NO_HP` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `dosen`
--

INSERT INTO `dosen` (`Id_DOSEN`, `NAMA_DOSEN`, `ALAMAT`, `NO_HP`) VALUES
(2501001, 'Zuyyina Lutfa', 'Purwosari', '087111234565'),
(2501002, 'Nasruddin', 'Beji', '081333444555'),
(2501003, 'Chusniyah', 'Sidoarjo', '081456667879'),
(2501004, 'Malikun', 'Grati, Pasuruan', '085777788970'),
(2501005, 'Medik', 'Malang', '083234321454'),
(2501006, 'Syifa\'ul Hadi', 'Winongan', '081234555654'),
(2501007, 'Slamet Darmawan', 'Surabaya', '085987678909'),
(2501008, 'Khalimatus Sa\'diyah', 'Purwodadi', '083443554334'),
(2501009, 'Vina Wijaya', 'Malang', '087665665668'),
(2501010, 'Rizki Tanjung', 'Bekasi', '082223334444'),
(2501011, 'Elma Zuhria', 'Jakarta', '081000000888'),
(2501012, 'M Fakhrul Ardani', 'Bekasi', '086777666888'),
(2501013, 'Sholehuddin', 'Cangkringmalang', '081233444355'),
(2501014, 'Anwar Khoirillah ', 'Malang', '08655444567'),
(2501015, 'Lilis Sulistya', 'Prigen', '083221332134'),
(2501016, 'Iqbal Wijaya', 'Bangil', '087667999000'),
(2501017, 'Annisa Lutfa ', 'Surabaya', '083456765666'),
(2501018, 'Nur Afika', 'Purwodadi', '085345678700'),
(2501019, 'Nisa Maghfiroh', 'Malang', '085555666000'),
(2501020, 'Zakiyatul Umam', 'Banten', '082233223343'),
(2501021, 'Wakhidin', 'Wonorejo', '085134523444'),
(2501022, 'Bagas Pamungkas', 'Gempol', '086566655521'),
(2501023, 'Nailil Ramadani', 'Purwodadi', '083255567890'),
(2501024, 'Khanza Amirah', 'Pasuruan', '083333454787'),
(2501025, 'Aditya Pratama', 'Tangerang', '083455453455'),
(2501026, 'Kanaya Siregar', 'Bandung', '087667890000'),
(2501027, 'Camel Wort', 'Surabaya', '081232323323'),
(2501028, 'James Bolt', 'Jakarta', '082233443231'),
(2501029, 'Alexander Biden', 'Malang', '087789098766'),
(2501030, 'Sam Mithen', 'Kendari', '085987678777'),
(2501031, 'fahat', 'pandaan', '089789098999');

-- --------------------------------------------------------

--
-- Stand-in struktur untuk tampilan `kuliah`
-- (Lihat di bawah untuk tampilan aktual)
--
CREATE TABLE `kuliah` (
`NIM` bigint(12)
,`NAMA_MAHASISWA` varchar(45)
,`ALAMAT` varchar(45)
,`Id_DOSEN` int(15)
,`NAMA_DOSEN` varchar(30)
);

-- --------------------------------------------------------

--
-- Struktur dari tabel `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `NIM` bigint(12) NOT NULL,
  `Nama_Mahasiswa` varchar(45) NOT NULL,
  `Alamat` varchar(45) NOT NULL,
  `Nama_Orangtua` varchar(100) NOT NULL,
  `TTL` date NOT NULL,
  `NO_HP` bigint(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `Nama_Mahasiswa`, `Alamat`, `Nama_Orangtua`, `TTL`, `NO_HP`) VALUES
(2, '', '', '', '0000-00-00', 0),
(201869040001, 'Elmaida Khoirotuzzuhria', 'Baujeng', 'Khoirul Mustpfa', '1999-12-01', 87654567876),
(201869040002, 'Muhammad Fakhrul Ardani', 'Jl. Juanda Pandaan', 'Nursidah', '1999-12-31', 81232323323),
(201869040003, 'Mukhammad Rakha Ammar Raziq', 'Pohkecik, Baujeng', 'Nur Khabibah', '1999-08-25', 81358044871),
(201869040004, 'Keisha Anastasya Putri', 'Jl. Pahlawan Sunaryo, Pandaan', 'Suyono', '1999-07-20', 81232323323),
(201869040005, 'Putri Ayu Safitri', 'Pohkecik, Baujeng, Beji', 'Uliyah', '2000-01-13', 86789888999),
(201869040006, 'Ainur Rizky', 'Turus,Pandaan', 'Memet', '2000-02-03', 88765666777),
(201869040007, 'Muhammad Sahrul', 'Gunung Gansir, Beji', 'Hartutik', '1999-11-02', 81232222111),
(201869040008, 'Muhammad Najim Sahrowi', 'Gunung Gangsir, beji', 'Sutaji', '1999-10-05', 87111000999),
(201869040009, 'Annisa Keisha Ratu', 'Mojokerto', 'Sii Ummah', '2000-03-04', 89000888666),
(201869040010, 'Atiqotuz Zummah', 'Baujeng', 'Khoirul Faidzin', '2000-07-12', 81358044871),
(201869040011, 'Risalatul Muawannah', 'Kedawung, Pandaan', 'Sholeh', '1999-12-21', 81358044871),
(201869040012, 'Dafina Agustina', 'Sidogiri, Pasuruan', 'Yayak', '1999-08-15', 86777666888),
(201869040013, 'Rifqiyah', 'Puspo, Pasuruan', 'Ali', '1999-11-01', 81456667879),
(201869040014, 'Ainun Gita Risqi', 'Gerbo, Pasuruan', 'Danang', '1999-07-29', 85555666000),
(201869040015, 'Lalilatul Afidah', 'Prigen, Pasuruan', 'Sutoyo', '1999-12-13', 82233223343),
(201869040016, 'Fahriza Aulia', 'Sengon, Purwosari', 'Tutik', '1999-12-22', 87111000999),
(201869040017, 'Illusia Insyiroh', 'Grati, Pasuruan', 'Salamah', '1999-03-14', 87000999878),
(201869040018, 'Dhyan Putri Fidanti', 'Kasri, Pandaan', 'Agung', '1999-08-03', 81888999555),
(201869040019, 'Thita Maratus Solihah', 'Kasri, Pandaan', 'adino', '1999-03-11', 82999888767),
(201869040020, 'Zaenal Dimas', 'Kuti, Pandaan', 'Ajeng', '2000-01-21', 86897564555),
(201869040021, 'Avanul Abdul Fatah', 'Wonorejo, Pasuruan', 'Hakim', '2000-02-17', 87654567876),
(201869040022, 'Achmad Syahrialdi', 'Sidogiri, Pasuruan', 'Subandi', '2000-03-23', 81232323323),
(201869040023, 'Abdur Rohim Musa', 'Jetak, Pandaan', 'Sumani', '2000-02-14', 81456667879),
(201869040024, 'Aysari Fandi Ahmad', 'Gerbo, Pasuruan', 'Sumago', '2000-07-14', 85555666000),
(201869040025, 'Yerico Army Nanlohy', 'Gunung Gansir, Beji', 'adrio', '1999-12-31', 82233223343),
(201869040026, 'Syahrul Ridho', 'Pohkecik, Baujeng', 'Hasan', '1999-11-23', 81234567897),
(201869040027, 'Salman Alfarisi', 'Jl. Pahlawan Sunaryo, Pandaan', 'Adibah', '1999-08-16', 86566655521),
(201869040028, 'Jiddan Fajar Radita', 'Sengon, Purwosari', 'Muliyono', '1999-09-27', 83255567890),
(201869040029, 'Mustakim', 'Gerbo, Pasuruan', 'Munir', '1999-09-20', 83333454787),
(201869040030, 'Adimas Bayu Ramadhan', 'Gunung Gangsir, Beji', 'Maimunah', '2000-03-16', 83221332134);

-- --------------------------------------------------------

--
-- Struktur untuk view `kuliah`
--
DROP TABLE IF EXISTS `kuliah`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `kuliah`  AS  select `mahasiswa`.`NIM` AS `NIM`,`mahasiswa`.`Nama_Mahasiswa` AS `NAMA_MAHASISWA`,`mahasiswa`.`Alamat` AS `ALAMAT`,`dosen`.`Id_DOSEN` AS `Id_DOSEN`,`dosen`.`NAMA_DOSEN` AS `NAMA_DOSEN` from (`mahasiswa` join `dosen`) where `dosen`.`Id_DOSEN` <> 0 ;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`Id_DOSEN`);

--
-- Indeks untuk tabel `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
