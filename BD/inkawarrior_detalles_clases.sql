-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: inkawarrior
-- ------------------------------------------------------
-- Server version	9.4.0

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
-- Table structure for table `detalles_clases`
--

DROP TABLE IF EXISTS `detalles_clases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalles_clases` (
  `id_detalles_clases` varchar(5) NOT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `id_clase` varchar(5) DEFAULT NULL,
  `Dni_profesor` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`id_detalles_clases`),
  KEY `id_clase` (`id_clase`),
  KEY `Dni_profesor` (`Dni_profesor`),
  CONSTRAINT `detalles_clases_ibfk_1` FOREIGN KEY (`id_clase`) REFERENCES `clases` (`id_clase`),
  CONSTRAINT `detalles_clases_ibfk_2` FOREIGN KEY (`Dni_profesor`) REFERENCES `profesores` (`Dni_Profesor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_clases`
--

LOCK TABLES `detalles_clases` WRITE;
/*!40000 ALTER TABLE `detalles_clases` DISABLE KEYS */;
INSERT INTO `detalles_clases` VALUES ('D0001','Clase para principiantes: equilibrio y remada básica.','C0001','70123456'),('D0002','Clase intermedia: toma de olas y giros iniciales.','C0002','71234567'),('D0003','Clase avanzada: maniobras y control en olas grandes.','C0003','72345678'),('D0004','Clase libre: práctica supervisada y corrección técnica.','C0004','73456789');
/*!40000 ALTER TABLE `detalles_clases` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-12-02 15:18:07
