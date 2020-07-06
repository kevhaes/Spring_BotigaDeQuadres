
DROP TABLE IF EXISTS `PAINTING`;
DROP TABLE IF EXISTS `SHOP`;
DROP TABLE IF EXISTS `AUTHOR`;

CREATE TABLE `SHOP` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(250) DEFAULT NULL,
	`capacity` INT(11) DEFAULT NULL,
	PRIMARY KEY (`id`)
	
);

INSERT INTO SHOP(name,capacity)values('shop1',10);
INSERT INTO SHOP(name,capacity)values('shop2',20);
INSERT INTO SHOP(name,capacity)values('shop3',30);
INSERT INTO SHOP(name,capacity)values('shop4',50);
INSERT INTO SHOP(name,capacity)values('shop5',30);
INSERT INTO SHOP(name,capacity)values('shop6',80);
INSERT INTO SHOP(name,capacity)values('shop7',30);
INSERT INTO SHOP(name,capacity)values('shop8',70);
INSERT INTO SHOP(name,capacity)values('shop9',100);

CREATE TABLE `AUTHOR` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(250) DEFAULT NULL,
	PRIMARY KEY (`id`)
);

INSERT INTO AUTHOR(name)values('Unknown Artist');
INSERT INTO AUTHOR(name)values('author02');
INSERT INTO AUTHOR(name)values('author03');
INSERT INTO AUTHOR(name)values('author04');
INSERT INTO AUTHOR(name)values('author05');
INSERT INTO AUTHOR(name)values('author06');



CREATE TABLE `PAINTING` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(250) DEFAULT NULL,
	`price` INT(11) DEFAULT NULL,
	`date`  DATETIME DEFAULT NOW(),
	`shop_id` int(11) DEFAULT NULL,
	`author_id` int(11) DEFAULT NULL,
	PRIMARY KEY (`id`),
  	FOREIGN KEY (`shop_id`) REFERENCES `shop` (`id`),
  	FOREIGN KEY (`author_id`) REFERENCES `author` (`id`)
  	
  	
);




INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting01',100,3,1);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting02',200,1,5);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting03',300,2,1);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting04',300,4,5);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting05',300,4,4);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting06',300,4,2);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting07',300,2,1);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting08',300,6,1);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting09',300,7,4);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting10',300,7,2);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting11',300,7,1);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting12',300,7,1);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting13',300,7,3);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting14',300,8,5);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting15',300,8,1);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting16',300,5,3);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting17',300,8,1);
INSERT INTO PAINTING(name,price,shop_id,author_id)values('painting18',300,8,1);




