package ma.beyondcom.sma.mData;

import java.util.ArrayList;
import ma.beyondcom.sma.R;

/**
 * Created by pc hp on 13/10/2017.
 */

public class SpaceCraftsCollection {

    public static ArrayList<SpaceCraft> getSpaceCrafts(){
        ArrayList<SpaceCraft> spaceCrafts=new ArrayList<>();
        SpaceCraft spaceCraft=null;

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Roger BADET");
        spaceCraft.setProfession("");
        spaceCraft.setDatetime("Lyon");
        spaceCraft.setCommunication("Lyon");
        spaceCraft.setLieu("");
        spaceCraft.setCv("Docteur en Médecine Dentaire \n" +
                "Professeur de l’enseignement supérieur \n" +
                "Ex Chef de département de Prothèse Conjointe, FMDC \n" +
                "DNSO option prothèse conjointe\n" +
                "CES  A  option  biomatériaux\n" +
                "CES  B  option  prothèse fixée\n" +
                "DESA  de Biomatériaux \n" +
                "Diplôme de statistique et d’épidémiologie appliquée à la médecine\n" +
                "Auteur de publications  internationales \n" +
                "Membre de plusieurs associations scientifiques nationales et internationales \n");
        spaceCraft.setResume("Résumé :\n" +
                "Sous l’influence de l’implantologie et des techniques adhésives, la médecine dentaire reconstructrice a évolué avec des changements de paradigmes, concernant d’une part la gestion des risques prothétiques et d’autre part la conservation maximale des tissus minéralisés, Cette nouvelle stratégie se différentie fondamentalement de  l’approche traditionnelle axée sur la mécanique.\n" +
                "Cliniquement, la pratique d’une dentisterie invasive a minima (minimally invasive dentistry) correspond à la stricte application du principe : respect systématique des tissus originels. \n" +
                "En effet grâce à la prise de conscience de la préservation tissulaire, l échéance prothétique tend à être repoussée. Le choix du type de restauration doit suivre les principes du gradient thérapeutique.\n" +
                "L’objectif de cette conférence est d’illustrer ces propos à travers plusieurs situations cliniques. \n");
        spaceCraft.setImage(R.drawable.interv1);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Thomas BAUER");
        spaceCraft.setProfession("Boulogne");
        spaceCraft.setDatetime("Boulogne");
        spaceCraft.setCommunication("Boulogne");
        spaceCraft.setLieu("");
        spaceCraft.setCv("-\tProfesseur d'enseignement supérieur assistant, département d'odontologie conservatrice -endodontie, faculté de médecine dentaire de Casablanca\n" +
                "-\tDoctorant en ingénierie tissulaire \n" +
                "-\tMaster universitaire du laser en dentisterie\n" +
                "-\tEnseignant associé au diplôme universitaire d’odontologie conservatrice –endodontie,  faculté de médecine dentaire, université Hassan II, Casablanca \n" +
                "-\tEnseignant associé au diplôme universitaire de dentisterie esthétique de l’université européen Miguel Cervantes\n" +
                "-\tEnseignant associé au diplôme universitaire de radiologie de faculté de médecine dentaire, Université Mohamed IV, Casablanca\n" +
                "-\tEnseignant associé au diplôme universitaire desurgences, faculté de médecine,  de l’université Hassan II, Casablanca \n" +
                "-\tDiplôme national de spécialité en odontologie conservatrice – endodontie\n" +
                "-\tDiplôme universitaire d’épidémiologie et recherche clinique\n" +
                "-\tDiplôme universitaire d’implantologie chirurgicale orale et maxillo-faciale.\n" +
                "-\tDiplôme universitaire de pathologie et de chirurgie buccale\n");
        spaceCraft.setResume("Résumé :\n" +
                "La reprise endodontique occupe une place importante dans l'endodontie quotidienne du praticien, il représente un acte thérapeutique difficile et imprévisible, La décision d'entreprendre une reprise de traitement endodontique est sujette à une variabilité intra et interindividuelle très importante. Les améliorations technologiques en matière d'instrumentation et de matériaux (ultrasons dédiés à l’endodontie, MTA ...) associés à l'utilisation de moyens de grossissement et d'un éclairage focalisé (loupes et microscopes opératoires) permettent d'optimiser de façon considérable les résultats lors des retraitements. \n" +
                "Nous vous invitons par ce travail à un tour d'horizon de la thérapeutique de reprise endodontique, de la décision thérapeutique au protocole opératoire.\n");
        spaceCraft.setImage(R.drawable.interv2);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Haykel BENAMOR");
        spaceCraft.setProfession("ODF");
        spaceCraft.setCommunication("hjkjj");
        spaceCraft.setCv("-\tDiplôme d'Université de Pédagogie des Sciences de la santé, Faculté de \n" +
                "Médecine Dentaire, Université Hassan II, 2014\n" +
                "-\tDiplôme d'Université de Communication Médicale, ISPED, Université de Bordeaux, 2013 \n" +
                "-\tProfesseur de l'Enseignement Supérieur, Faculté de Médecine Dentaire, Université Hassan II, depuis 2010 \n" +
                "-\tDoctorat d'Université, Faculté des Sciences de Casablanca, Université Hassan II, 2010\n" +
                "-\tProfesseur Agrégé, Faculté de Médecine Dentaire, Université Hassan II, de 2005 à 2010 \n" +
                "-\tDiplôme d'Université d'Orthodontie linguale, Faculté de Chirurgie Dentaire de Paris5, Université René DESCARTES, 2005\n" +
                "-\tDiplôme d'Etude Approfondie en Biomatériaux (DESA), Faculté de Médecine et de Pharmacie, Université Hassan II, 2001\n" +
                "-\tProfesseur Assistant Faculté de Médecine Dentaire, Université Hassan II, 2000 – 2005. \n" +
                "-\tDiplôme National de Spécialité en Orthodontie, Faculté de Médecine Dentaire, Université Hassan II, 2000 \n" +
                "-\tDocteur en Médecine Dentaire, Faculté de Médecine Dentaire, Université Hassan II, 1996 ");
        spaceCraft.setResume("Résumé :\n" +
                "-\tLes malocclusions orthodontiques peuvent être classées selon\n" +
                "-\tdifférents critères de difficultés. Parmi ces critères, la présence ou l’absence\n" +
                "-\td’asymétrie. En effet, les asymétries dentaires et squelettiques compliquent\n" +
                "-\tsouvent la prise en charge orthodontique. Leurs corrections exigent une\n" +
                "-\tapproche différente de celle qu’on a l’habitude d’adoptée régulièrement.\n" +
                "-\tL’objectif de cette présentation est de montrer les solutions thérapeutiques\n" +
                "-\tpour les différentes situations d’asymétries que l’on peut recevoir durant\n" +
                "-\tnotre pratique quotidienne.\n");
        spaceCraft.setDatetime("Tunis");
        spaceCraft.setImage(R.drawable.interv3);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Christel CONSO");
        spaceCraft.setProfession("Médecine Dentaire");
        spaceCraft.setDatetime("Paris");
        spaceCraft.setCommunication("Gestion des maladies à risque en cabinet dentaire");
        spaceCraft.setCv("\n" +
                "•\tDCD– Université de Montpellier \n" +
                "• D.U.de Chirurgie Orale – Université de Montpellier \n" +
                "• Postgraduate in periodontology, implantology& oral Surgery – NYU \n" +
                "• D.U. de chirurgie Orale et maxillo-faciale – Université de Toulouse \n" +
                "• D.U. d’Expertise médico légale Orale et maxillo-faciale – Université de Montpellier \n" +
                "• D.U. d’Imagerie médicale Tridimensionnelle - Université de Toulouse \n" +
                "• Master en chirurgie Avancée – Université Paris V \n" +
                "• Certificat de chirurgie osseuse pré-implantaire – Zimmer Institute \n" +
                "• Membre du comité scientifique de l’international group of oral rehabilitation. I.G.O.R. \n" +
                "• Membre du World Academy of Ultrasonic Piezoelectric Bone Surgery W.A.U.P.S. \n" +
                "• Membre de la société française de biomatériaux et systèmes implantables S.F.B.S.I. \n" +
                "• Président Fondateur de l’International Academy for Implantology& Oral Surgery I.A.I.O.S. \n" +
                "\n");
        spaceCraft.setResume("Résumé :\n" +
                "Nous recevons régulièrement dans nos cabinets, des patients présentant des pathologies diverses, auxquelles il faut faire face. \n" +
                "On est souvent amenés à se poser la question, pourrons-nous prendre en charge tel ou tel patient atteint de telle ou telle maladie, ou alors faut-il le rediriger vers des centres spécialisés. \n" +
                "Les pathologies les plus fréquentes rencontrées dans nos cabinets, sont le Diabète ; les maladies Cardio-vasculaires ; les maladies osseuses comme l’ostéoporose ; l’insuffisance rénale ; pour ne citer que celles-ci. Le diabète, devenu maladie épidémique au Maroc, deux millions cinq cent mille diabétiques recensés, sans compter les patients atteints de diabète et qui ne le savent pas. \n" +
                "Les maladies Cardio-vasculaires gagnent aussi du terrain, du fait de la sédentarité de la population, de l’hygiène de vie, et des exigences de la vie quotidienne. \n" +
                "Nombreux sont nos patients qui présentent ces maladies en même temps, et notre souci est de les accompagner. La décision thérapeutique, et /ou chirurgicale sont parfois délicates, et nous ne savons pas gérer certaines décisions, pouvons-nous ");
        spaceCraft.setImage(R.drawable.interv4);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Christophe DE LAVIGNE");
        spaceCraft.setProfession("SANTE COMMUNAUTAIRE");
        spaceCraft.setDatetime("Bordeaux");
        spaceCraft.setCommunication("La médecine dentaire en tant que facteur de développement socio économique");
        spaceCraft.setCv("•\tDCD,DSO,Professeur Agrégé en Santé Publique\n" +
                "•\tSpécialiste en économie de la santé- FMPOS-UCAD\n" +
                "•\tExpert auprès du Tribunal régional hors classe de Dakar\n");
        spaceCraft.setResume(" Résumé :\n" +
                "Nos systèmes de santé se trouvent confrontés à des enjeux difficiles et complexes du fait, notamment, des pressions nouvelles qu’exercent le vieillissement de la population, le développement des maladies chroniques et le recours intensif à des technologies médicales coûteuses mais vitales. Dans le même temps, il nous faut répondre aux attentes de plus en plus grandes des citoyens et tenter de résoudre les inégalités qui touchent les différents groupes de la population en matière d’accès aux services et des soins de santé. \n" +
                "La  médecine dentaire partie intégrante de la Médecine générale est confrontée aux mêmes difficultés surtout socio-économiques. En effet, les fluctuations économiques ont un impact considérable sur les ressources et les politiques de soins dentaires.Quand l’essentiel de la dépense de santé est supportée directement par les ménages, sans mécanisme de mutualisation du risque maladie, celle-ci représente un facteur de maintien dans la pauvreté ou d’appauvrissement brutal extrêmement important.  \n" +
                "Il est donc important dans la marche résolue vers l’émergence de nos pays de comprendre les relations complexes entre le développement socio-économiqueet la médecine dentaire pour dégager des perspectives novatrices en termes de politique, de maîtrise des dépenses de santé mais surtout d’accessibilité de nos populations à des soins de qualité qui boosteront la productivité et au-delà le développement socio-économique. \n");
        spaceCraft.setImage(R.drawable.interv5);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Yves LEFEBVRE");
        spaceCraft.setProfession(" NOUVELLES TECHNOLOGIES/ CFAO");
        spaceCraft.setDatetime("Strasbourg");
        spaceCraft.setCommunication("La CFAO au quotidien dans un cabinet d’omnipratique");
        spaceCraft.setCv("•\tPraticien libéral, exercice omnipratique.\n" +
                "•\tDiplômé à Paris V- Descartes en 1995.\n" +
                "•\tAttestation Universitaire en Implantologie (Paris VII) en 2003.\n" +
                "•\tDiplôme Universitaire de Formation Continue en Odontologie (Paris V) en 2005\n" +
                "•\tChargé d’enseignement à la Faculté de Chirurgie Dentaire de Paris  V - Descartes,département de Biomatériaux depuis 2007.\n" +
                "•\tMembre du comité d’experts réuni par la HAS en 2007 pour étudier « l’opportunité médicale d’inscrire la pose de prothèse à armature céramique et/ou usinée, sur la liste des actes remboursables ».\n" +
                "•\tChargé d’enseignement à la Faculté de médecine d’Angers, Groupe Etude Remodelage Osseux et bioMatériaux depuis 2013.\n" +
                "•\tChercheur associé de l’Unité de Recherche Biomatériaux Innovants et Interfaces (URB2i) de l’Université Paris Descartes.\n" +
                "•\tDiplôme Universitaire « Tissus calcifiés et Implantologie » (Angers) en 2016");
        spaceCraft.setResume("Résumé :\n" +
                "L’empreinte optique permet au praticien d’enregistrer, au fauteuil et de façon tridimensionnelle, les structures bucco-dentaires grâce à un système optique couplé à un ordinateur. À partir de cette empreinte optique, un logiciel spécifique élabore un maître modèle virtuel permettant de réaliser les étapes de conception et fabrication assistées par ordinateur. \n" +
                "La CFAO connaît un champ d’application en pleine expansion : initialement réservée à la prothèse conjointe unitaire (inlays, onlays, couronnes, facettes), elle est maintenant également utilisée en prothèse plurale (bridges), en prothèse implanto-portée, en orthodontie et pour la planification implantaire.\n" +
                "Cette présentation permettra de faire le point sur cette technique en pleine expansion et sur son utilisation quotidienne dans un cabinet d’omnipratique.\n");
        spaceCraft.setImage(R.drawable.interv6);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Nicolas LEFEVRE");
        spaceCraft.setProfession("NOUVELLES TECHNOLOGIES/LASER");
        spaceCraft.setDatetime("Paris");
        spaceCraft.setCommunication("Les lasers médicaux incontournables en médecine  Dentaire");
        spaceCraft.setCv("Etudes secondaires à Nancy – Lycée Henri Poincaré\n" +
                "Baccalauréat section Mathématiques\n" +
                "Diplômé de la Faculté de Médecine\n" +
                "Diplômé de la Faculté de Chirurgie dentaire\n" +
                "Spécialisation en Parodontologie, Chirurgie et Implantologie\n" +
                "Diplômé en Expertise bucco dentaire\n" +
                "Expert in Oral Implantolgoy D.G.O.I. - A.F.I.\n" +
                "Directeur de l’Enseignement des Techniques lasers assistées à Paris Garancière (Paris 7 Diderot)\n" +
                "Directeur de l’Enseignement des Techniques lasers assistées à Montpellier UFR\n" +
                "Professeur A.C. associé à l’Université de Milan Bicocca\n" +
                "Participe à de nombreuses recherches médicales sur les lasers médicaux, la Photothérapie\n" +
                "dynamique sans colorant, les cellules souches et la régénération osseuse.\n" +
                "Auteur de très nombreuses parutions et plusieurs ouvrages\n" +
                "Conférencier dans le monde entier (Europe, Afrique, Asie, Amériques, Océanie, ……)\n");
        spaceCraft.setResume("Résumé :\n" +
                "Les lasers médicaux sont utilisés depuis longtemps dans toutes lesspécialités de la médecine moderne. Les propriétés thérapeutiques deleurs rayonnements les rendent aujourd’hui incontournables enChirurgie Dentaire.Les traitements lasers assistés font partie des données acquises de lascience médicale qui nécessitent des mises à jour permettant deproposer aux patients toutes les options thérapeutiques disponibles(C.N.O. 2015).\n" +
                "C’est dans cet objectif de respect des acquis universitaires et de maitrisede l’énergie photonique des rayonnements que Gérard REY vousindiquera les principes d’utilisation et les protocoles fondamentaux quipermettent la réussite des traitements en cabinet libéral.\n" +
                "Avec plus de 25 années d’expérience clinique et hospitalière, le DocteurGérard REY est le concepteur de nombreux protocoles utiles pour laconservation des dents naturelles et la guérison des infections\n" +
                "bucco-dentaires.Il dirige l’enseignement des lasers médicaux à Paris Garancière, Milan\n");
        spaceCraft.setImage(R.drawable.interv7);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Dr Joseph BASSIL -LIBAN-");
        spaceCraft.setProfession("IMPLANTOLOGIE");
        spaceCraft.setDatetime("Toulouse");
        spaceCraft.setCommunication("Existe-t-il un implant qui répond à toutes les  indications ?");
        spaceCraft.setCv("DR Bassil est diplômé de l’Université Saint Joseph avec un diplôme de Docteur en Chirurgie Dentaire. Il est titulaire d’un CES d’Odontologie Chirurgicale de Paris VII (1995) et d’un Diplôme Universitaire de Pathologie Orale(1996) et de Radiologie Maxillo-Faciale (1997) de Paris VI. Il a obtenu son Doctorat d’Université en 2012 après avoir passé la Maitrise en Sciences Odontologiques (2006) et le diplôme d’Etudes Approfondies (2008)à l’Université saint Joseph dans laquelle il est enseignant dans le département de Chirurgie Orale depuis 1997. Il a été nommé Maître de Conférence en 2012.En plus de son activité universitaire, sa pratique privée se limite à la chirurgie orale dans son cabinet ou dans le service de Chirurgie Maxillo-Faciale à l’Hôpital Militaire de Beyrouth.\n" +
                "Dr Bassil a à son effectif plusieurs publications dans des revues internationales, ainsi que de nombreuses conférences locales et internationales.\n");
        spaceCraft.setResume("  Résumé :\n" +
                "Le choix du diamètre et de la  longueur de l'implant dépend du type d'édentement, du volume osseux résiduel, du diamètre de l’espace disponible pour la reconstruction prothétique, du profil d'émergence et du type d'occlusion.\n" +
                "\n" +
                "Les implants de petit diamètre sont indiqués dans des situations cliniques spécifiques, tel qu’une crête alvéolaire mince, un espace réduit ou pour le remplacement des dents à petit diamètre cervical.\n" +
                "Les implants courts sont utilisés sous le sinus et quant l’os résiduel est de faible hauteur alors que les implants de gros diamètre sont préférés au niveau des molaires quant le volume osseux le permet. De même, les implants non enfouis sont appréciés, surtout dans les régions postérieures, à cause de la grande stabilité osseusecrestale alors que les implants enfouis sont préférés dans les régions où l’esthétique prime.\n" +
                "La question qui se pose est la suivante: Est ce qu’on a besoin de plusieurs systèmes implantaires pour répondre à toutes cessituations cliniques ?\n");
        spaceCraft.setImage(R.drawable.interv8);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Sami BELHARETH");
        spaceCraft.setProfession("ODONTOLOGIE CONSERVATRICE");
        spaceCraft.setDatetime("La Marsa");
        spaceCraft.setCommunication("Le traitement restaurateur en 2017. Actualités et évolutions");
        spaceCraft.setCv("-\tDocteur en Chirurgie Dentaire (1974) \n" +
                "-\tDocteur en Sciences Odontologiques (1981)\n" +
                "-\tDocteur d’Etat en Odontologie (1990)\n" +
                "-\tAssistant Hospitalo-Universitaire en Odontologie Conservatrice  (1979/1986)\n" +
                "-\tMaitre de Conférences des Universités et Praticien Hospitalier en Odontologie Conservatrice et Endodontie (1988/1996)\n" +
                "-\tProfesseur des Universités, à la Faculté de Chirurgie Dentaire de l’Université Paris Descartes et Odontologiste (depuis 1996)\n" +
                "-\tPraticien hospitalier temps plein (Hôpital Bretonneau, Pôle TACAUR, Groupement hospitalier Paris Nord Val des Seine, APHP GH ) (depuis 1996)\n" +
                "-\t- Chef du service d’Odontologie de l’Hôpital Bretonneau, PARIS (depuis 2015)");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCraft.setResume(" Résumé :\n" +
                "La santé buccodentaire est une donnée importante de la santé globale, concourant au bien-être physique et mental et à la qualité de vie de nos patients. Le maintien de cette santé repose sur deux concepts indissociables la prévention et l’intervention minimale. L’intervention minimale s’impose lorsque le traitement restaurateur est indiqué et s’applique autant aux lésions superficielles qu’aux lésions profondes. Elle comporte 3 phases l’identification du problème clinique (carie, trauma, abrasion, érosion), le traitement restaurateur proprement dit et le suivi périodique du patient. Lors de cette conférence seront évoqués les nouveaux matériaux permettant de répondre au triple objectif du traitement restaurateur par méthode directe et indirecte, biologie-fonction-esthétique, en particulier l’évolution des verres ionomères vers les verres hybrides, le développement des matériaux de préservation de la vitalité pulpaire (silicates tricalciques), l’orientation des systèmes adhésifs multi-étapes vers les adhésifs universels, la place des composites « bulk » et les matériaux composites et céramiques usinables par CFAO. Les procédures de mise en œuvre de ces matériaux seront détaillées à partir d’exemples cliniques, en développant les nouveaux protocoles restaurateurs tels que les techniques de matriçage, le scellement dentinaire immédiat (IDS), l’élévation de marge, ou encore le collage des restaurations partielles adhésives.\n");
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Mohamed Amine BENHIMA");
        spaceCraft.setDatetime("Marrakech");
        spaceCraft.setCommunication("Petite Chirurgie  Buccale de Demain : Anciennes et Nouvelles Technologies et Techniques face aux Besoins Reels de la Population.");
        spaceCraft.setProfession("ODONTOLOGIE CHIRURGICALE");
        spaceCraft.setCv("Dr.Chir.Dent.,FICD,FACOMS,  CES Biol.Buc.,CES Odont.Chirurg.,DU Dermatologie Orale,DIUM\n" +
                "Ex-Directeur des DESS de Chirurgie Orale et de Pathologie Orale , et Charge de Cours et d'Enseignement Clinique, Departement de Chirurgie Orale et Maxillo-Faciale,Departement de Pathologie et Diagnostic Oraux, Faculte de Medecine Dentaire de l'Universite Libanaise , Beyrouth, Liban ,\n" +
                "Chirurgien Buccal de l'Hopital Central  de l'Armee  Libanaise et de l'Hopital Gouvernemental Universitaire de Baabda, Liban,\n" +
                "Redacteur en Chef du Journal de l'Ordre des Dentistes du Liban-JLDA,\n" +
                "President du Comite Scientifique de la Societe Libanaise de chirurgie Orale,\n" +
                "Ex President de la Commision Scientifique de l'Ordre des Dentistes du Liban,\n" +
                "Ex Chef de Clinique Chirurgicale Buccale de l'Universite Saint-Joseph de Beyrouth,\n" +
                "Ex Attache de Consultation en Chirurgie Buccale a l'Universite Paris 7,\n" +
                "Ex \"ClinicalFellow\" en Chirurgie Orale de l'Universite de Harvard,Boston,USA.\n");
        spaceCraft.setResume("  Résumé :\n" +
                "Parmi les disciplines  odontologiques ,la  chirurgie dento-alveolaire (ou odontologie chirurgicale) et la chirurgie orale mineure s'imposent dans tout plan de traitement bucco-dentaire contemporain. Avec l'explosion de nouvelles technologies, l’apparition de nouveaux biomatériaux de substitution osseuse, et l'évolution des  techniques opératoires  ,la petite  chirurgie  buccale  apparait ,en 2017,comme une discipline a la portée de l'odontologiste omnipraticien qui a renforce  et enrichi son internat en rotations chirurgicales  diverses, surtout celles hospitalières qui offrent une approche supplémentaire aux pathologies dentaires et bucco-maxillaires particulières et aux patients médicalement compromis qui souffrent de maladies chroniques , a symptomatologie osseuse et orale muqueuse.Notre présentation passera en revue l'évolution des concepts et raisonnementsdiagnostiques  et thérapeutiques en petite chirurgie buccale ,avec ,a l'appui, une large panoplie de cas \n");

        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);


        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Yassir EL ANDALOUSSI");
        spaceCraft.setDatetime("Casablanca");
        spaceCraft.setProfession("ODONTOLOGIE CHIRURGICALE");
        spaceCraft.setCommunication("Les nouvelles techniques d'imagerie au quotidien");
        spaceCraft.setCv("\uF0A7\tPrésident du conseil national de l'ordre de dentistes algériens (1998/2000)\n" +
                "\uF0A7\tMembre fondateur de l'académie algérienne de médecine dentaire\n" +
                "\uF0A7\tAncien doyen de la faculté de chirurgie dentaire d'Oran (1988/1990)\n" +
                "\uF0A7\tProfesseur chef de service au CHUOran (1980/1990)\n" +
                "\uF0A7\tMembre de la société française de chirurgie orale\n" +
                "\uF0A7\tPrésident scientifique de l'ass. des dentistes privés d'Oran");
        spaceCraft.setResume("  Résumé :\n" +
                "L'orthopantomogramme et la RVG ont beaucoup apporté a l'examen pré opératoire mais n'est il pas un leurre que de vouloir poser un diagnostic et déterminer une stratégie opératoire d'une pathologie occupant un volume et donc en 3D et disposant d'un image 2D?\n" +
                "de cette problématique est né le besoin de reconstituer en 3D nos images radiographiques et tenter un tant soit peu de reconstituer le réel.\n" +
                "grâce a une riche iconographie nous montrerons tous ces avantages dont:\n" +
                "1/ la relation dent de sagesse mandibulaire avec canal dentaire ou maxillaire avec le sinus.\n" +
                "2/ la position exacte d'un corps étranger ou une racine résiduelle par rapport aux tables et ainsi choisir la voie d'abord chirurgical\n" +
                "3/ la situation d'une canine incluse et déterminer sa traction orthodontique ou son extraction chirurgicale.\n" +
                "4/ Vérifier une obturation canalaires en son apex, étanchéité, canaux non obturés etc..\n" +
                "et la liste n’est pas exhaustive.\n" +
                "Cela pour démontrer cet apport qui améliorera nos thérapeutiques avec la satisfaction de nos patients, et à l'inverse de ce que certains pourraient croire, en diminuant les couts par une diminution des échecs.\n");

        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Ahmed EL BARDOUNI");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Cas prothetiques  complexes:comment aborder la prise en charge implantaire");
        spaceCraft.setProfession("ENDODONTIE");
        spaceCraft.setCv("Professeur agrégé en prothèse fixée. C.E.S. biomatériaux. C.E.S. prothèse fixée. C.E.S prothèse adjointe totale. C.E.S prothèse adjointe partielle. C.E.S parodontologie du  Prothèse maxillo-faciale. Membre fondateur et Ex président du Collège National de Prothèse. Exercice limitée à  la prothèse fixée/implantologie. Casablanca. Enseignant au DUCOMF Faculte  de medecine  Paul Sabatier.Toulouse.  ");
        spaceCraft.setResume("Résumé :\n" +
                "Le syndrome combiné est une entité clinique particulière, très difficile à traiter en général et encore plus particulièrement en implantologie parce qu’elle comporte certains pièges diagnostiques et donc thérapeutiques que le praticien doit savoir reconnaître afin de mieux les gérer.\n" +
                "Selon le glossaire des termes prothétiques (1) le syndrome combiné se défini comme les traits caractéristiques qui surviennent lorsque un maxillaire édenté est opposé aux dents mandibulaires antérieuresincluant la perte osseuse au niveau de la portion antérieure de la crête maxillaire, la croissance des tubérosités maxillaires , une hyperplasie papillaires du palais dur , l’extrusion des dents mandibulairesantérieures et la résorption osseuse des crêtesmandibulairespostérieures sous les bases des prothèses partielles amovibles .  Ce syndrome est égalementappelé syndrome de l’Hyperfonctionantérieure ou encore syndrome de Ellsworth Kelly  (2) qui avait été le premier à décrire ce syndrome en 1972 .\n" +
                "\n" +
                "D’autres symptômes sont souvent associés à ce tableau clinique déjàtrès riche comme la perte de la dimension verticale d’occlusion, les perturbations importantes du plan d’occlusion  et le pro-glissement mandibulaire pour ne citer que ceux là. \n" +
                "La perte des contacts occlusaux assurant le calage molaire postérieuradéquat est un facteur essentiel dans le processus pathologique du syndrome combiné(3)(4) ce qui entraine par conséquence une surcharge excessive sur la crête osseuse édentée du secteur antérieur  maxillaire par les dents antérieuresmandibulairesrésultant en une\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Abdelhalim EL IBRAHIMI");
        spaceCraft.setProfession("ENDODONTIE");
        spaceCraft.setDatetime("Fès");
        spaceCraft.setCommunication("Comment réussir son traitement endodontique ?");
        spaceCraft.setCv("\uF0A7\tProfesseur de l’Enseignement Supérieur en Odontologie Conservatrice \n" +
                "\uF0A7\tDiplôme National de Spécialités Odontologiques, option : Odontologie Conservatrice, Faculté de Médecine Dentaire, Rabat.\n" +
                "\uF0A7\tCertificat d’Etudes Supérieures en Biomatériaux et technologies de laboratoires, Faculté de Chirurgie Dentaire de Clermont-Ferrand ; France\n" +
                "\uF0A7\tCertificat d’Etudes Supérieures en Odontologie Conservatrice-Endodontie, Faculté de Chirurgie Dentaire de Bordeaux ; France\n" +
                "\uF0A7\tChef de Département d’Odontologie Conservatrice, Faculté de Médecine Dentaire, Rabat.");
        spaceCraft.setResume("Résumé :\n" +
                "\n" +
                "Les traitements canalaires occupent une large part dans l'exercice de tout médecin dentiste en omni-pratique.\n" +
                "La réussite de toute thérapeutique endodontique consiste en le scellement permanent et hermétique de la totalité du système canalaire, tout en restaurant à l'organe dentaire un état de santé biologiquement acceptable ainsi qu'une fonction normale.\n" +
                "La complexité et la diversité du système endodontique ainsi que certaines manœuvres intempestives peuvent concourir à plus ou moins longue échéance à l’échec du traitement canalaire.\n" +
                "A travers cette présentation, nous allons  expliquer et illustrer comment réussir les traitements canalaires en omni-pratique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);


        spaceCraft = new SpaceCraft();
        spaceCraft.setName("François-Xavier GUNEPIN");
        spaceCraft.setDatetime("Lorient");
        spaceCraft.setCommunication("Mise en charge immédiate d’un bridge complet après extraction\n" +
                "et implantation dans la même séance. Est-ce raisonnable? ");
        spaceCraft.setProfession("IMPLANTOLOGIE");
        spaceCraft.setCv("Dentiste LSD 1992 - Docteur en Médecine dentaire 1999 - Professeur à l’Université de Liège (BELGIQUE) - Chef de Service CHU Sart Tilman Liège (BELGIQUE) – Domaines d’activités cliniques, d’enseignement et de recherche : prothèse sur implants, occlusodontie et  prothèse amovible - Président du Département Hospitalier de Dentisterie - Vice-Président du Département Universitaire de dentisterie.\n" +
                "\n" +
                "\uF0D8\tDocteur en Médecine dentaire\n" +
                "\uF0D8\tChargé de cours à l’Université de Liège\n" +
                "\uF0D8\tChef de Service Prothèse amovible – Prothèse sur implants – Occlusion au CHU de LIEGE\n" +
                "\uF0D8\tPrésident du Département Hospitalier de Dentisterie de Liège\n" +
                "\uF0D8\tResponsable du DES de Chirurgie et Réhabilitation Orale Implantaire – Liège –\n" +
                "\uF0D8\tResponsable de cours du DES de Réhabilitation bucco-dentaire \n" +
                "\uF0D8\tResponsable et chargé de cours du Diplôme Inter-Universitaire Européen en Implantologie Orale (en collaboration avec l’Université de Corse)\n");
        spaceCraft.setResume("  Résumé :\n" +
                "A l’heure actuelle tout va vite, très vite, trop vite ? Poser des implants dans des alvéoles d’extraction dentaires et placer immédiatement un bridge total sur ces implants, est-ce aller trop vite ? Vraie évolution ou révolution pour nos patients ?Il est légitime d’essayer de vouloir apporter rapidement des solutions prothétiques implantaires fiables à nos patients. Cet exposé présentera les indications de cette proposition de réhabilitation et détaillera les procédures cliniques de réalisation.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Ahmed Reda HADDOUN");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setDatetime("Casablanca");
        spaceCraft.setCommunication("Le passage de l’édentation subtotale a l’édentation totale : rôle de la prothèse immédiate.");
        spaceCraft.setCv("- Professeur à la faculté de médecine dentaire de Casablanca \n" +
                "- Chef de service de prothèse adjointe \n" +
                "- CES de biomatériaux - Paris VISA\n" +
                "- CES de prothèse adjointe partielle - Paris VII\n" +
                "- CES de prothèse adjointe complète - Paris VII \n" +
                "- DU d'odontologie légale de d'expertise -Toulouse \n" +
                "- Directeur du diplôme de spécialité de prothèse adjointe \n");
        spaceCraft.setResume("Résumé :\n" +
                "Lorsqu’il s’agit des dents antérieures vouées à l'extraction, la prothèse immédiate réalisée avant leur avulsion, et mise en bouche le jour des extractions, permet d’épargner au patient la dure épreuve psychologique de la perte des dents et du préjudice esthétique ; et ce grâce à une programmation esthétique préalable\n" +
                "En outre la prothèse immédiate va guider la cicatrisation, contenir l’œdème post chirurgical et surtout réduire et prévenir la résorption osseuse\n" +
                "Par ailleurs, nous allons voir un certain nombre de cas cliniques qui montrent :\n" +
                "- L’apport de la prothèse immédiate dans la réhabilitation esthétique de l’étage inférieur de la face\n" +
                "- L’emploi judicieux d'une configuration de porte empreinte individuel que nous avons nommé « PEI à base réduite » en présence d’épulis \n" +
                "pas gérer certaines décisions, pouvons-nous opérer un diabétique, un opéré du cœur, un insuffisant rénal, leur poser des implants, les greffer, etc… \n" +
                "Quel est notre comportement vis-à-vis de certains médicaments, les anticoagulants, les antiagrégants plaquettaires, les biphosphonates, et d’autres… \n" +
                "Cette présentation nous permettra de mieux connaître ces maladies, pour mieux les appréhender et pouvoir mieux les gérer dans nos cabinets. \n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Abdelkrim LARGAB");
        spaceCraft.setDatetime("Casablanca ");
        spaceCraft.setCommunication("Réflexions sur l’alternative : Dents / Implants");
        spaceCraft.setProfession("PARODONTOLOGIE");
        spaceCraft.setCv("\uF0A7\tAncien Président de la société parisienne de parodontologie (2000-2002)\n" +
                "\uF0A7\tAncien rédacteur en chef de la Revue d'Odonto-Stomatologie (2001-2012)\n" +
                "\uF0A7\tMembre du bureau du Haut Conseil de  l'Agence Nationale pour le Développement Professionnel Continu\n" +
                "\uF0A7\tPrésident de la commission scientifique Indépendante de l'Agence Nationale pour le Développement Professionnel Continu depuis 2012\n");
        spaceCraft.setResume("Résumé :\n" +
                "Les progrès de l'implantologie moderne ont permis l'éclosion de nouvelles options thérapeutiques. L'apparente facilité de la prothèse implanto portée conduit à de nombreux traitements ou la conservation de la dent à été peu considérée.\n" +
                "Cela induit  le fait que trop d'extractions sont faites sans se poser de questions sur les autres options envisageables.\n" +
                "Le propos de cette  présentation est de faire le point sur la pertinence de cette démarche et  de ses conséquences. \n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);


        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        spaceCraft = new SpaceCraft();
        spaceCraft.setName("Farid ISMAEL");
        spaceCraft.setDatetime("Rabat");
        spaceCraft.setCommunication("Prothèse amovible partielle (PAP) ou Prothèse implanto-portée (PIP) : Quel choix ?");
        spaceCraft.setProfession("PROTHESE ADJOINTE");
        spaceCraft.setCv("•\tProfesseur d’enseignement supérieur en prothèse adjointe à la FMDR\n" +
                "•\tResponsable du CU de Réhabilitations occluso-prothétiques des cas complexes à la FMDR\n" +
                "•\tCo-responsable du DU de Réhabilitation implantaire à la FMDR\n" +
                "•\tMembre de l’International Team of Implantology (ITI)\n" +
                "•\tMembre du comité de lecture du journal Web Journal de la FMDR\n" +
                "•\tChargée de cours au Diplôme Universitaire d’Orthodontie à la FMDR, module : interdisciplinarité ortho-prothèse\n" +
                "•\tDoctorat de 3ème cycle en sciences odontologiques (DSO), Université d’Auvergne, Faculté de chirurgie dentaire de Clermont Ferrand, France\n");
        spaceCraft.setResume("Résumé :\n" +
                "Actuellement, les progrès spectaculaires de l’implantologie en rapport avec les techniques d’augmentation osseuse permettent plus l’orientation thérapeutique vers des restaurations fixées à la place des prothèses amovibles conventionnelles.\n" +
                "Mais, bien que lechamp d’indications de la PAP ait diminué, celle-ci ne doit pas être considérée comme une prothèse de second choix mais comme un moyen thérapeutique incontournable qui trouve son indication majorée lorsque les conditions locales, générales voire certaines dispositions personnelles n’autorisent pas la mise en place d’implants.\n" +
                "D’autre part, s’il est admis aujourd’hui que l’implantologie est guidée par la prothèse et non par l’os, la PAP, dans toutes les situations d’édentements partiels représente le fil conducteur du traitement implantaire fixé, en fournissant des outils guides pendant la phase diagnostique, chirurgicale et prothétique optimisant ainsi le succès thérapeutique.\n" +
                "Le but de notre conférence est donc de mettre en exergue :\n" +
                "-\tLes facteurs décisionnels entre PAP et PIP,\n" +
                "-\tLa forme de cohabitation qui existe entre la PAP et la PIP au sein d’un traitement global,\n" +
                "-\tEt l’apport de l’implantologie à la PAP classique.\n");
        spaceCraft.setImage(R.drawable.interv9);
        spaceCrafts.add(spaceCraft);

        return spaceCrafts;



    }
}
