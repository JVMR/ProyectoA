package com.example.romario.proyectoa.conexion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hernan on 18/05/2015.
 */
public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context) {
        super(context, "damiDb.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_ESTADOS);
        db.execSQL(CREATE_TABLE_MODALIDADES_ESTUDIOS);
        db.execSQL(CREATE_TABLE_ALUMNOS);
        db.execSQL(CREATE_TABLE_PROFESORES);
        db.execSQL(CREATE_TABLE_CARRERAS);
        db.execSQL(CREATE_TABLE_CURSOS);
        db.execSQL(CREATE_TABLE_CARRERAS_CURSOS);
        db.execSQL(CREATE_TABLE_TIPO_AULA);
        db.execSQL(CREATE_TABLE_AULAS);
        db.execSQL(CREATE_TABLE_DIAS);
        db.execSQL(CREATE_TABLE_SECCIONES);
        db.execSQL(CREATE_TABLE_HORARIOS);
        db.execSQL(CREATE_TABLE_ALUMNOS_HORARIOS);
        db.execSQL(CREATE_TABLE_EVALUACIONES);
        db.execSQL(CREATE_TABLE_CURSOS_EVALUACIONES);
        db.execSQL(CREATE_TABLE_CALIFICACIONES);
        db.execSQL(CREATE_TABLE_REGISTRO_NOTAS);

        db.execSQL(INSERTS_ESTADOS);
        db.execSQL(INSERTS_MODALIDADES_ESTUDIOS);
        db.execSQL(INSERTS_ALUMNOS);
        db.execSQL(INSERTS_PROFESORES);
        db.execSQL(INSERTS_DIAS);
        db.execSQL(INSERTS_CURSOS);
        db.execSQL(INSERTS_CARRERAS);
        db.execSQL(INSERTS_TIPO_AULA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL(DROP_DATABASE);
        //onCreate(db);
    }

    private static final String DROP_DATABASE="drop table ESTADOS;\n" +
            "drop table MODALIDADES_ESTUDIOS;\n" +
            "drop table sqlite_sequence;\n" +
            "drop table ALUMNOS;\n" +
            "drop table PROFESORES;\n" +
            "drop table CARRERAS;\n" +
            "drop table CURSOS;\n" +
            "drop table CARRERAS_CURSOS;\n" +
            "drop table TIPO_AULA;\n" +
            "drop table AULAS;\n" +
            "drop table DIAS;\n" +
            "drop table SECCIONES;\n" +
            "drop table HORARIOS;\n" +
            "drop table ALUMNOS_HORARIOS;\n" +
            "drop table EVALUACIONES;\n" +
            "drop table CURSOS_EVALUACIONES;\n" +
            "drop table CALIFICACIONES;\n" +
            "drop table REGISTRO_NOTAS;";

    private static final String CREATE_PRAGMA="";

    private static final String CREATE_TABLE_ESTADOS="CREATE TABLE ESTADOS (\n" +
            "  estadoId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  descripcion VARCHAR(45) NULL\n" +
            ");";

    private static final String CREATE_TABLE_MODALIDADES_ESTUDIOS="CREATE TABLE MODALIDADES_ESTUDIOS(\n" +
            "    modalidadEstudioId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "    descripcion VARCHAR(45) NOT NULL UNIQUE,\n" +
            "    abreviatura CHAR(2) NOT NULL UNIQUE\n" +
            ");";

    private static final String CREATE_TABLE_ALUMNOS=CREATE_PRAGMA+" "+"CREATE TABLE ALUMNOS (\n" +
            "  alumnoId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  nombres VARCHAR(20) NOT NULL,\n" +
            "  apellidoPaterno VARCHAR(20) NOT NULL,\n" +
            "  apellidoMaterno VARCHAR(20) NOT NULL,\n" +
            "  email VARCHAR(40) NOT NULL,\n" +
            "  estadoId INTEGER NOT NULL REFERENCES ESTADOS(estadoId)\n" +
            ");";

    private static final String CREATE_TABLE_PROFESORES="CREATE TABLE PROFESORES (\n" +
            "  profesorId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  nombres VARCHAR(20) NOT NULL,\n" +
            "  apellidoPaterno VARCHAR(20) NOT NULL,\n" +
            "  apellidoMaterno VARCHAR(20) NOT NULL,\n" +
            "  email VARCHAR(40) NOT NULL UNIQUE,\n" +
            "  username VARCHAR(15) NOT NULL UNIQUE,\n" +
            "  password VARCHAR(15) NOT NULL\n" +
            ");";

    private static final String CREATE_TABLE_CARRERAS="CREATE TABLE CARRERAS (\n" +
            "  carreraId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  descripcion VARCHAR(45) NOT NULL UNIQUE\n" +
            ");";

    private static final String CREATE_TABLE_CURSOS=CREATE_PRAGMA+" "+"CREATE TABLE CURSOS (\n" +
            "  cursoId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  codigo CHAR(4) NOT NULL,\n" +
            "  descripcion VARCHAR(45) NOT NULL UNIQUE,\n" +
            "  modalidadEstudioId INTEGER NOT NULL REFERENCES MODALIDADES_ESTUDIOS(modalidadEstudioId)\n" +
            ");";

    private static final String CREATE_TABLE_CARRERAS_CURSOS=CREATE_PRAGMA+" "+"CREATE TABLE CARRERAS_CURSOS (\n" +
            "  carreraCursoId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  carreraId INTEGER NOT NULL REFERENCES CARRERAS(carreraId),\n" +
            "  cursoId INTEGER NOT NULL  REFERENCES CURSOS(cursoId),\n" +
            "  creditos INTEGER NOT NULL\n" +
            ");";

    private static final String CREATE_TABLE_TIPO_AULA="CREATE TABLE  TIPO_AULA (\n" +
            "  tipoAulaId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  descripcion VARCHAR(20) NULL\n" +
            ");";

    private static final String CREATE_TABLE_AULAS=CREATE_PRAGMA+" "+"CREATE TABLE AULAS (\n" +
            "  aulaId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  tipoAulaId INTEGER NOT NULL REFERENCES TIPO_AULA(tipoAulaId)\n" +
            ");";

    private static final String CREATE_TABLE_DIAS="CREATE TABLE DIAS (\n" +
            "  diaId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  descripcion VARCHAR(15) NULL\n" +
            ");";

    private static final String CREATE_TABLE_SECCIONES="CREATE TABLE SECCIONES (\n" +
            "  seccionId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  descripcion CHAR(4) NULL\n" +
            ");";

    private static final String CREATE_TABLE_HORARIOS=CREATE_PRAGMA+" "+"CREATE TABLE HORARIOS (\n" +
            "  horarioId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  cursoId INTEGER NOT NULL REFERENCES CURSOS(cursoId),\n" +
            "  profesorId INTEGER NOT NULL REFERENCES PROFESORES(profesorId),\n" +
            "  aulaId INTEGER NOT NULL REFERENCES AULAS(aulaId),\n" +
            "  horaInicio CHAR(6) NOT NULL,\n" +
            "  horaFin CHAR(6) NOT NULL,\n" +
            "  diaId INTEGER NOT NULL REFERENCES DIAS(diaId),\n" +
            "  seccionId INTEGER NOT NULL REFERENCES SECCIONES(seccionId),\n" +
            "  grupo CHAR(2) NOT NULL\n" +
            ");";

    private static final String CREATE_TABLE_ALUMNOS_HORARIOS=CREATE_PRAGMA+" "+"CREATE TABLE ALUMNOS_HORARIOS (\n" +
            "  alumnoHorarioId INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  alumnoId INTEGER NOT NULL REFERENCES ALUMNOS(alumnoId),\n" +
            "  horarioId INTEGER NOT NULL REFERENCES HORARIOS(horarioId),\n" +
            "  estadoId INTEGER NOT NULL REFERENCES ESTADOS(estadoId)\n" +
            ");";

    private static final String CREATE_TABLE_EVALUACIONES="CREATE TABLE EVALUACIONES (\n" +
            "  evaluacionId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  descripcion VARCHAR(45) NOT NULL\n" +
            ");";

    private static final String CREATE_TABLE_CURSOS_EVALUACIONES=CREATE_PRAGMA+" "+"CREATE TABLE CURSOS_EVALUACIONES (\n" +
            "  cursoEvaluacionId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  cursoId INTEGER NOT NULL REFERENCES CURSOS(cursoId),\n" +
            "  evaluacionesId INTEGER NOT NULL REFERENCES EVALUACIONES(evaluacionId),\n" +
            "  porcentaje INTEGER NULL\n" +
            ");";

    private static final String CREATE_TABLE_CALIFICACIONES="CREATE TABLE CALIFICACIONES (\n" +
            "  calificacionId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  descripcion VARCHAR(10) NULL,\n" +
            "  nota INTEGER NOT NULL\n" +
            ");";

    private static final String CREATE_TABLE_REGISTRO_NOTAS=CREATE_PRAGMA+" "+"CREATE TABLE REGISTRO_NOTAS (\n" +
            "  registroNotaId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "  alumnoId INTEGER NOT NULL REFERENCES ALUMNOS(alumnoId),\n" +
            "  cursoId INTEGER NOT NULL REFERENCES CURSOS(cursoId),\n" +
            "  evaluacionId INTEGER NOT NULL REFERENCES EVALUACIONES(evaluacionId),\n" +
            "  calificacionesId INTEGER NOT NULL REFERENCES CALIFICACIONES(calificacionesId)\n" +
            ");";


    private static final String INSERTS_ESTADOS="insert into ESTADOS values\n" +
            "(1, 'MATRICULA REGULAR'),\n" +
            "(2, 'RETIRO TEMPORAL'),\n" +
            "(3, 'DESAPROBADO POR INASISTENCIA');";

    private static final String INSERTS_MODALIDADES_ESTUDIOS="insert into MODALIDADES_ESTUDIOS values\n" +
            "(1, 'CARRERAS TÉCNICAS','AC'),\n" +
            "(2, 'PROGRAMA DE ADELANTOS','AD'),\n" +
            "(3, 'DIPLOMADOS CIBERTEC','DC');";

    private static final String INSERTS_PROFESORES="INSERT INTO PROFESORES VALUES\n" +
            "(1,'Chris','Reyes','Powell','pcpowell0@cibertec.edu.pe','cpowell','123'),\n" +
            "(2,'Maria','Boyd','Berry','pmberry1@cibertec.edu.pe','mberry1','FzsZ54d'),\n" +
            "(3,'Jimmy','Roberts','Cruz','pjcruz2@cibertec.edu.pe','jcruz2','XKeeVx'),\n" +
            "(4,'Bruce','Porter','Mills','pbmills3@cibertec.edu.pe','bmills3','agiU4VP'),\n" +
            "(5,'Judy','Mcdonald','Gomez','pjgomez4@cibertec.edu.pe','jgomez4','6lgdUEY'),\n" +
            "(6,'Catherine','Rose','Perkins','pcperkins5@cibertec.edu.pe','cperkins5','LmV9ASAdkG'),\n" +
            "(7,'Earl','Hawkins','Sanchez','pesanchez6@cibertec.edu.pe','esanchez6','398dIPt'),\n" +
            "(8,'Frances','Harris','Sims','pfsims7@cibertec.edu.pe','fsims7','OYy56z'),\n" +
            "(9,'Kelly','Pierce','George','pkgeorge8@cibertec.edu.pe','kgeorge8','f1q5YPEeW'),\n" +
            "(10,'Jean','Freeman','Washington','pjwashington9@cibertec.edu.pe','jwashington9','AGWlTc0nkI'),\n" +
            "(11,'Nicole','Lawrence','Gordon','pngordona@cibertec.edu.pe','ngordona','KGEZWKkW'),\n" +
            "(12,'Stephen','Lane','Burns','psburnsb@cibertec.edu.pe','sburnsb','OKIQh6omIyM'),\n" +
            "(13,'John','Burns','Pierce','pjpiercec@cibertec.edu.pe','jpiercec','C7ylQk1EEgA'),\n" +
            "(14,'Kenneth','Gutierrez','Freeman','pkfreemand@cibertec.edu.pe','kfreemand','pZGwCsook7o'),\n" +
            "(15,'Terry','Bowman','Diaz','ptdiaze@cibertec.edu.pe','tdiaze','WWU3XtUWPjb'),\n" +
            "(16,'Stephanie','Boyd','Mason','psmasonf@cibertec.edu.pe','smasonf','Nhljh64j8r'),\n" +
            "(17,'Evelyn','Ferguson','Pierce','pepierceg@cibertec.edu.pe','epierceg','agzmHNYu'),\n" +
            "(18,'Ashley','Robertson','Freeman','pafreemanh@cibertec.edu.pe','afreemanh','NNrswp'),\n" +
            "(19,'Nancy','Bowman','Rodriguez','pnrodriguezi@cibertec.edu.pe','nrodriguezi','d7cBtbC'),\n" +
            "(20,'Catherine','Owens','Fisher','pcfisherj@cibertec.edu.pe','cfisherj','LrARaoB7l7');";

    private static final String INSERTS_ALUMNOS="insert into ALUMNOS values\n" +
            "(1, 'Phyllis', 'Gray', 'Webb', 'pwebb0@webmd.com',1),\n" +
            "(2, 'Kimberly', 'Reed', 'Coleman', 'kcoleman1@zdnet.com',1),\n" +
            "(3, 'Virginia', 'George', 'Pierce', 'vpierce2@buzzfeed.com',1),\n" +
            "(4, 'Judy', 'Rivera', 'Williamson', 'jwilliamson3@zdnet.com',1),\n" +
            "(5, 'Ruth', 'Reynolds', 'Day', 'rday4@toplist.cz',1),\n" +
            "(6, 'Heather', 'Ryan', 'Warren', 'hwarren5@imageshack.us',1),\n" +
            "(7, 'Margaret', 'Hansen', 'Montgomery', 'mmontgomery6@salon.com',1),\n" +
            "(8, 'Linda', 'West', 'Wheeler', 'lwheeler7@cnn.com',1),\n" +
            "(9, 'Ruth', 'Murphy', 'Stephens', 'rstephens8@zdnet.com',1),\n" +
            "(10, 'Phyllis', 'Hughes', 'Harvey', 'pharvey9@ehow.com',1),\n" +
            "(11, 'Janice', 'Duncan', 'Harrison', 'jharrisona@shutterfly.com',1),\n" +
            "(12, 'Jacqueline', 'Clark', 'Chavez', 'jchavezb@youtube.com',1),\n" +
            "(13, 'Gloria', 'George', 'Smith', 'gsmithc@reference.com',1),\n" +
            "(14, 'Diana', 'Torres', 'Lopez', 'dlopezd@ifeng.com',1),\n" +
            "(15, 'Shirley', 'Austin', 'Fernandez', 'sfernandeze@altervista.org',1),\n" +
            "(16, 'Susan', 'Lawrence', 'Tucker', 'stuckerf@ning.com',1),\n" +
            "(17, 'Virginia', 'Moreno', 'Simmons', 'vsimmonsg@craigslist.org',1),\n" +
            "(18, 'Betty', 'Hill', 'Diaz', 'bdiazh@unblog.fr',1),\n" +
            "(19, 'Judy', 'Ortiz', 'Stevens', 'jstevensi@archive.org',1),\n" +
            "(20, 'Rebecca', 'Washington', 'Robertson', 'rrobertsonj@ycombinator.com',1),\n" +
            "(21, 'Lillian', 'Banks', 'Moore', 'lmoorek@newyorker.com',1),\n" +
            "(22, 'Louise', 'Sanders', 'Kennedy', 'lkennedyl@smh.com.au',1),\n" +
            "(23, 'Brenda', 'Robertson', 'Spencer', 'bspencerm@cbslocal.com',1),\n" +
            "(24, 'Julie', 'Bishop', 'Wagner', 'jwagnern@360.cn',1),\n" +
            "(25, 'Mildred', 'Johnston', 'Taylor', 'mtayloro@freewebs.com',1),\n" +
            "(26, 'Anna', 'Nichols', 'Wilson', 'awilsonp@newsvine.com',1),\n" +
            "(27, 'Virginia', 'Myers', 'Spencer', 'vspencerq@parallels.com',1),\n" +
            "(28, 'Kelly', 'Hart', 'Roberts', 'krobertsr@seesaa.net',1),\n" +
            "(29, 'Carolyn', 'Burke', 'Lewis', 'clewiss@arstechnica.com',1),\n" +
            "(30, 'Ashley', 'Young', 'Payne', 'apaynet@deviantart.com',1),\n" +
            "(31, 'Amanda', 'Hicks', 'James', 'ajamesu@berkeley.edu',1),\n" +
            "(32, 'Diana', 'White', 'Morris', 'dmorrisv@liveinternet.ru',1),\n" +
            "(33, 'Dorothy', 'James', 'Vasquez', 'dvasquezw@mac.com',1),\n" +
            "(34, 'Dorothy', 'Graham', 'Fields', 'dfieldsx@nifty.com',1),\n" +
            "(35, 'Anne', 'Martin', 'Fisher', 'afishery@quantcast.com',1),\n" +
            "(36, 'Phyllis', 'Long', 'Burke', 'pburkez@smugmug.com',1),\n" +
            "(37, 'Linda', 'Fuller', 'Campbell', 'lcampbell10@deliciousdays.com',1),\n" +
            "(38, 'Tammy', 'Vasquez', 'Hughes', 'thughes11@etsy.com',1),\n" +
            "(39, 'Julie', 'Sims', 'Hamilton', 'jhamilton12@unesco.org',1),\n" +
            "(40, 'Marilyn', 'Brown', 'Daniels', 'mdaniels13@sbwire.com',1),\n" +
            "(41, 'Janice', 'Hansen', 'Hansen', 'jhansen14@blogtalkradio.com',1),\n" +
            "(42, 'Christina', 'Lopez', 'Sanchez', 'csanchez15@weebly.com',1),\n" +
            "(43, 'Ruby', 'Gardner', 'Martin', 'rmartin16@xing.com',1),\n" +
            "(44, 'Paula', 'Crawford', 'Nguyen', 'pnguyen17@oracle.com',1),\n" +
            "(45, 'Karen', 'Wright', 'Oliver', 'koliver18@google.com.br',1),\n" +
            "(46, 'Carolyn', 'Dunn', 'Foster', 'cfoster19@tmall.com',1),\n" +
            "(47, 'Joyce', 'Gomez', 'Gibson', 'jgibson1a@geocities.jp',1),\n" +
            "(48, 'Joan', 'Oliver', 'White', 'jwhite1b@nsw.gov.au',1),\n" +
            "(49, 'Rachel', 'Andrews', 'Rogers', 'rrogers1c@bloomberg.com',1),\n" +
            "(50, 'Diana', 'Rodriguez', 'Frazier', 'dfrazier1d@usgs.gov',1),\n" +
            "(51, 'Martha', 'Collins', 'Collins', 'mcollins1e@dagondesign.com',1),\n" +
            "(52, 'Catherine', 'Lane', 'Rogers', 'crogers1f@qq.com',1),\n" +
            "(53, 'Carol', 'Wallace', 'Carpenter', 'ccarpenter1g@hhs.gov',1),\n" +
            "(54, 'Laura', 'Cooper', 'Wilson', 'lwilson1h@comcast.net',1),\n" +
            "(55, 'Gloria', 'Hudson', 'Williamson', 'gwilliamson1i@rambler.ru',1),\n" +
            "(56, 'Katherine', 'Ramirez', 'Moore', 'kmoore1j@soundcloud.com',1),\n" +
            "(57, 'Sharon', 'Martin', 'Bell', 'sbell1k@arizona.edu',1),\n" +
            "(58, 'Wanda', 'Clark', 'Ferguson', 'wferguson1l@reference.com',1),\n" +
            "(59, 'Martha', 'Anderson', 'Johnston', 'mjohnston1m@salon.com',1),\n" +
            "(60, 'Amy', 'Owens', 'Gardner', 'agardner1n@miibeian.gov.cn',1),\n" +
            "(61, 'Melissa', 'Holmes', 'Jordan', 'mjordan1o@wufoo.com',1),\n" +
            "(62, 'Cynthia', 'Perry', 'Greene', 'cgreene1p@trellian.com',1),\n" +
            "(63, 'Jacqueline', 'Long', 'Boyd', 'jboyd1q@skyrock.com',1),\n" +
            "(64, 'Lori', 'Lynch', 'Green', 'lgreen1r@liveinternet.ru',1),\n" +
            "(65, 'Kimberly', 'Hughes', 'Moreno', 'kmoreno1s@bloglines.com',1),\n" +
            "(66, 'Anne', 'Washington', 'Medina', 'amedina1t@nbcnews.com',1),\n" +
            "(67, 'Bonnie', 'Gardner', 'James', 'bjames1u@amazonaws.com',1),\n" +
            "(68, 'Sharon', 'Perry', 'Ray', 'sray1v@flickr.com',1),\n" +
            "(69, 'Julie', 'Nguyen', 'Wilson', 'jwilson1w@wikimedia.org',1),\n" +
            "(70, 'Joan', 'Jenkins', 'Bailey', 'jbailey1x@va.gov',1),\n" +
            "(71, 'Angela', 'Webb', 'Kelly', 'akelly1y@va.gov',1),\n" +
            "(72, 'Nancy', 'Castillo', 'Hamilton', 'nhamilton1z@ifeng.com',1),\n" +
            "(73, 'Cheryl', 'Edwards', 'Adams', 'cadams20@huffingtonpost.com',1),\n" +
            "(74, 'Jessica', 'Ellis', 'Nelson', 'jnelson21@usatoday.com',1),\n" +
            "(75, 'Jane', 'Clark', 'Young', 'jyoung22@123-reg.co.uk',1),\n" +
            "(76, 'Wanda', 'Johnson', 'Moore', 'wmoore23@webmd.com',1),\n" +
            "(77, 'Robin', 'Hawkins', 'Tucker', 'rtucker24@amazon.co.jp',1),\n" +
            "(78, 'Christine', 'Owens', 'Garrett', 'cgarrett25@mail.ru',1),\n" +
            "(79, 'Kathy', 'Nguyen', 'Richardson', 'krichardson26@microsoft.com',1),\n" +
            "(80, 'Gloria', 'Gordon', 'Murphy', 'gmurphy27@hc360.com',1),\n" +
            "(81, 'Alice', 'Rogers', 'Oliver', 'aoliver28@mac.com',1),\n" +
            "(82, 'Christine', 'Robinson', 'Bradley', 'cbradley29@skype.com',1),\n" +
            "(83, 'Jane', 'Brown', 'Reed', 'jreed2a@mozilla.org',1),\n" +
            "(84, 'Tina', 'Hart', 'Nichols', 'tnichols2b@army.mil',1),\n" +
            "(85, 'Julie', 'Elliott', 'Stephens', 'jstephens2c@techcrunch.com',1),\n" +
            "(86, 'Elizabeth', 'Garrett', 'Lopez', 'elopez2d@t-online.de',1),\n" +
            "(87, 'Lisa', 'Mills', 'Black', 'lblack2e@studiopress.com',1),\n" +
            "(88, 'Jennifer', 'Nichols', 'Hughes', 'jhughes2f@bluehost.com',1),\n" +
            "(89, 'Heather', 'Gutierrez', 'Hunt', 'hhunt2g@cloudflare.com',1),\n" +
            "(90, 'Rose', 'White', 'Ramos', 'rramos2h@examiner.com',1),\n" +
            "(91, 'Beverly', 'Olson', 'Freeman', 'bfreeman2i@elegantthemes.com',1),\n" +
            "(92, 'Cynthia', 'Greene', 'Carpenter', 'ccarpenter2j@google.cn',1),\n" +
            "(93, 'Katherine', 'Green', 'Wallace', 'kwallace2k@rakuten.co.jp',1),\n" +
            "(94, 'Susan', 'Perry', 'Reyes', 'sreyes2l@latimes.com',1),\n" +
            "(95, 'Ann', 'Holmes', 'Kelley', 'akelley2m@wisc.edu',1),\n" +
            "(96, 'Judith', 'Peterson', 'Gonzales', 'jgonzales2n@lycos.com',1),\n" +
            "(97, 'Robin', 'Torres', 'Dean', 'rdean2o@shop-pro.jp',1),\n" +
            "(98, 'Sarah', 'Rose', 'Larson', 'slarson2p@google.fr',1),\n" +
            "(99, 'Laura', 'Stanley', 'Alvarez', 'lalvarez2q@telegraph.co.uk',1),\n" +
            "(100, 'Louise', 'Graham', 'Medina', 'lmedina2r@yahoo.com',1);";

    private static final String INSERTS_DIAS="insert into DIAS values\n" +
            "(1, 'Lunes'),\n" +
            "(2, 'Martes'),\n" +
            "(3, 'Miércoles'),\n" +
            "(4, 'Jueves'),\n" +
            "(5, 'Viernes'),\n" +
            "(6, 'Sábado'),\n" +
            "(7, 'Domingo');";

    private static final String INSERTS_CURSOS="insert into CURSOS values\n" +
            "(1,'0267','Base de Datos Avanzado ii',1),\n" +
            "(2,'0557','Desarrollo de Aplicaciones Móviles i',1),\n" +
            "(3,'0778','Desarrollo para Entorno Web',1),\n" +
            "(4,'0772','Fundamentos de Calidad de Software',1),\n" +
            "(5,'1352','Inglés Profesional I',1),\n" +
            "(6,'0720','Organización y Constitución de Empresas',1),\n" +
            "(7,'0779','Proyecto de Investigación',1),\n" +
            "(8,'1369','Ética Profesional',1);";

    private static final String INSERTS_CARRERAS="insert into CARRERAS values\n" +
            "(1, 'ADMINISTRACIÓN BANCARIA TR'),\n" +
            "(2, 'ADMINISTRACIÓN DE NEGOCIOS INTERNACIONALES TR'),\n" +
            "(3, 'ADMINISTRACIÓN DE RECURSOS HUMANOS TR'),\n" +
            "(4, 'ADMINISTRACIÓN TR'),\n" +
            "(5, 'ADMINISTRACIÓN DE SERVICIOS TURÍSTICOS TR'),\n" +
            "(6, 'ADMINISTRACIÓN Y SISTEMAS TR'),\n" +
            "(7, 'COMPUTACIÓN E INFORMÁTICA TR'),\n" +
            "(8,'CONTABILIDAD TR'),\n" +
            "(9,'DISEÑO DE INTERIORES TR'),\n" +
            "(10,'DISEÑO GRÁFICO TR'),\n" +
            "(11,'INDUSTRIAL Y SISTEMAS TR'),\n" +
            "(12,'MARKETING TR'),\n" +
            "(13,'REDES Y COMUNICACIONES TR');";

    private static final String INSERTS_TIPO_AULA="INSERT INTO TIPO_AULA VALUES\n" +
            "(1,'TEORIA'),\n" +
            "(3,'PRÁCTICA/TALLER'),\n" +
            "(2,'LABORATORIO');";
}
