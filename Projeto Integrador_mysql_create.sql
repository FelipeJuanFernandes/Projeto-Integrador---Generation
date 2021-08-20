CREATE TABLE `Categoria` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`tipo` varchar(255) NOT NULL,
	`classificacao` varchar(255) NOT NULL,
	`ativo` BOOLEAN NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Produto` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(255) NOT NULL,
	`preco` DECIMAL(8,2) NOT NULL,
	`qtd` int NOT NULL,
	`descricao` varchar(1000) NOT NULL,
	`usuario_id` bigint NOT NULL,
	`categoria_id` bigint NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Usuario` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(300) NOT NULL,
	`email` varchar(300) NOT NULL,
	`senha` varchar(500) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk0` FOREIGN KEY (`usuario_id`) REFERENCES `Usuario`(`id`);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk1` FOREIGN KEY (`categoria_id`) REFERENCES `Categoria`(`id`);




