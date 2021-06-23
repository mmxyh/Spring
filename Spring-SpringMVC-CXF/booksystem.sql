/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50709
 Source Host           : localhost:3306
 Source Schema         : booksystem

 Target Server Type    : MySQL
 Target Server Version : 50709
 File Encoding         : 65001

 Date: 16/09/2019 11:03:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment`  (
  `book_id` int(20) NOT NULL,
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_number` int(11) NOT NULL,
  `appointment_time` datetime(0) NOT NULL,
  `expect_return_time` datetime(0) NOT NULL,
  `real_return_time` datetime(0) NULL DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT 0 COMMENT '0 借出；1 已还；2 超时未还',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of appointment
-- ----------------------------
INSERT INTO `appointment` VALUES (103, 1, 20080808, '2017-08-02 11:37:24', '2017-08-02 11:37:24', '2017-08-03 18:22:32', 1);

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '图书ID',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书名称',
  `number` int(11) NOT NULL COMMENT '图书数量',
  `detail` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图书描述',
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1111232 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '图书表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (107, '活着6', 106, '描述6');
INSERT INTO `book` VALUES (108, '活着7', 107, '描述7');
INSERT INTO `book` VALUES (109, '活着8', 108, '描述8');
INSERT INTO `book` VALUES (110, '活着9', 109, '描述9');
INSERT INTO `book` VALUES (111, '111', 111, '111');
INSERT INTO `book` VALUES (113, '活着12', 112, '描述12');
INSERT INTO `book` VALUES (114, '活着13', 113, '描述13');
INSERT INTO `book` VALUES (115, '活着14', 114, '描述14');
INSERT INTO `book` VALUES (116, '活着15', 115, '描述15');
INSERT INTO `book` VALUES (117, '活着16', 116, '描述16');
INSERT INTO `book` VALUES (118, '活着17', 117, '描述17');
INSERT INTO `book` VALUES (119, '活着18', 118, '描述18');
INSERT INTO `book` VALUES (120, '活着19', 119, '描述19');
INSERT INTO `book` VALUES (121, '活着20', 120, '描述20');
INSERT INTO `book` VALUES (122, '活着21', 121, '描述21');
INSERT INTO `book` VALUES (124, '活着23', 123, '描述23');
INSERT INTO `book` VALUES (125, '活着24', 124, '描述24');
INSERT INTO `book` VALUES (126, '活着25', 125, '描述25');
INSERT INTO `book` VALUES (127, '活着26', 126, '描述26');
INSERT INTO `book` VALUES (128, '活着27', 127, '描述27');
INSERT INTO `book` VALUES (129, '活着28', 128, '描述28');
INSERT INTO `book` VALUES (130, '活着29', 129, '描述29');
INSERT INTO `book` VALUES (131, '活着30', 130, '描述30');
INSERT INTO `book` VALUES (132, '活着31', 131, '描述31');
INSERT INTO `book` VALUES (133, '活着32', 132, '描述32');
INSERT INTO `book` VALUES (134, '活着33', 133, '描述33');
INSERT INTO `book` VALUES (135, '活着34', 134, '描述34');
INSERT INTO `book` VALUES (136, '活着35', 135, '描述35');
INSERT INTO `book` VALUES (137, '活着36', 136, '描述36');
INSERT INTO `book` VALUES (138, '活着37', 137, '描述37');
INSERT INTO `book` VALUES (139, '活着38', 138, '描述38');
INSERT INTO `book` VALUES (140, '活着39', 139, '描述39');
INSERT INTO `book` VALUES (141, '活着40', 140, '描述40');
INSERT INTO `book` VALUES (142, '活着41', 141, '描述41');
INSERT INTO `book` VALUES (143, '活着42', 142, '描述42');
INSERT INTO `book` VALUES (144, '活着43', 143, '描述43');
INSERT INTO `book` VALUES (145, '活着44', 144, '描述44');
INSERT INTO `book` VALUES (146, '活着45', 145, '描述45');
INSERT INTO `book` VALUES (147, '活着46', 146, '描述46');
INSERT INTO `book` VALUES (148, '活着47', 147, '描述47');
INSERT INTO `book` VALUES (150, '活着49', 149, '描述49');
INSERT INTO `book` VALUES (151, '活着50', 150, '描述50');
INSERT INTO `book` VALUES (152, '活着51', 151, '描述51');
INSERT INTO `book` VALUES (153, '活着52', 152, '描述52');
INSERT INTO `book` VALUES (154, '活着53', 153, '描述53');
INSERT INTO `book` VALUES (155, '活着54', 154, '描述54');
INSERT INTO `book` VALUES (156, '活着55', 155, '描述55');
INSERT INTO `book` VALUES (157, '活着56', 156, '描述56');
INSERT INTO `book` VALUES (158, '活着57', 157, '描述57');
INSERT INTO `book` VALUES (160, '活着59', 159, '描述59');
INSERT INTO `book` VALUES (161, '活着60', 160, '描述60');
INSERT INTO `book` VALUES (162, '活着61', 161, '描述61');
INSERT INTO `book` VALUES (163, '活着62', 162, '描述62');
INSERT INTO `book` VALUES (164, '活着63', 163, '描述63');
INSERT INTO `book` VALUES (166, '活着65', 165, '描述65');
INSERT INTO `book` VALUES (167, '活着66', 166, '描述66');
INSERT INTO `book` VALUES (168, '活着67', 167, '描述67');
INSERT INTO `book` VALUES (169, '活着68', 168, '描述68');
INSERT INTO `book` VALUES (170, '活着69', 169, '描述69');
INSERT INTO `book` VALUES (171, '活着70', 170, '描述70');
INSERT INTO `book` VALUES (172, '活着71', 171, '描述71');
INSERT INTO `book` VALUES (173, '活着72', 172, '描述72');
INSERT INTO `book` VALUES (174, '活着73', 173, '描述73');
INSERT INTO `book` VALUES (175, '活着74', 174, '描述74');
INSERT INTO `book` VALUES (176, '活着75', 175, '描述75');
INSERT INTO `book` VALUES (177, '活着76', 176, '描述76');
INSERT INTO `book` VALUES (178, '活着77', 177, '描述77');
INSERT INTO `book` VALUES (179, '活着78', 178, '描述78');
INSERT INTO `book` VALUES (180, '活着79', 179, '描述79');
INSERT INTO `book` VALUES (181, '活着80', 180, '描述80');
INSERT INTO `book` VALUES (182, '活着81', 181, '描述81');
INSERT INTO `book` VALUES (183, '活着82', 182, '描述82');
INSERT INTO `book` VALUES (184, '活着83', 183, '描述83');
INSERT INTO `book` VALUES (185, '活着84', 184, '描述84');
INSERT INTO `book` VALUES (186, '活着85', 185, '描述85');
INSERT INTO `book` VALUES (187, '活着86', 186, '描述86');
INSERT INTO `book` VALUES (188, '活着87', 187, '描述87');
INSERT INTO `book` VALUES (189, '活着88', 188, '描述88');
INSERT INTO `book` VALUES (190, '活着89', 189, '描述89');
INSERT INTO `book` VALUES (191, '活着90', 190, '描述90');
INSERT INTO `book` VALUES (192, '活着91', 191, '描述91');
INSERT INTO `book` VALUES (193, '活着92', 192, '描述92');
INSERT INTO `book` VALUES (194, '活着93', 193, '描述93');
INSERT INTO `book` VALUES (195, '活着94', 194, '描述94');
INSERT INTO `book` VALUES (196, '活着95', 195, '描述95');
INSERT INTO `book` VALUES (197, '活着96', 196, '描述96');
INSERT INTO `book` VALUES (198, '活着97', 197, '描述97');
INSERT INTO `book` VALUES (199, '活着98', 198, '描述98');
INSERT INTO `book` VALUES (200, '活着99', 199, '描述99');
INSERT INTO `book` VALUES (201, '活着0', 100, '描述0');
INSERT INTO `book` VALUES (202, '活着1', 101, '描述1');
INSERT INTO `book` VALUES (203, '活着2', 102, '描述2');
INSERT INTO `book` VALUES (204, '活着3', 103, '描述3');
INSERT INTO `book` VALUES (205, '活着4', 104, '描述4');
INSERT INTO `book` VALUES (206, '活着5', 105, '描述5');
INSERT INTO `book` VALUES (207, '活着6', 106, '描述6');
INSERT INTO `book` VALUES (208, '活着7', 107, '描述7');
INSERT INTO `book` VALUES (209, '活着8', 108, '描述8');
INSERT INTO `book` VALUES (210, '活着9', 109, '描述9');
INSERT INTO `book` VALUES (222, '3333', 6666, '5555');
INSERT INTO `book` VALUES (1111, '111', 11, '111');
INSERT INTO `book` VALUES (1121, '11', 11, '11');
INSERT INTO `book` VALUES (1221, '12', 22, '1222');
INSERT INTO `book` VALUES (2111, '11', 11, '11');
INSERT INTO `book` VALUES (11111, '1111', 1111, '11');
INSERT INTO `book` VALUES (1111231, '11', 11, '11');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_number` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`user_id`, `user_number`) USING BTREE,
  UNIQUE INDEX `user_number`(`user_number`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, 'HiSEN', '13820080808', '1234', '20080808');
INSERT INTO `user` VALUES (6, '阿星', '13820080001', '北京市朝阳区', '20080001');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `gender` int(1) NOT NULL,
  `age` int(11) NOT NULL,
  `pwd` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '密码,MD5加密',
  `user_state` int(11) NOT NULL COMMENT '0:正常,1:锁定,2:封禁',
  `create_time` date NOT NULL COMMENT '创建时间',
  `last_time` date NULL DEFAULT NULL COMMENT '上次登录时间',
  `update_time` date NULL DEFAULT NULL COMMENT '更新时间',
  `user_type` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (1, 'hisen', 1, 25, '28-80-51-21-1357-57-120-4292-821873-76-6107', 0, '2017-08-27', '2017-08-27', '2017-08-27', 0);

SET FOREIGN_KEY_CHECKS = 1;
