/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : housecrm

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2016-10-31 14:30:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cell
-- ----------------------------
DROP TABLE IF EXISTS `cell`;
CREATE TABLE `cell` (
  `cellId` int(11) NOT NULL,
  `cellName` varchar(255) DEFAULT NULL,
  `cellFloor` int(11) DEFAULT NULL,
  `cellCustomerId` int(11) DEFAULT NULL,
  `cellCustomerName` varchar(255) DEFAULT NULL,
  `cellArea` double DEFAULT NULL,
  `cellMoney` double DEFAULT NULL,
  `cellTotal` double DEFAULT NULL,
  `cellPoint` double DEFAULT NULL,
  `ceSubdistrictId` int(11) DEFAULT NULL,
  `cellState` int(11) DEFAULT NULL,
  PRIMARY KEY (`cellId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cell
-- ----------------------------

-- ----------------------------
-- Table structure for cushcustomer
-- ----------------------------
DROP TABLE IF EXISTS `cushcustomer`;
CREATE TABLE `cushcustomer` (
  `cushId` int(11) NOT NULL,
  `cushCustomerCard` int(11) DEFAULT NULL,
  `cushUserName` varchar(255) DEFAULT NULL,
  `cushDate` varchar(255) DEFAULT NULL,
  `cushMoney` double DEFAULT NULL,
  `cushState` int(11) DEFAULT NULL,
  `cushMoneyState` int(11) DEFAULT NULL,
  PRIMARY KEY (`cushId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cushcustomer
-- ----------------------------

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customerId` int(11) NOT NULL,
  `customerName` varchar(255) DEFAULT NULL,
  `customerPhone` varchar(255) DEFAULT NULL,
  `customerPhone2` varchar(255) DEFAULT NULL,
  `customerAddr` varchar(255) DEFAULT NULL,
  `customerCard` varchar(255) DEFAULT NULL,
  `customerCardname` varchar(255) DEFAULT NULL,
  `cellId` int(11) DEFAULT NULL,
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('524112851', '刘一', '123', '456', '保定高碑店辛立庄', '789', '刘一', null);
INSERT INTO `customer` VALUES ('524226234', '刘二', '123', '456', '望京', '789', '刘二', null);
INSERT INTO `customer` VALUES ('524402503', '刘三', '1212', '23123', '顺义', '545', '刘三', null);

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `logId` int(11) NOT NULL,
  `logUserId` int(11) DEFAULT NULL,
  `logUsername` varchar(255) DEFAULT NULL,
  `loginIp` varchar(255) DEFAULT NULL,
  `operation` varchar(255) DEFAULT NULL,
  `logDate` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`logId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menuId` int(11) NOT NULL,
  `menuName` varchar(255) DEFAULT NULL,
  `menuUrl` varchar(255) DEFAULT NULL,
  `menuType` varchar(255) DEFAULT NULL,
  `parentId` int(11) DEFAULT NULL,
  `menuState` int(11) DEFAULT NULL,
  PRIMARY KEY (`menuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `orderId` int(11) NOT NULL,
  `orderCustomerId` int(11) DEFAULT NULL,
  `orderCustomerName` varchar(255) DEFAULT NULL,
  `orderCellId` int(11) DEFAULT NULL,
  `orderDate` varchar(255) DEFAULT NULL,
  `orderUserId` int(11) DEFAULT NULL,
  `orderState` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for pushcell
-- ----------------------------
DROP TABLE IF EXISTS `pushcell`;
CREATE TABLE `pushcell` (
  `pushId` int(11) NOT NULL,
  `pushDate` varchar(255) DEFAULT NULL,
  `pushCellId` int(11) DEFAULT NULL,
  `pushCushId` int(11) DEFAULT NULL,
  `pushCushName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pushId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pushcell
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` int(11) NOT NULL,
  `roleName` varchar(255) DEFAULT NULL,
  `roleDate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for rolemenu
-- ----------------------------
DROP TABLE IF EXISTS `rolemenu`;
CREATE TABLE `rolemenu` (
  `id` int(11) NOT NULL,
  `roleId` int(11) DEFAULT NULL,
  `menuId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rolemenu
-- ----------------------------

-- ----------------------------
-- Table structure for subdistrict
-- ----------------------------
DROP TABLE IF EXISTS `subdistrict`;
CREATE TABLE `subdistrict` (
  `subdistrictId` int(11) NOT NULL,
  `subdistrictName` varchar(255) DEFAULT NULL,
  `subdistrictDiscribe` varchar(255) DEFAULT NULL,
  `subdistrictAddr` varchar(255) DEFAULT NULL,
  `subdistrictPic` varchar(255) DEFAULT NULL,
  `subdistrictBelong` varchar(255) DEFAULT NULL,
  `subdistrictPic2` varchar(255) DEFAULT NULL,
  `subdistrictPic3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`subdistrictId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subdistrict
-- ----------------------------
INSERT INTO `subdistrict` VALUES ('131874075', '米兰花园', '这个小区很漂亮啊', '1122222222', 'http://192.168.107.128/images/2016-09-29/131874147.jpg', '新区', 'http://192.168.107.128/images/2016-09-29/131874484.jpg', 'http://192.168.107.128/images/2016-09-29/131875687.jpg');
INSERT INTO `subdistrict` VALUES ('641693025', '玫瑰园', '玫瑰园是最好的小区', '高碑店', 'http://192.168.107.128/images/2016-10-28/641693245.jpg', null, 'http://192.168.107.128/images/2016-10-28/641694328.jpg', 'http://192.168.107.128/images/2016-10-28/641695045.jpg');
INSERT INTO `subdistrict` VALUES ('687583291', '观湖公馆', '家乡宁德美如画 美不美，家乡水！亲不亲，故乡情！我们是家乡的山水哺育长大的，是家乡的文化把我们领进知识的海洋。我的家乡----宁德，它是一个繁华昌盛的小城市，它虽不如伤海东方明珠那么璀璨，也不如北京万里长城那么举世闻名。但它在三十年的努力改变之下，终于变成了一个美丽的城市。 曾经宁德是一个在人心中微不足道的小县城。', '高碑店', 'http://192.168.107.128/images/2016-10-17/687583393.png', null, 'http://192.168.107.128/images/2016-10-17/687585891.png', 'http://192.168.107.128/images/2016-10-17/687587162.jpg');

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser` (
  `sysId` int(11) NOT NULL,
  `sysName` varchar(255) DEFAULT NULL,
  `sysPassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sysId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sysuser
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `userPassword` varchar(255) DEFAULT NULL,
  `userSex` varchar(255) DEFAULT NULL,
  `userPhone` char(11) DEFAULT NULL,
  `userState` int(11) DEFAULT NULL,
  `userCard` char(255) DEFAULT NULL,
  `userCardname` varchar(255) DEFAULT NULL,
  `userAddr` varchar(255) DEFAULT NULL,
  `userInDate` varchar(255) DEFAULT NULL,
  `userOutDate` varchar(255) DEFAULT NULL,
  `userRoleid` int(11) DEFAULT NULL,
  `loginIntime` varchar(255) DEFAULT NULL,
  `loginOuttime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '21232F297A57A5A743894A0E4A801FC3', '男', '213321555', '0', '11', 'admin', '望京', '2015-01-01', null, '1', null, null);
INSERT INTO `user` VALUES ('2', 'aaa', '21232F297A57A5A743894A0E4A801FC3', '男', '111', '0', '12', '张三', '望京', '2015-01-01', null, '1', null, null);
INSERT INTO `user` VALUES ('3', 'bb', '21232F297A57A5A743894A0E4A801FC3', '男', '1521111545', '0', '123123123', '王方方', '百度333', '2015-01-01', null, '1', null, null);
INSERT INTO `user` VALUES ('128359559', 'lixianlaing', 'F7EEB1F38880BD362507E38883AC07DC', '男', '151886', '0', '123456789123456789', '李贤良', '辛立庄', '2016-09-29', null, null, null, null);
INSERT INTO `user` VALUES ('353147990', 'xuelin', '16737D84879CD8C902EA9D23094A8F08', '女', '23123', '0', '23', '学林', '平谷', '2016-09-20', null, null, null, null);
INSERT INTO `user` VALUES ('353366446', 'zhujiang', '7431E8F2DAE5316830771927B6ADD351', '男', '2123', '0', '515521', '朱江', '顺义', '2016-09-20', null, null, null, null);
INSERT INTO `user` VALUES ('504561915', 'lisi', 'DC3A8F1670D65BEA69B7B65048A0AC40', '女', '1231', '0', '1231231', '李四', '顺义', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('504602127', 'baipan', '2E059D3998E3C8A15E7BD2864CF7A1BF', '男', '121', '0', '512', '白攀', '铁匠营', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('504645472', 'wangyang', 'B1860DAC1E44203372C22F24771B57D2', '男', '454', '0', '56465', '王洋', '望京新世界', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('504702155', 'congyan', 'BEB2FCBB4177884E206D6ABC7A5E2465', '女', '1521111545', '0', '62', '丛岩', '顺义国展', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('504748388', 'kangmiao', 'A13AE1F82C2B5DAFC938C4F474AE6809', '男', '221231', '0', '51452', '康淼', '大兴亦庄', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('504842597', 'wenzheng', 'C2CD5FF234EC60E406060A5EA857BAFC', '男', '12123', '0', '4521514', '温铮', '顺义石门苑', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('504889496', 'liyonghui', '484A325940D352304944F1DDB28398E0', '男', '21231', '0', '54154', '李永辉', '望京大医院', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('504944164', 'lishuaishuai', '758268F2D77E8E165A64CD2A455B6B2D', '女', '564465', '0', '5464', '李帅帅', '顺义铁匠营新村', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('505015456', 'huweizhong', 'A10FE7E70A146580941100DEE69565AC', '男', '3232', '0', '2632', '胡卫中', '顺义铁匠营', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('505078727', 'zenganrong', '39913DDA2230E5E5CB88DFFFCBDCCC9C', '女', '2132123', '0', '512312', '曾安荣', '顺义顺义地铁站', '2016-09-22', null, null, null, null);
INSERT INTO `user` VALUES ('505128567', 'lihailiang', '15FAC808983603A1E5BD4AF5B8F317E4', '男', '524132', '0', '454', '李海亮', '崔各庄北皋', '2016-09-22', null, null, null, null);
