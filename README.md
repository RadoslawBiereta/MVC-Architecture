# MVC-Architecture
*Badanie architektury MVC na laboratorium z Projektowania wielowarstwowych aplikacji internetowych*

## Moduł Java do przetwarzania informacji o produkcie.
* Ten projekt implementuje moduł Java w architekturze MVC, który pozwala użytkownikowi na wprowadzenie nazwy produktu, jego ceny i ilości, a następnie wyliczenie łącznej ceny produktu. (Wymaga on od użytkownika wprowadzenie danych, które są przetwarzane w modelu, a wynik jest wyświetlany w widoku. Kontroler jest pośrednikiem między modelem a widokiem.)

## Wymagania
* Aby uruchomić ten moduł, potrzebujesz Java Development Kit (JDK) w wersji 8 lub wyższej.

## Uruchamianie aplikacji :computer:
- Sklonuj repozytorium na swój komputer: git clone https://github.com/RadoslawBiereta/MVC-Architecture.git
- Przejdź do katalogu projektu: cd MVC-Architecture
- Skompiluj pliki .java: javac *.java
- Uruchom program: java Main

## Opis architektury
* W tym projekcie wykorzystana jest architektura Model-View-Controller (MVC). Kontroler jest pośrednikiem między modelem a widokiem. Model zawiera dane, które są przetwarzane, a widok prezentuje wynik. Kontroler odbiera zdarzenia od widoku i przekazuje je do modelu, a następnie aktualizuje widok na podstawie zmian w modelu.
![Architektura MVC](https://github.com/RadoslawBiereta/MVC-Architecture/blob/main/MVC.png)
