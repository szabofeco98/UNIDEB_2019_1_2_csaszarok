# Szótár Projekt

## 1. A rendszer célja
Készülő programunk egy magyar-angol szótáras felkérdezőprogram. Célunk 
ezzel a projekttel, hogy hatékonyan fejlesszük a hétköznapi emberek 
nyelvtudását, mind fiatalokét, mind idősekét is egyaránt.
 
Alkalmazásunkat úgy lehet majd használni, hogy a program a feltöltött 
szótárból kérdez szavakat és ezeket kell helyesen megválaszolni. 
A felhasználóink új szavakat tudnak ezáltal tanulni, a régieket 
feleleveníteni, ezáltal lesz egy aktív szókincsük.

Saját szólista is összeállítható, amely használható saját vagy 
pl. gyerekeink angol házifeladatának gyors megtanulásához és kikérdezéséhez.

A minimalista dizájn miatt átlátható, és könnyen felfedezhető a mi kis 
tanulószótárunk idősek és fiatalok számára egyaránt, és nem utolsó 
sorban nem vonja el a tanulástól a figyelmet.

Nem kell órákat belefektetnünk az angol tanulásba, vonaton buszon, 
út közben is használható, akár iskolai szünetekben is.

Ingyenes, nem kell tízezreket költenünk magántanárra, nyelviskolára, ha 
célunk csak a szavak felfrissítése, nem kell otthon a nehéz szótárakat 
bújni, jegyzetelni, szókártyákkal vacakolni, itt játszva meg lehet 
tanulni az új szavakat. 

A program segítségével az angol nyelvtudással 
nem rendelkező szülők is ki tudják kérdezni gyerekeiket! 

Author:[Szabó Alexandra_Ilona](https://github.com/Wrigozo)  

## 2. Projektterv
#### Projekt:Szótár alkalmazás.

1. **Erőforrások:**
   1. Idő:
       * 2019.09.09 : Csapat megalakulása.
       * 2019.09.16 : Projekt kezdete.
       * 2019.09.30 : Projekt átadása.
       * Rendelkezésre álló idő : 14 nap.
   2. Munkaerő:
       * 1 fő Front End fejlesztő.
       * 1 fő Full Stack fejlesztő .
       * 2 fő Back End fejlesztő.
2. **Mérdöldkövek:**
    1. Csapat megalakulás projekt kiválasztása:
      2019.09.09-kor megalakult a csapat majd 2019.09.16-kor kiválasztásra került a projekt.
    2. 2019.09.23-ig :
        <details>
            <summary>Követelmény specifikáció:</summary>
              <pre>
              1. Jelenlegi helyzet.
              2. Vágyálom rendszer
              3. Jelenlegi üzleti folyamatok
              4. Igényelt Üzleti folyamatok
            </pre>
         </details>
         <details>
            <summary>Funkcionális specifikáció:</summary>
              <pre>
              1. Jelenlegi helyzet.
              2. Vágyálom rendszer
              3. Jelenlegi üzleti folyamatok
              4. Igényelt Üzleti folyamatok
            </pre>
         </details>
       <details>
            <summary>Rendszerterv</summary>
              <pre>
              1. A rendszer célja
              2. Projektterv
              3. Üzleti folyamatok modellje
              4. Követelmények
              5. Funkcionálisterv
              6. Fizikai környezet
              7. Architekturálisterv
              8. Implementációsterv
              9. Tesztterv
              10. Telepitésiterv
              11. Karbantartásiterv
            </pre>
         </details>
    3. 2019.09.30-ig Szótár alkalmazás lefejlesztése.
4. **Szerepkörök**
   * Frond End fejlesztő: Hamza Sándor.:Ő felelős az alkalmazás kinézetéért továbbá hogy az alkalmazás könnyen 
         használható legyen minden funkció magáért beszélően legyen megjelenítve.Munkája a fxml/css szerkesztését is tartalmazza
   * Back End fejlesztők : Szabó Alexandra,Petrik Dávid.:Felelős az adatok megfelelő áramlásáért,adatbázis kapcsolat kialakításáért
     és az üzleti logika implementálásáért.
   * Full Stack fejlesztő:Szabó Ferenc .:Front End és Back End munkálatok végzése egyaránt.
       
   

Author:[Szabó Ferenc](https://github.com/szabofeco98)


## 3. Üzleti folyamatok modellje
   * **Megvalósítandó Üzleti folyamatok:**
     * A szofver regisztrációs és bejelentkező felületet kell hogy nyújtson a felhasználók számára 
      .Regisztráláskor meg kell adnia nevét email címét és egy általa választott jelszót ezeket az adatokat egy adatbázisban tároljuk
       amelyekkel majd bejelentkezhet a felületre.
     * A szótár felület lehetőséget kell biztosítson szavak hozzá adására kézzel vagy txt fájlból való beolvasással és szavak törlésére        is lehetőséget kell adjon .Funkciót kell biztosítson minden szó felkérdezésére vagy véletlenszerűen  x-darab szó felkérdezésére 
       a szoftver  azonnal vissza jelez hogy eltaláltuk-e a szót vagy sem.
   * **Üzleti Szereplők**
     * Felhasználó:A regsztrációs felület kitöltése után felhasználói jogusultságot kap a szoftver használó
      .A felhasználónak lehetősége van  a szavak adatbázisban való tárolására.Adatbázisban tárolt szavak bővítésére/törlésére tárolt            szavak megtekintésére valamint használhatók a felkérdezés funkciók.
     * Vendég Felhasználó:Amennyiben nincs regisztrált felhasználónk is használható az alkalmazás azonban nem elérhetőek az adatbázishoz
       kapcsolódó műveletek(szavak hoszú tűvú tárolása,törlés,hozzáadás).
   * **Üzleti Entitások**
     * Word: Kézzel bevihető vagy fájl beolvasással regisztrált fiók estén adatbázisban tárolja.
            Az objektum váza:
     
       | Word |
       |------|
       |String(hunWord)|
       |String(engWord|
       |Number(userId)|
             
     * User: Regisztrálás során vihető fel az adatbázisba segítségével a felhasználók adatbázisban tudják tárolni szavaikat.
             Bejelentkezni csak regisztrált userel lehetséges.Az objektum váza:
             
       |User|
       |------|
       |Number(ID)|
       |String(userName)|
       |String(passWord)|
       |String(email)|
   
    
Author:[Szabó Ferenc](https://github.com/szabofeco98)

## 4. Követelmények

|Megnevezés |
|:---------:|
|Regisztráció|
|Bejelentkezés|
|Kijelentkezés|
|Általános beállítások	|
|Teszt|

Author:[Szabó Alexandra_Ilona](https://github.com/Wrigozo)

## 5. Funkcionálisterv

## 6. Fizikai környezet

## 7. Architekturálisterv

## 8. Adatbázisterv
Logikai adatmodell:

A szoftver Postgre sql adatbázist fog használni felhasználói azonositásra valamint szavak tárolására 
az adatbázisban 2 tábla lesz a user valamint a word amelyek egy a többhöz kapcsolatban állnak egymással
az az a word tábla minden elemét el kell látni egy külső kulcsal amely a user tábla elsődleges kulcsával
egyezik meg 
<br>

Az adatbázis JPA hybernate megoldásokat fog használni az adatbázis műveletekhez.

Author:[Szabó Alexandra_Ilona](https://github.com/Wrigozo)

## 9. Implementációsterv

## 10. Tesztterv
| Vizsgálat módja/eszköze, részletes leírása |Elvárt eredmény  | Eredmény | Megfelelőség státusza (Megfelelő,Pótlás határideje) |
|:------------------------------------------:|:---------------:|:--------:|:---------------------------------------------------:|
|Felhasználó regisztrálása                   |     A regisztráció sikeres legyen |          |                                                     |
|A bejelentkezési adatok kitöltését követően a felhasználó bejelentkezik|  A bejelentkezés sikeres |          |                                                     |
|A kijelentkezés gombra rányomva kijelentkezzen |	Sikeres Kijelentkezés| | |
|Ellenőrizni az adatbázisokat hogy képesek-e az adott szavak felvételére, lekérdezésére |	Sikeres lekérdezés,adatfelvétel| | |
|Kilistázzuk az nehezen tanult szavakat      | A szavak kilistázódnak | | |
|Teszt elkezdése                             | A szavak lekérdezése elkezdődik | | |
|Teszt befejződése                           | A teszt sikeresen befejeződik, majd a kiértékelés megjelenik| | |
|Megnyitjuk a ranglistát	|A ranglista sikeresen megnyílik az aktuális adatokkal| | |

Author:[Szabó Alexandra_Ilona](https://github.com/Wrigozo) 
## 11. Telepitésiterv

## 12. Karbantartásiterv

