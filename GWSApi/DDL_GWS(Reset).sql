CREATE DATABASE  IF NOT EXISTS `db_gws` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_gws`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: db_gws
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_clientes`
--

DROP TABLE IF EXISTS `tb_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_clientes` (
  `id_cliente` binary(16) NOT NULL,
  `id_demanda` binary(16) NOT NULL,
  `nome_empresa` varchar(255) NOT NULL,
  `nome_cliente` varchar(255) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `url_img` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `id_cliente` (`id_cliente`),
  UNIQUE KEY `id_demanda` (`id_demanda`),
  CONSTRAINT `tb_clientes_ibfk_1` FOREIGN KEY (`id_demanda`) REFERENCES `tb_demandas` (`id_demanda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_clientes`
--

LOCK TABLES `tb_clientes` WRITE;
/*!40000 ALTER TABLE `tb_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_demandas`
--

DROP TABLE IF EXISTS `tb_demandas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_demandas` (
  `id_demanda` binary(16) NOT NULL,
  `titulo` varchar(255) NOT NULL,
  `logo` varchar(255) NOT NULL,
  `descricao` text NOT NULL,
  `anexo` varchar(255) DEFAULT NULL,
  `prioridade` bit(2) NOT NULL,
  `privacidade` bit(1) NOT NULL,
  `status` bit(2) NOT NULL,
  `data_inical` datetime NOT NULL,
  `data_final` datetime NOT NULL,
  `custo` double(12,2) NOT NULL,
  PRIMARY KEY (`id_demanda`),
  UNIQUE KEY `id_demanda` (`id_demanda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_demandas`
--

LOCK TABLES `tb_demandas` WRITE;
/*!40000 ALTER TABLE `tb_demandas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_demandas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_hardskills`
--

DROP TABLE IF EXISTS `tb_hardskills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_hardskills` (
  `id_hardskill` binary(16) NOT NULL,
  `nome` varchar(150) NOT NULL,
  PRIMARY KEY (`id_hardskill`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_hardskills`
--

LOCK TABLES `tb_hardskills` WRITE;
/*!40000 ALTER TABLE `tb_hardskills` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_hardskills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_hardskills_usuarios`
--

DROP TABLE IF EXISTS `tb_hardskills_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_hardskills_usuarios` (
  `id_hardskill` binary(16) NOT NULL,
  `id_usuario` binary(16) NOT NULL,
  KEY `id_hardskill` (`id_hardskill`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `tb_hardskills_usuarios_ibfk_1` FOREIGN KEY (`id_hardskill`) REFERENCES `tb_hardskills` (`id_hardskill`),
  CONSTRAINT `tb_hardskills_usuarios_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_hardskills_usuarios`
--

LOCK TABLES `tb_hardskills_usuarios` WRITE;
/*!40000 ALTER TABLE `tb_hardskills_usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_hardskills_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_segmentos`
--

DROP TABLE IF EXISTS `tb_segmentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_segmentos` (
  `id_segmento` binary(16) NOT NULL,
  `segmento` varchar(150) NOT NULL,
  PRIMARY KEY (`id_segmento`),
  UNIQUE KEY `id_segmento` (`id_segmento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_segmentos`
--

LOCK TABLES `tb_segmentos` WRITE;
/*!40000 ALTER TABLE `tb_segmentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_segmentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_segmentos_demandas`
--

DROP TABLE IF EXISTS `tb_segmentos_demandas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_segmentos_demandas` (
  `id_segmento` binary(16) DEFAULT NULL,
  `id_demanda` binary(16) DEFAULT NULL,
  KEY `tb_segmentos_demandas_pk1_idx` (`id_segmento`),
  KEY `tb_segmentos_demandas_pk2_idx` (`id_demanda`),
  CONSTRAINT `tb_segmentos_demandas_pk1` FOREIGN KEY (`id_segmento`) REFERENCES `tb_segmentos` (`id_segmento`),
  CONSTRAINT `tb_segmentos_demandas_pk2` FOREIGN KEY (`id_demanda`) REFERENCES `tb_demandas` (`id_demanda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_segmentos_demandas`
--

LOCK TABLES `tb_segmentos_demandas` WRITE;
/*!40000 ALTER TABLE `tb_segmentos_demandas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_segmentos_demandas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_softskills`
--

DROP TABLE IF EXISTS `tb_softskills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_softskills` (
  `id_softskill` binary(16) NOT NULL,
  `nome` varchar(150) NOT NULL,
  PRIMARY KEY (`id_softskill`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_softskills`
--

LOCK TABLES `tb_softskills` WRITE;
/*!40000 ALTER TABLE `tb_softskills` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_softskills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_softskills_usuarios`
--

DROP TABLE IF EXISTS `tb_softskills_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_softskills_usuarios` (
  `id_softskill` binary(16) NOT NULL,
  `id_usuario` binary(16) NOT NULL,
  KEY `id_softskill` (`id_softskill`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `tb_softskills_usuarios_ibfk_1` FOREIGN KEY (`id_softskill`) REFERENCES `tb_softskills` (`id_softskill`),
  CONSTRAINT `tb_softskills_usuarios_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_softskills_usuarios`
--

LOCK TABLES `tb_softskills_usuarios` WRITE;
/*!40000 ALTER TABLE `tb_softskills_usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_softskills_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuarios`
--

DROP TABLE IF EXISTS `tb_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_usuarios` (
  `id_usuario` binary(16) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `tipo_usuario` tinyint NOT NULL,
  `sobrenome` varchar(150) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(60) NOT NULL,
  `data_cadastro` datetime NOT NULL,
  `data_ferias` datetime NOT NULL,
  `designacao` text NOT NULL,
  `cidade` varchar(255) NOT NULL,
  `estado` varchar(255) NOT NULL,
  `hora_semanais` time NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `id_usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuarios`
--

LOCK TABLES `tb_usuarios` WRITE;
/*!40000 ALTER TABLE `tb_usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_usuarios_demandas`
--

DROP TABLE IF EXISTS `tb_usuarios_demandas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_usuarios_demandas` (
  `id_usuario` binary(16) NOT NULL,
  `id_demanda` binary(16) NOT NULL,
  KEY `id_demanda` (`id_demanda`),
  KEY `id_usuario` (`id_usuario`),
  CONSTRAINT `tb_usuarios_demandas_ibfk_1` FOREIGN KEY (`id_demanda`) REFERENCES `tb_demandas` (`id_demanda`),
  CONSTRAINT `tb_usuarios_demandas_ibfk_2` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_usuarios_demandas`
--

LOCK TABLES `tb_usuarios_demandas` WRITE;
/*!40000 ALTER TABLE `tb_usuarios_demandas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_usuarios_demandas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-30 15:57:20
