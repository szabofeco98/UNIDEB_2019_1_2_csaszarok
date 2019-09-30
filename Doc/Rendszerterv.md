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
     * A szótár felület lehetőséget kell biztosítson szavak hozzá adására  és szavak törlésére        is lehetőséget kell adjon .Funkciót kell biztosítson minden szó felkérdezésére vagy véletlenszerűen  x-darab szó felkérdezésére 
       a szoftver  azonnal vissza jelez hogy eltaláltuk-e a szót vagy sem.
   * **Üzleti Szereplők**
     * Felhasználó:A regsztrációs felület kitöltése után felhasználói jogusultságot kap a szoftver használó
      .A felhasználónak lehetősége van  a szavak adatbázisban való tárolására.Adatbázisban tárolt szavak bővítésére/törlésére tárolt  szavak megtekintésére valamint használhatók a felkérdezés funkciók.

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

## 5. Funkcionális terv

Képernyőtervek: <br>
-Regisztráció: <br>
A képernyőn megjelennek a regisztrációhoz kitöltendő mezők, majd ha a felhasználó kitöltötte ezeket a mezőket, a Regisztráció gombra kattintva tudja magát regisztrálni a rendszerbe. Ha a regisztráció már megtörtént, ebben az esetben a "Tovább a bejelelntezésre" gomb megnyomásával a bejelentkező felületre lesz továbbítva.
![](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/Registration.png) <br>
-Bejelentkezés: <br>
A bejelentkező felületnél a felhasználó, a szükséges adatok megadása utána a "Bejelentkezés" gombra kattintva tudunk a saját profilunkhoz hozzáférni. Ha még nem rendelkezik regisztrált profillal, abban az esetben a "Regisztráció" gombra kattintva átkerül a Regisztráció felületre.
![](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/Login.png) <br>
-Menü: <br>
A sikeres bejelentezés után a felhasználó a menüben találja magát. Itt lehetőség van az összes szó vagy véletlenszerű szavak visszakérdezésére, ezzel hozzásegítve a felhasználót az új szavak megtanulására. Ha minden szót tud vagy csak esetleg új fába vágná a fejszéjét, lehetősége nyílik a saját adatbázisának kezelésére az "Új szavak hozzáadása" gombbal. Ezen felül egy Kijelentkezés gomb található, amivel a bejelentkező felületre lehet vissza navigálni.
![](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/Menu.png) <br>
-Tanulás: <br>
Ennél a lehetőségnél a felhasználónak két lehetősége van. Az egyik, hogy az adatbázisban lévő összes szót visszakérdezi az adatbázisból, a másik lehetőségnél a véletlenszerű visszakérdezés tíz szót kérdez vissza. 
![](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/Test.png) <br>
-Adatbázis: <br>
Ezen a felületen a szavakat tudjuk kezelni. Szavak hozzáadására, illetve törlésére van lehetőségünk. A magyar illetve az angol verzió után a "Szó hozzáadása" gombbal bekerül az adatbázisban, ami a jobb oldalon látható. Ha az adatbázisban rákattintunk egy adott szóra, a "Szó törlése" gombbal tudjuk törölni. A Magyar illetve Angol cellákra kattintva tudjuk betűrendbe állítani az eddig bevitt szavakat.
![](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/WordModifying.png) <br>

Author: [Hamza Sándor](https://github.com/sandorhamza)

## 6. Fizikai környezet

Az alkalmazás JavaFX platformon kerül megvalósításra ennek következtében a végeredmény egy asztali alkalmazás lesz. <br> 
A megvalósítás Intellij Community Netbeans, Eclipse fejlesztői környezetek használatával történik. Az alkalmazás <br>
fejlesztése során csak is open source függőségeket tartalmazhat. Mivel a szoftver nem csatlakozik hálózathoz, <br>
 ezért tűzfal vagy egyéb hálózattal kapcsolatos tudnivaló nincs. Az alkalmazás futtatásához szükséges a Java 11-es verziója <br>
 és mivel Java-ról beszélünk ezért az alkalmazás teljes mértékben platformfüggetlen.

Author: [Hamza Sándor](https://github.com/sandorhamza)


## 7. Architekturálisterv
A rendszer 3 különböző rétegből fog állni. Az adatbázis réteg az első, erre épül egy logikai réteg, majd a 
prezentációs réteg. A prezentációs rétegünk egy mobil alkalmazás. Az adatbázist és a prezentációs
rétegnek az összekötést a logikai réteg fogja biztosítani.  
Amikor az alkalmazásban változtatásokat, hibajavításokat végzünk a felhasználó beállításai mellett a változás 
határozza meg, hogy az automatikusan frissül-e. Amennyiben nem, egy figyelmeztető üzenet jelenik meg, és a 
felhasználó hozzájárulása szükséges a frissítés megkezdéséhez.  
Meghatározott tervezési minták és alapelvek betartásával a rendszer könnyen 
és következetesen bővíthető. A rendszer moduláris felépítése megkönnyíti, és nagy mértékben elősegíti a bővítését, fejlesztést. 

| Név | Kifejtés |
|:---:|:--------:|
| Regisztráció | A felület eléréséhez felhasználói fiók szükséges. Ehhez természetesen elengedhetetlen egy regisztrációs felület is. |
| Bejelentkezés | A felület eléréséhez bejelentkezés szükséges. A felhasználó ezután tudja elérni a különböző funkciókat, illetve a szerver az ő fiókjához csatoltan tárol különböző adatokat. |
| Kijelentkezés | Ha a kliens felhasználót szeretne cserélni akkor elengedhetetlen egy kijelentkező felület. Ezután a kliens visszatér a bejelentkező képernyőre. |
| Általános beállítások | Mind a mobil, mind a webes felületen elérhetővé kell tennie egy beállítások felületet ahol a felhasználó egyedi preferanciák alapján képes lesz beállítani dolgokat (Pl.: Nyelv, Értesítések, Felhasználó adatainak módosítása) |
| Teszt | Ha egy felhasználó kiválasztotta az általa feltöltött szavakat, lehetősége lesz olvasni az adott szótárban és tesztelheti, mennyire tudja az adott szavakat. |
| Kiértékelt tesztek | Egy teszt kitöltése után a felhasználó láthatja az elért pontszámát, ezt tároljuk. Erre alapul majd a ranglista. |

Author:[Petrik Dávid](https://github.com/PDavidson123)
## 8. Adatbázisterv
Logikai adatmodell:

A szoftver Postgre sql adatbázist fog használni felhasználói azonositásra valamint szavak tárolására 
az adatbázisban 2 tábla lesz a user valamint a word amelyek egy a többhöz kapcsolatban állnak egymással
az az a word tábla minden elemét el kell látni egy külső kulcsal amely a user tábla elsődleges kulcsával
egyezik meg 
<br>

Az adatbázis JPA hybernate megoldásokat fog használni az adatbázis műveletekhez.

Adatbázis séma:

![ ](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/adatb%C3%A1ziss%C3%A9ma.JPG)

Author:[Szabó Ferenc](https://github.com/szabofeco98),[Hamza Sándor](https://github.com/sandorhamza)


## 9. Implementációsterv
Perzisztencia osztályok:
A perzisztencia osztályokból képezhetjük le az adatbázis elemeit 
objektumként ehez a Hybernate megoldásait fogja használni a szoftver.Két darab entitás osztályra lesz szükségünk egy a szavak tárolására egy pedig a felhasználók tárolására ezek kapcsolatban is állnak egymással amelyet @oneToMany és @manyToOne annotációval jeleznünk kell a forditó számára.
Az osztályok váza:
<br>

![ ](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/PerzisztenciaOszt%C3%A1lyok.JPG)

Üzleti logika osztályai:Csapatunk az MVC architechturális minta melett döntött igy az üzleti logika osztályait a modell package fogja tartalmazni.Három osztályra lesz szükségünk,egy modellre amely a bejelentkezésért felel és hozzá fér a user táblához  a következő a regisztrációért felel és szintén hozzá fér a user táblához valamint a harmadik osztály amely a word táblához fér hozzá.Az osztályok váza:

![ ](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/Modell.JPG)

Kliens oldal osztályai:A kliens oldal osztályai tartalmazzák a nézeteket amelyet az ügyfelek látnak csapatunk az egyszerüségre és  intuitivitásra törekedett ide tartoznak a nézeteken kivül a hozzájuk kapcsolodó kontrollerek amelyek kapcsolatban állnak a nézettel és modell osztályokkal.
Az osztáylok váza:

![ ](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/View.JPG)

![ ](https://github.com/szabofeco98/UNIDEB_2019_1_2_csaszarok/blob/master/Doc/images/Controller.JPG)

Author:[Szabó Ferenc](https://github.com/szabofeco98),[Petrik Dávid](https://github.com/PDavidson123)

## 10. Tesztterv
| Vizsgált funkció |input|Elvárt eredmény  | Eredmény | Megfelelőség státusza (Megfelelő,Pótlás határideje) |
|:-:|:-:|:-:|:-:|:-:|
|Regisztráció|4-karakternél rövidebb felhasználó név|Sikertelen|Sikertelen|Megfelelt|
|Regisztáció|létező felhasználónév|Sikertelen|Sikertelen|Megfelelt|
|Regisztráció|helytelen email cím|Sikertelen|Sikertelen|Megfelelt|
|Regisztráció|4-karakternél rövidebb jelszó|Sikertelen|Sikertelen|Megfelelt|
|Regisztráció|Nem egyező jelszó|Sikertelen|Sikertelen|Megfelelt|
|Regisztráció|Megfelelő email,Megfelelő jelszó,Megfelelő felhasználó név|Sikeres|Sikeres |Megfelelt|
|Szavak hozzá adása|Egyik szó üres|Sikertelen|Sikertelen|Megfelelt|
|Szavak hozzá adása|Mind két szó kitöltve|Sikeres|Sikeres|Megfelelt|
|Szavak törlése|Nincs kijelölt szó|Sikertelen|Sikertelen|Megfelelt|
|Szavak törlése|Nincs kijelölt szó|Sikeres|Sikeres|Megfelelt|
|Jelszó megváltoztatás | 4 karakternél rövidebb jelszó | Sikertelen | Sikertelen | Megfelelt |
|Jelszó megváltoztatás | Létező jelszó | Sikertelen | Sikertelen | Megfelelt |
|Jelszó megváltoztatás | Megfelelő | Sikeres | Sikeres | Megfelelt |
|Felhasználó megváltoztatás | 4 karakternél rövidebb felhasználónév | Sikertelen | Sikertelen | Megfelelt 
|Felhasználó megváltoztatás | Létező felhasználónév | Sikertelen | Sikertelen | Megfelelt |
|Felhasználó megváltoztatás | Megfelelő | Sikeres | Sikeres | Megfelelt |

Author: [Szabó Alexandra_Ilona](https://github.com/Wrigozo), [Szabó Ferenc](https://github.com/szabofeco98), [Petrik Dávid](https://github.com/PDavidson123), [Hamza Sándor](https://github.com/sandorhamza)



## 11. Telepitésiterv

## 12. Karbantartásiterv

A rendszergazda végzi az üzemeltetést. A rendszergazda a megrendelő munkatársa. 
Az elvárások:


* meghibásodás esetén az utolsó konzisztens állapot visszaállítása
* a rendszer frissítése
* az általános átvizsgálás során észlelt hibák javítása
* bejelentések során érkezett hibák javítása
* a munkatársak igényeinek folyamatos figyelése és felmérése.


Author:[Szabó Alexandra_Ilona](https://github.com/Wrigozo) 