/*
 Navicat Premium Data Transfer

 Source Server         : LOCAL
 Source Server Type    : MariaDB
 Source Server Version : 100213
 Source Host           : localhost:3306
 Source Schema         : belajar

 Target Server Type    : MariaDB
 Target Server Version : 100213
 File Encoding         : 65001

 Date: 04/09/2018 13:10:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mata_kuliah
-- ----------------------------
DROP TABLE IF EXISTS `mata_kuliah`;
CREATE TABLE `mata_kuliah` (
  `id` int(11) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mata_kuliah
-- ----------------------------
BEGIN;
INSERT INTO `mata_kuliah` VALUES (1, 'Bahasa');
INSERT INTO `mata_kuliah` VALUES (2, 'MTK');
COMMIT;

-- ----------------------------
-- Table structure for table_profile
-- ----------------------------
DROP TABLE IF EXISTS `table_profile`;
CREATE TABLE `table_profile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_lengkap` varchar(200) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `umur` int(11) DEFAULT NULL,
  `jenis_kelamin` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for table_student_matakuliah
-- ----------------------------
DROP TABLE IF EXISTS `table_student_matakuliah`;
CREATE TABLE `table_student_matakuliah` (
  `id` int(11) DEFAULT NULL,
  `id_student` int(11) DEFAULT NULL,
  `id_mata_kuliah` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_student_matakuliah
-- ----------------------------
BEGIN;
INSERT INTO `table_student_matakuliah` VALUES (1, 1, 1);
INSERT INTO `table_student_matakuliah` VALUES (2, 1, 2);
COMMIT;

-- ----------------------------
-- Table structure for table_students
-- ----------------------------
DROP TABLE IF EXISTS `table_students`;
CREATE TABLE `table_students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_students
-- ----------------------------
BEGIN;
INSERT INTO `table_students` VALUES (1, 'Student 1', 'Yogyajarta');
INSERT INTO `table_students` VALUES (2, 'Student 2', 'Bantul');
INSERT INTO `table_students` VALUES (3, 'Nama students', 'Adress students');
INSERT INTO `table_students` VALUES (4, 'Nama students dua', 'Adress students dua');
INSERT INTO `table_students` VALUES (5, 'Nama students dua adasdas', 'Adress students dua asdasdsd');
INSERT INTO `table_students` VALUES (6, 'Nama adasdas', 'Adress sdasdsd');
COMMIT;

-- ----------------------------
-- Table structure for table_user
-- ----------------------------
DROP TABLE IF EXISTS `table_user`;
CREATE TABLE `table_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT '''''''NULL''''''',
  `password` varchar(100) DEFAULT 'NULL',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of table_user
-- ----------------------------
BEGIN;
INSERT INTO `table_user` VALUES (2, 'Admin 2', 'Password admin 2');
INSERT INTO `table_user` VALUES (3, 'Admin 3', 'Password admin 2');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
