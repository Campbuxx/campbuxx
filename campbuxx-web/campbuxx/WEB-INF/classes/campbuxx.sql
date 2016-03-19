/*
MySQL Data Transfer
Source Host: localhost
Source Database: campbuxx
Target Host: localhost
Target Database: campbuxx
Date: 2/3/2016 5:25:19 PM
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_posts
-- ----------------------------
DROP TABLE IF EXISTS `tb_posts`;
CREATE TABLE `tb_posts` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_title` varchar(50) NOT NULL,
  `p_category` int(11) NOT NULL,
  `p_content` varchar(400) DEFAULT NULL,
  `p_create_date` datetime DEFAULT NULL,
  `p_student_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
INSERT INTO `tb_user` VALUES ('Liang', 'Zhao', '15247', '12345', null);
