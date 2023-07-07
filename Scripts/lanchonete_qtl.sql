-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 07/07/2023 às 02:37
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `lanchonete_qtl`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `borda`
--

CREATE TABLE `borda` (
  `nome` varchar(20) NOT NULL,
  `valor` double NOT NULL,
  `recheio` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `borda`
--

INSERT INTO `borda` (`nome`, `valor`, `recheio`) VALUES
('Catupiry', 6, 'catupiry'),
('Cheddar', 5, 'cheddar');

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `codigo` int(4) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `cpf` varchar(12) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `aniversario` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`codigo`, `nome`, `cpf`, `endereco`, `telefone`, `aniversario`) VALUES
(81, 'Marcela', '22222222222', 'Rua L', '8888-8888,9999-9999', '1999-07-12'),
(82, 'Natalia', '88888888888', 'Rua C', '1111-1111,4444-4444', '0085-01-20');

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `codigo` int(4) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `cpf` varchar(12) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `telefone` varchar(30) NOT NULL,
  `salario` double NOT NULL,
  `cargo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `funcionario`
--

INSERT INTO `funcionario` (`codigo`, `nome`, `cpf`, `endereco`, `telefone`, `salario`, `cargo`) VALUES
(61, 'Fernando', '11111111111', 'Rua M', '3333-3333,7777-8888', 2000, 'Atendente'),
(62, 'Claudio', '77777777777', 'Rua H', '1111-1111,4444-4444', 4000, 'Gerente');

-- --------------------------------------------------------

--
-- Estrutura para tabela `lanche`
--

CREATE TABLE `lanche` (
  `idLanche` int(6) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `precoVenda` double NOT NULL,
  `dataValidade` date NOT NULL,
  `peso` double NOT NULL,
  `pao` varchar(20) NOT NULL,
  `recheio` varchar(20) NOT NULL,
  `molho` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `lanche`
--

INSERT INTO `lanche` (`idLanche`, `nome`, `precoVenda`, `dataValidade`, `peso`, `pao`, `recheio`, `molho`) VALUES
(30, 'Sanduiche de Lombo', 10, '2023-01-10', 400, 'Frances', 'Lombo', 'Picante'),
(31, 'Sanduiche de Pernil', 15, '2023-01-10', 400, 'Franc?s', 'Penil', 'Tártaro');

-- --------------------------------------------------------

--
-- Estrutura para tabela `molho`
--

CREATE TABLE `molho` (
  `idMolho` int(4) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `molho`
--

INSERT INTO `molho` (`idMolho`, `nome`, `valor`) VALUES
(11, 'Tomate', 3),
(12, 'Gorgonzola', 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pagamento`
--

CREATE TABLE `pagamento` (
  `id_pedido` int(6) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `valorPago` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(6) NOT NULL,
  `nomeCliente` varchar(30) NOT NULL,
  `nomeFunc` varchar(30) NOT NULL,
  `taxaServico` double NOT NULL,
  `itensConsumidos` varchar(50) NOT NULL,
  `quantidade` int(6) NOT NULL,
  `valorTotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pedido`
--

INSERT INTO `pedido` (`idPedido`, `nomeCliente`, `nomeFunc`, `taxaServico`, `itensConsumidos`, `quantidade`, `valorTotal`) VALUES
(101, 'Natalia', 'Fernando', 10, 'Pizza Napolitana', 2, 90),
(102, 'Marcela', 'Fernando', 10, 'Coxinha', 3, 34),
(103, 'Marcela', 'Claudio', 10, 'Pizza Atum', 1, 70);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pizza`
--

CREATE TABLE `pizza` (
  `idPizza` int(6) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `precoVenda` double NOT NULL,
  `dataValidade` date NOT NULL,
  `peso` double NOT NULL,
  `molho` varchar(15) DEFAULT NULL,
  `recheio` varchar(15) DEFAULT NULL,
  `borda` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pizza`
--

INSERT INTO `pizza` (`idPizza`, `nome`, `precoVenda`, `dataValidade`, `peso`, `molho`, `recheio`, `borda`) VALUES
(41, 'Pizza Napolitana', 40, '2021-01-15', 600, 'Gorgonzola', 'Presunto', 'Cheddar'),
(42, 'Pizza Da Casa', 50, '2021-01-12', 600, 'Tomate', 'Bacon', 'Cheddar'),
(43, 'Pizza Atum', 60, '2021-01-15', 500, 'Tomate', 'Atum', 'Catupiry'),
(44, 'Pizza Queijo', 50, '2021-01-15', 500, 'Gorgonzola', 'Queijo', 'Cheddar');

-- --------------------------------------------------------

--
-- Estrutura para tabela `recheio`
--

CREATE TABLE `recheio` (
  `idRecheio` int(4) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `recheio`
--

INSERT INTO `recheio` (`idRecheio`, `nome`, `valor`) VALUES
(31, 'Presunto', 4),
(32, 'Queijo', 4),
(33, 'Bacon', 4),
(34, 'Atum', 6),
(35, 'Frango', 4);

-- --------------------------------------------------------

--
-- Estrutura para tabela `salgadinho`
--

CREATE TABLE `salgadinho` (
  `idSalgado` int(6) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `precoVenda` double NOT NULL,
  `dataValidade` date NOT NULL,
  `peso` double NOT NULL,
  `recheio` varchar(20) NOT NULL,
  `massa` varchar(20) NOT NULL,
  `tipo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `salgadinho`
--

INSERT INTO `salgadinho` (`idSalgado`, `nome`, `precoVenda`, `dataValidade`, `peso`, `recheio`, `massa`, `tipo`) VALUES
(20, 'Coxinha', 8, '2023-01-10', 200, 'Frango c/bacon', 'Foliada', 'Frito'),
(21, 'Pastel', 8, '2023-01-10', 200, 'Carne ', 'Cozida', 'Assado');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `borda`
--
ALTER TABLE `borda`
  ADD PRIMARY KEY (`nome`);

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`codigo`);

--
-- Índices de tabela `lanche`
--
ALTER TABLE `lanche`
  ADD PRIMARY KEY (`idLanche`);

--
-- Índices de tabela `molho`
--
ALTER TABLE `molho`
  ADD PRIMARY KEY (`idMolho`);

--
-- Índices de tabela `pagamento`
--
ALTER TABLE `pagamento`
  ADD PRIMARY KEY (`id_pedido`);

--
-- Índices de tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`);

--
-- Índices de tabela `pizza`
--
ALTER TABLE `pizza`
  ADD PRIMARY KEY (`idPizza`);

--
-- Índices de tabela `recheio`
--
ALTER TABLE `recheio`
  ADD PRIMARY KEY (`idRecheio`);

--
-- Índices de tabela `salgadinho`
--
ALTER TABLE `salgadinho`
  ADD PRIMARY KEY (`idSalgado`);

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `pagamento`
--
ALTER TABLE `pagamento`
  ADD CONSTRAINT `pagamento_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`idPedido`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
