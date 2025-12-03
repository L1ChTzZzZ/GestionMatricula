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
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matricula` (
  `id_matricula` varchar(5) NOT NULL,
  `Fecha_pago` date DEFAULT NULL,
  `Monto_total` double DEFAULT NULL,
  `Tipo_pago` varchar(50) DEFAULT NULL,
  `id_usuario` varchar(5) DEFAULT NULL,
  `Dni_alumno` varchar(8) DEFAULT NULL,
  `id_clase` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id_matricula`),
  KEY `id_usuario` (`id_usuario`),
  KEY `Dni_alumno` (`Dni_alumno`),
  KEY `id_clase` (`id_clase`),
  CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`),
  CONSTRAINT `matricula_ibfk_2` FOREIGN KEY (`Dni_alumno`) REFERENCES `alumno` (`DniAlumno`),
  CONSTRAINT `matricula_ibfk_3` FOREIGN KEY (`id_clase`) REFERENCES `clases` (`id_clase`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matricula`
--

LOCK TABLES `matricula` WRITE;
/*!40000 ALTER TABLE `matricula` DISABLE KEYS */;
INSERT INTO `matricula` VALUES ('M0001','2025-10-01',150,'Efectivo','E001','73451289','C0001'),('M0002','2025-10-02',160,'Tarjeta','E002','81234567','C0002'),('M0003','2025-10-03',170,'Yape','E001','76239845','C0003'),('M0004','2025-10-04',180,'Efectivo','E002','74523167','C0004'),('M0005','2025-10-05',150,'Tarjeta','E001','73219876','C0001'),('M0007','2025-10-07',170,'Efectivo','E001','75481236','C0003'),('M0008','2025-10-08',180,'Tarjeta','E002','73548921','C0004'),('M0009','2025-10-09',150,'Yape','E001','72893456','C0001'),('M0010','2025-10-10',160,'Efectivo','E002','74321598','C0002'),('M0011','2025-10-11',170,'Tarjeta','E001','78123456','C0003'),('M0012','2025-10-12',180,'Yape','E002','79234567','C0004'),('M0013','2025-10-13',150,'Efectivo','E001','70345678','C0001'),('M0014','2025-10-14',160,'Tarjeta','E002','71456789','C0002'),('M0015','2025-10-15',170,'Yape','E001','72567890','C0003'),('M0016','2025-10-16',180,'Efectivo','E002','73678901','C0004'),('M0017','2025-10-17',150,'Tarjeta','E001','74789012','C0001'),('M0018','2025-10-18',160,'Yape','E002','75890123','C0002'),('M0019','2025-10-19',170,'Efectivo','E001','76901234','C0003'),('M0020','2025-10-20',180,'Tarjeta','E002','77012345','C0004'),('M0021','2025-10-21',150,'Yape','E001','78123457','C0001'),('M0022','2025-10-22',160,'Efectivo','E002','79234568','C0002'),('M0023','2025-10-23',170,'Tarjeta','E001','70345679','C0003'),('M0024','2025-10-24',180,'Yape','E002','71456780','C0004'),('M0025','2025-10-25',150,'Efectivo','E001','72567891','C0001'),('M0026','2025-10-26',160,'Tarjeta','E002','73678902','C0002'),('M0027','2025-10-27',170,'Yape','E001','74789013','C0003'),('M0028','2025-10-28',180,'Efectivo','E002','75890124','C0004'),('M0029','2025-11-18',160,'YAPE','E001','78018949','C0002'),('M0030','2025-11-18',170,'TARJETA','E001','78019292','C0003'),('M0031','2025-11-18',160,'YAPE','E001','88019292','C0002'),('M0032','2025-12-11',150,'YAPE','E001','78018949','C0001');
/*!40000 ALTER TABLE `matricula` ENABLE KEYS */;
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
