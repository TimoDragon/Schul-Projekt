# Java Tutorial

## Allgemein


### - EVA Prinzip
Das EVA-Prinzip beschreibt die Grundprinzipien der Datenverarbeitung. Das Akronym leitet sich aus den Initialen der Begriffe Input, Processing und Output ab (englisches IPO-Modell: Input-Process-Output). Diese drei Begriffe beschreiben den Ablauf der Datenverarbeitung. Dieses Prinzip wird aus der Perspektive der Verarbeitungseinheit (die auch ein Mensch sein kann) betrachtet und ist somit unabhängig von elektronischen Maschinen. Daher ist sie allgemein auf den Prozess der Datenverarbeitung anwendbar.

[![Eva.Prinzip](https://img.youtube.com/vi/bRHJd8_afn0/0.jpg)](https://www.youtube.com/watch?v=bRHJd8_afn0)

### - Was ist ein Algorithmus
Im Allgemeinen ist ein Algorithmus eine Reihe von Anweisungen, die Schritt für Schritt ausgeführt werden, um ein Problem zu lösen oder eine Aufgabe zu erledigen. Der Algorithmus von Google bestimmt beispielsweise, welche Website an welcher Position in den Google-Suchergebnissen angezeigt wird.

### -Compiler und Interpreter

#### -Interpreter 

Ein Interpreter ist ein Computerprogramm, das den Quellcode eines Softwareprojekts zur Laufzeit (also bei seiner Ausführung) verarbeitet und als Schnittstelle zwischen dem Projekt und dem Prozessor fungiert. Der Interpreter verarbeitet den Code immer Zeile für Zeile, um nacheinander einzelne Anweisungen für den Prozessor zu lesen, zu analysieren und aufzubereiten. Dieses Prinzip gilt auch für Schleifenanweisungen, die wieder ausgeführt werden, sobald sie an der Reihe sind. Interpreter verwenden eine eigene interne Bibliothek, um Softwarecode zu verarbeiten: Sobald eine Zeile Quellcode in einen entsprechenden maschinenlesbaren Befehl umgewandelt ist, wird sie direkt an den Prozessor weitergeleitet.

#### -Compiler

Ein Compiler ist ein Computerprogramm, das den gesamten Quellcode eines Softwareprojekts vor der Ausführung in Maschinensprache übersetzt. Erst dann wird das Projekt vom Prozessor ausgeführt, sodass ihm von Anfang an alle Anweisungen im Maschinencode zur Verfügung stehen. Auf diese Weise ist der Prozessor bereit, alle Komponenten auszuführen, die zum Ausführen der entsprechenden Software, zur Verarbeitung von Eingaben und zur Erzeugung von Ausgaben erforderlich sind. In vielen Fällen erfolgt jedoch ein entscheidender Zwischenschritt im Kompilierungsprozess: Vor der endgültigen Übersetzung in Maschinensprache wandeln die meisten Compiler in der Regel zunächst den Quellcode in Zwischencode (auch „Objektcode“ genannt). Plattformen und kann auch von einem Dolmetscher verwendet werden.

## Einführung in die Programmierung
### 1. Inkrementoperator

### 2. Typecasting
    
###  3. Bedingungen
if Bedingung:

```java
int i = 0;
if (i == 1) {
    System.out.println("Die Zahl ist 1");
}
else {
    System.out.println("Die Zahl ist nicht 1");
}
```
In diesem Beispiel geht es darum, dass wir einen Integer "i" mit dem Wert 0 haben
und dann durch eine if-Abfrage geschaut wird ob "i", 1 ist.
Falls dies true (wahr) ist dann wird in der Konsole "Die Zahl ist 1" ausgegeben, wenn dies
aber false (falsch) ist erscheint in der Konsole "Die Zahl ist nicht 1". Da der Integer 0 und
nicht 1 ist, erscheint "Die Zahl ist nicht 1".


switch case:
```java
int number = 0;
switch(number) {
    case 0: {
        System.out.println("Die Zahl ist 0");
        break;
    }
    case 1: {
        System.out.println("Die Zahl ist 1");
        break;
    }
}
```
Bei dem switch gibt man einen Datentypen ein den man mit den cases vergleichen will. Zum beispiel gibt man den Datentypen "number" ein, welcher ein Integer ist und vergleicht ihn mit 0 und 1. Falls die Zahl 0 ist wird in der Konsole "Die Zahl ist 0" ausgeben, falls dieser 1 ist erscheint "Die Zahl ist 1". "break" sorgt dafür, dass das vergleichen beendet wird.

### 4. Schleifen
for schleife:
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
In diesem Beispiel zur for schleife kann man sehen das wir einen int "i" haben, der 0 ist. Als nächstes
kann man erkennen, dass dort "i < 10" steht. Was bedeutet das die schleife solange wiederholt wird, bis i nicht mehr kleiner als 10 ist. Währenddessen wird i ausgegeben.


while schleife:
```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i = i + 1;
}
```
Die while schleife wird so lange wiederholt wie der eingegebene Inhalt true (wahr) ist. In diesem fall
so lange wie i unter 10 ist. Nach jeder wiederholung wird i um 1 größer in diesem Beispiel.


do while schleife:
```java
```

## Einführung in die Objektorientiere Programmierung

## Objektorientierte Programmierung

In einem Buch über Java-Programmierung müssen mehrere Teile vereinigt werden,

die grundsätzliche Programmierung nach dem imperativen Prinzip (Variablen, Operatoren Fallunterscheidung, Schleifen, einfache statische Methoden) in einer neuen Grammatik für Java, dann die Objektorientierung (Objekte, Klassen, Vererbung, Schnittstellen), erweiterte Möglichkeiten der Java-Sprache (Ausnahmen, Generics, Closures) und zum Schluss die Bibliotheken (String-Verarbeitung, Ein-/Ausgabe …).
Dieses Kapitel stellt das Paradigma der Objektorientierung in den Mittelpunkt und zeigt die Syntax, wie etwa in Java Vererbung realisiert wird.

## Objekte
Bei der Objektorientierten Modellierung (OOM) spielen Objekte eine fundamentale Rolle. Der klassische Ansatz im Unterricht arbeitet mit rein virtuellen Objekten - sämtliche Interaktion und auch die Objektkommunikation spielt sich im Rechner ab. Nicht selten kommt es dabei vor, dass man Objekte im wahrsten Sinne des Wortes gar nicht "sieht".
Ziel dieses Projektes ist es, Objekte begreifbar zu machen und Objektkommunikation zu visualisieren. Dafür stehen für den Unterricht Bauteile bereit, mit denen sich verschiedene Szenarien modellieren lassen. Die Schülerinnen und Schüler bekommen so die Möglichkeit, Objekte tatsächlich anzufassen und ihren aktuellen State (Zustand) nicht nur über Methoden zu erfragen, sondern auch zu sehen (Bauteil: RGB-LED) oder zu hören (Bauteil: Summer).

## Klassen

Klassen sind das wichtigste Merkmal objektorientierter Programmiersprachen. Eine Klasse definiert einen neuen Typ, beschreibt die Eigenschaften der Objekte und gibt somit den Bauplan an. Jedes Objekt ist ein Exemplar (auch Instanz[ 104 ](Ich vermeide das Wort Instanz und verwende dafür durchgängig das Wort Exemplar. An die Stelle von instanziieren tritt das einfache Wort erzeugen. Instanz ist eine irreführende Übersetzung des englischen Ausdrucks »instance«. ) oder Ausprägung genannt) einer Klasse.

Eine Klasse deklariert im Wesentlichen zwei Dinge:

Attribute (was das Objekt hat)

Operationen (was das Objekt kann)

## Klassendiagramme

### Die lose Beziehung

### Typ 1 «instanziiert»

Wenn wir ein Objekt erstellen, welches ein anderes Objekt verwendet, ohne dessen Referenz als Membervariable zu speichern, handelt es sich um eine lose «inszanziiert» Beziehung.

### Typ 2 «use»

Wenn wir auf ein statisches Element einer anderen Klasse zugreifen, handelt es sich um eine lose «use» Beziehung.

### Assoziationsbeziehung

Prinzipiell sprechen wir von einer Assoziationsbeziehung, wenn ein Objekt einer Klasse, eine Referenz (die Speicherstelle eines anderen Objektes) als Membervariable speichert.
Kategoresierungsgesichtspunkte

 Nach ihrer Richtung:

 unidirektionale (gerichtete) Assoziation

 bidirektionale Assoziation

 Nach der Mengenangabe:

 1:1-Assoziation (ein Objekt kann ein anderes Objekt referenzieren)

 1:n-Assoziation (ein Objekt kann ein oder mehrere andere Objekte referenzieren)

 N:m-Assoziation (Objekte können sich gegenseitig mehrfach referenzieren)

Nach der Wirkung:

Assoziation

Aggregation (Spezialfall der Assoziation)

Komposition (Spezialfall der Aggregation)

Operationen (was das Objekt kann)