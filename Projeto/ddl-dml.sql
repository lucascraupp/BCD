-- MySQL dump 10.13  Distrib 8.0.35, for Linux (x86_64)
--
-- Host: ampto.sj.ifsc.edu.br    Database: pp1lucas
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `acampamentos`
--

DROP TABLE IF EXISTS `acampamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acampamentos` (
  `jovem_id_jovem` int NOT NULL,
  `data` datetime(6) NOT NULL,
  PRIMARY KEY (`jovem_id_jovem`,`data`),
  CONSTRAINT `FKsgssqu0mmv7017gqppt5k11wa` FOREIGN KEY (`jovem_id_jovem`) REFERENCES `jovem` (`id_jovem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acampamentos`
--

LOCK TABLES `acampamentos` WRITE;
/*!40000 ALTER TABLE `acampamentos` DISABLE KEYS */;
INSERT INTO `acampamentos` VALUES (1,'2018-03-09 00:00:00.000000'),(1,'2018-04-09 00:00:00.000000'),(1,'2018-05-09 00:00:00.000000'),(2,'2018-03-09 00:00:00.000000'),(2,'2018-04-09 00:00:00.000000'),(2,'2018-05-09 00:00:00.000000'),(3,'2018-05-09 00:00:00.000000');
/*!40000 ALTER TABLE `acampamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alergias`
--

DROP TABLE IF EXISTS `alergias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alergias` (
  `id_alergias` int NOT NULL AUTO_INCREMENT,
  `alergia` varchar(45) NOT NULL,
  PRIMARY KEY (`id_alergias`),
  UNIQUE KEY `UK_5y6qe3abfi5cyglsvc6pgkwgn` (`alergia`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alergias`
--

LOCK TABLES `alergias` WRITE;
/*!40000 ALTER TABLE `alergias` DISABLE KEYS */;
INSERT INTO `alergias` VALUES (4,'Ácaro'),(2,'Amendoim'),(1,'Aranha'),(3,'Glúten'),(5,'Ovo');
/*!40000 ALTER TABLE `alergias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `areas`
--

DROP TABLE IF EXISTS `areas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `areas` (
  `id_areas` int NOT NULL AUTO_INCREMENT,
  `area` varchar(45) NOT NULL,
  PRIMARY KEY (`id_areas`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `areas`
--

LOCK TABLES `areas` WRITE;
/*!40000 ALTER TABLE `areas` DISABLE KEYS */;
INSERT INTO `areas` VALUES (1,'Ciência e Tecnologia'),(2,'Cultura'),(3,'Desportos'),(4,'Habilidades Escoteiras'),(5,'Serviços');
/*!40000 ALTER TABLE `areas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `distintivos`
--

DROP TABLE IF EXISTS `distintivos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `distintivos` (
  `id_distintivos` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`id_distintivos`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distintivos`
--

LOCK TABLES `distintivos` WRITE;
/*!40000 ALTER TABLE `distintivos` DISABLE KEYS */;
INSERT INTO `distintivos` VALUES (1,'Pata-tenra'),(2,'Saltador'),(3,'Rastreador'),(4,'Caçador');
/*!40000 ALTER TABLE `distintivos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especialidades`
--

DROP TABLE IF EXISTS `especialidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `especialidades` (
  `id_areas` int NOT NULL,
  `id_especialidades` int NOT NULL AUTO_INCREMENT,
  `especialidade` varchar(45) NOT NULL,
  PRIMARY KEY (`id_especialidades`),
  KEY `FKimdtag41f5gk324q0ylnmqlij` (`id_areas`),
  CONSTRAINT `FKimdtag41f5gk324q0ylnmqlij` FOREIGN KEY (`id_areas`) REFERENCES `areas` (`id_areas`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especialidades`
--

LOCK TABLES `especialidades` WRITE;
/*!40000 ALTER TABLE `especialidades` DISABLE KEYS */;
INSERT INTO `especialidades` VALUES (1,1,'Arqueologia'),(1,2,'Astronáutica'),(1,3,'Anatomia Humana'),(2,4,'Anime'),(2,5,'Budismo'),(2,6,'Arte em Origami'),(3,7,'Arco e Flecha'),(3,8,'Capoeira'),(3,9,'Boxe'),(4,10,'Almoxarifado'),(4,11,'Ferramentas de Corte'),(4,12,'Cidadania do Mundo'),(5,13,'Aquicultura'),(5,14,'Arte Digital'),(5,15,'Babá');
/*!40000 ALTER TABLE `especialidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `insignias`
--

DROP TABLE IF EXISTS `insignias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `insignias` (
  `id_insignias` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  PRIMARY KEY (`id_insignias`),
  UNIQUE KEY `UK_26esol2fhq3patd4ypp1gi7ux` (`nome`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `insignias`
--

LOCK TABLES `insignias` WRITE;
/*!40000 ALTER TABLE `insignias` DISABLE KEYS */;
INSERT INTO `insignias` VALUES (3,'INSÍGNIA DA BOA AÇÃO'),(4,'INSÍGNIA DA LUSOFONIA'),(1,'INSÍGNIA DO APRENDER'),(2,'INSÍGNIA DO CONESUL');
/*!40000 ALTER TABLE `insignias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jovem`
--

DROP TABLE IF EXISTS `jovem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jovem` (
  `id_jovem` int NOT NULL AUTO_INCREMENT,
  `id_tipo_sanguineo` int NOT NULL,
  `data_nasc` datetime(6) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  PRIMARY KEY (`id_jovem`),
  UNIQUE KEY `UK_4pdrra4efd4x22h54eajnyy7e` (`cpf`),
  KEY `FK7ht3pt6lnft5oof96l8i6e92w` (`id_tipo_sanguineo`),
  CONSTRAINT `FK7ht3pt6lnft5oof96l8i6e92w` FOREIGN KEY (`id_tipo_sanguineo`) REFERENCES `tipo_sanguineo` (`id_tipo_sanguineo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jovem`
--

LOCK TABLES `jovem` WRITE;
/*!40000 ALTER TABLE `jovem` DISABLE KEYS */;
INSERT INTO `jovem` VALUES (1,2,'2011-08-14 00:00:00.000000','865.411.217-45','will.ernest@gmail.com','3117 Stokes Flats','Ernest Will','(727) 936-3855 x5780'),(2,1,'2009-11-16 00:00:00.000000','683.083.207-16','onie@yahoo.com','238 Parisian Square','Onie Gulgowski','(641) 817-0445 x5535'),(3,5,'2014-07-04 00:00:00.000000','401.571.884-42','haag.francis@gmail.com','58314 Anjelica Landing','Francis Haag','(267) 872-4230'),(4,8,'2011-08-15 00:00:00.000000','724.724.140-30','caylaup@outlook.com','5715 Murazik Forge','Cayla Upton','(865) 301-6946 x0909'),(5,6,'2009-03-24 00:00:00.000000','258.668.417-62','marg.crui@gmail.com','25852 Corkery Bridge','Margherita Cruickshank','(574) 626-0169');
/*!40000 ALTER TABLE `jovem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jovem_alergias`
--

DROP TABLE IF EXISTS `jovem_alergias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jovem_alergias` (
  `alergias_id_alergias` int NOT NULL,
  `jovens_id_jovem` int NOT NULL,
  PRIMARY KEY (`alergias_id_alergias`,`jovens_id_jovem`),
  KEY `FKnjor570mrmbf8sssy5nwiqtt8` (`jovens_id_jovem`),
  CONSTRAINT `FKlfdpp2f4gkatnobjt2up99h23` FOREIGN KEY (`alergias_id_alergias`) REFERENCES `alergias` (`id_alergias`),
  CONSTRAINT `FKnjor570mrmbf8sssy5nwiqtt8` FOREIGN KEY (`jovens_id_jovem`) REFERENCES `jovem` (`id_jovem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jovem_alergias`
--

LOCK TABLES `jovem_alergias` WRITE;
/*!40000 ALTER TABLE `jovem_alergias` DISABLE KEYS */;
INSERT INTO `jovem_alergias` VALUES (4,1),(5,1),(1,2),(2,2),(3,2),(1,4),(3,5);
/*!40000 ALTER TABLE `jovem_alergias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jovem_responsaveis`
--

DROP TABLE IF EXISTS `jovem_responsaveis`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jovem_responsaveis` (
  `jovens_id_jovem` int NOT NULL,
  `responsaveis_responsavel` int NOT NULL,
  PRIMARY KEY (`jovens_id_jovem`,`responsaveis_responsavel`),
  KEY `FK6cfyjlybsmyrgxtvub5kf7yfb` (`responsaveis_responsavel`),
  CONSTRAINT `FK6cfyjlybsmyrgxtvub5kf7yfb` FOREIGN KEY (`responsaveis_responsavel`) REFERENCES `responsavel` (`responsavel`),
  CONSTRAINT `FKce9trbqi9hmatw2s6xvf89dl7` FOREIGN KEY (`jovens_id_jovem`) REFERENCES `jovem` (`id_jovem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jovem_responsaveis`
--

LOCK TABLES `jovem_responsaveis` WRITE;
/*!40000 ALTER TABLE `jovem_responsaveis` DISABLE KEYS */;
INSERT INTO `jovem_responsaveis` VALUES (1,1),(2,2),(3,2),(2,3),(3,4),(4,4),(3,5),(5,5);
/*!40000 ALTER TABLE `jovem_responsaveis` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `progresso_distintivo`
--

DROP TABLE IF EXISTS `progresso_distintivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `progresso_distintivo` (
  `jovem_id_jovem` int NOT NULL,
  `requisitos_distintivo_id_requisitos_distintivo` int NOT NULL,
  `data` datetime(6) NOT NULL,
  PRIMARY KEY (`jovem_id_jovem`,`requisitos_distintivo_id_requisitos_distintivo`),
  KEY `FK63h2qhl8n69i8r0a1ikvkrt9p` (`requisitos_distintivo_id_requisitos_distintivo`),
  CONSTRAINT `FK63h2qhl8n69i8r0a1ikvkrt9p` FOREIGN KEY (`requisitos_distintivo_id_requisitos_distintivo`) REFERENCES `requisitos_distintivo` (`id_requisitos_distintivo`),
  CONSTRAINT `FK9vvn1g89qhjd0gyvokyjw4mu8` FOREIGN KEY (`jovem_id_jovem`) REFERENCES `jovem` (`id_jovem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `progresso_distintivo`
--

LOCK TABLES `progresso_distintivo` WRITE;
/*!40000 ALTER TABLE `progresso_distintivo` DISABLE KEYS */;
INSERT INTO `progresso_distintivo` VALUES (1,1,'2018-03-02 00:00:00.000000'),(1,2,'2019-03-02 00:00:00.000000'),(1,3,'2020-03-02 00:00:00.000000'),(1,4,'2021-03-02 00:00:00.000000'),(2,1,'2018-03-02 00:00:00.000000'),(2,2,'2019-03-02 00:00:00.000000'),(2,3,'2020-03-02 00:00:00.000000'),(2,4,'2021-03-02 00:00:00.000000'),(3,1,'2018-03-02 00:00:00.000000'),(4,1,'2018-03-02 00:00:00.000000'),(4,2,'2019-03-02 00:00:00.000000'),(5,1,'2018-03-02 00:00:00.000000'),(5,2,'2019-03-02 00:00:00.000000'),(5,3,'2020-03-02 00:00:00.000000');
/*!40000 ALTER TABLE `progresso_distintivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `progresso_especialidade`
--

DROP TABLE IF EXISTS `progresso_especialidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `progresso_especialidade` (
  `jovem_id_jovem` int NOT NULL,
  `requisitos_especialidade_id_requisitos_especialidade` int NOT NULL,
  `data` datetime(6) NOT NULL,
  PRIMARY KEY (`jovem_id_jovem`,`requisitos_especialidade_id_requisitos_especialidade`),
  KEY `FKpb4qbnk0tln3d6jpol7yltg1c` (`requisitos_especialidade_id_requisitos_especialidade`),
  CONSTRAINT `FKm3rrayi41q9e4qh1a80fsj5o0` FOREIGN KEY (`jovem_id_jovem`) REFERENCES `jovem` (`id_jovem`),
  CONSTRAINT `FKpb4qbnk0tln3d6jpol7yltg1c` FOREIGN KEY (`requisitos_especialidade_id_requisitos_especialidade`) REFERENCES `requisitos_especialidade` (`id_requisitos_especialidade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `progresso_especialidade`
--

LOCK TABLES `progresso_especialidade` WRITE;
/*!40000 ALTER TABLE `progresso_especialidade` DISABLE KEYS */;
INSERT INTO `progresso_especialidade` VALUES (1,1,'2018-06-02 00:00:00.000000'),(1,2,'2018-06-02 00:00:00.000000'),(1,3,'2018-06-02 00:00:00.000000'),(1,4,'2018-06-02 00:00:00.000000'),(1,5,'2018-06-02 00:00:00.000000'),(1,6,'2018-06-02 00:00:00.000000'),(1,31,'2018-07-02 00:00:00.000000'),(1,32,'2018-07-02 00:00:00.000000'),(1,33,'2018-07-02 00:00:00.000000'),(1,34,'2018-07-02 00:00:00.000000'),(1,35,'2018-07-02 00:00:00.000000'),(1,36,'2018-07-02 00:00:00.000000'),(1,37,'2018-07-02 00:00:00.000000'),(1,38,'2018-07-02 00:00:00.000000'),(1,39,'2018-07-02 00:00:00.000000'),(1,55,'2018-08-02 00:00:00.000000'),(1,56,'2018-08-02 00:00:00.000000'),(1,57,'2018-08-02 00:00:00.000000'),(1,58,'2018-08-02 00:00:00.000000'),(1,59,'2018-08-02 00:00:00.000000'),(1,60,'2018-08-02 00:00:00.000000'),(1,61,'2018-08-02 00:00:00.000000'),(1,62,'2018-08-02 00:00:00.000000'),(1,63,'2018-08-02 00:00:00.000000'),(1,76,'2018-09-02 00:00:00.000000'),(1,77,'2018-09-02 00:00:00.000000'),(1,78,'2018-09-02 00:00:00.000000'),(1,79,'2018-09-02 00:00:00.000000'),(1,80,'2018-09-02 00:00:00.000000'),(1,81,'2018-09-02 00:00:00.000000'),(1,82,'2018-09-02 00:00:00.000000'),(1,83,'2018-09-02 00:00:00.000000'),(1,84,'2018-09-02 00:00:00.000000'),(1,109,'2018-10-02 00:00:00.000000'),(1,110,'2018-10-02 00:00:00.000000'),(1,111,'2018-10-02 00:00:00.000000'),(1,112,'2018-10-02 00:00:00.000000'),(1,113,'2018-10-02 00:00:00.000000'),(1,114,'2018-10-02 00:00:00.000000'),(2,1,'2018-06-02 00:00:00.000000'),(2,2,'2018-06-02 00:00:00.000000'),(2,3,'2018-06-02 00:00:00.000000'),(2,4,'2018-06-02 00:00:00.000000'),(2,5,'2018-06-02 00:00:00.000000'),(2,6,'2018-06-02 00:00:00.000000'),(2,16,'2018-07-02 00:00:00.000000'),(2,17,'2018-07-02 00:00:00.000000'),(2,18,'2018-07-02 00:00:00.000000'),(2,19,'2018-07-02 00:00:00.000000'),(2,20,'2018-07-02 00:00:00.000000'),(2,21,'2018-07-02 00:00:00.000000'),(2,22,'2018-07-02 00:00:00.000000'),(2,23,'2018-07-02 00:00:00.000000'),(2,24,'2018-07-02 00:00:00.000000'),(2,25,'2018-07-02 00:00:00.000000'),(2,26,'2018-07-02 00:00:00.000000'),(2,27,'2018-07-02 00:00:00.000000'),(2,28,'2018-07-02 00:00:00.000000'),(2,29,'2018-07-02 00:00:00.000000'),(2,30,'2018-07-02 00:00:00.000000'),(2,55,'2018-08-02 00:00:00.000000'),(2,56,'2018-08-02 00:00:00.000000'),(2,57,'2018-08-02 00:00:00.000000'),(2,58,'2018-08-02 00:00:00.000000'),(2,59,'2018-08-02 00:00:00.000000'),(2,60,'2018-08-02 00:00:00.000000'),(2,61,'2018-08-02 00:00:00.000000'),(2,62,'2018-08-02 00:00:00.000000'),(2,63,'2018-08-02 00:00:00.000000'),(2,76,'2018-09-02 00:00:00.000000'),(2,77,'2018-09-02 00:00:00.000000'),(2,78,'2018-09-02 00:00:00.000000'),(2,79,'2018-09-02 00:00:00.000000'),(2,80,'2018-09-02 00:00:00.000000'),(2,81,'2018-09-02 00:00:00.000000'),(2,82,'2018-09-02 00:00:00.000000'),(2,83,'2018-09-02 00:00:00.000000'),(2,84,'2018-09-02 00:00:00.000000'),(2,109,'2018-10-02 00:00:00.000000'),(2,110,'2018-10-02 00:00:00.000000'),(2,111,'2018-10-02 00:00:00.000000'),(2,112,'2018-10-02 00:00:00.000000'),(2,113,'2018-10-02 00:00:00.000000'),(2,114,'2018-10-02 00:00:00.000000'),(3,121,'2018-06-02 00:00:00.000000'),(3,122,'2018-06-02 00:00:00.000000'),(3,123,'2018-06-02 00:00:00.000000'),(3,124,'2018-06-02 00:00:00.000000'),(3,125,'2018-06-02 00:00:00.000000'),(3,126,'2018-06-02 00:00:00.000000'),(3,127,'2018-06-02 00:00:00.000000'),(3,128,'2018-06-02 00:00:00.000000'),(3,129,'2018-06-02 00:00:00.000000'),(4,64,'2018-07-02 00:00:00.000000'),(4,65,'2018-07-02 00:00:00.000000'),(4,66,'2018-07-02 00:00:00.000000'),(4,67,'2018-07-02 00:00:00.000000'),(4,68,'2018-07-02 00:00:00.000000'),(4,69,'2018-07-02 00:00:00.000000'),(4,70,'2018-06-02 00:00:00.000000'),(4,71,'2018-06-02 00:00:00.000000'),(4,72,'2018-06-02 00:00:00.000000'),(4,73,'2018-06-02 00:00:00.000000'),(4,74,'2018-06-02 00:00:00.000000'),(4,75,'2018-06-02 00:00:00.000000'),(5,7,'2018-07-02 00:00:00.000000'),(5,8,'2018-07-02 00:00:00.000000'),(5,9,'2018-07-02 00:00:00.000000'),(5,10,'2018-07-02 00:00:00.000000'),(5,11,'2018-07-02 00:00:00.000000'),(5,12,'2018-07-02 00:00:00.000000'),(5,13,'2018-07-02 00:00:00.000000'),(5,14,'2018-07-02 00:00:00.000000'),(5,15,'2018-07-02 00:00:00.000000'),(5,40,'2018-08-02 00:00:00.000000'),(5,41,'2018-08-02 00:00:00.000000'),(5,42,'2018-08-02 00:00:00.000000'),(5,43,'2018-08-02 00:00:00.000000'),(5,44,'2018-08-02 00:00:00.000000'),(5,45,'2018-08-02 00:00:00.000000'),(5,46,'2018-08-02 00:00:00.000000'),(5,47,'2018-08-02 00:00:00.000000'),(5,48,'2018-08-02 00:00:00.000000'),(5,115,'2018-06-02 00:00:00.000000'),(5,116,'2018-06-02 00:00:00.000000'),(5,117,'2018-06-02 00:00:00.000000'),(5,118,'2018-06-02 00:00:00.000000'),(5,119,'2018-06-02 00:00:00.000000'),(5,120,'2018-06-02 00:00:00.000000');
/*!40000 ALTER TABLE `progresso_especialidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `progresso_insignia`
--

DROP TABLE IF EXISTS `progresso_insignia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `progresso_insignia` (
  `jovem_id_jovem` int NOT NULL,
  `requisitos_insignia_id_requisitos_insignia` int NOT NULL,
  `data` datetime(6) NOT NULL,
  PRIMARY KEY (`jovem_id_jovem`,`requisitos_insignia_id_requisitos_insignia`),
  KEY `FKebv6nqbw9m8vtrm5brt13b81a` (`requisitos_insignia_id_requisitos_insignia`),
  CONSTRAINT `FKebv6nqbw9m8vtrm5brt13b81a` FOREIGN KEY (`requisitos_insignia_id_requisitos_insignia`) REFERENCES `requisitos_insignia` (`id_requisitos_insignia`),
  CONSTRAINT `FKshs4t8411lvxlncbigpc5dtld` FOREIGN KEY (`jovem_id_jovem`) REFERENCES `jovem` (`id_jovem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `progresso_insignia`
--

LOCK TABLES `progresso_insignia` WRITE;
/*!40000 ALTER TABLE `progresso_insignia` DISABLE KEYS */;
INSERT INTO `progresso_insignia` VALUES (1,1,'2018-01-01 00:00:00.000000'),(1,2,'2018-01-01 00:00:00.000000'),(1,3,'2018-01-01 00:00:00.000000'),(1,4,'2018-01-01 00:00:00.000000'),(1,5,'2018-01-01 00:00:00.000000'),(1,6,'2018-01-01 00:00:00.000000'),(1,7,'2018-01-01 00:00:00.000000'),(2,22,'2020-12-05 00:00:00.000000'),(2,23,'2020-12-05 00:00:00.000000'),(2,24,'2020-12-05 00:00:00.000000'),(2,25,'2020-12-05 00:00:00.000000'),(2,26,'2020-12-05 00:00:00.000000'),(2,27,'2020-12-05 00:00:00.000000'),(2,28,'2020-12-05 00:00:00.000000');
/*!40000 ALTER TABLE `progresso_insignia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requisitos_distintivo`
--

DROP TABLE IF EXISTS `requisitos_distintivo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requisitos_distintivo` (
  `id_distintivos` int NOT NULL,
  `id_requisitos_distintivo` int NOT NULL AUTO_INCREMENT,
  `requisito` varchar(500) NOT NULL,
  PRIMARY KEY (`id_requisitos_distintivo`),
  UNIQUE KEY `UK_44uhk8w8a0y7llc5kr4na1dyl` (`requisito`),
  KEY `FKa8lpvq7xb31o7o7d9rdwxfv1c` (`id_distintivos`),
  CONSTRAINT `FKa8lpvq7xb31o7o7d9rdwxfv1c` FOREIGN KEY (`id_distintivos`) REFERENCES `distintivos` (`id_distintivos`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requisitos_distintivo`
--

LOCK TABLES `requisitos_distintivo` WRITE;
/*!40000 ALTER TABLE `requisitos_distintivo` DISABLE KEYS */;
INSERT INTO `requisitos_distintivo` VALUES (1,1,'Quando completar o Caminho do Integrar é sinal que você já está pronto(a) para a Cerimônia de Integração e para fazer a sua Promessa de Lobinho. Os “Velhos Lobos” vão preparar um momento especial para apresentar você e sua família para todo o grupo escoteiro. Nesta cerimônia você receberá o lenço escoteiro e alguns distintivos para costurar em sua camisa ou blusa.'),(2,2,'Para conquistar o distintivo de Lobo Saltador, você precisa fazer pelo menos a metade das atividades propostas no seu guia/aplicativo.'),(3,3,'Para conquistar o distintivo de Lobo Rastreador, você precisa fazer as atividades que restam, e assim cumprir 100% das atividades.'),(4,4,'Para conquistar o distintivo de Lobo Caçador, você deve realizar a metade das atividades deste bloco.');
/*!40000 ALTER TABLE `requisitos_distintivo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requisitos_especialidade`
--

DROP TABLE IF EXISTS `requisitos_especialidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requisitos_especialidade` (
  `id_especialidades` int NOT NULL,
  `id_requisitos_especialidade` int NOT NULL AUTO_INCREMENT,
  `requisito` varchar(500) NOT NULL,
  PRIMARY KEY (`id_requisitos_especialidade`),
  UNIQUE KEY `UK_2ut4ia1prcmbohtilr1qb73bg` (`requisito`),
  KEY `FKfkkylywa6osoeasqvca61447` (`id_especialidades`),
  CONSTRAINT `FKfkkylywa6osoeasqvca61447` FOREIGN KEY (`id_especialidades`) REFERENCES `especialidades` (`id_especialidades`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requisitos_especialidade`
--

LOCK TABLES `requisitos_especialidade` WRITE;
/*!40000 ALTER TABLE `requisitos_especialidade` DISABLE KEYS */;
INSERT INTO `requisitos_especialidade` VALUES (1,1,'Apresentar, de maneira ilustrada, o que é arqueologia e qual sua importância.'),(1,2,'Apresentar 4 (quatro) diferentes zonas arqueológicas, sendo duas delas brasileiras e duas de outros países.'),(1,3,'Preparar e apresentar uma palestra ilustrada, tratando de uma das zonas arqueológicas do país, dando enfoque nos seguintes aspectos: localização, estado atual e importância histórica, social, econômica e turística.'),(1,4,'Apresentar a biografia de 2 (dois) arqueólogos importantes na história mundial, destacando seus principais trabalhos, suas descobertas mais importantes e a corrente teórica em que trabalhavam.'),(1,5,'Expor as teorias associadas à evolução humana e ao povoamento das Américas, decorrente de estudos arqueológicos, citando as principais descobertas e onde ocorreram.'),(1,6,'Apresentar 1 (um) estudo sobre a vida de 1 (um) povo antigo de sua livre escolha, baseado em pesquisas arqueológicas e ilustrando com fotos ou gravuras de escavações, documentos, monumentos ou objetos deixados por ele.'),(2,7,'Apresentar a história da conquista do espaço.'),(2,8,'Apresentar 1 (um) pequeno experimento que demonstre a Lei de Ação e Reação, que explica o funcionamento básico de 1 (um) foguete.'),(2,9,'Construir uma base de lançamento de foguetes de garrafas PET (foguete de água) e executar 1 (um) lançamento, seguindo as regras de segurança adequadas.'),(2,10,'Explicar o conceito do canhão de Newton.'),(2,11,'Explicar o funcionamento do Sistema de Posicionamento Global (GPS).'),(2,12,'Explicar o que é uma Estação Espacial, além de apresentar a história de uma das estações espaciais construídas até hoje.'),(2,13,'Apresentar a biografia de 1 (um) dos personagens da conquista espacial.'),(2,14,'Fazer uma apresentação, utilizando material midiático (cartazes, multimídia, etc.), acerca de 5 (cinco) satélites artificiais que se encontram no espaço sideral, explicando quais são os tipos e suas funções. Destacar sua importância nos dias de hoje.'),(2,15,'Explicar o que foi a “Missão Centenário” e citar quais foram os experimentos realizados nesta missão.'),(3,16,'Conhecer a estrutura geral de uma célula humana e criar uma maquete ou modelo com massa de modelar, incluindo seus principais componentes.'),(3,17,'Explicar a relação entre as células, os tecidos, os órgãos, os sistemas e o corpo humano.'),(3,18,'Apresentar uma pesquisa sobre uma doença escolhida pelo seu examinador, que possa afetar 1 (um) dos sistemas do corpo humano, nomeando as estruturas que podem ser afetadas.'),(3,19,'Citar os componentes do sistema respiratório, e apresentar os malefícios que o ar poluído pode ocasionar a este sistema.'),(3,20,'Conhecer as estruturas do sistema digestório e apresentar como funciona o processo de digestão dos alimentos e onde os diferentes nutrientes são absorvidos.'),(3,21,'Apresentar as classes de nutrientes alimentares e a importância de uma alimentação balanceada para o corpo humano.'),(3,22,'Apresentar como é composto o sistema músculo-esquelético e a importância de praticar atividades físicas regularmente.'),(3,23,'Conhecer a estrutura e os componentes do aparelho circulatório, nomear as partes do coração, diferenciar as artérias e as veias e saber a localização das principais artérias do organismo.'),(3,24,'Conhecer os neurônios envolvidos no processo de percepção da dor e explicar como ocorre o reflexo de retirada da mão de uma superfície quente.'),(3,25,'Apresentar as diferenças entre 1 (um) embrião e 1 (um) feto, buscando fotos que ilustrem os diferentes momentos da gestação.'),(3,26,'Montar 1 (um) panfleto contendo informações sobre como o cigarro pode fazer mal à saúde, que estruturas do corpo humano podem ser afetadas, e distribuir cópias na sua escola, comunidade ou Grupo Escoteiro.'),(3,27,'Conhecer as principais estruturas do aparelho urinário do homem e da mulher, e explicar como a água ingerida pela boca pode ser eliminada do organismo.'),(3,28,'Citar os principais estudiosos de anatomia humana e expor, em seu Grupo Escoteiro, desenhos de partes do corpo humano, nomeando cada uma delas.'),(3,29,'Fazer uma pesquisa sobre como eram realizadas as primeiras dissecções de cadáveres para o estudo da anatomia humana.'),(3,30,'Dissecar uma peça de frango mostrando quais estruturas do corpo é possível reconhecer e nomear cada uma delas.'),(4,31,'Escolher 1 (um) anime de sua preferência e apresentá-lo, discorrendo sobre sua trama, personagens, criadores, artistas envolvidos, época de criação, etc.'),(4,32,'Realizar uma apresentação sobre a história dos animes, destacando seu surgimento, o desenvolvimento no país de origem, os principais títulos, os principais autores e artistas e sua chegada e exibição no Brasil.'),(4,33,'Organizar uma exposição ilustrada com personagens de animes de sua preferência, citando suas características, a que obra pertencem e quem foi seu criador.'),(4,34,'Descrever ao menos 5 (cinco) gêneros de anime, explicando as particularidades de cada um.'),(4,35,'Explicar a importância da restrição de faixa etária em determinados animes.'),(4,36,'Apresentar 1 (um) relato audiovisual contendo ao menos 5 (cinco) animes assistidos por você. O relato deve conter o título original, e se houver o nacional, ano de produção, país de origem, gênero e uma breve sinopse de cada 1 (um) dos animes.'),(4,37,'Demonstrar conhecimento sobre as principais tecnologias utilizadas na produção, gravação e reprodução de animes.'),(4,38,'Apresentar 1 (um) trabalho sobre 3 (três) grandes festivais de anime pelo mundo, sendo pelo menos 1 (um) brasileiro, e explicar as particularidades de cada 1 (um) deles.'),(4,39,'Promover uma sessão de vídeo, preferencialmente para sua seção ou matilha/patrulha, para assistir 1 (um) anime.'),(5,40,'Apresentar a história do Buda Shakyamuni e a origem do budismo.'),(5,41,'Apresentar uma breve explicação sobre as 3 (três) grandes linhas de pensamento Budistas, ou 3 (três) Veículos:Hinayana, Mahayana e Tantrayana.'),(5,42,'Explicar o que são os Sutras e citar três.'),(5,43,'Explicar o que são Mantras, escolher 1 (um) deles e recitar para o examinador.'),(5,44,'Definir o que é joia tríplice e o significado de tomar refúgio na jóia tríplice.'),(5,45,'Explicar o que são bodisatvas, relatando a história e características de 1 (um) deles.'),(5,46,'Apresentar pelo menos 3 (três) preceitos budistas.'),(5,47,'Relacionar os fundamentos budistas com 3 (três) artigos da Lei Escoteira.'),(5,48,'Visitar 1 (um) templo e participar de uma cerimônia budista.'),(6,49,'Apresentar 1 (um) relatório sobre o significado da palavra “origami”, a origem desta arte e do papel, descrevendo seus benefícios.'),(6,50,'Montar esquema que apresente a linguagem do origami (símbolos utilizados na dobradura: Linha do vale, linha da montanha, virar, girar, dobrar por dentro, dobrar por fora, plissagem, achatar ou afundar).'),(6,51,'Apresentar por escrito bibliografia sobre o Origami: sobre 2 (dois) autores famosos nacionais ou internacionais e possuir pelo menos 1 (um) livro de origami.'),(6,52,'Expor seus trabalhos de origami sozinho ou com outros origamistas em outro local, como escola, biblioteca, associações ou exposição internacional.'),(6,53,'Visitar uma exposição de origami mostrando fotos ou participar de “workshop” de origami apresentando, posteriormente, as dobraduras feitas.'),(6,54,'Utilizar origamis como decoração de 1 (um) evento, preferencialmente, promovido pelo Grupo Escoteiro, seção ou matilha/patrulha.'),(7,55,'Elaborar 1 (um) trabalho escrito sobre arco e flecha, citando sua origem, evolução histórica e características.'),(7,56,'Apresentar 1 (um) trabalho sobre a regulamentação da prática do arco e flecha como atividade esportiva.'),(7,57,'Demonstrar todos os tipos de arcos, tipos de flechas, tipos de pontas e tipos de competição.'),(7,58,'Demonstrar conhecimento sobre ancoragem, postura, nomenclatura e medidas envolvidas no esporte.'),(7,59,'Ter conhecimento das regras de segurança para manejar 1 (um) arco e flecha.'),(7,60,'Explicar o que faz a Associação Nacional e Internacional de Arco e Flecha e o tipo de competições desse esporte.'),(7,61,'Ter conhecimento prático de arco e flecha mediante curso de tiro com arco e flecha, com prática mínima de 6h. Este item é obrigatório para qualquer Nível onde se conquiste itens que vão além da teoria fazendo uso do arco e flecha.'),(7,62,'Participar de uma prova simulada de tiro de arco e flecha com pontuação mínima: sendo 50% das flechas pontuando a 10 (dez) metros- Alvo FITA ou IFAA e 30% das flechas pontuando a quinze metros Alvo FITA ou IFAA.'),(7,63,'Participar de prova com monitoramento de juiz habilitado, item esse que só poderá ser efetuado mediante participação anterior em uma competição de tiro de arco e flecha.'),(8,64,'Explicar as diferenças entre os estilos de capoeira, Angola e Regional.'),(8,65,'Contar a origem histórica da capoeira através de uma palestra para jovens da mesma faixa etária.'),(8,66,'Demonstrar que sabe tocar os instrumentos musicais da capoeira (berimbau e pandeiro) e opcionais (agogô, reco-reco e atabaque).'),(8,67,'Cantar 3 (três) músicas de capoeira.'),(8,68,'Demonstrar movimentos básicos da capoeira (ginga, meia-lua, benção, esquivas, etc.).'),(8,69,'Convidar seu grupo de capoeira para realizar uma roda no seu Grupo Escoteiro e demonstrar seu jogo na mesma.'),(9,70,'Contar a história do boxe – nacional e mundial – para seu examinador.'),(9,71,'Descrever suas regras e demonstrar as 5 (cinco) técnicas básicas de golpes no boxe, citando cada golpe e demonstrando com 1 (um) professor e/ou outro praticante juvenil.'),(9,72,'Demonstrar 3 (três) tipos de saídas de golpes, 4 (quatro) tipos de defesa de golpes e duas defesas de mão.'),(9,73,'Listar, para seu examinador, nomes dos maiores nomes boxeadores da história, destacando suas principais características.'),(9,74,'Apresentar todas as federações (brasileiras e internacionais) de boxe e como se organizam suas categorias.'),(9,75,'Discorrer sobre os benefícios que o Boxe pode trazer para sua saúde e sua formação pessoal, apontando também os cuidados que se deve ter quanto à sua prática.'),(10,76,'Demonstrar noções básicas do funcionamento de 1 (um) almoxarifado.'),(10,77,'Selecionar corretamente o material para 1 (um) acampamento da seção.'),(10,78,'Visitar 1 (um) almoxarifado de 1 (um) órgão público ou empresa privada entrevistando seu responsável, para conhecer a importância e a responsabilidade da função.'),(10,79,'Encarregar-se do material da seção durante 1 (um) acampamento de final de semana.'),(10,80,'Administrar o almoxarifado da seção por 1 (um) período mínimo de 3 (três) meses.'),(10,81,'Organizar 1 (um) cadastro de fornecedores do material utilizado pela seção.'),(10,82,'Realizar o inventário do material da seção, efetuando 1 (um) levantamento do valor em moeda corrente, para o caso de ser necessária a substituição de qualquer item.'),(10,83,'Executar a manutenção apropriada no material de campo da seção.'),(10,84,'Organizar o processo de controle de estoque do material utilizado pela seção.'),(11,85,'Identificar 6 (seis) tipos de ferramentas de corte e sua finalidade de utilização.'),(11,86,'Demonstrar como afiar e conservar 4 (quatro) tipos de ferramentas de corte, entre elas faca e machadinha.'),(11,87,'Demonstrar as formas de utilização de 1 (um) canivete multifunção e de uma faca estilo punhal.'),(11,88,'Demonstrar a forma de condução de canivetes e facas.'),(11,89,'Demonstrar a forma de utilização de 1 (um) facão, machadinha e machado.'),(11,90,'Construir uma bainha, em couro ou material similar, para faca e facão.'),(11,91,'Demonstrar a forma de condução de facão, machadinha e machado.'),(11,92,'Demonstrar a forma de utilização de 1 (um) serrote.'),(11,93,'Conhecer as regras de segurança para manuseio de ferramentas de corte e construir 1 (um) canto do lenhador conforme regras de segurança.'),(11,94,'Descascar de forma correta, com emprego de canivete e faca, duas laranjas e duas maçãs.'),(11,95,'Construir, com emprego da faca, 2 (dois) espetos para assar ovo.'),(11,96,'Construir, com emprego de facão e machadinha, no mínimo 4 (quatro) estacas para emprego em toldo, demonstrando a rigidez e utilidade da obra construída.'),(12,97,'Pesquisar sobre a Organização Mundial do Movimento Escoteiro (WOSM), localização do Escritório Mundial, suas Regiões e respectivos Escritórios.'),(12,98,'Identificar em 1 (um) planisfério pelo menos cinquenta países em que o Movimento Escoteiro tenha existência legal, em todas as Regiões Escoteiras.'),(12,99,'Reconhecer o emblema escoteiro e a bandeira nacional de pelo menos trinta deles e explicar o significado do emblema oficial da Organização Mundial do Movimento Escoteiro.'),(12,100,'Manter correspondência com 1 (um) escoteiro estrangeiro durante 6 ((seis) meses (mínimo de 5 (cinco) cartas), procurando aumentar seus conhecimentos gerais sobre a geografia, a história e os costumes do país em questão, não só por meio da correspondência, mas também pela leitura de livros.'),(12,101,'Acampar com escoteiros estrangeiros, em atividades nacionais ou internacionais.'),(12,102,'Participar de alguma atividade de caráter internacional promovida por uma Organização Escoteira ou Organização Internacional (ONU, UNESCO, UNICEF, UNHCR etc.).'),(12,103,'Escrever 1 (um) artigo sobre os problemas atuais do mundo e como o Escotismo pode colaborar na busca de solução.'),(12,104,'Identificar os 5 (cinco) países que possuem os maiores contingentes escoteiros na relação membros potenciais / membros efetivos e a razão deste sucesso.'),(12,105,'Pesquisar e apresentar uma palestra sobre os principais Parques do Escotismo Mundial.'),(12,106,'Montar 1 (um) painel com pelo menos quinze insígnias escoteiras estrangeiras.'),(12,107,'Pesquisar e apresentar pelo menos 3 (três) exemplos de trabalhos comunitários desenvolvidos por associações escoteiras estrangeiras.'),(12,108,'Relatar os esforços de 3 (três) organizações que se ocupem em promover a paz mundial, identificando sua metodologia de atuação e abrangência.'),(13,109,'Saber o que é aquicultura, quais suas características e quais espécies são considerados pescado.'),(13,110,'Conhecer os cuidados básicos exigidos pela espécie de aquicultura a que se dedica.'),(13,111,'Conhecer as modalidades de cultura e os métodos mais aplicados, pesquisando sobre os mais utilizados em sua região.'),(13,112,'Manter uma criação, durante 1 (um) período adequado à espécie a que se dedica, e fazer 1 (um) prato para ser degustado pela seção.'),(13,113,'Conhecer os sistemas de alimentação, reprodução, prevenção de doenças e tratamento de águas ou condições de clima e correnteza.'),(13,114,'Visitar uma aquicultura e elaborar relatório para apresentação à seção, destacando os beneficias resultantes para a comunidade local.'),(14,115,'Apresentar à sua seção 1 (um) programa de desenho digital a sua escolha, demonstrando o uso de diversas ferramentas disponíveis, como texturas e filtros de cor.'),(14,116,'Explicar a importância do trabalho com layers, demonstrando a formatação de uma imagem utilizando esta ferramenta.'),(14,117,'Organizar uma exposição em sua seção, contendo pelo menos 5 (cinco) de seus trabalhos.'),(14,118,'Explicar ou à seção a importância dos efeitos de luz e sombra e quais as melhores técnicas para se conseguir os resultados desejados.'),(14,119,'Explicar o que é e como funciona uma mesa digitalizadora, demonstrando seu uso à seção.'),(14,120,'Fazer uma apresentação à matilha ou matilha/patrulha sobre a importância da paleta de cores selecionada para 1 (um) trabalho, utilizando recursos midiáticos de escolha livre (vídeos, apresentações de slides, cartazes.)'),(15,121,'Demonstrar que conhece os telefones de emergência de sua localidade.'),(15,122,'Descrever regras de segurança a serem observadas quando cuidando de crianças e bebês.'),(15,123,'Explicar os cuidados de higiene a observar no trato com crianças e bebês.'),(15,124,'Ter noções básicas de primeiros socorros.'),(15,125,'Demonstrar como trocar a fralda de 1 (um) bebê.'),(15,126,'Preparar uma mamadeira.'),(15,127,'Distrair duas crianças, por mais de 4 (quatro) horas.'),(15,128,'Explicar como tratar com doenças infantis comuns.'),(15,129,'Trabalhar como voluntário durante pelo menos 5 (cinco) períodos, totalizando vinte horas, em uma creche, maternal ou jardim de infância, descrevendo seu funcionamento.');
/*!40000 ALTER TABLE `requisitos_especialidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requisitos_insignia`
--

DROP TABLE IF EXISTS `requisitos_insignia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `requisitos_insignia` (
  `id_insignias` int NOT NULL,
  `id_requisitos_insignia` int NOT NULL AUTO_INCREMENT,
  `requisito` varchar(500) NOT NULL,
  PRIMARY KEY (`id_requisitos_insignia`),
  UNIQUE KEY `UK_cmf2bvu2pi1gkeh038pad19qf` (`requisito`),
  KEY `FK6md06ulhy4vfhfeqwmev7dqiv` (`id_insignias`),
  CONSTRAINT `FK6md06ulhy4vfhfeqwmev7dqiv` FOREIGN KEY (`id_insignias`) REFERENCES `insignias` (`id_insignias`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requisitos_insignia`
--

LOCK TABLES `requisitos_insignia` WRITE;
/*!40000 ALTER TABLE `requisitos_insignia` DISABLE KEYS */;
INSERT INTO `requisitos_insignia` VALUES (1,1,'Organizar o espaço de estudo adequadamente, observando a sua iluminação, local para acondicionamento dos materiais e ambiente.'),(1,2,'Ter o seu material escolar devidamente organizado, demonstrado cuidados com os livros, cadernos e demais materiais.'),(1,3,'Destinar o tempo adequado para seu estudo e tarefas de casa, relatando aos pais, a Akela ou outro Velho Lobo quanto tempo utiliza para essas atividades.'),(1,4,'Participar, como Lobinho, de pelo menos uma edição do Projeto Educação Escoteira com sua Alcateia, ou de outra atividade em conjunto com escolas realizada pela sua Alcateia ou pelo seu Grupo Escoteiro/Seção Autônoma.'),(1,5,'Participar ativamente de pelo menos duas atividades especiais em sua escola (Ex.: Festa Junina, Feira de Ciências, Excursão, etc.) e mostrar fotos ou relatório para a Alcateia.'),(1,6,'Apoiar um colega de classe em alguma tarefa ou ajudá-lo a aprender algum conteúdo que tenha dificuldade.'),(1,7,'Conversar com seus pais , Akela ou outro Velho Lobo sobre sua participação na escola, seu interesse pelos estudos e sobre os pontos que podem ser melhorados para ser um melhor aluno.'),(2,8,'Indicar, no mapa mundi, onde estão localizados os demais países do Cone Sul, sabendo reconhecer suas bandeiras e explicar o significado das cores de cada uma delas.'),(2,9,'Pesquisar a história de algo importante por sua utilidade que tenha sido inventado em um dos países do Cone Sul.'),(2,10,'Degustar pelo menos um prato típico de outro país do Cone Sul, conhecendo sua história e origem.'),(2,11,'Visitar exposições ou feiras culturais referentes a outros países do Cone Sul.'),(2,12,'Conhecer uma lenda ou conto de outro país do Cone Sul e contá-la para Alcateia.'),(2,13,'Conhecer a principal dança típica de pelo menos dois países do Cone Sul.'),(2,14,'Ir a uma peça de teatro cujo roteiro seja de outro país do Cone Sul e não esteja adaptado.'),(2,15,'Assistir uma animação ou filme nacional de outro país do Cone Sul.'),(2,16,'Enviar e receber uma correspondência, ou e-mail, contendo uma foto de sua Alcateia, para um lobinho de outro país do Cone Sul.'),(2,17,'Entrevistar alguém que esteja morando, ou tenha morado em algum país do Cone Sul.'),(2,18,'Descobrir quais distintivos poderia conquistar se fosse de outro país do Cone Sul.'),(2,19,'Ensinar a Alcateia a cantar uma canção escoteira de outro país do Cone Sul.'),(2,20,'Conhecer as principais terminologias do Ramo Lobinho (Alcateia, Matilha, acampamento, etc) em castelhano ou em outro idioma falado em países do Cone Sul, como o guarani.'),(2,21,'Conhecer os nomes e os símbolos das Associações Escoteiras dos países que integram o Cone Sul.'),(3,22,'Conhecer os principais problemas sociais de sua rua ou bairro e conversar com seus pais ou velhos lobos sobre como você poderia contribuir para resolvê-los.'),(3,23,'Conhecer instituições de sua comunidade que realizam ações assistenciais a pessoas necessitadas ou orientação para a melhoria da vida das pessoas, procurando saber de que forma sua Alcateia poderia ajudá-las.'),(3,24,'Participar de pelo menos uma edição do Mutirão Nacional Escoteiro de Ação Comunitária com sua Alcateia ou de outra atividade de ação comunitária realizada pela sua Alcateia ou por seu Grupo Escoteiro.'),(3,25,'Perceber os eventuais perigos a que estão expostos os lobinhos em uma excursão ou acampamento/acantonamento e ajudar a aplicar as regras de segurança para evitá-los.'),(3,26,'Participar de pelo menos três boas ações coletivas com sua Alcateia, contribuindo com ideias e ações para o planejamento e execução das atividades.'),(3,27,'Participar de uma ação comunitária promovida por alguma instituição de sua comunidade: igreja, clube, escola, posto de saúde, polícia, bombeiros, casa comercial, etc. e fazer um relatório sobre essa participação.'),(3,28,'Planejar e executar uma boa ação, diferente das realizadas anteriormente, que seja útil em sua Alcateia, casa, escola ou comunidade, com duração mínima de um mês, apresentando posteriormente os resultados para sua Alcateia.'),(4,29,'Pesquisar os temperos e especiarias típicos dos países lusófonos, também presentes no Brasil.'),(4,30,'Pesquisar a fauna e flora típicos dos países lusófonos, também presentes no Brasil.'),(4,31,'Pesquisar utensílios e invenções utilizadas no Brasil, criados em algum país lusófonos.'),(4,32,'Indicar, no mapa mundi, onde estão localizados os países lusófonos e reconhecer suas respectivas bandeiras.'),(4,33,'Visitar exposições ou feiras culturais referentes a outros países lusófonos.'),(4,34,'Degustar pelo menos uma refeição típica de outro país lusófono, conhecendo sua história e origem.'),(4,35,'Ir a uma peça de teatro cujo roteiro seja de outro país lusófono e não esteja adaptado.'),(4,36,'Assistir um espetáculo (circo, show musical etc) que seja originário de outro país lusófono.'),(4,37,'Conhecer uma lenda ou conto de um outro país lusófono, e contá-la para sua Alcateia.'),(4,38,'Entrevistar alguém que tenha morado, ou esteja morando, em um país lusófono.'),(4,39,'Ver um filme nacional ou animação de outro país Lusófono.'),(4,40,'Enviar e receber uma correspondência, ou e-mail, contendo uma foto de sua Alcateia, para um lobinho de outro país lusófono.'),(4,41,'Descobrir quais distintivos o Lobinho poderia conquistar se fosse de outro país lusófono.'),(4,42,'Fazer uma lista de termos escoteiros utilizados em outro país lusófono.'),(4,43,'Conhecer o símbolo das Associações Escoteiras dos países lusófonos.');
/*!40000 ALTER TABLE `requisitos_insignia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `responsavel`
--

DROP TABLE IF EXISTS `responsavel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `responsavel` (
  `responsavel` int NOT NULL AUTO_INCREMENT,
  `cpf` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  PRIMARY KEY (`responsavel`),
  UNIQUE KEY `UK_19crnd5p78y9x4iifm56shoah` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `responsavel`
--

LOCK TABLES `responsavel` WRITE;
/*!40000 ALTER TABLE `responsavel` DISABLE KEYS */;
INSERT INTO `responsavel` VALUES (1,'628.462.126-43','rickey.little@gmail.com','Rickey Little','(48) 98149-1949'),(2,'105.087.240-15','baubach@hotmail.com','Dan Baumbach III','(49) 97370-4847'),(3,'681.467.611-78','teddyh@hotmail.com','Teddy Harris','(51) 99512-3438'),(4,'407.440.046-40','shoppe@gmail.com','Shannon Hoppe','(48) 3235-8287'),(5,'870.510.875-68','torphy@yahoo.com','Tyesha Torphy','(73) 99011-6840');
/*!40000 ALTER TABLE `responsavel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_sanguineo`
--

DROP TABLE IF EXISTS `tipo_sanguineo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_sanguineo` (
  `id_tipo_sanguineo` int NOT NULL AUTO_INCREMENT,
  `tipo_sanguineo` varchar(10) NOT NULL,
  PRIMARY KEY (`id_tipo_sanguineo`),
  UNIQUE KEY `UK_1fm2jub46ylt5xbc6y8xc75mr` (`tipo_sanguineo`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_sanguineo`
--

LOCK TABLES `tipo_sanguineo` WRITE;
/*!40000 ALTER TABLE `tipo_sanguineo` DISABLE KEYS */;
INSERT INTO `tipo_sanguineo` VALUES (2,'A-'),(1,'A+'),(8,'AB-'),(7,'AB+'),(4,'B-'),(3,'B+'),(6,'O-'),(5,'O+');
/*!40000 ALTER TABLE `tipo_sanguineo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-15 17:39:17
