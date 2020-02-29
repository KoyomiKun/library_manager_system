CREATE TABLE `Book`
(
    `id`      varchar(32) NOT NULL,
    `catalog` varchar(32) NOT NULL,
    `name`    varchar(50) NOT NULL,
    `press`   varchar(50) NOT NULL,
    `year`    INT         NOT NULL,
    `author`  varchar(32) NOT NULL,
    `price`   DOUBLE      NOT NULL,
    `amount`  INT         NOT NULL,
    `save`    INT         NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
CREATE TABLE `BorrowCard`
(
    `id`         varchar(32) NOT NULL,
    `name`       varchar(32) NOT NULL,
    `department` varchar(32) NOT NULL,
    `catalog`    varchar(500) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE `Manager`
(
    `id`          varchar(32) NOT NULL,
    `password`    varchar(32) NOT NULL,
    `name`        varchar(32) NOT NULL,
    `phoneNumber` varchar(500) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
CREATE TABLE `Record`
(
    `cardId`     varchar(32) NOT NULL,
    `bookId`     varchar(32) NOT NULL,
    `borrowDate` DATE DEFAULT NULL,
    `returnDate` DATE DEFAULT NULL,
    `managerId` varchar(32) NOT NULL,
    PRIMARY KEY (`cardId`, `bookId`),
    FOREIGN KEY (`cardId`) references BorrowCard (`id`),
    FOREIGN KEY (`bookId`) references Book (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;