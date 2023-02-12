/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

/**
 *
 * @author Luis
 */
public class Ubicacion {
    public static String[] getProvincia(String Departamento)
    {
        int n=9;
        if(Departamento.equalsIgnoreCase("Amazonas"))
            n=8;
        if(Departamento.equalsIgnoreCase("Ancash"))
            n=21;
        if(Departamento.equalsIgnoreCase("Apurimac"))
            n=8;
        if(Departamento.equalsIgnoreCase("Arequipa"))
            n=9;
        if(Departamento.equalsIgnoreCase("Ayacucho"))
            n=10;
        if(Departamento.equalsIgnoreCase("Cajamarca"))
            n=14;
        if(Departamento.equalsIgnoreCase("Cusco"))
            n=14;
        if(Departamento.equalsIgnoreCase("Huancavelica"))
            n=8;
        if(Departamento.equalsIgnoreCase("Huánuco"))
            n=12;
        if(Departamento.equalsIgnoreCase("Ica"))
            n=6;
        if(Departamento.equalsIgnoreCase("Junín"))
            n=10;
        if(Departamento.equalsIgnoreCase("La Libertad"))
            n=13;
        if(Departamento.equalsIgnoreCase("Lambayeque"))
            n=4;
        if(Departamento.equalsIgnoreCase("Lima"))
            n=11;
        if(Departamento.equalsIgnoreCase("Loreto"))
            n=9;
        if(Departamento.equalsIgnoreCase("Madre de Dios"))
            n=4;
        if(Departamento.equalsIgnoreCase("Moquegua"))
            n=4;
        if(Departamento.equalsIgnoreCase("Pasco"))
            n=4;
        if(Departamento.equalsIgnoreCase("Piura"))
            n=9;
        if(Departamento.equalsIgnoreCase("Puno"))
            n=14;
        if(Departamento.equalsIgnoreCase("San Martín"))
            n=11;
        if(Departamento.equalsIgnoreCase("Tacna"))
            n=5;
        if(Departamento.equalsIgnoreCase("Tumbes"))
            n=5;
        if(Departamento.equalsIgnoreCase("Ucayali"))
            n=5;
        
         String[] provincias = new String[n];
        
        if(Departamento.equalsIgnoreCase("Amazonas"))
        {
            provincias[0] = "Provincia";
           provincias[1] = "Chachapoyas";
            provincias[2] = "Bagua";
            provincias[3] = "Bongara";
            provincias[4] = "Condorcanqui";
            provincias[5] = "Luya";
            provincias[6] = "Rodriguez de Mendoza";
            provincias[7] = "Utcamba";
        }
        
        if(Departamento.equalsIgnoreCase("Ancash"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Aija";
            provincias[2] = "Antonio Raymondi";
            provincias[3] = "Asuncion";
            provincias[4] = "Bolognesi";
            provincias[5] = "Carhuaz";
            provincias[6] = "Carlos F. Fitzcarrald";
            provincias[7] = "Casma";
            provincias[8] = "Corongo";
            provincias[9] = "Huaraz";
            provincias[10] = "Huari";
            provincias[11] = "Huarmey";
            provincias[12] = "Huaylas";
            provincias[13] = "Mariscal Luzuriaga";
            provincias[14] = "Ocros";
            provincias[15] = "Pallasca";
            provincias[16] = "Pomabamba";
            provincias[17] = "Recuay";
            provincias[18] = "Santa";
            provincias[19] = "Sihuas";
            provincias[20] = "Yungay";
        }
        
        if(Departamento.equalsIgnoreCase("Apurimac"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Abancay";
            provincias[2] = "Andahuaylas";
            provincias[3] = "Antabamba";
            provincias[4] = "Aymaraes";
            provincias[5] = "Cotabambas";
            provincias[6] = "Chincheros";
            provincias[7] = "Grau";
            
        }
        if(Departamento.equalsIgnoreCase("Arequipa"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Arequipa";
            provincias[2] = "Camana";
            provincias[3] = "Caraveli";
            provincias[4] = "Castilla";
            provincias[5] = "Caylloma";
            provincias[6] = "Condesuyos";
            provincias[7] = "Islay";
            provincias[8] = "La uniòn";
        }
        if(Departamento.equalsIgnoreCase("Ayacucho"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Huamanga";
            provincias[2] = "Cangallo";
            provincias[3] = "Huanca sancos";
            provincias[4] = "Huanta";
            provincias[5] = "La mar";
            provincias[6] = "Lucanas";
            provincias[7] = "Parinacochas";
            provincias[8] = "Pàucar del sara sara";
            provincias[9] = "Sucre";
            provincias[10] = "Victor fajardo";
            provincias[11] = "Vilcas huaman";
            
        }
        if(Departamento.equalsIgnoreCase("Cajamarca"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Cajamarca";
            provincias[2] = "Cajabamba";
            provincias[3] = "Celendin";
            provincias[4] = "Chota";
            provincias[5] = "Contumaza";
            provincias[6] = "Cutervo";
            provincias[7] = "Hualgayoc";
            provincias[8] = "Jaen";
            provincias[9] = "San ignacio";
            provincias[10] = "San marcos";
            provincias[11] = "San miguel";
            provincias[12] = "San pablo";
            provincias[13] = "Santa cruz";
        }
        
           if(Departamento.equalsIgnoreCase("Cusco"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Cusco";
            provincias[2] = "Acomayo";
            provincias[3] = "Anta";
            provincias[4] = "Calca";
            provincias[5] = "Canas";
            provincias[6] = "Canchis";
            provincias[7] = "Chumbivilcas";
            provincias[8] = "Espinar";
            provincias[9] = "La convencion";
            provincias[10] = "Paruro";
            provincias[11] = "Paucartambo";
            provincias[12] = "Quispicanchi";
            provincias[13] = "Urubamba";
         
        }
        
          if(Departamento.equalsIgnoreCase("Huancavelica"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Huancavelica";
            provincias[2] = "Acobamba";
            provincias[3] = "Angaraes";
            provincias[4] = "Castrovirreyna";
            provincias[5] = "Churcampa";
            provincias[6] = "Huaytara";
            provincias[7] = "Tayacaja";
            
        }
        
          if(Departamento.equalsIgnoreCase("Huánuco"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Huanuco";
            provincias[2] = "Ambo";
            provincias[3] = "Dos de mayo";
            provincias[4] = "Huacaybamba";
            provincias[5] = "Huamalies";
            provincias[6] = "Leoncio prado";
            provincias[7] = "Marañon";
            provincias[8] = "Pachitea";
            provincias[9] = "Puerto inca";
            provincias[10] = "Lauricocha";
            provincias[11] = "Yarowilca";
            
        }
        
          if(Departamento.equalsIgnoreCase("Ica"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Ica";
            provincias[2] = "Chincha";
            provincias[3] = "Nasca";
            provincias[4] = "Palpa";
            provincias[5] = "Pisco";
        }
        
          if(Departamento.equalsIgnoreCase("Junín"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Huancayo";
            provincias[2] = "Concepcion";
            provincias[3] = "Chanchamayo";
            provincias[4] = "Jauja";
            provincias[5] = "Junin";
            provincias[6] = "Satipo";
            provincias[7] = "Tarma";
            provincias[8] = "Yauli";
            provincias[9] = "Chupaca";
        }
        
          if(Departamento.equalsIgnoreCase("La Libertad"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Trujillo";
            provincias[2] = "Ascope";
            provincias[3] = "Bolivar";
            provincias[4] = "Chepen";
            provincias[5] = "Julcan";
            provincias[6] = "Otuzco";
            provincias[7] = "Pacasmayo";
            provincias[8] = "Pataz";
            provincias[9] = "Sanchez carrion";
            provincias[10] = "Santiago de chuco";
            provincias[11] = "Gran chimu";
            provincias[12] = "Viru";
        }
        
          if(Departamento.equalsIgnoreCase("Lambayeque"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Chiclayo";
            provincias[2] = "Ferreñafe";
            provincias[3] = "Lambayeque";
        }
        
          if(Departamento.equalsIgnoreCase("Lima"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Lima";
            provincias[2] = "Barranca";
            provincias[3] = "Cajatambo";
            provincias[4] = "Canta";
            provincias[5] = "Cañete";
            provincias[6] = "Huaral";
            provincias[7] = "Huarochiri";
            provincias[8] = "Huaura";
            provincias[9] = "Oyon";
            provincias[10] = "Yauyos";

        }
          if(Departamento.equalsIgnoreCase("Loreto"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Maynas";
            provincias[2] = "Alto amazonas";
            provincias[3] = "Loreto";
            provincias[4] = "Mariscal ramon castilla";
            provincias[5] = "Requena";
            provincias[6] = "Ucayali";
            provincias[7] = "Datem del marañon";
            provincias[8] = "Putumayo";
           
        }
            if(Departamento.equalsIgnoreCase("Madre de Dios"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Tambopata";
            provincias[2] = "Manu";
            provincias[3] = "Tahuamanu";

        }
              if(Departamento.equalsIgnoreCase("Moquegua"))
        {
            provincias[0] = "Provincia";
           provincias[1] = "Mariscal nieto";
            provincias[2] = "General sanchez cerro";
            provincias[3] = "Ilo";
        }
                if(Departamento.equalsIgnoreCase("Pasco"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Pasco";
            provincias[2] = "Daniel alcides carrion";
            provincias[3] = "Oxapampa";
        }
                  if(Departamento.equalsIgnoreCase("Piura"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Piura";
            provincias[2] = "Ayabaca";
            provincias[3] = "Huancabamba";
            provincias[4] = "Morropon";
            provincias[5] = "Paita";
            provincias[6] = "Sullana";
            provincias[7] = "Talara";
            provincias[8] = "Sechura";
        }
          if(Departamento.equalsIgnoreCase("Puno"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Puno";
            provincias[2] = "Azangaro";
            provincias[3] = "Carabaya";
            provincias[4] = "Chucuito";
            provincias[5] = "El collao";
            provincias[6] = "Huancane";
            provincias[7] = "Lampa";
            provincias[8] = "Melgar";
            provincias[9] = "Moho";
            provincias[10] = "San antonio de putina";
            provincias[11] = "San roman";
            provincias[12] = "Sandia";
            provincias[13] = "Yunguyo";
        }
           if(Departamento.equalsIgnoreCase("San Martín"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Moyobamba";
            provincias[2] = "Bellavista";
            provincias[3] = "El dorado";
            provincias[4] = "Huallaga";
            provincias[5] = "Lamas";
            provincias[6] = "Mariscal caceres";
            provincias[7] = "Picota";
            provincias[8] = "Rioja";
            provincias[9] = "San martin";
            provincias[10] = "Tocache";
        }
           if(Departamento.equalsIgnoreCase("Tacna"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Tacna";
            provincias[2] = "Candarave";
            provincias[3] = "Jorge basadre";
            provincias[4] = "Tarata";
        }
             if(Departamento.equalsIgnoreCase("Tumbes"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Tumbes";
            provincias[2] = "Contralmirante villar";
            provincias[3] = "Zarumilla";
            provincias[4] = "Tarata";
        }
            if(Departamento.equalsIgnoreCase("Ucayali"))
        {
            provincias[0] = "Provincia";
            provincias[1] = "Coronel portillo";
            provincias[2] = "Atalaya";
            provincias[3] = "Padre abad";
            provincias[4] = "Purus";
        }
        return provincias;
    }
    
    public static String[] getDistrito(String Provincia)
    {
        int n=9;
        
          if(Provincia.equalsIgnoreCase("Chachapoyas"))
            n=6;
          if(Provincia.equalsIgnoreCase("Bagua"));
            n=6;
         if(Provincia.equalsIgnoreCase("Bongara"))
            n=13;
          if(Provincia.equalsIgnoreCase("Condorcanqui"))
            n=4;
          if(Provincia.equalsIgnoreCase("Luya"))
            n=23;
          if(Provincia.equalsIgnoreCase("Rodriguez de Mendoza"))
            n=6;
          if(Provincia.equalsIgnoreCase("Aija"))
            n=6;
            if(Provincia.equalsIgnoreCase("Antonio Raymondi"))
            n=6;
              if(Provincia.equalsIgnoreCase("Asuncion"))
            n=2;
                if(Provincia.equalsIgnoreCase("Bolognesi"))
            n=2;
               if(Provincia.equalsIgnoreCase("Carhuaz"))
            n=2;
              if(Provincia.equalsIgnoreCase("Carlos F. Fitzcarrald"))
            n=2;
              if(Provincia.equalsIgnoreCase("Casma"))
            n=2;
              if(Provincia.equalsIgnoreCase("Corongo"))
            n=2;
              if(Provincia.equalsIgnoreCase("Huaraz"))
            n=2;
             if(Provincia.equalsIgnoreCase("Huari"))
            n=2;
            if(Provincia.equalsIgnoreCase("Huarmey"))
            n=2;
            if(Provincia.equalsIgnoreCase("Huaylas"))
            n=2;
            if(Provincia.equalsIgnoreCase("Mariscal Luzuriaga"))
            n=2;
            if(Provincia.equalsIgnoreCase("Ocros"))
            n=2;
            if(Provincia.equalsIgnoreCase("Pallasca"))
            n=2;
            if(Provincia.equalsIgnoreCase("Pomabamba"))
            n=2;
            if(Provincia.equalsIgnoreCase("Recuay"))
            n=2;
            if(Provincia.equalsIgnoreCase("Santa"))
            n=2;
            if(Provincia.equalsIgnoreCase("Sihuas"))
            n=2;
            if(Provincia.equalsIgnoreCase("Yungay"))
            n=2;
             if(Provincia.equalsIgnoreCase("Abancay"))
            n=2;
            if(Provincia.equalsIgnoreCase("Andahuaylas"))
            n=2;
            if(Provincia.equalsIgnoreCase("Antabamba"))
            n=2;
            if(Provincia.equalsIgnoreCase("Aymaraes"))
            n=2;
            if(Provincia.equalsIgnoreCase("Cotabambas"))
            n=2;
            if(Provincia.equalsIgnoreCase("Chincheros"))
            n=2;
             if(Provincia.equalsIgnoreCase("Grau"))
            n=2;
            if(Provincia.equalsIgnoreCase("Arequipa"))
            n=2;
            if(Provincia.equalsIgnoreCase("Camana"))
            n=2;
             if(Provincia.equalsIgnoreCase("Caraveli"))
            n=2;
            if(Provincia.equalsIgnoreCase("Castilla"))
            n=2;
            if(Provincia.equalsIgnoreCase("Caylloma"))
            n=2;
            if(Provincia.equalsIgnoreCase("Condesuyos"))
            n=2;
            if(Provincia.equalsIgnoreCase("Islay"))
            n=2;
            if(Provincia.equalsIgnoreCase("La uniòn"))
            n=2;
             if(Provincia.equalsIgnoreCase("Huamanga")) 
            n=2;
               if(Provincia.equalsIgnoreCase("Cangallo"))
            n=2;
             if(Provincia.equalsIgnoreCase("Huanca sancos"))
            n=2;
            if(Provincia.equalsIgnoreCase("Huanta"))
            n=2;
            if(Provincia.equalsIgnoreCase("La mar"))
            n=2;
             if(Provincia.equalsIgnoreCase("Lucanas"))
            n=2;
            if(Provincia.equalsIgnoreCase("Parinacochas"))
            n=2;
            if(Provincia.equalsIgnoreCase("Pàucar del sara sara"))
            n=2;
            if(Provincia.equalsIgnoreCase("Sucre"))
            n=2;
            if(Provincia.equalsIgnoreCase("Victor fajardo"))
            n=2;
            if(Provincia.equalsIgnoreCase("Vilcas huaman"))
            n=2;
             if(Provincia.equalsIgnoreCase("Cajamarca")) 
            n=2;
              if(Provincia.equalsIgnoreCase("Cajabamba"))
            n=2;
             if(Provincia.equalsIgnoreCase("Celendin")) 
            n=2;
               if(Provincia.equalsIgnoreCase("Chota"))
            n=2;
             if(Provincia.equalsIgnoreCase("Contumaza"))
            n=2;
            if(Provincia.equalsIgnoreCase("Cutervo"))
            n=2;
            if(Provincia.equalsIgnoreCase("Hualgayoc"))
            n=2;
             if(Provincia.equalsIgnoreCase("Jaen"))
            n=2;
            if(Provincia.equalsIgnoreCase("San ignacio"))
            n=2;
            if(Provincia.equalsIgnoreCase("San marcos"))
            n=2;
            if(Provincia.equalsIgnoreCase("San miguel"))
            n=2;
            if(Provincia.equalsIgnoreCase("San pablo"))
            n=2;
            if(Provincia.equalsIgnoreCase("Santa cruz"))
            n=2;
             if(Provincia.equalsIgnoreCase("Trujillo"))
            n=11;
           
            
             

         String[] distrito = new String[n];
        
        if(Provincia.equalsIgnoreCase("Chachapoyas"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Chachapoyas";
           distrito[2] = "Asuncion";
           distrito[3] = "Balsas";
           distrito[4] = "Cheto";
           distrito[5] = "Chiliquin";
        }
        
          if(Provincia.equalsIgnoreCase("Bagua"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "La Peca";
           distrito[2] = "Aramango";
           distrito[3] = "Copallin";
           distrito[4] = "El Parco";
           distrito[5] = "Imaza";
        }
          if(Provincia.equalsIgnoreCase("Bongara"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Jumbilla";
           distrito[2] = "Chisquilla";
           distrito[3] = "Churuja";
           distrito[4] = "Corosha";
           distrito[5] = "Cuispes";
           distrito[6] = "Florida";
           distrito[7] = "Jazan";
           distrito[8] = "Recta";
           distrito[9] = "San Carlos";
           distrito[10] = "Shipasbamba";
           distrito[11] = "Valera";
           distrito[12] = "Yambrasbamba";
        }
         if(Provincia.equalsIgnoreCase("Condorcanqui"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Nieva";
           distrito[2] = "El Cenepa";
           distrito[3] = "Rio Santiago";
        }
        if(Provincia.equalsIgnoreCase("Luya"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Lamud";
           distrito[2] = "Camporrendo";
           distrito[3] = "Cocabamba";
           distrito[4] = "Colcamar";
           distrito[5] = "Conila";
           distrito[6] = "Inguilpata";
           distrito[7] = "Longuita";
           distrito[8] = "Lonya Chico";
           distrito[9] = "Luya";
           distrito[10] = "Luya Viejo";
           distrito[11] = "Maria";
           distrito[11] = "Ocalli";
           distrito[12] = "Ocumal";
           distrito[13] = "Pisuquia";
           distrito[14] = "Providencia";
           distrito[15] = "San Cristobal";
           distrito[16] = "San Francisco del yeso";
           distrito[17] = "San Jeronimo";
           distrito[18] = "San Juan de Lopecancha";
           distrito[19] = "Santa Catalina";
           distrito[20] = "Santo Tomas";
           distrito[21] = "Tingo";
           distrito[22] = "Trita";
        }
         if(Provincia.equalsIgnoreCase("Rodriguez de Mendoza"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Chachapoyas";
           distrito[2] = "Asuncion";
           distrito[3] = "Balsas";
           distrito[4] = "Cheto";
           distrito[5] = "Chiliquin";
        }
         if(Provincia.equalsIgnoreCase("Utcamba"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "San Nicolas";
           distrito[2] = "Chirimoto";
           distrito[3] = "Cochacal";
           distrito[4] = "Huambo";
           distrito[5] = "Limabamba";
        }
          if(Provincia.equalsIgnoreCase("Aija"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Ajai";
           distrito[2] = "Coris";
           distrito[3] = "Huacllan";
           distrito[4] = "La Merces";
           distrito[5] = "Succha";
        }
            if(Provincia.equalsIgnoreCase("Antonio Raymondi"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Chaccho";
           distrito[2] = "Chingas";
           distrito[3] = "Llamellin";
           distrito[4] = "Mirgas";
           distrito[5] = "San Juan de Rontoy";
        }
          if(Provincia.equalsIgnoreCase("Asuncion"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "San Nicolas";
        }
             if(Provincia.equalsIgnoreCase("Bolognesi"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Canis";
        }
         if(Provincia.equalsIgnoreCase("Carhuaz"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Acompampa";
        }
        if(Provincia.equalsIgnoreCase("Carlos F. Fitzcarrald"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "San Luis";
        }
        if(Provincia.equalsIgnoreCase("Casma"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Buena Vista Alta";
        }
        if(Provincia.equalsIgnoreCase("Huaraz"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Cochabamba";
        }
          if(Provincia.equalsIgnoreCase("Corongo"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Aco";
        }
          if(Provincia.equalsIgnoreCase("Huari"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Anra";
        }
          if(Provincia.equalsIgnoreCase("Huarmey"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Cochapeti";
        }
          if(Provincia.equalsIgnoreCase("Huaylas"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Caraz";
        }
          if(Provincia.equalsIgnoreCase("Mariscal Luzuriaga"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Casca";
        }
          if(Provincia.equalsIgnoreCase("Ocros"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Lilipa";
        }
         if(Provincia.equalsIgnoreCase("Pallasca"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Bolognesi";
        }
         if(Provincia.equalsIgnoreCase("Pomabamba"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Huayllan";
        }
         if(Provincia.equalsIgnoreCase("Recuay"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Catac";
        }
          if(Provincia.equalsIgnoreCase("Santa"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Moro";
        }
           if(Provincia.equalsIgnoreCase("Sihuas"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Quiches";
        }
           if(Provincia.equalsIgnoreCase("Yungay"))
        {
           distrito[0] = "Distrito";
           distrito[1] = "Cascapara";
        }
          
         if(Provincia.equalsIgnoreCase("Abancay"))
         {
             distrito[0] = "Distrito";
           distrito[1] = "Abancay";
         }
            if(Provincia.equalsIgnoreCase("Andahuaylas"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Chiara";
            }
            if(Provincia.equalsIgnoreCase("Antabamba"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Antabamba";
            }
            if(Provincia.equalsIgnoreCase("Aymaraes"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Capaya";
            }
            if(Provincia.equalsIgnoreCase("Cotabambas"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Ongoy";
            }
            if(Provincia.equalsIgnoreCase("Chincheros"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Mara";
            }
             if(Provincia.equalsIgnoreCase("Grau"))
             {
                 distrito[0] = "Distrito";
           distrito[1] = "Turpay";
             }
          if(Provincia.equalsIgnoreCase("Arequipa"))
          {
              distrito[0] = "Distrito";
           distrito[1] = "Centro";
          }
            if(Provincia.equalsIgnoreCase("Camana"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Cayma";
            }
             if(Provincia.equalsIgnoreCase("Caraveli"))
             {
                 distrito[0] = "Distrito";
           distrito[1] = "Miraflores";
             }
            if(Provincia.equalsIgnoreCase("Castilla"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Paurcarpata";
            }
            if(Provincia.equalsIgnoreCase("Caylloma"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Sabandia";
            } 
            if(Provincia.equalsIgnoreCase("Condesuyos"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Sachaca";
            }
            if(Provincia.equalsIgnoreCase("Islay"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Tiabaya";
            }
            if(Provincia.equalsIgnoreCase("La uniòn"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Yanahuara";
            }
           if(Provincia.equalsIgnoreCase("Huamanga")) 
           {
               distrito[0] = "Distrito";
           distrito[1] = "Yanahuara";
           }
               if(Provincia.equalsIgnoreCase("Cangallo"))
               {
                   distrito[0] = "Distrito";
           distrito[1] = "Cangallo";
               }
             if(Provincia.equalsIgnoreCase("Huanca sancos"))
             {
                 distrito[0] = "Distrito";
           distrito[1] = "Chuschi";
             }
            if(Provincia.equalsIgnoreCase("Huanta"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Los Morochucos";
            }
            if(Provincia.equalsIgnoreCase("La mar"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Maria Parado de Bellido";
            }
             if(Provincia.equalsIgnoreCase("Lucanas"))
             {
                 distrito[0] = "Distrito";
           distrito[1] = "Paras";
             }
            if(Provincia.equalsIgnoreCase("Parinacochas"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Toros";
            }
            if(Provincia.equalsIgnoreCase("Pàucar del sara sara"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Acocro";
            }
            if(Provincia.equalsIgnoreCase("Sucre"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Acos Vinchos";
            }
            if(Provincia.equalsIgnoreCase("Victor fajardo"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Caermen Alto";
            }
            if(Provincia.equalsIgnoreCase("Vilcas huaman"))
            {
                distrito[0] = "Distrito";
           distrito[1] = "Chiara";
            }
            
             if(Provincia.equalsIgnoreCase("Cajamarca")) 
             {
                 
                distrito[0] = "Distrito";
           distrito[1] = "Cachachi";
             }
              if(Provincia.equalsIgnoreCase("Cajabamba"))
              {
                  
                distrito[0] = "Distrito";
           distrito[1] = "Cospan";
              }
             if(Provincia.equalsIgnoreCase("Celendin")) 
             {
                 
                distrito[0] = "Distrito";
           distrito[1] = "Celendin";
             }
               if(Provincia.equalsIgnoreCase("Chota"))
               {
                   
                distrito[0] = "Distrito";
           distrito[1] = "Angua";
               }
             if(Provincia.equalsIgnoreCase("Contumaza"))
             {
                 
                distrito[0] = "Distrito";
           distrito[1] = "Chilete";
             }
            if(Provincia.equalsIgnoreCase("Cutervo"))
            {
                
                distrito[0] = "Distrito";
           distrito[1] = "Choros";
            }
            if(Provincia.equalsIgnoreCase("Hualgayoc"))
            {
                
                distrito[0] = "Distrito";
           distrito[1] = "Bambamarca";
            }
             if(Provincia.equalsIgnoreCase("Jaen"))
             {
                 
                distrito[0] = "Distrito";
           distrito[1] = "Bellavista";
             }
            if(Provincia.equalsIgnoreCase("San ignacio"))
            {
                
                distrito[0] = "Distrito";
           distrito[1] = "Chirinos";
            }
            if(Provincia.equalsIgnoreCase("San marcos"))
            {
                
                distrito[0] = "Distrito";
           distrito[1] = "Chancay";
            }
            if(Provincia.equalsIgnoreCase("San miguel"))
            {
                
                distrito[0] = "Distrito";
           distrito[1] = "Bolivar";
            }
            if(Provincia.equalsIgnoreCase("San pablo"))
            {
                
                distrito[0] = "Distrito";
           distrito[1] = "San Bernardino";
            }
            if(Provincia.equalsIgnoreCase("Santa cruz"))
            {
                
                distrito[0] = "Distrito";
           distrito[1] = "Andabamba";
            }
            
            if(Provincia.equalsIgnoreCase("Trujillo"))
              {
                  
             distrito[0] = "Trujillo";
           distrito[1] = "El Porvenir";
           distrito[2] = "Laredo";
           distrito[3] = "Florencia de Mora";
           distrito[4] = "Victor Larco Herrera";
           distrito[5] = "Huanchaco";
           distrito[6] = "La Esperanza";
           distrito[7] = "Moche";
           distrito[8] = "Poroto";
           distrito[9] = "Salaverry";
           distrito[10] = "Simbal";
              }
            
        
        return distrito;
    }
}
