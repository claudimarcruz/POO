-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02/07/2023 às 20:55
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
-- Banco de dados: `petshop`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cao`
--

CREATE TABLE `cao` (
  `idCao` int(4) NOT NULL,
  `cor` varchar(15) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `idade` int(2) NOT NULL,
  `raca` varchar(30) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `porte` varchar(10) NOT NULL,
  `peso` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `cao`
--

INSERT INTO `cao` (`idCao`, `cor`, `nome`, `idade`, `raca`, `sexo`, `porte`, `peso`) VALUES
(1, 'cor1', 'cao1', 1, 'raca1', 'm', 'porte1', 1),
(2, 'cor2', 'cao2', 2, 'raca2', 'm', 'porte2', 2),
(3, 'cor3', 'cao3', 3, 'raca3', 'm', 'porte3', 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `gato`
--

CREATE TABLE `gato` (
  `idGato` int(4) NOT NULL,
  `cor` varchar(15) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `idade` int(2) NOT NULL,
  `raca` varchar(30) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `porte` varchar(10) NOT NULL,
  `peso` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `gato`
--

INSERT INTO `gato` (`idGato`, `cor`, `nome`, `idade`, `raca`, `sexo`, `porte`, `peso`) VALUES
(4, 'cor1', 'gato1', 4, 'raca1', 'm', 'porte1', 1),
(5, 'cor2', 'gato2', 5, 'raca2', 'm', 'porte2', 2),
(6, 'cor3', 'gato3', 6, 'raca3', 'm', 'porte3', 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `passaro`
--

CREATE TABLE `passaro` (
  `idPassaro` int(4) NOT NULL,
  `cor` varchar(15) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `idade` int(2) NOT NULL,
  `raca` varchar(30) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `anilha` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `passaro`
--

INSERT INTO `passaro` (`idPassaro`, `cor`, `nome`, `idade`, `raca`, `sexo`, `anilha`) VALUES
(7, 'cor1', 'passaro1', 1, 'raca1', 'm', 1),
(8, 'cor2', 'passaro2', 2, 'raca2', 'm', 2),
(9, 'cor3', 'passaro3', 3, 'raca3', 'm', 3),
(10, 'cor4', 'passaro4', 4, 'raca4', 'm', 4);

-- --------------------------------------------------------

--
-- Estrutura para tabela `proprietario`
--

CREATE TABLE `proprietario` (
  `cpf` int(12) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `data_nasc` date DEFAULT NULL,
  `endereco` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `proprietario`
--

INSERT INTO `proprietario` (`cpf`, `nome`, `telefone`, `email`, `data_nasc`, `endereco`) VALUES
(1, 'proprietario1', '1', 'email1', NULL, 'end1'),
(2, 'proprietario2', '2', 'email2', NULL, 'end2'),
(3, 'proprietario3', '3', 'email3', NULL, 'end3'),
(4, 'proprietario4', '4', 'email4', NULL, 'end4');

-- --------------------------------------------------------

--
-- Estrutura para tabela `proprietario_animal`
--

CREATE TABLE `proprietario_animal` (
  `cpf_prop` int(4) NOT NULL,
  `id_animal` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `proprietario_animal`
--

INSERT INTO `proprietario_animal` (`cpf_prop`, `id_animal`) VALUES
(1, 2),
(1, 6),
(1, 7),
(1, 10),
(2, 1),
(2, 9),
(3, 8),
(4, 3);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cao`
--
ALTER TABLE `cao`
  ADD PRIMARY KEY (`idCao`);

--
-- Índices de tabela `gato`
--
ALTER TABLE `gato`
  ADD PRIMARY KEY (`idGato`);

--
-- Índices de tabela `passaro`
--
ALTER TABLE `passaro`
  ADD PRIMARY KEY (`idPassaro`);

--
-- Índices de tabela `proprietario`
--
ALTER TABLE `proprietario`
  ADD PRIMARY KEY (`cpf`);

--
-- Índices de tabela `proprietario_animal`
--
ALTER TABLE `proprietario_animal`
  ADD PRIMARY KEY (`id_animal`),
  ADD KEY `cpf_prop` (`cpf_prop`);

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `proprietario_animal`
--
ALTER TABLE `proprietario_animal`
  ADD CONSTRAINT `proprietario_animal_ibfk_1` FOREIGN KEY (`cpf_prop`) REFERENCES `proprietario` (`cpf`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
