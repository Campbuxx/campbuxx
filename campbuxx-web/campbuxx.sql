/*
MySQL Data Transfer
Source Host: localhost
Source Database: campbuxx
Target Host: localhost
Target Database: campbuxx
Date: 3/19/2016 2:59:58 PM
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tb_category
-- ----------------------------
DROP TABLE IF EXISTS `tb_category`;
CREATE TABLE `tb_category` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_category` varchar(20) NOT NULL,
  `c_disc` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_posts
-- ----------------------------
DROP TABLE IF EXISTS `tb_posts`;
CREATE TABLE `tb_posts` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_title` varchar(50) NOT NULL,
  `p_category` int(11) NOT NULL,
  `p_content` varchar(21000) DEFAULT NULL,
  `p_create_date` datetime DEFAULT NULL,
  `p_student_id` int(11) DEFAULT NULL,
  `p_image` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `user_first_name` varchar(20) NOT NULL,
  `user_last_name` varchar(20) NOT NULL,
  `user_student_id` int(11) NOT NULL,
  `user_password` varchar(50) NOT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `tb_category` VALUES ('1', 'books', 'book');
INSERT INTO `tb_category` VALUES ('2', 'stationery', 'stationery');
INSERT INTO `tb_category` VALUES ('3', 'laptops', 'laptop');
INSERT INTO `tb_category` VALUES ('4', 'job offers', 'job');
INSERT INTO `tb_category` VALUES ('5', 'activities', 'activities');
INSERT INTO `tb_category` VALUES ('6', 'others', 'others');
INSERT INTO `tb_posts` VALUES ('1', 'test_1', '1', 'TestTest', '2016-02-10 17:17:13', '15247', 'resources/upload/no-img.png');
INSERT INTO `tb_posts` VALUES ('2', 'test_2', '1', 'test test test test', '2016-03-13 15:21:24', '15247', 'resources/upload/no-img.png');
INSERT INTO `tb_posts` VALUES ('3', 'Waterman fountain pen', '2', '<p>Waterman fountain pen</p>\r\n<p><strong>Waterman fountain pen</strong></p>\r\n<p><strong><em>Waterman fountain pen</em></strong></p>\r\n<p><strong><em><span style=\"text-decoration: underline;\">Waterman fountain pen</span></em></strong></p>\r\n<p><strong><em><span style=\"text-decoration: underline;\"><span style=\"text-decoration: line-through;\">Waterman fountain pen</span></span></em></strong></p>\r\n<p><strong><em><span style=\"text-decoration: underline;\"><span style=\"text-decoration: line-through;\"><br /></span></span></em>Waterman fountain pen</strong></p>\r\n<p><em>Waterman fountain pen</em></p>', '2016-03-17 17:43:58', '15247', 'resources/upload/no-img.png');
INSERT INTO `tb_posts` VALUES ('4', 'Waterman fountain pen', '2', '<p>asasas</p>\r\n<p><strong>sdsdsfsfsdf</strong></p>\r\n<p><strong>asadsadas</strong></p>', '2016-03-17 18:38:07', '15247', 'resources/upload/152472007_Ford_Shelby_GT500.jpg');
INSERT INTO `tb_user` VALUES ('Test', 'Smith', '12345', '12345', '4103445689');
INSERT INTO `tb_user` VALUES ('Liang', 'Zhao', '15247', '12345', '5101101110');
INSERT INTO `tb_user` VALUES ('Sam', 'Pathen', '66666', '66666', '4511002330');
