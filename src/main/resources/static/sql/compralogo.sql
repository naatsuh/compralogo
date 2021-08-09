-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10-Ago-2021 às 01:37
-- Versão do servidor: 10.4.19-MariaDB
-- versão do PHP: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `compralogo`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `compras`
--

CREATE TABLE `compras` (
  `id` int(11) NOT NULL,
  `produto` varchar(80) DEFAULT NULL,
  `codigo` varchar(100) NOT NULL,
  `quantidade_un` decimal(12,5) DEFAULT NULL,
  `valor_un` decimal(10,4) DEFAULT NULL,
  `valor_total_un` decimal(10,4) DEFAULT NULL,
  `id_comercio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `compra_comercio`
--

CREATE TABLE `compra_comercio` (
  `id` int(11) NOT NULL,
  `tipo_do_comercio` varchar(60) DEFAULT NULL,
  `nome_do_comercio` varchar(120) DEFAULT NULL,
  `valor_total_compra` decimal(10,2) DEFAULT NULL,
  `data` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dispesas_fixas`
--

CREATE TABLE `dispesas_fixas` (
  `id` int(11) NOT NULL,
  `agua` decimal(10,2) DEFAULT NULL,
  `luz` decimal(10,2) DEFAULT NULL,
  `gas` decimal(10,2) DEFAULT NULL,
  `internet` decimal(10,2) DEFAULT NULL,
  `mes_ano` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `dividas_cartoes`
--

CREATE TABLE `dividas_cartoes` (
  `id` int(11) NOT NULL,
  `banco` decimal(10,2) NOT NULL,
  `valor_divida` decimal(10,2) NOT NULL,
  `total_pago` decimal(10,2) NOT NULL,
  `total_a_pagar` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `receitas`
--

CREATE TABLE `receitas` (
  `id` int(11) NOT NULL,
  `salario` decimal(10,2) NOT NULL,
  `decimo_terceiro` decimal(10,2) NOT NULL,
  `ferias` decimal(10,2) NOT NULL,
  `gratifcacao` decimal(10,2) NOT NULL,
  `restituicao_imposto_renda` decimal(10,2) NOT NULL,
  `heranca` decimal(10,2) NOT NULL,
  `outros` decimal(10,2) NOT NULL,
  `dinheiro_guardado` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_comercio` (`id_comercio`);

--
-- Índices para tabela `compra_comercio`
--
ALTER TABLE `compra_comercio`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `dispesas_fixas`
--
ALTER TABLE `dispesas_fixas`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `dividas_cartoes`
--
ALTER TABLE `dividas_cartoes`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `receitas`
--
ALTER TABLE `receitas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `compras`
--
ALTER TABLE `compras`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `compra_comercio`
--
ALTER TABLE `compra_comercio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `dispesas_fixas`
--
ALTER TABLE `dispesas_fixas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `dividas_cartoes`
--
ALTER TABLE `dividas_cartoes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `receitas`
--
ALTER TABLE `receitas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
