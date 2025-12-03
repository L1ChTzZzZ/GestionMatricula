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
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `DniAlumno` varchar(8) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Correo` varchar(80) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  `Telefono` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`DniAlumno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES ('70345678','Esteban','Silva','esteban.silva@yahoo.com','Jr. Moquegua 320','965432178'),('70345679','Pablo','Delgado','pablo.delgado@hotmail.com','Calle Ayacucho 223','954321999'),('71456780','Rosa','Flores','rosa.flores@gmail.com','Av. Ica 334','934512789'),('71456789','Gabriela','Reyes','gabriela.reyes@gmail.com','Calle Cajamarca 120','987654987'),('72567890','David','Cárdenas','david.cardenas@gmail.com','Av. Angamos 450','912398765'),('72567891','César','Aguilar','cesar.aguilar@gmail.com','Jr. Lima 445','945678234'),('72893456','Fernando','López','fernando.lopez@gmail.com','Jr. Cusco 876','912334455'),('73219876','Jorge','Vega','jorge.vega@gmail.com','Jr. San Martín 204','998877665'),('73451289','Carlos','Ramírez','carlos.ramirez@gmail.com','Av. Los Olivos 123','987654321'),('73548921','Paola','Cruz','paola.cruz@gmail.com','Av. Arequipa 654','976554433'),('73678901','Verónica','Ortega','veronica.ortega@hotmail.com','Jr. Trujillo 512','954678123'),('73678902','Martha','Zúñiga','martha.zuniga@yahoo.com','Calle Miraflores 556','976543789'),('74321598','Claudia','Castro','claudia.castro@hotmail.com','Av. Tacna 345','945667788'),('74523167','Ana','Pérez','ana.perez@hotmail.com','Av. Universitaria 102','945678321'),('74789012','Héctor','Rojas','hector.rojas@gmail.com','Av. Colonial 600','943211234'),('74789013','Iván','Espinoza','ivan.espinoza@gmail.com','Av. Pardo 667','988765123'),('75481236','Andrés','Soto','andres.soto@yahoo.com','Calle Lima 789','987112233'),('75890123','Daniela','Campos','daniela.campos@gmail.com','Calle Junín 703','934567123'),('75890124','Patricia','Campos','patricia.campos@gmail.com','Jr. San Juan 778','934567345'),('76239845','Luis','Torres','luis.torres@yahoo.com','Calle Las Flores 789','976543210'),('76894532','Lucía','Morales','lucia.morales@gmail.com','Av. Grau 303','934567812'),('76901234','Eduardo','Salazar','eduardo.salazar@gmail.com','Av. Bolognesi 800','976543876'),('76901235','Raúl','Huamán','raul.huaman@gmail.com','Calle Arequipa 889','954321654'),('77012345','Mónica','Gutiérrez','monica.gutierrez@yahoo.com','Jr. Lima 900','988765432'),('77012346','Karina','Meza','karina.meza@gmail.com','Av. Perú 990','923456987'),('78018949','Madr','asdf','sadf@gmail.com','adasdf','941143873'),('78019292','Marcelo','Guerrero','mmarkzz369@gmail.com','JrJr','999222111'),('78123456','Ricardo','Mendoza','ricardo.mendoza@gmail.com','Calle Puno 102','923456789'),('78123457','Julio','Vargas','julio.vargas@gmail.com','Av. Arequipa 1001','977654321'),('79234567','Natalia','Herrera','natalia.herrera@gmail.com','Av. Piura 210','954321678'),('79234568','Sandra','Ruiz','sandra.ruiz@gmail.com','Jr. Huancayo 112','923456123'),('81234567','María','Gonzales','maria.gonzales@gmail.com','Jr. Primavera 456','912345678'),('88019292','Luana','Lombardi','Lu@gmail.com','JrJr','93838383');
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
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
