# SSM框架基础
简单的CRUD等基础功能

GitHub：https://github.com/mmxyh/SSMDemo

博客：https://blog.csdn.net/Trista_1999/article/details/100878791


# 前言
**用到的技术点：**
* 框架：Spring(AOP、DI、IOC) + SpringMVC + Mybatis + CXF
* 数据库：MySQL
* 前端框架：Bootstrap快速搭建JSP页面
* 项目管理：MAVEN
* 开发工具：IntellijIDEA
* 开发环境：Windows

# 准备
准备部分主要包括数据库建表、SSM框架的搭建启动。
###数据库建表

### MySQL
~~~sql
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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

INSERT INTO `book` VALUES (1, '活着15', 115, '描述15');
INSERT INTO `book` VALUES (2, '活着16', 116, '描述16');
INSERT INTO `book` VALUES (3, '活着17', 117, '描述17');
INSERT INTO `book` VALUES (4, '活着18', 118, '描述18');
INSERT INTO `book` VALUES (5, '活着19', 119, '描述19');
INSERT INTO `book` VALUES (6, '活着20', 120, '描述20');
INSERT INTO `book` VALUES (7, '活着21', 121, '描述21');
INSERT INTO `book` VALUES (8, '活着23', 123, '描述23');
INSERT INTO `book` VALUES (9, '活着24', 124, '描述24');
INSERT INTO `book` VALUES (10, '活着25', 125, '描述25');
INSERT INTO `book` VALUES (11, '活着26', 126, '描述26');
INSERT INTO `book` VALUES (12, '活着27', 127, '描述27');
INSERT INTO `book` VALUES (13, '活着28', 128, '描述28');
INSERT INTO `book` VALUES (14, '活着29', 129, '描述29');
INSERT INTO `book` VALUES (15, '活着30', 130, '描述30');

SET FOREIGN_KEY_CHECKS = 1;
~~~

###Redis

- 在redis.windows.conf文件中修改Redis端口号、密码等配置，修改完成后使用`redis-server redis.windows.conf`命令重新启动
- 在Redis安装目录下执行`redis-cli -h 127.0.0.1 -p 6379 -a 密码`打开Redis操作界面
- 若没有设置密码，value不填
 
  `<!--<property name="password" value="${redis.password}"/>-->`
  
   `<property name="password" value=""></property>`
         

## SSM项目搭建与启动
1.配置：
- 配置tomecat server
    不能设置一级域名，否则跳转会有问题
- 配置resources/properties/jdbc.properties
- 注意resources/mybatis/mybatis-config.xml的驼峰命名转换
  <!-- 开启驼峰命名转换:Table{create_time} -> Entity{createTime} -->
    <setting name="mapUnderscoreToCamelCase" value="true" />
    
   
2.启动：    
- 打开 http://localhost:8082 (端口改为你的)
- 账号/密码:admin/admin





