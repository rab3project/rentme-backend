
create schema rentme;

use rentme;

DROP TABLE IF EXISTS `Products`;

CREATE TABLE `Products` (
  `name` varchar(50) NOT NULL,
  `uploadDate` date DEFAULT NULL,
  `rentedIndicator` tinyint(1) NOT NULL,
  `rentCount` int(50) DEFAULT NULL,
  `imageHttp` varchar(200) DEFAULT NULL,
  `uploadedByuserid` bigint(40) NOT NULL,
  `pricePerDay` double DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `Products_ibfk_1_idx` (`uploadedByuserid`),
  CONSTRAINT `Products_ibfk_1` FOREIGN KEY (`uploadedByuserid`) REFERENCES `user_login` (`id`)
) ENGINE=InnoDB;



CREATE TABLE `rentedItems` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `rentedByUserLId` bigint(20) NOT NULL,
  `rentedProductId` bigint(20) NOT NULL,
  `rentFromDate` date DEFAULT NULL,
  `rentToDate` date DEFAULT NULL,
  `totalPrice` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `rentedByUserLId` (`rentedByUserLId`),
  KEY `rentedProductId` (`rentedProductId`),
  CONSTRAINT `rentedItems_ibfk_1` FOREIGN KEY (`rentedByUserLId`) REFERENCES `user_login` (`id`),
  CONSTRAINT `rentedItems_ibfk_2` FOREIGN KEY (`rentedProductId`) REFERENCES `Products` (`id`)
) ENGINE=InnoDB;


CREATE TABLE `user` (
  `id` bigint(15) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` varchar(100) DEFAULT NULL,
  `created_at` datetime NOT NULL,
  `email` varchar(70) DEFAULT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

CREATE TABLE `user_login` (
  `id` bigint(15) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `last_signed_on` datetime NOT NULL,
  `user_id` bigint(15) NOT NULL,
  `created_at` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_login_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB;

