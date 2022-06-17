import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> maListe = new ArrayList();
        maListe.add(1);
        maListe.add(2);
        maListe.add(3);

        System.out.println(maListe);

        List<String> listString = new ArrayList();
        listString.add("A");
        listString.add("B");
        listString.add("C");

        List<Float> listFloat = new ArrayList();
        listFloat.add(0.5f);
        listFloat.add(10f);
        listFloat.add(9.7f);

        List<Etudiant> etudiants = new ArrayList();
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setNom("Mendje");
        etudiant1.setPrenom("Floribert");
        etudiant1.setMatricule("14MF002");

        Etudiant etudiant2 = new Etudiant();
        etudiant2.setNom("Yirung");
        etudiant2.setPrenom("Meschack");
        etudiant2.setMatricule("12YC001");

        Etudiant etudiant3 = new Etudiant();
        etudiant3.setNom("Tshilombo");
        etudiant3.setPrenom("Ruth");
        etudiant3.setMatricule("16TR003");

        Etudiant etudiant4 = new Etudiant();
        etudiant4.setNom("Katele");
        etudiant4.setPrenom("Elie");
        etudiant4.setMatricule("19KK014");

        Etudiant etudiant5 = new Etudiant();
        etudiant5.setNom("Muzala");
        etudiant5.setPrenom("Jemima");
        etudiant5.setMatricule("19MN123");

        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        etudiants.add(etudiant3);
        etudiants.add(etudiant4);
        etudiants.add(etudiant5);

        Collections.sort(etudiants);

        Set<String> listSet = new HashSet();

        listSet.add("toto");
        listSet.add("toto");

        System.out.println(listSet);

        Map<Integer,Etudiant> listMap = new HashMap();
        listMap.put(1,etudiant1);
        listMap.put(2,etudiant2);
        listMap.put(3,etudiant3);
        listMap.put(4,etudiant4);
        listMap.put(5,etudiant5);

        listMap.get(1);
        System.out.println(listMap);


    }
}
